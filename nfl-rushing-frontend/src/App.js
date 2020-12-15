import React from "react";
import './App.css';
import ReactTable from "react-table-6";
import "react-table-6/react-table.css";
import axios from "axios";
import { API_BASE_URL, COLUMN_NAME, CSV_HEADERS } from './constants/index';
import { CSVLink } from "react-csv";
import { Navbar,Button } from "react-bootstrap";

const requestData = async (pageSize, page, sorted, filterable) => {

  const data = await axios.get(
    `${API_BASE_URL}/details?offset=${page}`+
    `&limit=${pageSize}&sortOrder=${sorted[0]?.desc ? 'DESC' : 'ASC'}`+
    `&sortByField=${sorted[0]?.id.toLowerCase() ? sorted[0]?.id.toLowerCase() : ""}`+
    `&filterByPlayer=${filterable[0]?.value ? filterable[0]?.value : ""}`
  );
  const res = {
    rows: data.data.playerList,
    pages: Math.ceil(data.data.numberOfRecords / pageSize)
  };
  return res;
};

class App extends React.Component {
  constructor() {
    super();
    this.state = {
      data: [],
      pages: null,
      loading: true,
      dataToDownload: []
    };
    this.fetchData = this.fetchData.bind(this);
  }
  
  fetchData(state, instance) {
    this.setState({ loading: true });
    requestData(
      state.pageSize,
      state.page,
      state.sorted,
      state.filtered
    ).then(res => {
      // Now just get the rows of data to your React Table (and update anything else like total pages or loading)
      this.setState({
        data: res.rows,
        pages: res.pages,
        loading: false
      });
    });
  }
  render() {
    const { data, pages, loading } = this.state;
    return (
      <div className="root-css">
        <Navbar variant="dark" className="navbar-css">
          <Navbar.Brand className="ml-auto font-weight-bold">NFL Rushing</Navbar.Brand>
          <Button variant="light" className="ml-auto">
            <CSVLink 
            data={data}
            headers={CSV_HEADERS}
            filename = "player_details.csv"
            >Export CSV
            </CSVLink>
          </Button>
        </Navbar>
        <ReactTable
          columns={COLUMN_NAME}
          manual // Forces table not to paginate or sort automatically, so we can handle it server-side
          data={data}
          pages={pages} // Display the total number of pages
          loading={loading} // Display the loading overlay when we need it
          onFetchData={this.fetchData} // Request new data when things change
          defaultPageSize={10}
          className="react-table-css"
        />
      </div>
    );
  }
}

export default App;

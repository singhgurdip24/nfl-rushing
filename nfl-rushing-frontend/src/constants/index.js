export const API_BASE_URL = process.env.REACT_APP_API_BASE_URL || 'http://localhost:8080';

export const COLUMN_NAME = [
    {
      Header: "Player",
      accessor: "Player",
      sortable: false,
      filterable: true
    },
    {
      Header: "Yards",
      accessor: "Yds"
    },
    {
      Header: "Longest Rush",
      accessor: "Lng"
    },
    {
      Header: "TouchDowns",
      accessor: "TD"
    },
    {
      Header: "Team",
      accessor: "Team",
      id: "Team",
      sortable: false
    },
    {
      Header: "Position",
      accessor: "Pos",
      sortable: false
    },
    {
      Header: "Rushing Attempts/Game Avg",
      accessor: "Att/G",
      sortable: false
    },
    {
      Header: "Rushing Attempts",
      accessor: "Att",
      sortable: false
    },
    {
      Header: "Average",
      accessor: "Avg",
      sortable: false
    },
    {
      Header: "Yards/Game",
      accessor: "Yds/G",
      sortable: false
    },
    {
      Header: "First",
      accessor: "1st",
      sortable: false
    },
    {
      Header: "First Percentage",
      accessor: "1st%",
      sortable: false
    },
    {
      Header: "Twenty",
      accessor: "20+",
      sortable: false
    },
    {
      Header: "Forty",
      accessor: "40+",
      sortable: false
    },
    {
      Header: "FUM",
      accessor: "FUM"
    }
];
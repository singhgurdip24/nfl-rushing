export const API_BASE_URL = process.env.NFL_APP_API_BASE_URL || 'http://localhost:8080';

export const COLUMN_NAME = [
    {
      Header: "Player",
      accessor: "Player",
      sortable: false,
      filterable: true
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
      Header: "Total Rushing Yards",
      accessor: "Yds"
    },
    {
      Header: "Rushing Average Yards/Attempt",
      accessor: "Avg",
      sortable: false
    },
    {
      Header: "Rushing Yards/Game",
      accessor: "Yds/G",
      sortable: false
    },
    {
      Header: "Total Rushing TouchDowns",
      accessor: "TD"
    },
    {
      Header: "Longest Rush",
      accessor: "Lng"
    },
    {
      Header: "Rushing First Downs",
      accessor: "1st",
      sortable: false
    },
    {
      Header: "Rushing First Down Percentage",
      accessor: "1st%",
      sortable: false
    },
    {
      Header: "Rushing 20+ Yards Each",
      accessor: "20+",
      sortable: false
    },
    {
      Header: "Rushing 40+ Yards Each",
      accessor: "40+",
      sortable: false
    },
    {
      Header: "Rushing Fumbles",
      accessor: "FUM"
    }
];

export const CSV_HEADERS = [
  {
    label: "Player",
    key: "Player"
  },
  {
    label: "Team",
    key: "Team"
  },
  {
    label: "Position",
    key: "Pos"
  },
  {
    label: "Rushing Attempts/Game Avg",
    key: "Att/G"
  },
  {
    label: "Rushing Attempts",
    key: "Att"
  },
  {
    label: "Total Rushing Yards",
    key: "Yds"
  },
  {
    label: "Rushing Average Yards/Attempt",
    key: "Avg"
  },
  {
    label: "Rushing Yards/Game",
    key: "Yds/G"
  },
  {
    label: "Total Rushing TouchDowns",
    key: "TD"
  },
  {
    label: "Longest Rush",
    key: "Lng"
  },
  {
    label: "Rushing First Downs",
    key: "1st"
  },
  {
    label: "Rushing First Down Percentage",
    key: "1st%"
  },
  {
    label: "Rushing 20+ Yards Each",
    key: "20+"
  },
  {
    label: "Rushing 40+ Yards Each",
    key: "40+"
  },
  {
    label: "Rushing Fumbles",
    key: "FUM"
  }
]
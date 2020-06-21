import React, { Component } from "react";
import AppNav from "./common/AppNav";
class HomePage extends Component {
  state = {};
  render() {
    return (
      <div>
        <AppNav />
        <h2
          style={{
            display: "flex",
            justifyContent: "center",
            alignItems: "centre",
            height: "100vh",
          }}
        >
          Welcome to Expense App.
        </h2>
      </div>
    );
  }
}

export default HomePage;

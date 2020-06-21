import React, { Component } from "react";
import { Route, BrowserRouter as Router, Switch } from "react-router-dom";
import Category from "./components/Category";
import HomePage from "./components/HomePage";
import Expenses from "./components/Expenses";

class App extends Component {
  state = {};
  render() {
    return (
      <Router>
        <Switch>
          <Route path="/" exact={true} component={HomePage} />
          <Route path="/categories" exact={true} component={Category} />
          <Route path="/expenses" exact={true} component={Expenses} />
        </Switch>
      </Router>
    );
  }
}

export default App;

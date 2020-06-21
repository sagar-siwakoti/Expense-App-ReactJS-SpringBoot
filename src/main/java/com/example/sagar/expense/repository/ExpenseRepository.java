package com.example.sagar.expense.repository;

import com.example.sagar.expense.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository  extends JpaRepository<Expense,Long> {

}

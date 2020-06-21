package com.example.sagar.expense.repository;

import com.example.sagar.expense.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category,Long> {
    Category findByName(String name);
}

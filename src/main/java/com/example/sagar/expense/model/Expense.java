package com.example.sagar.expense.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "expense")
public class Expense {
    @Id
    private Long id;

    private String description;

    private String location;

    private Instant expenseDate;

    @ManyToOne
    private Category category;


    @JsonIgnore
    @ManyToOne
    private User user;
}

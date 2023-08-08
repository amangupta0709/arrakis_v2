package com.db.grad.main.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int quantity;

    private String status;

    private float price;

    private String buySell;

    private Date trade_date;

    private Date settlement_date;

    @ManyToOne
    private CounterParty counterParty;

    @ManyToOne
    private Security security;

    @ManyToOne
    private Book book;
}

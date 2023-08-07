package com.db.grad.javaapi.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "counterparty")
public class CounterParty {

    @Id
    private long ID;
    private String name;


    public CounterParty() {

    }

    public CounterParty(long id, String name) {
        this.ID = id;
        this.name = name;
    }

    @Id
    @Column(name = "ID", nullable = false)
    public long getId() {
        return ID;
    }
    public void setId(long id) {
        this.ID = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

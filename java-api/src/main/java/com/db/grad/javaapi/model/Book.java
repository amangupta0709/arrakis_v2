package com.db.grad.javaapi.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
    @Id
    private int bookId;
    private String bookName;

    public Book() {

    }
    public Book(int id, String name) {

        this.bookId=id;
        this.bookName = name;
    }

    @Id
    @Column(name = "book_id", nullable = false)
    public int getId() {
        return (int) bookId;
    }
    public void setId(int id) {
        this.bookId = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return bookName;
    }
    public void setName(String name) {
        this.bookName = name;
    }
}

package com.db.grad.javaapi.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookuser")
public class BookUser {
    @Id
    private int bookId;
    private int userId;

    public BookUser() {

    }
    public BookUser(int id, int uid) {

        this.bookId=id;
        this.userId = uid;
    }

    @Id
    @Column(name = "book_id", nullable = false)
    public int getId() {
        return bookId;
    }
    public void setId(int id) {
        this.bookId = id;
    }

    @Column(name = "user_id", nullable = false)
    public int getName() {
        return userId;
    }
    public void setName(int uid) {
        this.userId = uid;
    }
}

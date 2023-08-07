package com.db.grad.javaapi.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

    @Id
    private long ID;
    private String name;
    private String email;
    private String role;

    public Users() {

    }

    public Users(long id, String name, String email, String role) {
        this.ID = id;
        this.name = name;
        this.email = email;
        this.role = role;

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

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "role", nullable = false)
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}

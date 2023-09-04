package com.example.OnlineBookStore.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Authors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authorId")
    private int authorId;

    @Column(name = "authorName", length = 200, nullable = false)
    private String authorName;

    @Column(name = "Nationality", length = 50, nullable = false)
    private String nationality;

    @Column(name = "Birth_Date", nullable = false)
    private Date birthDate;

    // Constructors, getters, and setters

    public Authors() {
        // Default constructor
    }

    public Authors(String authorName, String nationality, Date birthDate) {
        this.authorName = authorName;
        this.nationality = nationality;
        this.birthDate = birthDate;
    }

    // Getters and setters for all fields

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    // Other methods

    @Override
    public String toString() {
        return "Author [authorId=" + authorId + ", authorName=" + authorName + ", nationality=" + nationality
                + ", birthDate=" + birthDate + "]";
    }
}

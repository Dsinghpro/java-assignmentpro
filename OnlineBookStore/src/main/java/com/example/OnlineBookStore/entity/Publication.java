package com.example.OnlineBookStore.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Publication")
public class Publication {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="publication_id")
	private int publicationId;
	@Column(name="publisher_name")
    private String publicationName;
    @Column(name="Address")
    private String address;
    @Column(name="Email")
    private String email;
    @Column(name="created_at")
    private Date createdAt;

    public Publication() {
        // Default constructor
    }

    public Publication(int publicationId, String publicationName, String address, String email, Date createdAt) {
        this.publicationId = publicationId;
        this.publicationName = publicationName;
        this.address = address;
        this.email = email;
        this.createdAt = createdAt;
    }

    public int getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(int publicationId) {
        this.publicationId = publicationId;
    }

    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Publication [publicationId=" + publicationId + ", publicationName=" + publicationName + ", address="
                + address + ", email=" + email + ", createdAt=" + createdAt + "]";
    }
}


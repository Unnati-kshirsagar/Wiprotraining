package com.wipro.hibernatedemo.entity;



import jakarta.persistence.*;

@Entity
@Table(name = "pan_card")
public class PanCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "holder_name")
    private String holderName;

    @Column(name = "pan_number", unique = true)
    private String panNumber;

    public PanCard() {}

    public PanCard(String holderName, String panNumber) {
        this.holderName = holderName;
        this.panNumber = panNumber;
    }

    // ✅ Add this constructor for update
    public PanCard(int id, String holderName, String panNumber) {
        this.id = id;
        this.holderName = holderName;
        this.panNumber = panNumber;
    }

    // Getters, setters, and toString() ...
}

package com.wipro.hibernatedemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pan")
public class Pan {

    @Id
    private int id;
    private String panholderName;
    private String panNumber;

    public Pan() {}

    public Pan(int id, String panholderName, String panNumber) {
        this.id = id;
        this.panholderName = panholderName;
        this.panNumber = panNumber;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPanholderName() { return panholderName; }
    public void setPanholderName(String panholderName) { this.panholderName = panholderName; }

    public String getPanNumber() { return panNumber; }
    public void setPanNumber(String panNumber) { this.panNumber = panNumber; }

    @Override
    public String toString() {
        return "Pan [id=" + id + ", panholderName=" + panholderName + ", panNumber=" + panNumber + "]";
    }
}

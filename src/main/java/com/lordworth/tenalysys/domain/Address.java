package com.lordworth.tenalysys.domain;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Address implements Serializable {
    private Integer id;
    private String streetName;
    private String village;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }
}

package com.example.MovieService.clas;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;

@Entity
public class MovieRodzaj {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    private String rodzaj;

    public MovieRodzaj() {
        this.rodzaj = "Rodzaj"+getID();
    }
    public MovieRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }
    public Long getID() {
        return ID;
    }

    @JsonIgnore
    public void setID(Long ID) {
        this.ID = ID;
    }
    public String getRodzaj() {
        return rodzaj;
    }
    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

}

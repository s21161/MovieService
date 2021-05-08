package com.example.MovieService.clas;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    private String tytul;
    private String rodzaj;

    public Movie() {
        this.tytul = "Tytuł "+getID();
        this.rodzaj = "";
    }

    public Movie(String tytul, String rodzaj) {
        this.tytul = tytul;
        this.rodzaj = rodzaj;
    }

    public Long getID() {
        return ID;
    }

    @JsonIgnore
    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String nazwa) {
        this.tytul = tytul;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

}

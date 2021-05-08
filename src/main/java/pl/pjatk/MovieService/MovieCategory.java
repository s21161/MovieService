package pl.pjatk.MovieService;

import com.fasterxml.jackson.annotation.*;
import org.hibernate.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MovieCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    private String rodzaj;

    public MovieCategory() {
        this.rodzaj = "Rodzaj"+getID();
    }

    public MovieCategory(String rodzaj) {
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
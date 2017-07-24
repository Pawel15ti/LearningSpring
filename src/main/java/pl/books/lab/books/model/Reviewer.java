package pl.books.lab.books.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawcio on 2017-07-08.
 */
@Entity
public class Reviewer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;


    public Reviewer(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Reviewer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

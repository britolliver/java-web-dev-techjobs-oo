package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer { //a public class called Employer
    private int id; //a private variable called id that will be an integer,
    private static int nextId = 1; //private static variable called nextID with a set value of 1
    private String value;//private variable named value that will be a string

    public Employer() { //a public constructor called employer w/ no parameters
        id = nextId;//the private variable id is assigned the variable nextid
        nextId++; //nextid will increase in increments and id will be updated to that
    }

    public Employer(String value) { //public constructor called employer but with a parameter value that is a string
        this();//this makes this constructor do what constructor in line 10 does;it goes back up to line 10
        this.value = value;//refers to the value at the top; the value at the top will be assigned the parameter we put in; ex: Bob
        //i don't understand why it is referring to the other constructor
    }

    // Custom toString, equals, and hashCode methods:

    @Override //haven't gone over this in details but i think you need it to make equals do a different behavior
    public String toString() {
        return value;
    }
        //a toString method that will be called on an object or class and return the string variable value
    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true; //checks for reflexivity; a=a
        if (!(o instanceof Employer)) return false; //making sure the cast was safe
        Employer employer = (Employer) o;//casting
        return getId() == employer.getId();//comparing to make sure id's are equal
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }//variable used above that returns id

    public String getValue() {
        return value;
    }//gets value

    public void setValue(String value) {
        this.value = value;
    }//assigns value to value
}

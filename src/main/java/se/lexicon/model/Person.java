package se.lexicon.model;

import se.lexicon.sequencers.PersonalIdSequencer;

import java.util.Objects;

public class Person {

    private final int id;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser credentials;


    // --------------Constructors-----------------//

    public Person(String firstName, String lastName, String email, AppUser credentials) {
        this.id= PersonalIdSequencer.nextId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        setCredentials(credentials);
    } // end of constructor

    public Person(String firstName, String lastName, String email) {
        this.id= PersonalIdSequencer.nextId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
//----------------Getters--------------------//

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public AppUser getCredentials() {
        return credentials;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }

    //----------------Setters--------------------//


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCredentials(AppUser credentials) {
        if (credentials == null) {
            throw new IllegalArgumentException("credentials cannot be null...");
        } else {
            this.credentials = credentials;
        }
    }
} // end of class

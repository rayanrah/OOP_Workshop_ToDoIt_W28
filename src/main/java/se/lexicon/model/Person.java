package se.lexicon.model;

import se.lexicon.sequencers.PersonalIdSequencer;

public class Person extends PersonalIdSequencer {

    private String firstName;
    private String lastName;
    private String email;

    public Person(String firstName, String email, String lastName) {
        super.nextId(); // Super need to be in the first line.
        this.firstName = firstName;
        this.email = email;
        this.lastName = lastName;
    }
}

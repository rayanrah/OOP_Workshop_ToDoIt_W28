package se.lexicon.sequencers;

public class PersonalIdSequencer {

    private static int currentId = 0;

    // Implement the nextId() method to retrieve the next available id and update the currentId.
    public static int nextId() {
        currentId++;
        setCurrentId(currentId);
        return currentId;
    }

    // Implement the getter method to retrieve the current id.
    public static int getCurrentId() {
        return currentId;
    }

    // Implement the set(int newId) method to set a new value for the currentId.
    public static void setCurrentId(int nextId) {
        currentId = nextId;
    }
}

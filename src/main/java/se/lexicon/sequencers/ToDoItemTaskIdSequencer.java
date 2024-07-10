package se.lexicon.sequencers;

public class ToDoItemTaskIdSequencer {

    private int currentId = 0;

    // Implement the nextId() method to retrieve the next available id and update the currentId.
    public int nextId() {
        currentId++;
        setCurrentId(currentId);
        return currentId;
    }

    // Implement the getter method to retrieve the current id.
    public int getCurrentId() {
        return currentId;
    }

    // Implement the set(int newId) method to set a new value for the currentId.
    public void setCurrentId(int nextId) {
        this.currentId = nextId;
    }
}

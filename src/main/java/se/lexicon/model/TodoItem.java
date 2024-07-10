package se.lexicon.model;

import se.lexicon.sequencers.PersonalIdSequencer;
import se.lexicon.sequencers.TodoItemIdSequencer;

import java.time.LocalDate;

public class TodoItem extends TodoItemIdSequencer {

    boolean done;
    private String id;
    private String title;
    private String taskDescription;
    private LocalDate deadline;
    private Person creator;


    // --------------Constructors-----------------//

    public TodoItem(String title, String taskDescription, LocalDate deadline, boolean done, Person creator) {
        super.nextId(); // get next id from the sequencer.
        setTitle(title); // setter for title - can not be null or empty.
        this.taskDescription = taskDescription;
        setDeadline(deadline); // Setter for localDate - can not be null.
        this.done = true;
        this.creator = creator;
    }

//----------------Getters--------------------//

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public Person getCreator() {
        return creator;
    }

    public String getSummary() {
        return "Creator: " + creator +"\nTitle: " + title + "\nDescription: " + taskDescription + "\nDeadline: " + deadline;
    }

    public boolean isDone() {
        return done;
    }

//----------------Setters--------------------//


    public void setDone(boolean done) {
        this.done = done;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    // setter for title - can not be null or empty.
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    // Setter for localDate - can not be null.
    public void setDeadline(LocalDate deadline) {
        if (deadline == null) {
            throw new IllegalArgumentException("Deadline cannot be null");
        } else {
            this.deadline = deadline;
        }
    }

} // TodoItem


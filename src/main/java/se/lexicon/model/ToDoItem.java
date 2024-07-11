package se.lexicon.model;

import se.lexicon.sequencers.TodoItemIdSequencer;

import java.time.LocalDate;

public class ToDoItem {

    private final int id;
    private boolean done;
    private String title;
    private String taskDescription;
    private LocalDate deadline;
    private Person creator;


    // --------------Constructors-----------------//

    public ToDoItem(String title, String taskDescription, LocalDate deadline, boolean done, Person creator) {
        this.id = TodoItemIdSequencer.nextId(); // get next id from the sequencer.
        setTitle(title); // setter for title - can not be null or empty.
        this.taskDescription = taskDescription;
        setDeadline(deadline); // Setter for localDate - can not be null.
        this.done = true;
        this.creator = creator;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    // setter for title - can not be null or empty.
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    // Setter for localDate - can not be null.
    public void setDeadline(LocalDate deadline) {
        if (deadline == null) {
            throw new IllegalArgumentException("Deadline cannot be null");
        }
        this.deadline = deadline;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    // deadLine TodoItem is overdue if current date > deadline. Not allowed to be null
    public boolean isOverdue() {
        return LocalDate.now().isAfter(deadline);
    }

    public boolean inOverdue() {
        return LocalDate.now().isAfter(deadline);
    }
    // get the summary of the toDoItem

    @Override
    public String toString() {
        return "ToDoItem{" +
                "done=" + done +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", deadline=" + deadline +
                ", creator=" + creator +
                '}';
    }


    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

} // TodoItem


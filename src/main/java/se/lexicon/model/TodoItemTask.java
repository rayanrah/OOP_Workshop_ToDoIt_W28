package se.lexicon.model;

import se.lexicon.sequencers.ToDoItemTaskIdSequencer;

public class TodoItemTask {

    private final int id;
    private boolean assigned;
    private Person assignee;
    private ToDoItem todoitem;

    // --------------Constructors-----------------//

    public TodoItemTask(ToDoItem todoitem, Person assignee) {
        this.id = ToDoItemTaskIdSequencer.nextId(); // get the next id from the sequencer package.
        setAssignee(assignee);
        setTodoitem(todoitem);
    }


//----------------Getters--------------------//

    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public ToDoItem getTodoitem() {
        return todoitem;
    }

    public void setTodoitem(ToDoItem todoitem) {
        if (todoitem == null) {
            throw new IllegalArgumentException("ToDoItem cannot be null");
        }
        this.todoitem = todoitem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        if (assignee == null) {
            this.assigned = false;
        } else {
            this.assigned = true;
            this.assignee = assignee;
        }
    }

    //----------------Setters--------------------//

    @Override
    public String toString() { //get the summary of the ToDoItemTask.
        return "TodoItemTask{" +
                "id=" + id +
                ", assigned=" + assigned +
                ", assignee=" + assignee +
                ", todoitem=" + todoitem +
                '}';
    }


} // TodoItemTask

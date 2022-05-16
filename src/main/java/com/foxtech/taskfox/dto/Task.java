package com.foxtech.taskfox.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity(name = "Task")
@Table(name = "TASK")
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taskId;
    private String task;
    private Date createDate;
    @JsonManagedReference
    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Note> notes;

    protected Task() {}

    public Task(Integer taskId, String task, Date createDate) {
        super();
        this.taskId = taskId;
        this.task = task;
        this.createDate = createDate;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }

    public void addNote(Note note) {
        notes.add(note);
        note.setTask(this);
    }

    public void removeNote(Note note) {
        notes.remove(note);
        note.setTask(null);
    }
}

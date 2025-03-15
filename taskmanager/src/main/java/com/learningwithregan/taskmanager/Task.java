package com.learningwithregan.taskmanager;

public class Task {
    private String title;
    private String description;
    private String creator;
    private String assignee;

    public Task(String title, String description, String creator, String assignee) {
        this.title = title;
        this.description = description;
        this.creator = creator;
        this.assignee = assignee;
    }

    public Task() {
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getAssignee() {
        return this.assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }
}

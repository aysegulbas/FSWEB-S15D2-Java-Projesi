package com.workintech.company.model;

import java.util.Objects;

public class Task {
    private  String project;
    private String description;
    private String assignee;
    private Priority priority;
    private Status status;



    public Task(String project, String description,String assignee, Priority priority, Status status) {
        this.project = project;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.assignee = assignee;
    }

    public String getProject() {
        return project;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }

    public String getAssignee() {
        return assignee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(project, task.project) && Objects.equals(description, task.description) && Objects.equals(assignee, task.assignee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, description, assignee);
    }

    @Override
    public String toString() {
        return "Task{" +
                "project='" + project + '\'' +
                ", description='" + description + '\'' +
                ", assignee='" + assignee + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }
}

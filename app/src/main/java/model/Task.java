package model;

import java.util.Date;

/**
 *
 * @author decio
 */
public class Task {
    private int id;
    private int idProject;
    private String name;
    private String description;
    private String notes;
    private Boolean isCompleted;
    private Date deadLine;
    private Date createdAt;
    private Date updateAt;

    public Task(int id, int idProject, String name, String description, String nodes, Boolean isCompleted, Date deadLine, Date createdAt, Date updateAt) {
        this.id = id;
        this.idProject = idProject;
        this.name = name;
        this.description = description;
        this.notes = nodes;
        this.isCompleted = isCompleted;
        this.deadLine = deadLine;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }
 
    
    // Cria nova tarefa
    public Task() {
        this.createdAt = new Date();
    }
    
//    public int getIdUpdate(int taskId) {
//        return taskId;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", idProject=" + idProject + ", name=" + name + ", description=" + description + ", notes=" + notes + ", isCompleted=" + isCompleted + ", deadLine=" + deadLine + ", createdAt=" + createdAt + ", updateAt=" + updateAt + '}';
    }
    
    
}

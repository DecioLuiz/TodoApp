package model;

import java.util.Date;

/**
 *
 * @author decio
 */
public class Project {
    private int id;
    private String name;
    private String description;
    private Date createAt;
    private Date updateAt;

    public Project() {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

//    public Project() {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.createAt = createAt;
//        this.updateAt = updateAt;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    
    
}

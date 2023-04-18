package com.example.todo_200;

public class DataModel {
    private Integer userId;
    private Integer id;
    private String title;
    private String completed;

    public DataModel(Integer userid, Integer id, String title, String completed) {
        this.userId = userid;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Integer getUserid() {
        return userId;
    }

    public void setUserid(Integer userid) {
        this.userId = userid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }
}

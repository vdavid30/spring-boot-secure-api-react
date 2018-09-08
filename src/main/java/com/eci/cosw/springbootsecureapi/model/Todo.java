package com.eci.cosw.springbootsecureapi.model;
import java.util.Date;
public class Todo {
    private String text;
    private int priority;
    private Date date;

    public Todo(){}

    public Todo(String text, int priority, Date date){
        this.text=text;
        this.priority=priority;
        this.date=date;
    }

    public Date getDate() {
        return date;
    }

    public int getPriority() {
        return priority;
    }

    public String getText() {
        return text;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setText(String text) {
        this.text = text;
    }
}

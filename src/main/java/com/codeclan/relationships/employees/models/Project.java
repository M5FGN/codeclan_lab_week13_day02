package com.codeclan.relationships.employees.models;

import javax.persistence.*;

@Entity
@Table(name="projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="projectid")
    private Long projectid;

    @Column
    private String name;

    @Column
    private int duration;

    public Project(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public Project() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

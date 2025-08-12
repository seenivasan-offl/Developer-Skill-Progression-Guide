package com.example.developerroadmap.model;

import java.util.List;

public class Topic {
    private String id;
    private String title;
    private List<String> courses;
    private List<Topic> subtopics;

    public Topic() {}

    public Topic(String id, String title, List<String> courses, List<Topic> subtopics) {
        this.id = id;
        this.title = title;
        this.courses = courses;
        this.subtopics = subtopics;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public List<String> getCourses() { return courses; }
    public void setCourses(List<String> courses) { this.courses = courses; }
    public List<Topic> getSubtopics() { return subtopics; }
    public void setSubtopics(List<Topic> subtopics) { this.subtopics = subtopics; }
}

package com.example.developerroadmap.model;

import java.util.List;

public class Role {
    private String id;
    private String name;
    private List<Topic> topics;

    public Role() {}

    public Role(String id, String name, List<Topic> topics) {
        this.id = id;
        this.name = name;
        this.topics = topics;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Topic> getTopics() { return topics; }
    public void setTopics(List<Topic> topics) { this.topics = topics; }
}

package com.example.developerroadmap.controller;

import com.example.developerroadmap.model.Role;
import com.example.developerroadmap.service.RoadmapService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roadmap")
@CrossOrigin(origins = "*")  // Enable CORS for React frontend
public class RoadmapController {

    private final RoadmapService roadmapService;

    public RoadmapController(RoadmapService roadmapService) {
        this.roadmapService = roadmapService;
    }

    @GetMapping("/roles")
    public List<Role> getRoles() {
        return roadmapService.getAllRoles();
    }

    @GetMapping("/role/{id}")
    public Role getRoleById(@PathVariable String id) {
        return roadmapService.getAllRoles()
                .stream()
                .filter(role -> role.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElse(null);
    }
}

package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/data")
public class ResourceController { // Unique class name

    // Fetch a resource by ID
    @GetMapping("/{id}")
    public ResponseEntity<String> fetchResource(@PathVariable int id) {
        return ResponseEntity.ok("✅ Successfully retrieved resource with ID: " + id);
    }

    // Create a new resource
    @PostMapping
    public ResponseEntity<String> addNewResource(@RequestBody String resourceContent) {
        return ResponseEntity.ok("🆕 New resource added with details: " + resourceContent);
    }

    // Modify an existing resource
    @PutMapping("/{id}")
    public ResponseEntity<String> modifyResource(@PathVariable int id, @RequestBody String updatedContent) {
        return ResponseEntity.ok("🔄 Resource ID " + id + " updated with: " + updatedContent);
    }

    // Remove a resource
    @DeleteMapping("/{id}")
    public ResponseEntity<String> removeResource(@PathVariable int id) {
        return ResponseEntity.ok("🗑 Resource with ID " + id + " has been successfully deleted.");
    }
}

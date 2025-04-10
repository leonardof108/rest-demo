package com.leonardof108.rest_demo.controller;

import com.leonardof108.rest_demo.model.CloudVendor;
import com.leonardof108.rest_demo.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    @Autowired
    private CloudVendorService service;

    @GetMapping("/{vendorId}")
    public ResponseEntity<CloudVendor> getVendor(@PathVariable String vendorId) {
        CloudVendor vendor = service.getVendorById(vendorId);
        if (vendor != null) {
            return ResponseEntity.ok(vendor);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping
    public ResponseEntity<List<CloudVendor>> getAllVendors() {
        List<CloudVendor> vendors = service.getAllVendors();
        return ResponseEntity.ok(vendors);
    }

    @PostMapping
    public ResponseEntity<String> createVendor(@Valid @RequestBody CloudVendor vendor) {
        String response = service.createVendor(vendor);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping
    public ResponseEntity<String> updateVendor(@Valid @RequestBody CloudVendor vendor) {
        String response = service.updateVendor(vendor);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{vendorId}")
    public ResponseEntity<String> deleteVendor(@PathVariable String vendorId) {
        String response = service.deleteVendor(vendorId);
        return ResponseEntity.ok(response);
    }
}

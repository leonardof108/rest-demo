package com.leonardof108.rest_demo.controller;

import com.leonardof108.rest_demo.model.CloudVendor;
import com.leonardof108.rest_demo.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendors")
public class CloudVendorController {

    @Autowired
    private CloudVendorService cloudVendorService;

    @GetMapping("/{vendorId}")
    public ResponseEntity<CloudVendor> getVendor(@PathVariable String vendorId) {
        CloudVendor vendor = cloudVendorService.getVendorById(vendorId);
        if (vendor == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(vendor);
    }

    @GetMapping
    public ResponseEntity<List<CloudVendor>> getAllVendors() {
        return ResponseEntity.ok(cloudVendorService.getAllVendors());
    }

    @PostMapping
    public ResponseEntity<String> createVendor(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.createVendor(cloudVendor);
        return ResponseEntity.status(201).body("Vendor created successfully");
    }

    @PutMapping
    public ResponseEntity<String> updateVendor(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.updateVendor(cloudVendor);
        return ResponseEntity.ok("Vendor updated successfully");
    }

    @DeleteMapping("/{vendorId}")
    public ResponseEntity<String> deleteVendor(@PathVariable String vendorId) {
        cloudVendorService.deleteVendor(vendorId);
        return ResponseEntity.ok("Vendor deleted successfully");
    }
}

package com.leonardof108.rest_demo.controller;

import com.leonardof108.rest_demo.model.CloudVendor;
import com.leonardof108.rest_demo.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    @Autowired
    private CloudVendorService service;

    @GetMapping("/{vendorId}")
    public CloudVendor getVendor(@PathVariable String vendorId) {
        return service.getVendorById(vendorId);
    }

    @GetMapping
    public List<CloudVendor> getAllVendors() {
        return service.getAllVendors();
    }

    @PostMapping
    public String createVendor(@RequestBody CloudVendor vendor) {
        return service.createVendor(vendor);
    }

    @PutMapping
    public String updateVendor(@RequestBody CloudVendor vendor) {
        return service.updateVendor(vendor);
    }

    @DeleteMapping("/{vendorId}")
    public String deleteVendor(@PathVariable String vendorId) {
        return service.deleteVendor(vendorId);
    }
}

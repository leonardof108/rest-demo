package com.leonardof108.rest_demo.service;

import com.leonardof108.rest_demo.model.CloudVendor;
import com.leonardof108.rest_demo.repository.CloudVendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorService {

    @Autowired
    private CloudVendorRepository repository;

    public CloudVendor getVendorById(String vendorId) {
        return repository.findById(vendorId).orElse(null);
    }

    public List<CloudVendor> getAllVendors() {
        return repository.findAll();
    }

    public String createVendor(CloudVendor vendor) {
        repository.save(vendor);
        return "Vendor created successfully!";
    }

    public String updateVendor(CloudVendor vendor) {
        repository.save(vendor);
        return "Vendor updated successfully!";
    }

    public String deleteVendor(String vendorId) {
        repository.deleteById(vendorId);
        return "Vendor deleted successfully!";
    }
}

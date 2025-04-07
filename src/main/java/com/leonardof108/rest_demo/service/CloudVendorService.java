package com.leonardof108.rest_demo.service;

import com.leonardof108.rest_demo.model.CloudVendor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CloudVendorService {
    private final Map<String, CloudVendor> vendorMap = new HashMap<>();

    public CloudVendor getVendorById(String vendorId) {
        return vendorMap.get(vendorId);
    }

    public List<CloudVendor> getAllVendors() {
        return new ArrayList<>(vendorMap.values());
    }

    public void createVendor(CloudVendor cloudVendor) {
        vendorMap.put(cloudVendor.getVendorId(), cloudVendor);
    }

    public void updateVendor(CloudVendor cloudVendor) {
        vendorMap.put(cloudVendor.getVendorId(), cloudVendor);
    }

    public void deleteVendor(String vendorId) {
        vendorMap.remove(vendorId);
    }
}

package com.leonardof108.rest_demo.controller;

import com.leonardof108.rest_demo.model.CloudVendor;
import com.leonardof108.rest_demo.service.CloudVendorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CloudVendorControllerTest {

    @Mock
    private CloudVendorService service;

    @InjectMocks
    private CloudVendorController controller;

    private CloudVendor vendor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        vendor = new CloudVendor("1", "VendorName", "VendorAddress", "1234567890");
    }

    @Test
    void testGetVendor() {
        when(service.getVendorById("1")).thenReturn(vendor);
        ResponseEntity<CloudVendor> response = controller.getVendor("1");
        assertEquals(200, response.getStatusCodeValue());
        assertNotNull(response.getBody());
        assertEquals("VendorName", response.getBody().getVendorName());
    }

    @Test
    void testGetAllVendors() {
        when(service.getAllVendors()).thenReturn(Arrays.asList(vendor));
        ResponseEntity<List<CloudVendor>> response = controller.getAllVendors();
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(1, response.getBody().size());
    }

    @Test
    void testCreateVendor() {
        when(service.createVendor(vendor)).thenReturn("Vendor created successfully!");
        ResponseEntity<String> response = controller.createVendor(vendor);
        assertEquals(201, response.getStatusCodeValue());
        assertEquals("Vendor created successfully!", response.getBody());
    }

    @Test
    void testUpdateVendor() {
        when(service.updateVendor(vendor)).thenReturn("Vendor updated successfully!");
        ResponseEntity<String> response = controller.updateVendor(vendor);
        assertEquals(200, response.getStatusCodeValue());
        assertEquals("Vendor updated successfully!", response.getBody());
    }

    @Test
    void testDeleteVendor() {
        when(service.deleteVendor("1")).thenReturn("Vendor deleted successfully!");
        ResponseEntity<String> response = controller.deleteVendor("1");
        assertEquals(200, response.getStatusCodeValue());
        assertEquals("Vendor deleted successfully!", response.getBody());
    }
}

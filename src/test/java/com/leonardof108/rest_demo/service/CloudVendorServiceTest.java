package com.leonardof108.rest_demo.service;

import com.leonardof108.rest_demo.model.CloudVendor;
import com.leonardof108.rest_demo.repository.CloudVendorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CloudVendorServiceTest {

    @Mock
    private CloudVendorRepository repository;

    @InjectMocks
    private CloudVendorService service;

    private CloudVendor vendor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        vendor = new CloudVendor("1", "VendorName", "VendorAddress", "1234567890");
    }

    @Test
    void testGetVendorById() {
        when(repository.findById("1")).thenReturn(Optional.of(vendor));
        CloudVendor result = service.getVendorById("1");
        assertNotNull(result);
        assertEquals("VendorName", result.getVendorName());
    }

    @Test
    void testGetAllVendors() {
        when(repository.findAll()).thenReturn(Arrays.asList(vendor));
        assertEquals(1, service.getAllVendors().size());
    }

    @Test
    void testCreateVendor() {
        when(repository.save(vendor)).thenReturn(vendor);
        String response = service.createVendor(vendor);
        assertEquals("Vendor created successfully!", response);
        verify(repository, times(1)).save(vendor);
    }

    @Test
    void testUpdateVendor() {
        when(repository.save(vendor)).thenReturn(vendor);
        String response = service.updateVendor(vendor);
        assertEquals("Vendor updated successfully!", response);
        verify(repository, times(1)).save(vendor);
    }

    @Test
    void testDeleteVendor() {
        doNothing().when(repository).deleteById("1");
        String response = service.deleteVendor("1");
        assertEquals("Vendor deleted successfully!", response);
        verify(repository, times(1)).deleteById("1");
    }
}

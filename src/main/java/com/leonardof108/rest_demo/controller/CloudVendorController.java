package com.leonardof108.rest_demo.controller;

import com.leonardof108.rest_demo.model.CloudVendor;
import com.leonardof108.rest_demo.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public String createVendor(@Valid @RequestBody CloudVendor vendor) {
        return service.createVendor(vendor);
    }

    @PutMapping
    public String updateVendor(@Valid @RequestBody CloudVendor vendor) {
        return service.updateVendor(vendor);
    }

    @DeleteMapping("/{vendorId}")
    public String deleteVendor(@PathVariable String vendorId) {
        return service.deleteVendor(vendorId);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> 
            errors.put(error.getField(), error.getDefaultMessage()));
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}

package com.leonardof108.rest_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CloudVendor {
    @Id
    @NotBlank(message = "Vendor ID cannot be blank")
    private String vendorId;

    @NotBlank(message = "Vendor name cannot be blank")
    private String vendorName;

    @NotBlank(message = "Vendor address cannot be blank")
    private String vendorAddress;

    @NotBlank(message = "Vendor phone number cannot be blank")
    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    private String vendorPhoneNumber;
}

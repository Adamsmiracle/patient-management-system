package com.pm.patientservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class PatientResponseDTO {
    private String id;
    private String name;
    private String email;
    private String address;
    private LocalDate dateOfBirth;
}

package com.kingslymokgwathi.tshimologong_api.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Entity
@Data
public class Survey {
    @Id
    @GeneratedValue
    private UUID id;

    private String fullName;
    private String email;
    private LocalDate dateOfBirth;
    private String contactNumber;
    @ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "books", joinColumns = @JoinColumn(name = "library_id"))
    private List<String> favoriteFood = new ArrayList<>();
    @Embedded
    private Preference preference;
}

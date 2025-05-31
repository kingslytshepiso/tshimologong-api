package com.kingslymokgwathi.tshimologong_api.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.kingslymokgwathi.tshimologong_api.enums.Rating;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
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
    @CollectionTable(name = "food", joinColumns = @JoinColumn(name = "food_id"))
    private List<String> favoriteFood = new ArrayList<>();
    @ElementCollection(targetClass = Rating.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "ratings", joinColumns = @JoinColumn(name = "survey_id"))
    private Map<String, Rating> ratings;
}

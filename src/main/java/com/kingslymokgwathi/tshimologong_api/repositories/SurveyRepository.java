package com.kingslymokgwathi.tshimologong_api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kingslymokgwathi.tshimologong_api.models.Survey;

public interface SurveyRepository extends JpaRepository<Survey, UUID> {

}

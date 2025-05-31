package com.kingslymokgwathi.tshimologong_api.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.kingslymokgwathi.tshimologong_api.models.Survey;
import com.kingslymokgwathi.tshimologong_api.repositories.SurveyRepository;

@Service
public class SurveyService {
    private final SurveyRepository surveyRepository;

    public SurveyService(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    public Survey createSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }

    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    public Survey getSurveyById(UUID id) {
        return surveyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Survey not found"));
    }

}

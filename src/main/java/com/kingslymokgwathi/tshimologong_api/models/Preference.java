package com.kingslymokgwathi.tshimologong_api.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class Preference {
    private RatingItem watchingMovies;
    private RatingItem watchingTv;
    private RatingItem listeningToRadio;
    private RatingItem eatingOut;

}

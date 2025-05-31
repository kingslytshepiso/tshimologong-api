package com.kingslymokgwathi.tshimologong_api.models;

import com.kingslymokgwathi.tshimologong_api.enums.Rating;
import lombok.Data;

@Data
public class RatingItem {
    private String question;
    private Rating rating;
}

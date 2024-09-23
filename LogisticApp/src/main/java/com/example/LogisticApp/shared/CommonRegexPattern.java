package com.example.LogisticApp.shared;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CommonRegexPattern {

    private final String departmentRegex = "^[A-Za-z0-9]{3,20}$";
    private final String municipalityRegex = "^[A-Za-z0-9\\s\\-']{3,50}$";
    private final String addressRegex = "^[A-Za-z0-9\\s\\#\\-]+\\s[A-Za-z0-9\\s\\#\\-]+\\s[A-Za-z0-9\\s\\#\\-]+$";

}

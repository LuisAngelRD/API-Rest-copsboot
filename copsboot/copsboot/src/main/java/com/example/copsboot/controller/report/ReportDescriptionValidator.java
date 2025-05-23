package com.example.copsboot.controller.report;



import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ReportDescriptionValidator implements ConstraintValidator<ValidReportDescription, String> { //<1>

    @Override
    public void initialize(ValidReportDescription constraintAnnotation) { //<2>
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean result = true;
        if (!value.toLowerCase().contains("suspect")) { //<3>
            result = false;
        }
        return result;
    }
}
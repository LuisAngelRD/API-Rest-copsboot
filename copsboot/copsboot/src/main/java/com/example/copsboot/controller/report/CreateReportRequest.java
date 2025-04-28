package com.example.copsboot.controller.report;

import java.time.Instant;

import com.example.copsboot.jpa.UserId;
import com.example.copsboot.model.report.CreateReportParameters;

public record CreateReportRequest(Instant dateTime, @ValidReportDescription String description) {
    public CreateReportParameters toParameters(UserId userId) {
        return new CreateReportParameters(userId, dateTime, description);
    }
}
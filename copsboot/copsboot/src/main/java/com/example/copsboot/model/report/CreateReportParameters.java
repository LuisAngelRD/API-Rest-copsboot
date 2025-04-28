package com.example.copsboot.model.report;


import java.time.Instant;

import com.example.copsboot.jpa.UserId;

public record CreateReportParameters(UserId userId, Instant dateTime, String description) {
}
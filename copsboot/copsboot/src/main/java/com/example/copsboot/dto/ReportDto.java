package com.example.copsboot.dto;


import java.time.Instant;

import com.example.copsboot.model.report.Report;
import com.example.copsboot.model.report.ReportId;
import com.example.copsboot.service.user.UserService;

public record ReportDto(ReportId id, String reporter, Instant dateTime, String description) {

    public static ReportDto fromReport(Report report, UserService userService) {
    String reporterEmail = userService.getUserById(report.getReporterId())
            .orElseThrow(() -> new IllegalArgumentException("User not found: " + report.getReporterId()))
            .getEmail();

    return new ReportDto(
            report.getId(),
            reporterEmail,
            report.getDateTime(),
            report.getDescription()
    );
}
}
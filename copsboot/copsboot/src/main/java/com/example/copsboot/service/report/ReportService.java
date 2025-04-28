package com.example.copsboot.service.report;

import org.springframework.stereotype.Service;

import com.example.copsboot.model.report.CreateReportParameters;
import com.example.copsboot.model.report.Report;
import com.example.copsboot.repository.report.ReportRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ReportService {

    private final ReportRepository repository;

    public ReportService(ReportRepository reportRepository) {
        this.repository = reportRepository;
    }

    public Report createReport(CreateReportParameters parameters) {
        return repository.save(new Report(repository.nextId(),
                parameters.userId(),
                parameters.dateTime(),
                parameters.description()));
    }
    
}

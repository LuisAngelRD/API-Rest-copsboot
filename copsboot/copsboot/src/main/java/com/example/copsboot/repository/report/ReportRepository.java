package com.example.copsboot.repository.report;



import org.springframework.data.repository.CrudRepository;

import com.example.copsboot.model.report.Report;
import com.example.copsboot.model.report.ReportId;

public interface ReportRepository extends CrudRepository<Report, ReportId>, ReportRepositoryCustom {
}
package com.example.copsboot.repository.report;


import java.util.UUID;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.copsboot.jpa.UniqueIdGenerator;
import com.example.copsboot.model.report.ReportId;

@Repository
@Transactional
public class ReportRepositoryImpl implements ReportRepositoryCustom {

    private final UniqueIdGenerator<UUID> generator;

    public ReportRepositoryImpl(UniqueIdGenerator<UUID> generator) {
        this.generator = generator;
    }

    @Override
    public ReportId nextId() {
        return new ReportId(generator.getNextUniqueId());
    }
}
package com.example.copsboot.model.report;



import java.util.UUID;

import com.example.copsboot.jpa.AbstractEntityId;

public class ReportId extends AbstractEntityId<UUID> {
    protected ReportId() {
    }

    public ReportId(UUID id) {
        super(id);
    }
}
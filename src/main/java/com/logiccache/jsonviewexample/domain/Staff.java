package com.logiccache.jsonviewexample.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class Staff {
    private String id;

    private String name;

    private LocalDate dateOfBirth;

    private String department;

    private BigDecimal salary;

    private boolean secureRecord;
}

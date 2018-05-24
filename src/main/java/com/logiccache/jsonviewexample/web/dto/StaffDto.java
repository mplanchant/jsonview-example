package com.logiccache.jsonviewexample.web.dto;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import com.logiccache.jsonviewexample.web.View;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class StaffDto {

    private Long id;

    @JsonView(View.Public.class)
    private String name;

    @JsonView(View.Admin.class)
    private LocalDate dateOfBirth;

    @JsonView({View.Public.class, View.Payroll.class})
    private String department;

    @JsonView(View.Payroll.class)
    private BigDecimal salary;

    @JsonView(View.Private.class)
    private boolean secureRecord;
}

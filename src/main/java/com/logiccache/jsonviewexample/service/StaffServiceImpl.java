package com.logiccache.jsonviewexample.service;

import com.logiccache.jsonviewexample.domain.Staff;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

@Service
public class StaffServiceImpl implements StaffService {
    @Override
    public Staff staffMember(String id) {
        return Staff.builder()
                .id("1000")
                .name("Joe Bloggs")
                .dateOfBirth(LocalDate.of(2010, Month.AUGUST, 3))
                .department("IT")
                .salary(BigDecimal.TEN)
                .secureRecord(true)
                .build();
    }
}

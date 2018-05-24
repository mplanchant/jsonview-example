package com.logiccache.jsonviewexample.web;

import com.fasterxml.jackson.annotation.JsonView;
import com.logiccache.jsonviewexample.web.dto.StaffDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface StaffController {

    @JsonView(View.Public.class)
    @GetMapping(value = "/public/staff/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    default StaffDto getStaffMemberPublic(@PathVariable("id") String id) {
        return doGetStaffMember(id);
    }

    @JsonView(View.Payroll.class)
    @GetMapping(value = "/payroll/staff/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    default StaffDto getStaffMemberPayroll(@PathVariable("id") String id) {
        return doGetStaffMember(id);
    }

    StaffDto doGetStaffMember(String id);
}

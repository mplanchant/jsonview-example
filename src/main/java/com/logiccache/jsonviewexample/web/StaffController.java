package com.logiccache.jsonviewexample.web;

import com.logiccache.jsonviewexample.web.dto.StaffDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface StaffController {

    @GetMapping(value = "/staff/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    default StaffDto getStaffMember(@PathVariable("id") String id) {
        return doGetStaffMember(id);
    }

    StaffDto doGetStaffMember(String id);
}

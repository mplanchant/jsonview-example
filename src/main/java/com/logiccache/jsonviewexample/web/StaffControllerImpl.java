package com.logiccache.jsonviewexample.web;

import com.logiccache.jsonviewexample.service.StaffService;
import com.logiccache.jsonviewexample.web.dto.StaffDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffControllerImpl implements StaffController {

    private StaffService staffService;
    private ModelMapper modelMapper;

    @Autowired
    public StaffControllerImpl(StaffService staffService, ModelMapper modelMapper) {
        this.staffService = staffService;
        this.modelMapper = modelMapper;
    }

    @Override
    public StaffDto doGetStaffMember(String id) {
        return modelMapper.map(staffService.staffMember(id), StaffDto.class);
    }
}

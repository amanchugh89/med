package com.aws.hack.controller;

import com.aws.hack.entity.ImageRecord;
import com.aws.hack.service.ImageRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
@RequestMapping("/hack")
public class Controller {
    @Autowired
    ImageRecordService recordService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Application!";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @Consumes(MediaType.APPLICATION_JSON)
    public void add(@RequestBody ImageRecord record) throws Exception {
        recordService.submitDetails(record);
    }
}

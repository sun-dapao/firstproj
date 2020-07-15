package com.example.firstproj.controller;

import com.example.firstproj.entity.User;
import com.example.firstproj.entity.WorkReport;
import com.example.firstproj.entity.response.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class WorkReportController {
    @CrossOrigin
    @PostMapping(value = "api/workReport/queryList")
    @ResponseBody
    public List<WorkReport> login(@RequestBody String requestString) {
        WorkReport report1 = new WorkReport();
        report1.setDate("2001");
        report1.setName("aa");
        List<WorkReport> workReportList = new ArrayList<>();
        workReportList.add(report1);
        workReportList.add(report1);
        return  workReportList;
    }
}

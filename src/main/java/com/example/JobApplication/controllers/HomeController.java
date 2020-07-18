package com.example.JobApplication.controllers;

import com.example.JobApplication.domain.Job;
import com.example.JobApplication.repository.JobDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("job")
public class HomeController {

    public JobDao jobDao;

    @Autowired
    public HomeController(JobDao jobDao) {
    this.jobDao = jobDao;
    }

    @GetMapping("/home")
    public List<Job> Index()
    {

        return jobDao.findAll();
    }

    @GetMapping("/filter")
    public Job filter(@RequestParam("query") String query)
    {
        Job xs = new Job();
//        homeDao.save(x);
        return xs;
    }

    @GetMapping("/list")
    public Job Show()
    {
        Job x = new Job();
        jobDao.save(x);
        return x;
    }


    @GetMapping("/edit")
    public Job edit()
    {
        Job x = new Job();
        jobDao.save(x);
        return x;
    }


    @GetMapping("/edit")
    public Job insert()
    {
        Job x = new Job();
        jobDao.save(x);
        return x;
    }




}

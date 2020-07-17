package com.example.JobApplication.controllers;

import com.example.JobApplication.domain.Job;
import com.example.JobApplication.repository.HomeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.UUID;

@RestController
public class HomeController {



   public HomeDao homeDao;

    @Autowired
    public HomeController(HomeDao homeDao) {
    this.homeDao = homeDao;
    }

    @GetMapping("/home")
    public Job Index()
    {
        Job x = new Job(UUID.randomUUID(),"Front-end");
        homeDao.save(x);
        return x;
    }


    @GetMapping("/job/list")
    public Job Show()
    {
        Job x = new Job(UUID.randomUUID(),"Front-end");
        homeDao.save(x);
        return x;
    }


    @GetMapping("/home")
    public Job edit()
    {
        Job x = new Job(UUID.randomUUID(),"Front-end");
        homeDao.save(x);
        return x;
    }



    @GetMapping("/home")
    public Job delete()
    {
        Job x = new Job(UUID.randomUUID(),"Front-end");
        homeDao.save(x);
        return x;
    }



    @GetMapping("/home")
    public Job update()
    {
        Job x = new Job(UUID.randomUUID(),"Front-end");
        homeDao.save(x);
        return x;
    }



}

package com.example.demo.controller;

import com.example.demo.model.Developer;
import com.example.demo.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeveloperController {

    @Autowired
    private DeveloperService devService;

    @GetMapping("/developer")
    public List<Developer> getDevelopers(){
        return this.devService.getDeveloper();
    }

    @PostMapping("/developer")
    public Developer addDeveloper(@RequestBody Developer dev){

        return this.devService.addDeveloper(dev);
    }

    @DeleteMapping("/developer/{devId}")
    public String deleteDeveloper(@PathVariable int devId){

        return this.devService.deleteDeveloper(devId);
    }

    @PutMapping("/developer/{devId}")
    public String updateDeveloper(@RequestBody Developer developer ,@PathVariable int devId){

         this.devService.updateDeveloper(developer,devId);
        return "Developer is updated successfully";


    }
}

package com.example.hackathon.dal;

import com.example.hackathon.models.Project;
import com.example.hackathon.models.Scope;
import com.example.hackathon.models.User;
import com.example.hackathon.repository.projectRepository;
import com.example.hackathon.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class projectsApi {

    @Autowired
    private projectRepository projectRepository;
    @Autowired
    private userRepository userRepository;

    @GetMapping("/getAllProjects")
    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    @GetMapping("/getProjectByScope")
    public Project getProjectByScope(@RequestParam Scope requastedScope) {
        return projectRepository.findAllByProjectScope(requastedScope);
    }
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/getUserByScope")
    public User getUserByScope(@RequestParam Scope requastedScope){
        return userRepository.findAllByUserScope(requastedScope);
    }
}

package com.example.hackathon.repository;

import com.example.hackathon.models.Project;
import com.example.hackathon.models.Scope;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface projectRepository extends MongoRepository<Project, String> {
    Project findAllByProjectScope(Scope scope);
}

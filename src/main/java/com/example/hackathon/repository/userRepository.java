package com.example.hackathon.repository;

import com.example.hackathon.models.Project;
import com.example.hackathon.models.Scope;
import com.example.hackathon.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends MongoRepository<User,String> {
    User findAllByUserScope(Scope scope);

}

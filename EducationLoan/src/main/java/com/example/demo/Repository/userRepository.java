package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.userModel;
@Repository
public interface userRepository extends JpaRepository<userModel, Integer> {

}

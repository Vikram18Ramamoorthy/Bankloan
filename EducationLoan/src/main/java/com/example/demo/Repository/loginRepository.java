package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.loginModel;

@Repository
public interface loginRepository  extends JpaRepository<loginModel, String>{

	

}

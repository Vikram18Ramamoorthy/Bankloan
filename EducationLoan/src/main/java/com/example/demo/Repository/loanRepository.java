package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.loanApplicationModel;

@Repository
public interface loanRepository extends JpaRepository<loanApplicationModel,Integer> {
	
	

}

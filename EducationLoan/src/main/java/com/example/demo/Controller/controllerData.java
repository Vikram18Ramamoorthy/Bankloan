package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.adminModdel;
import com.example.demo.Model.loanApplicationModel;
import com.example.demo.Service.serviceData;

@RestController
public class controllerData {
	
	@Autowired
	serviceData service;
	
	
	//---------------Admin-----------
	@PostMapping("/post")
	public String create(@RequestBody adminModdel admin )
	{
		return service.addAdmin(admin);
	}
	
	@GetMapping("/get")
	public List<adminModdel>read()
	{
		return service.getAdmin();
	}
	
	
	@PutMapping("/update")
	public String update(@RequestBody adminModdel admin)
	{
		return service.updateAdmin(admin);
	}
	
	@DeleteMapping("/delete/{Email}")
	public String delete(@RequestParam("Email") String Email)
	{
		service.deleteAdmin(Email);
		return "deleted";
	}
	
	
	
	
	//----------------Loan Application---------
	
	@PostMapping("/postloan")
	public String createLoan(@RequestBody loanApplicationModel loan )
	{
		return service.addLoan(loan);
	}
	
	@GetMapping("/getloan")
	public List<loanApplicationModel> readLoan()
	{
		return service.getLoan();
	}
	
	
	@PutMapping("/updateloan")
	public String updateLoan(@RequestBody loanApplicationModel loan)
	{
		return service.updateLoan(loan);
	}
	
	@DeleteMapping("/deleteloan/{cid}")
	public String deleteLoan(@RequestParam("cid") int loanId)
	{
		service.deleteLoan(loanId);
		return "deleted";
	}
	
	
	
	
	
	
	
	
}
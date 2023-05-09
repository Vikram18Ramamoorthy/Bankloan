package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.adminModdel;
import com.example.demo.Model.loanApplicationModel;
import com.example.demo.Repository.adminRepository;
import com.example.demo.Repository.loanRepository;
import com.example.demo.Repository.loginRepository;
import com.example.demo.Repository.userRepository;
@Service
public class serviceData {
	

	@Autowired
	loginRepository logrep;
	
	@Autowired
	userRepository  userep;
	
	@Autowired
	adminRepository adminrep;
	
	
	@Autowired
	loanRepository loanrep;

	
	//---------admin--------------
	public String addAdmin(adminModdel admin) {
		// TODO Auto-generated method stub
		adminrep.save(admin);
		return "Add";
		
	}

	public List<adminModdel> getAdmin() {
		// TODO Auto-generated method stub
		return adminrep.findAll();

	}

	public String updateAdmin(adminModdel admin) {
		// TODO Auto-generated method stub
		adminrep.save(admin);
		return null;
	}

	public void deleteAdmin(String Email) {
		// TODO Auto-generated method stub
		adminrep.deleteById(Email);
		
	}
	
	
	
	
	//----------------------loan application-------------------

	public String addLoan(loanApplicationModel loan) {
		// TODO Auto-generated method stub
		loanrep.save(loan);
		return "Add";
	}

	public List<loanApplicationModel> getLoan() {
		// TODO Auto-generated method stub
		return loanrep.findAll();
	}

	

	public void deleteLoan(int loanId) {
		// TODO Auto-generated method stub
		loanrep.deleteById(loanId);
		
	}

	public String updateLoan(loanApplicationModel loan) {
		// TODO Auto-generated method stub
		loanrep.save(loan);
		return "updated";
	}

	
	
}

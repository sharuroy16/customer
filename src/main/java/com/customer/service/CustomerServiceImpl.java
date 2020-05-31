package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.customer.entity.Logindetails;
import com.customer.repository.LoginRepository;

@Component("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired 
	private LoginRepository loginRepository;
	
	public Logindetails validateUser(String username, String userpassword) {
		return loginRepository.validateUser(username, userpassword);
	}
	
	public void save(Logindetails logindetails) {
		loginRepository.save(logindetails);
	}
	public List<Logindetails> listAllLoginDetails() {
		return (List<Logindetails>) loginRepository.findAll();
	}
	public Logindetails get(Long id) {
		return loginRepository.findById(id).get();
	}
	public void delete(Long id) {
		loginRepository.deleteById(id);
	}
}
package com.customer.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.customer.entity.Logindetails;

@Service
public interface CustomerService {

	public Logindetails validateUser(String username, String userpassword);
	public void save(Logindetails logindetails);
	public List<Logindetails> listAllLoginDetails();
	public Logindetails get(Long id);
	public void delete(Long id);
}
package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entity.Gpay;
import com.repository.GpayRepository;

@Service
public class GpayService {

	@Autowired
	GpayRepository gpayRepository;
	
	@Autowired
	RestTemplate restTemplate;			// this class help us to call rest api develop using any language. 
	
	public String createGpayAccount(Gpay gpay) {
		String emailid = gpay.getEmailid();
		//int result = restTemplate.getForObject("http://localhost:8383/account/findaccno/"+emailid, Integer.class);
		int result = restTemplate.getForObject("http://ACCOUNTMICROSERVICE/account/findaccno/"+emailid, Integer.class);
		if(result==-1) {
			return "Account not register with emailid";
		}else {
			gpay.setAccno(result);
			gpayRepository.save(gpay);
			return "Gpay account created successfully";
		}
	}
}
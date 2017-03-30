package com.tf.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tf.entity.Billing;
import com.tf.service.BillingService;

@RestController
public class BillingController {
	
	@Autowired
	private BillingService billingService;
	
	private Logger logger = Logger.getLogger(BillingController.class);
	
	@RequestMapping(value="/doBilling",method=RequestMethod.POST)
	public Boolean doBilling(@RequestBody Billing billing) {
		logger.info("Billing Service Started....");
		Boolean response = Boolean.FALSE;
		try {
			response = billingService.doBilling(billing);
		}catch(Exception exception) {
			logger.error("Error Occured In Billig Service...\n"+exception);
		}
		logger.info("Billing Service Ended....");
		return response;
	}

}

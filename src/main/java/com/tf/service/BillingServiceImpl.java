package com.tf.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.tf.entity.Billing;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Override
	public Boolean doBilling(Billing billing) {
		
		
		
		String actExpiryDate = "2023-1-31";
		String userExpiryDate = billing.getYear()+"-"+billing.getMonth()+"-31";
		
		
		SimpleDateFormat  dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date actExpiryDate1 = dateFormat.parse(actExpiryDate);
			Date userExpiryDate1 = dateFormat.parse(userExpiryDate);
			
			if("cgdemo".equalsIgnoreCase(billing.getUserName())
					&& "0123456789012345".equalsIgnoreCase(billing.getCardNo())
					&& billing.getCvv() == 123
					&& actExpiryDate1.getTime() == userExpiryDate1.getTime()
						) {
					return Boolean.TRUE;
				}
				return Boolean.FALSE;
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Boolean.FALSE;
	}
	
}

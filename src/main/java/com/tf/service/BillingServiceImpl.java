package com.tf.service;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.tf.entity.Billing;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Override
	public Boolean doBilling(Billing billing) {
		Calendar calendar = Calendar.getInstance();
		Integer date = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		calendar.set(billing.getYear(), billing.getMonth(), date);
		System.out.println("Time in millis "+calendar.getTimeInMillis()); //
		Date currentDate = new Date();
		if("capgemini".equalsIgnoreCase(billing.getUserName())
			&& "0123456789012345".equalsIgnoreCase(billing.getCardNo())
			&& billing.getCvv() == 123
			&& currentDate.getTime() <= 1677846062830L
				) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
}

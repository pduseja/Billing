package com.tf.entity;


public class Billing {
	
	private String userName;
	private String cardNo;
	private Long cvv;
	private Integer year;
	private Integer month;
	private Float amount;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public Long getCvv() {
		return cvv;
	}
	public void setCvv(Long cvv) {
		this.cvv = cvv;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
}

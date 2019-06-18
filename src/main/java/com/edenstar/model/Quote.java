package com.edenstar.model;

import java.util.Date;

public class Quote {

	private int customerID;
	private int kioskID;
	private int employeeID;
	private int quoteId;
	private String emailIDManager;

	private Date quoteDate;
	private Date startDate;
	private Date endDate;

	private int expired;
	private int isApproved;
	private int leaseLength;
	private double rate;

	private double totalLease;
	private int validFor;

	private byte[] quotationPdf;

	public Quote(int customerID, int kioskID, int employeeID, int quoteId, String emailIDManager, Date quoteDate,
			Date startDate, Date endDate, int expired, int isApproved, int leaseLength, double rate, double totalLease,
			int validFor, byte[] quotationPdf) {
		super();
		this.customerID = customerID;
		this.kioskID = kioskID;
		this.employeeID = employeeID;
		this.quoteId = quoteId;
		this.emailIDManager = emailIDManager;
		this.quoteDate = quoteDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.expired = expired;
		this.isApproved = isApproved;
		this.leaseLength = leaseLength;
		this.rate = rate;
		this.totalLease = totalLease;
		this.validFor = validFor;
		this.quotationPdf = quotationPdf;
	}

	public Quote() {
		super();
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getKioskID() {
		return kioskID;
	}

	public void setKioskID(int kioskID) {
		this.kioskID = kioskID;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(int quoteId) {
		this.quoteId = quoteId;
	}

	public String getEmailIDManager() {
		return emailIDManager;
	}

	public void setEmailIDManager(String emailIDManager) {
		this.emailIDManager = emailIDManager;
	}

	public Date getQuoteDate() {
		return quoteDate;
	}

	public void setQuoteDate(Date quoteDate) {
		this.quoteDate = quoteDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getExpired() {
		return expired;
	}

	public void setExpired(int expired) {
		this.expired = expired;
	}

	public int getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(int isApproved) {
		this.isApproved = isApproved;
	}

	public int getLeaseLength() {
		return leaseLength;
	}

	public void setLeaseLength(int leaseLength) {
		this.leaseLength = leaseLength;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getTotalLease() {
		return totalLease;
	}

	public void setTotalLease(double totalLease) {
		this.totalLease = totalLease;
	}

	public int getValidFor() {
		return validFor;
	}

	public void setValidFor(int validFor) {
		this.validFor = validFor;
	}

	public byte[] getQuotationPdf() {
		return quotationPdf;
	}

	public void setQuotationPdf(byte[] quotationPdf) {
		this.quotationPdf = quotationPdf;
	}

	@Override
	public String toString() {
		return "Quote [customerID=" + customerID + ", kioskID=" + kioskID + ", employeeID=" + employeeID + ", quoteId="
				+ quoteId + ", emailIDManager=" + emailIDManager + ", quoteDate=" + quoteDate + ", startDate="
				+ startDate + ", endDate=" + endDate + ", expired=" + expired + ", isApproved=" + isApproved
				+ ", leaseLength=" + leaseLength + ", rate=" + rate + ", totalLease=" + totalLease + ", validFor="
				+ validFor + "]";
	}

}
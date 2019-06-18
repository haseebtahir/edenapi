package com.edenstar.model;

import java.util.Arrays;
import java.util.Date;

public class Contract {

	private int contractID;
	private int quoteID;
	private Date approvalDate;
	private String comments;

	private int flagForManager;
	private int isApproved;
	private int retainDeposit;

	private byte[] contractPdf;
	private byte[] thankYouLetterPdf;

	public Contract() {
		super();
	}

	public Contract(int contractID, int quoteID, Date approvalDate, String comments, int flagForManager, int isApproved,
			int retainDeposit, byte[] contractPdf, byte[] thankYouLetterPdf) {
		super();
		this.contractID = contractID;
		this.quoteID = quoteID;
		this.approvalDate = approvalDate;
		this.comments = comments;
		this.flagForManager = flagForManager;
		this.isApproved = isApproved;
		this.retainDeposit = retainDeposit;
		this.contractPdf = contractPdf;
		this.thankYouLetterPdf = thankYouLetterPdf;
	}

	public int getContractID() {
		return contractID;
	}

	public void setContractID(int contractID) {
		this.contractID = contractID;
	}

	public int getQuoteID() {
		return quoteID;
	}

	public void setQuoteID(int quoteID) {
		this.quoteID = quoteID;
	}

	public Date getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getFlagForManager() {
		return flagForManager;
	}

	public void setFlagForManager(int flagForManager) {
		this.flagForManager = flagForManager;
	}

	public int getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(int isApproved) {
		this.isApproved = isApproved;
	}

	public int getRetainDeposit() {
		return retainDeposit;
	}

	public void setRetainDeposit(int retainDeposit) {
		this.retainDeposit = retainDeposit;
	}

	public byte[] getContractPdf() {
		return contractPdf;
	}

	public void setContractPdf(byte[] contractPdf) {
		this.contractPdf = contractPdf;
	}

	public byte[] getThankYouLetterPdf() {
		return thankYouLetterPdf;
	}

	public void setThankYouLetterPdf(byte[] thankYouLetterPdf) {
		this.thankYouLetterPdf = thankYouLetterPdf;
	}

	@Override
	public String toString() {
		return "Contract [contractID=" + contractID + ", quoteID=" + quoteID + ", approvalDate=" + approvalDate
				+ ", comments=" + comments + ", flagForManager=" + flagForManager + ", isApproved=" + isApproved
				+ ", retainDeposit=" + retainDeposit + ", contractPdf=" + Arrays.toString(contractPdf)
				+ ", thankYouLetterPdf=" + Arrays.toString(thankYouLetterPdf) + "]";
	}

}
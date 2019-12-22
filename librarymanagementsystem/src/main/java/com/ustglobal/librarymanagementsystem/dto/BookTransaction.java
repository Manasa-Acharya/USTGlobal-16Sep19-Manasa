package com.ustglobal.librarymanagementsystem.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booktransaction")
public class BookTransaction {

	@Id
	@Column
	@GeneratedValue
	private int transactionId;
	@Column
	private Date issueDate;
	@Column
	private Date returDate;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getReturDate() {
		return returDate;
	}
	public void setReturDate(Date returDate) {
		this.returDate = returDate;
	}
}

package edu.ifg.lessons.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String holder;
	private String number;
	private String bank;
	private Double funds;
	
	
	public Account() {
		super();
	}

	public Account(String holder, String number, String bank, Double funds) {
		super();
		this.holder = holder;
		this.number = number;
		this.bank = bank;
		this.funds = funds;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public Double getFunds() {
		return funds;
	}
	public void setFunds(Double funds) {
		this.funds = funds;
	}
}

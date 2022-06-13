package com.carrental.carrental.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "s22_s003_16_insurancetype")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceType {

	@Id
	@Column(name = "insurance_id")
	private Integer insuranceId;

	@Column(name = "daily_cost")
	private Integer dailyCost;

	@Column(name = "coverage_limit")
	private Integer coverageLimit;

	@Column(name = "provider")
	private String provider;

}

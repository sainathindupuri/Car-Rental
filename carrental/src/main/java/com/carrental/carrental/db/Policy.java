package com.carrental.carrental.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "s22_s003_16_policy")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Policy {

	@Id
	@Column(name = "policy_id")
	private Integer policyId;

	@OneToOne
	@JoinColumn(name = "insurance_id")
	private InsuranceType insuranceId;

}

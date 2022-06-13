package com.carrental.carrental.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "s22_s003_16_cartype")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarType {

	@Id
	@Column(name = "type_id")
	private Integer typeId;

	@Column(name = "type")
	private String type;

	@Column(name = "seatingcap")
	private Integer seatingCap;

	@Column(name = "trans_type")
	private String transType;

}

package com.carrental.carrental.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "s22_s003_16_location")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Location {

	@Id
	@Column(name = "zip")
	private Integer zip;

	@Column(name = "state")
	private String state;

	@Column(name = "city")
	private String city;

}

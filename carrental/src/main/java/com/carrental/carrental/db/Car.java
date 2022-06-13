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

@Entity(name = "s22_s003_16_cars")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {

	@Id
	@Column(name = "car_id")
	private String carId;

	@Column(name = "name")
	private String name;

	@Column(name = "rental_cost")
	private Integer rentalCost;

	@OneToOne
	@JoinColumn(name = "type_id")
	private CarType tyepId;

	@OneToOne
	@JoinColumn(name = "location_id")
	private Location locationId;
}

package com.carrental.carrental.db;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "s22_s003_16_reservation")
public class Reservation {

	@Id
	@Column(name = "reservation_id")
	private Integer reservation_id;

	@Column(name = "pickupdate")
	private Date pickupDate;

	@Column(name = "returnDate")
	private Date returnDate;

}

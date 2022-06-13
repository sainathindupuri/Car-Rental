package com.carrental.carrental.db;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookId implements Serializable {

	@OneToOne
	@JoinColumn(name = "reservation_id")
	private Reservation reservation;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

}

package com.carrental.carrental.db;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "s22_s003_16_book")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	@EmbeddedId
	private BookId id;

}

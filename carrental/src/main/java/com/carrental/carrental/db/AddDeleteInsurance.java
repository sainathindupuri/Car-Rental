package com.carrental.carrental.db;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "s22_s003_16_add_delete_insurancetype")
public class AddDeleteInsurance {

	@EmbeddedId
	private AddDelInsId id;

}

package fr.bluechipit.jpa;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("P")
@Table(name = "PART_TIME_EMP")
public class PartTimeEmployee extends Employee {
	@Column(name = "hourly_rate")
	private int hourlyRate;

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	
}

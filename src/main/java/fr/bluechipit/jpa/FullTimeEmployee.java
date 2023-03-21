package fr.bluechipit.jpa;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("F")
@Table(name = "FULL_TIME_EMP")
public class FullTimeEmployee extends Employee {
	@Column(name = "salary")
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}

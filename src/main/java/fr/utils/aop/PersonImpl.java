package fr.utils.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonImpl implements Person {
	private static Logger logger = LoggerFactory.getLogger(PersonImpl.class);
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void helloWorld(){
		logger.debug("helloWorld start");
		logger.debug("helloWorld toString()="+toString());
		logger.debug("helloWorld end");
	}
	@Override
	public String toString() {
		return "name="+name+" age="+age;
	}
	
}

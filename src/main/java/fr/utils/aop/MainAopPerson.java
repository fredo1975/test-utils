package fr.utils.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAopPerson {
	private static final String[] CONTEXT = {"appContext.xml"};
	private ClassPathXmlApplicationContext applicationContext = null;
	private static Logger logger = LoggerFactory.getLogger(MainAopPerson.class);
    
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.debug("*** Start ***");
		Long startTime = System.currentTimeMillis();
		MainAopPerson launcher = new MainAopPerson();
		launcher.applicationContext = new ClassPathXmlApplicationContext(CONTEXT);
		//Person person = (Person) launcher.applicationContext.getBean("person");
		ConfigurableListableBeanFactory configurableListableBeanFactory = 
			(ConfigurableListableBeanFactory) launcher.applicationContext.getBeanFactory();
		Person person = (Person)configurableListableBeanFactory.getBean("person");
		logger.debug("person.hashCode()="+person.hashCode());
		person.helloWorld();
		
		Long endTime = System.currentTimeMillis();
		Long during = endTime-startTime;
		logger.debug("*** end in "+(double)during/1000+" s ***");
		logger.debug("*** End ***");
	}

}

package fr.utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class TestDate2 extends TestCase {
	protected static final Log logger = LogFactory.getLog(TestDate2.class);
	public void testWithDate(){
		String methodName="testWithDate";
		logger.info(methodName+" start");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		String dateStringFormat = sdf.format(cal.getTime());
		logger.info(methodName+" dateStringFormat="+dateStringFormat);
		logger.info(methodName+" cal="+cal.getTime());
		try {
			Date d = sdf.parse(dateStringFormat);
			logger.info(methodName+" d="+d);
			logger.info(methodName+" sdf.format(d)="+sdf.format(d));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			logger.info(methodName+" "+e.getMessage());
		}
		logger.info(methodName+" end");
	}
}

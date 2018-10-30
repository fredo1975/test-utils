package fr.bluechipit.divers;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class TestDate {
	protected static final Log logger = LogFactory.getLog(TestDate.class);
	
	public static void main(String[] args) {
		logger.info("TestDate start");
		Calendar calEnd = GregorianCalendar.getInstance();
		Calendar calStart = new GregorianCalendar(2010, 5, 1);
		Date dateStart = calStart.getTime();
		Date d = null;
		Calendar calendar = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		logger.info("TestDate calStart="+sdf.format(dateStart)+" calEnd="+sdf.format(calEnd.getTime()));
		boolean lastDayOfRange = false;
		if(calEnd.after(calStart)){
			logger.info("TestDate calEnd.after(calStart)");
			calendar.set(calStart.get(Calendar.YEAR), calStart.get(Calendar.MONTH), calStart.get(Calendar.DAY_OF_MONTH));
			logger.info("TestDate calendar="+sdf.format(calendar.getTime())+" DAY_OF_WEEK_IN_MONTH="+calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
			
			// 1
			while(!lastDayOfRange){
				calendar.add(Calendar.DAY_OF_MONTH, +1);
				logger.info("TestDate calendar="+sdf.format(calendar.getTime()));
				// 2
				if(calendar.equals(calEnd)){
					logger.info("TestDate c'etait le dernier jour !!");
					lastDayOfRange = true;
				}
			}
		}
		logger.info("TestDate end");
	}
}

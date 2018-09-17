package fr.utils.oom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OomHandler {
	protected static final Logger logger = LoggerFactory.getLogger(OomHandler.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> ll = new ArrayList<String>();
		List<Integer> integerList = new ArrayList<Integer>();
		
		Map<Integer,Integer> integerMap = new HashMap<Integer,Integer>();
		int i=0;
		while(true){
			logger.info("i="+i);
			integerList.add(i++);
			logger.info("integerList.size()="+integerList.size());
			integerMap.put(i, i);
			logger.info("integerMap.size()="+integerMap.size());
		}

	}

}

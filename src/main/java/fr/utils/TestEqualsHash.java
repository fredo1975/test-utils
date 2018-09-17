package fr.utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class TestEqualsHash {
	protected static final Log logger = LogFactory.getLog(TestEqualsHash.class);
	public static void main(String[] args) {
		logger.info("TestEqualsHash start");
		List<Point> pointList = new ArrayList<Point>();
		List<PointCol> pointColList = new ArrayList<PointCol>();
		Set<PointCol> pointColSet = new HashSet<PointCol>();
		
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				Point point = PointFactory.buildPoint(j);
				//logger.info("TestEqualsHash point="+point.toString());
				pointList.add(point);
			}
			PointCol pointCol = PointFactory.buildPointCol(pointList);
			pointColList.add(pointCol);
			pointColSet.add(pointCol);
			logger.info("TestEqualsHash pointCol="+pointCol.toString());
		}
		logger.info("TestEqualsHash pointColList.size()="+pointColList.size());
		int index=0;
		for(Iterator<PointCol> itPointCol=pointColList.iterator();itPointCol.hasNext();){
			itPointCol.next();
			if(index++==5){
				itPointCol.remove();
			}
		}
		for(Iterator<PointCol> itPointCol=pointColSet.iterator();itPointCol.hasNext();){
			itPointCol.next();
			if(index++==5){
				itPointCol.remove();
			}
		}
		logger.info("TestEqualsHash pointColList.size()="+pointColList.size());
		
		Map<String,String> map = new TreeMap<String,String>();
		map.put("fred", "oki");
		map.put("cedric", "oki");
		map.put("ryan", "ko");
		map.put("loadge", "oki");
		//map.put("fred", "987");
		for(Map.Entry<String, String> entry : map.entrySet()){
			logger.info("TestEqualsHash entry="+entry.getKey()+"/"+entry.getValue());
		}
		logger.info("TestEqualsHash end");
	}

}

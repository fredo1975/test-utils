package fr.bluechipit.divers;
import java.util.List;

import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class PointFactory {
	protected static final Log logger = LogFactory.getLog(PointFactory.class);
	
	public static Point buildPoint(int index){
		//logger.info("buildPoint start");
		Long idPoint = RandomUtils.nextLong();
		Point point = new Point();
		point.setId(idPoint);
		RandomString rs = new RandomString(5);
		point.setName("Point"+rs.nextString());
		point.setIndex(index);
		//logger.info("buildPoint end");
		return point;
	}
	
	public static PointCol buildPointCol(List<Point> pointList){
		//logger.info("buildPoint start");
		PointCol pointCol = new PointCol();
		Long idPointCol = RandomUtils.nextLong();
		pointCol.setId(idPointCol);
		for(Point point : pointList){
			pointCol.getPointMap().put(point.getId(), point);
		}
		//logger.info("buildPoint end");
		return pointCol;
	}
	
}

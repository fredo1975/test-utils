package fr.bluechipit.divers;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class PointCol {
	protected final Log logger = LogFactory.getLog(PointCol.class);
	private Long id;
	private Map<Long,Point> pointMap;
	private int index;
	public PointCol() {
		super();
		pointMap = new HashMap<Long, Point>();
	}
	public PointCol(Long id, Map<Long, Point> map) {
		super();
		this.id = id;
		this.pointMap = map;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Map<Long, Point> getPointMap() {
		return pointMap;
	}
	public void setPointMap(Map<Long, Point> pointMap) {
		this.pointMap = pointMap;
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + index;
		result = prime * result
				+ ((pointMap == null) ? 0 : pointMap.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PointCol other = (PointCol) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (index != other.index)
			return false;
		if (pointMap == null) {
			if (other.pointMap != null)
				return false;
		} else if (!pointMap.equals(other.pointMap))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PointCol [id=" + id + ", index=" + index + ", pointMap="
				+ pointMap + "]";
	}
}

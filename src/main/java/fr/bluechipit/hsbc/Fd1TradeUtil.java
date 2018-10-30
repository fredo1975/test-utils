package fr.bluechipit.hsbc;

import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

public class Fd1TradeUtil {

	public static final Fd1RecordType fd1RecordTypeBooked_2 = Fd1RecordType.RECORD_TYPE_2;
	public static final Fd1RecordType fd1RecordTypeBooked_16 = Fd1RecordType.RECORD_TYPE_16;
	
	private String transactionNumber;
	private String transactionNumberOrigin;
	private Set<Events> eventSet;
	private boolean booked;
	
	public String getTransactionNumber() {
		return transactionNumber;
	}
	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	public Set<Events> getEventSet() {
		return eventSet;
	}
	public void setEventSet(Set<Events> eventSet) {
		this.eventSet = eventSet;
	}
	
	public boolean isBooked() {
		return booked;
	}
	public void setBooked(boolean booked) {
		this.booked = booked;
	}
	public String getTransactionNumberOrigin() {
		return transactionNumberOrigin;
	}
	public void setTransactionNumberOrigin(String transactionNumberOrigin) {
		this.transactionNumberOrigin = transactionNumberOrigin;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((transactionNumber == null) ? 0 : transactionNumber.hashCode());
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
		Fd1TradeUtil other = (Fd1TradeUtil) obj;
		if (transactionNumber == null) {
			if (other.transactionNumber != null)
				return false;
		} else if (!transactionNumber.equals(other.transactionNumber))
			return false;
		return true;
	}
	public String getTransactionNumberBooked(String transactionNumberOrigin,Map<String,Fd1TradeUtil> fd1TradeByTransactionNumberMap) {
		String transactionNumberResult = null;
		Fd1TradeUtil fd1TradeUtil = fd1TradeByTransactionNumberMap.get(transactionNumberOrigin);
		if(fd1TradeUtil!=null) {
			if(StringUtils.isNotEmpty(fd1TradeUtil.getTransactionNumberOrigin())) {
				transactionNumberResult = getTransactionNumberBooked(fd1TradeUtil.getTransactionNumberOrigin(),fd1TradeByTransactionNumberMap);
			}else {
				// means it has been booked
				if(fd1TradeUtil.getEventSet().contains(fd1RecordTypeBooked_2)||fd1TradeUtil.getEventSet().contains(fd1RecordTypeBooked_16)) {
					transactionNumberResult = transactionNumberOrigin;
				}else {
					// WARNING
				}
			}
		}
		return transactionNumberResult;
	}
	
	
}

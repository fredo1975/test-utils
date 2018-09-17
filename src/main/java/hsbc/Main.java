package hsbc;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

public class Main {

	public static void main(String[] args) {
		List<Fd1TradeUtil> fd1TradeUtilLeafList = new ArrayList<Fd1TradeUtil>();
		Map<String,Fd1TradeUtil> fd1TradeByTransactionNumberMap = new HashMap<String,Fd1TradeUtil>();
		for(Map.Entry<String,Fd1TradeUtil> entry :  fd1TradeByTransactionNumberMap.entrySet()){
			String transactionNumber = entry.getKey();
			Fd1TradeUtil fd1TradeUtil = entry.getValue();
			
		}
		
		for(Fd1TradeUtil leaf : fd1TradeUtilLeafList) {
			Fd1TradeUtil fd1TradeUtil = fd1TradeByTransactionNumberMap.get(leaf.getTransactionNumber());
			if(fd1TradeUtil!=null) {
				if(StringUtils.isNotEmpty(fd1TradeUtil.getTransactionNumberOrigin())) {
					String transactionNumberOrigin = fd1TradeUtil.getTransactionNumberBooked(fd1TradeUtil.getTransactionNumberOrigin(),fd1TradeByTransactionNumberMap);
					Fd1TradeUtil fd1TradeUtilOrigin = fd1TradeByTransactionNumberMap.get(transactionNumberOrigin);
					Date cobDate = null;
					Set<Events> set = fd1TradeUtilOrigin.getEventSet();
					if(CollectionUtils.isNotEmpty(set)) {
						if(set.contains(Fd1TradeUtil.fd1RecordTypeBooked_2)||set.contains(Fd1TradeUtil.fd1RecordTypeBooked_16)) {
							for(Events event : set) {
								if(Fd1TradeUtil.fd1RecordTypeBooked_2.equals(event)||Fd1TradeUtil.fd1RecordTypeBooked_16.equals(event)) {
									cobDate = event.getCobDate();
								}
							}
						}
					}
					if(cobDate==null) {
						
					}else {
						
					}
				}
				
			}
		}
	}
}

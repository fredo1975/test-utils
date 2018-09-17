package fr.bluechipit.memory.footprint;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

public class MemoryFootPrintMainTest {
	protected static final Logger logger = LoggerFactory.getLogger(MemoryFootPrintMainTest.class);
	private static final Integer NB_STOCK_KEY = 1000000;
	public static StockKey buildStockKey() {
		StringBuilder isin = new StringBuilder(RandomStringUtils.random(10, true, true));
		StringBuilder ccy = new StringBuilder(RandomStringUtils.random(3, true, true));
		StringBuilder bookRef = new StringBuilder(RandomStringUtils.random(3, true, true));
		return new StockKey(isin.toString(), ccy.toString(), bookRef.toString());
		
	}
	public static void main(String[] args) {
		Map<StockKey,StockKey> map = new HashMap<StockKey,StockKey>();
		StopWatch stopWatch = new StopWatch("start.....");
		stopWatch.start();
		for(int i=0;i<NB_STOCK_KEY;i++) {
			StockKey stockKey = buildStockKey();
			logger.debug("insertion=" + stockKey.toString());
			map.put(stockKey, stockKey);
		}
		logger.debug("KB: " + (double) (Runtime.getRuntime().totalMemory()) / 1024);
		stopWatch.stop();
		logger.debug(stopWatch.prettyPrint());
	}

}

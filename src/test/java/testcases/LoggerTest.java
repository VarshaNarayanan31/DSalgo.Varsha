package testcases;

import utilities.LoggerLoad;

public class LoggerTest {

	public void tst01_TestingLog() throws InterruptedException {
		LoggerLoad.info("<..........Testing Info.......>");
		LoggerLoad.warn("<..........Testing Info.......>");
		LoggerLoad.error("<..........Testing Info.......>");
		}
	
}

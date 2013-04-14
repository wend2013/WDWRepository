/**
 * SystemTest.java
 * TODO
 * Author:wend2013
 * Email:wend2013@163.com
 * 2013-4-14 下午2:04:21
 */
package com.wendongwei.repository.system;

import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * @author wendongwei
 * 
 *         打印与当前系统有关的资料
 * 
 */
public class SystemTest
{
	private static Logger logger = Logger.getLogger(SystemTest.class);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		logger.info(new Date());

		Properties p = System.getProperties();
		p.list(System.out);

		logger.info("--- Memory Usage:");
		Runtime rt = Runtime.getRuntime();
		logger.info("Total Memory = " + rt.totalMemory() + " Free Memory = "
				+ rt.freeMemory());
	}

}

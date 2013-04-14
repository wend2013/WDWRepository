/**
 * URShift.java
 * TODO
 * Author:wend2013
 * Email:wend2013@163.com
 * 2013-4-14 下午3:49:36
 */
package com.wendongwei.repository.bitmanipulation.urshift;

import org.apache.log4j.Logger;

/**
 * @author wendongwei
 * 
 *         移位运算示例
 */
public class URShift
{
	private static Logger logger = Logger.getLogger(URShift.class);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int i = -1;
		i >>>= 10;
		logger.info(i);

		long l = -1;
		l >>>= 10;
		logger.info(l);

		short s = -1;
		s >>>= 10;
		logger.info(s);

		byte b = -1;
		b >>>= 10;
		logger.info(b);
	}

}

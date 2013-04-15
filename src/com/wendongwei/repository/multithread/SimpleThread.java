/**
 * SimpleThread.java
 * TODO
 * Author:wend2013
 * Email:wend2013@163.com
 * 2013-4-15 下午9:06:47
 */
package com.wendongwei.repository.multithread;

import org.apache.log4j.Logger;

/**
 * @author wendongwei
 * 
 *         最简单生成多线程的方式
 */
public class SimpleThread extends Thread
{
	private static Logger logger = Logger.getLogger(SimpleThread.class);

	private int countDown = 5;

	private int threadNumber;

	private static int threadCount = 0;

	public SimpleThread()
	{
		threadNumber = ++threadCount;
		logger.info("Making " + threadNumber);
	}

	public void run()
	{
		while (true)
		{
			logger.info("Thread " + threadNumber + "(" + countDown + ")");
			if (--countDown == 0)
			{
				return;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		for (int i = 0; i < 5; i++)
		{
			new SimpleThread().start();
		}
		logger.info("All thread started");
	}

}

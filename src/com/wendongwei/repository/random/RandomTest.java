/**
 * RandomTest.java
 * TODO
 * Author:wend2013
 * Email:wend2013@163.com
 * 2013-4-14 下午2:33:54
 */
package com.wendongwei.repository.random;

import java.util.Random;

import org.apache.log4j.Logger;

/**
 * @author wendongwei
 * 
 *         生成随机数
 */
public class RandomTest
{
	private static Logger logger = Logger.getLogger(RandomTest.class);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Random rand = new Random();

		int i, j;

		i = rand.nextInt() % 100;
		j = rand.nextInt() % 100;

		logger.info(i + " " + j);

		float u, v;
		u = rand.nextFloat();
		v = rand.nextFloat();

		logger.info(u + " " + v);
	}

}

/**
 * BitManipulation.java
 * TODO
 * Author:wend2013
 * Email:wend2013@163.com
 * 2013-4-14 下午4:00:41
 */
package com.wendongwei.repository.bitmanipulation;

import java.util.Random;

import org.apache.log4j.Logger;

/**
 * @author wendongwei
 * 
 *         位操作示例
 */
public class BitManipulation
{
	private static Logger logger = Logger.getLogger(BitManipulation.class);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Random rand = new Random();
		int i = rand.nextInt();
		int j = rand.nextInt();

		logger.info("-1 = " + pBinInt(-1));
		logger.info("+1 = " + pBinInt(+1));

		int maxpos = 2147483647;
		logger.info("2147483647 = " + pBinInt(maxpos));

		int maxneg = -2147483648;
		logger.info("-2147483648 = " + pBinInt(maxneg));

		logger.info(i + " = " + pBinInt(i));
		logger.info("~" + i + " = " + pBinInt(~i));
		logger.info("-" + i + " = " + pBinInt(-i));
		logger.info("i = " + pBinInt(i));
		logger.info("j = " + pBinInt(j));
		logger.info("i & j = " + pBinInt(i & j));
		logger.info("i | j = " + pBinInt(i | j));
		logger.info("i ^ j = " + pBinInt(i ^ j));
		logger.info("i << 5 = " + pBinInt(i << 5));
		logger.info("i >> 5 = " + pBinInt(i >> 5));
		logger.info("(~i) >> 5 = " + pBinInt((~i) >> 5));
		logger.info("i >>> 5 = " + pBinInt(i >>> 5));
	}

	/**
	 * 将int型变量转变为二进制字符串
	 * 
	 * @param i
	 * @return
	 */
	public static String pBinInt(int i)
	{
		StringBuffer str = new StringBuffer();
		for (int j = 31; j >= 0; j--)
		{
			if (((1 << j) & i) != 0)
			{
				str.append("1");
			}
			else
			{
				str.append("0");
			}
		}
		return str.toString();
	}

	/**
	 * 将long型变量转变为二进制字符串
	 * 
	 * @param l
	 * @return
	 */
	public static String pBinLong(long l)
	{
		StringBuffer str = new StringBuffer();
		for (int i = 63; i >= 0; i--)
		{
			if (((1L << i) & l) != 0)
			{
				str.append("1");
			}
			else
			{
				str.append("0");
			}
		}
		return str.toString();
	}
}

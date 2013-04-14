/**
 * Assignment.java
 * TODO
 * Author:wend2013
 * Email:wend2013@163.com
 * 2013-4-14 下午2:24:39
 */
package com.wendongwei.repository.others;

import org.apache.log4j.Logger;

/**
 * @author wendongwei
 * 
 *         别名的例子
 * 
 */
public class Assignment
{
	private static Logger logger = Logger.getLogger(Assignment.class);

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Number n1 = new Number();
		Number n2 = new Number();

		n1.i = 9;
		n2.i = 47;

		logger.info(n1.i + " " + n2.i);

		n1 = n2;

		logger.info(n1.i + " " + n2.i);

		n1.i = 27;

		logger.info(n1.i + " " + n2.i);
	}

}

class Number
{
	int i;
}

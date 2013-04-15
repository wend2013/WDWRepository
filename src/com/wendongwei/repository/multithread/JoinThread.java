/**
 * JoinThread.java
 * TODO
 * Author:wend2013
 * Email:wend2013@163.com
 * 2013-4-15 下午10:11:44
 */
package com.wendongwei.repository.multithread;

/**
 * @author wendongwei
 * 
 */
public class JoinThread extends Thread
{
	public JoinThread(String name)
	{
		super(name);
	}

	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			for (long k = 0; k < 100000000; k++)
			{
			}

			System.out.println(this.getName() + ":" + i);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Thread t1 = new JoinThread("A");
		t1.start();
		try
		{
			t1.join(1000); // Join在这里~
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("over");
		/*
		 * 这样子就很明显了，t.join(int wait_time); 后面的代码想要执行需要满足以下条件之一： 1、线程t死了；
		 * 2、等待时间超过wait_time；
		 * 
		 * 如果没有指定wait_time就只能等线程t死了才行了···
		 */
	}

}

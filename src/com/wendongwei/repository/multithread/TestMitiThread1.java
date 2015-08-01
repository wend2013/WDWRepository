/**
 * TestMitiThread1.java
 * TODO
 * Author:wend2013
 * Email:wend2013@163.com
 * 2013-4-15 下午9:38:37
 */
package com.wendongwei.repository.multithread;

/**
 * @author wendongwei
 * 
 *         通过实现 Runnable 接口实现多线程
 */
public class TestMitiThread1 implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " 线程运行开始!");
		for (int i = 0; i < 100000000; i++)
		{
			System.out.println(i + " " + Thread.currentThread().getName());
			try
			{
				Thread.sleep((int) Math.random() * 100);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " 线程运行结束!");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName() + " 线程运行开始!");
		TestMitiThread1 test = new TestMitiThread1();
		Thread thread1 = new Thread(test);
		Thread thread2 = new Thread(test);
		thread1.start();
		thread2.start();
		// start()方法的调用后并不是立即执行多线程代码，
		// 而是使得该线程变为可运行态（Runnable），什么时候运行是由操作系统决定的。
		System.out.println(Thread.currentThread().getName() + " 线程运行结束!");
	}

}

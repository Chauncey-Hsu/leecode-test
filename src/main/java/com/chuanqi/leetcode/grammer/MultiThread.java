package com.chuanqi.leetcode.grammer;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author xuchuanqi
 * @date 2022/4/21 10:24.
 */
public class MultiThread {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();//同一个对象
        for (int i = 0; i < 3; i++) {
//            new Thread(myThread).start();//三个线程使用相同的对象
            new Thread(new MyThread()).start();//如果上面改成这样，此时三个线程使用不同的对象，synchronized (this)对象锁无法同步
        }
    }
}

class MyThread implements Runnable {
    private static int count = 9;

    @Override
    public void run() {
        synchronized (this) {//设置对象锁，对不同线程中的同一任务对象有效
            try {
                for (int i = 0; i < 3; i++) {
                    count--;
                    System.out.print(Thread.currentThread().getName() + ":" + (count) + "\t");
                    TimeUnit.MILLISECONDS.sleep(500 + new Random().nextInt(1000));//随机休眠 0.5-1.5秒
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
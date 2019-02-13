package com.github.bakerzhu.java.delay;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        DelayQueue<Message> queue = new DelayQueue<>();
        Message m1 = new Message(1, "zhangsan", 2000);
        Message m2 = new Message(2, "lisi", 5000);
        queue.offer(m1);
        queue.offer(m2);
        // 启动消费线程 消费添加到延时队列中的消息，前提是任务到了延期时间
        ExecutorService exec = Executors.newFixedThreadPool(1);
        exec.execute(new Consumer(queue));
        exec.shutdown();
    }
}
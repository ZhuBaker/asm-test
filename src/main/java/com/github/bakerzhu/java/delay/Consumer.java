package com.github.bakerzhu.java.delay;

import java.util.concurrent.DelayQueue;

public class Consumer implements Runnable {

    private DelayQueue<Message> queue;

    public Consumer(DelayQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Message message = queue.take();
                System.out.println("消费消息id：" + message.getId() + " 消息体：" + message.getBody());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
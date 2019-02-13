package com.github.bakerzhu.java.delay;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 */
public class Message implements Delayed {

    private int id;
    private String body; // 消息内容
    private long excuteTime;// 延迟时长，这个是必须的属性因为要按照这个判断延时时长。  执行时的时间戳

    public Message(int id, String body, long excuteTime) {
        this.id = id;
        this.body = body;
        this.excuteTime = TimeUnit.NANOSECONDS.convert(excuteTime, TimeUnit.MILLISECONDS) + System.nanoTime();
    }

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public long getExcuteTime() {
        return excuteTime;
    }

    //延迟任务是否到时就是按照这个方法判断如果返回的是负数则说明到期否则还没到期
    @Override
    public long getDelay(TimeUnit unit) {
        long result = unit.convert(this.excuteTime - System.nanoTime(), TimeUnit.NANOSECONDS);
        System.out.println(this.id + " " + result);
        return result;
    }

    /**
     * 自定义实现比较方法返回 1 0 -1 三个参数
     * 大的 (返回1) 处于队列后端
     * 小的 (返回-1) 处于队列前端
     */
    @Override
    public int compareTo(Delayed o) {
        Message m = (Message) o;
        int i = Long.valueOf(this.excuteTime).compareTo(Long.valueOf(m.excuteTime));
        System.out.println(this.id + " __ " + this.excuteTime + " " + i);
        return i;

        /*if (this.getDelay(TimeUnit.MILLISECONDS) > o.getDelay(TimeUnit.MILLISECONDS)) {
            return 1;
        } else if (this.getDelay(TimeUnit.MILLISECONDS) < o.getDelay(TimeUnit.MILLISECONDS)) {
            return -1;
        }
        return 0;*/
    }

    public static void main(String[] args) {
        System.out.println(Long.valueOf(1L).compareTo(Long.valueOf(2L)));
    }

}
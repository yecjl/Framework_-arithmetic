package com.study.thread.state;

import com.study.thread.state.blocked.MyThread;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ThreadStateTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testThreadNew() {
        Thread thread = new Thread();
        System.out.println(thread.getState());
    }

    @Test
    public void testThreadRunnable() {
        Thread thread = new Thread();
        thread.start();
        System.out.println(thread.getState());
    }

}
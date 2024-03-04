/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package object_instance;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class StudentBOtest {

    public StudentBOtest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testGetInstanceNotNull() {
        // Kiểm tra rằng getInstance không trả về giá trị null
        StudentBO instance = StudentBO.getInstance();
        assertNotNull(instance);
    }

    @Test
    public void testSingletonInstance() {
        // Kiểm tra rằng hai lần gọi getInstance trả về cùng một đối tượng
        StudentBO instance1 = StudentBO.getInstance();
        StudentBO instance2 = StudentBO.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    public void testGetInstanceTwice() {
        // Kiểm tra rằng hai lần gọi getInstance trả về cùng một đối tượng
        StudentBO instance1 = StudentBO.getInstance();
        StudentBO instance2 = StudentBO.getInstance();
        assertSame(instance1, instance2);

        // Kiểm tra rằng instance2 không trả về giá trị null
        assertNotNull(instance2);
    }

    
    private static final int THREAD_COUNT = 10;
    private static final int ITERATIONS = 1000;

    @Test
    public void testRaceCondition() throws InterruptedException {
        Counter counter = new Counter();

        // Tạo mảng các luồng để tăng giá trị đồng thời
        Thread[] threads = new Thread[THREAD_COUNT];

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < ITERATIONS; j++) {
                    counter.increment();
                }
            });
        }

        // Khởi động tất cả các luồng
        for (Thread thread : threads) {
            thread.start();
        }

        // Chờ cho tất cả các luồng hoàn thành
        for (Thread thread : threads) {
            thread.join();
        }

        // Kiểm tra xem kết quả là đúng hay không
        assertEquals(THREAD_COUNT * ITERATIONS, counter.getValue());
    }

    static class Counter {

        private int value = 0;

        public synchronized void increment() {
            value++;
        }

        public int getValue() {
            return value;
        }
    }
}

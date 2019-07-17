package com.example.demo2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {Demo2Application.class})
public class Demo2ApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("hello");
		TestCase.assertEquals(1, 1);
	}
	
	@Test
	public void testTwo() {
		System.out.println("hello2");
		TestCase.assertEquals(1, 1);
	}

	

	@Before
	public void testBefore() {
		System.out.println("before");
	}
	@After
	public void testAfter() {
		System.out.println("after");
	}
}

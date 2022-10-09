package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestStringConcat 
{
	@Test
	void testDoStringConcat() 
	{
		DailyTasks sc = new DailyTasks();
		String s1 = sc.doStringConcat("Good", "Morning");
		assertEquals("Good Morning", s1);
	}
}
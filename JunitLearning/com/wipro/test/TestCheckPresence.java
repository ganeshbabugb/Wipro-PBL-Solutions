package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence 
{
	@Test
	public void testCheckPresence() 
	{
		DailyTasks cp = new DailyTasks();
		boolean isPresent = cp.checkPresence("Ganesh", "Deepika");
		assertEquals(true, isPresent);
	}
}

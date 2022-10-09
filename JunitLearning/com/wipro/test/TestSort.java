package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestSort 
{
	@Test
	void testSort() 
	{
		DailyTasks ts = new DailyTasks();
		int[] numbers = new int[] { -8, 7, 5, 9, 10, -2, 3 };
		assertArrayEquals(new int[] { -8, -2, 3, 5, 7, 9, 10 }, ts.sortValues(numbers));
	}
}

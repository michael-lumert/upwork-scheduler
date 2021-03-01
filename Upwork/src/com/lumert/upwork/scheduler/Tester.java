package com.lumert.upwork.scheduler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Tester {

	public static List<Task> createSampleTasks() {

		List<Task> tasks = new ArrayList<>();

		tasks.add(new Task(1, 1, Task.Category.BLUE, getRandomDate()));
		tasks.add(new Task(2, 5, Task.Category.GREEN, getRandomDate()));
		tasks.add(new Task(3, 0, Task.Category.RED, getRandomDate()));
		tasks.add(new Task(4, 1, Task.Category.RED, getRandomDate()));
		tasks.add(new Task(5, 3, Task.Category.BLUE, getRandomDate()));
		tasks.add(new Task(6, 1, Task.Category.GREEN, getRandomDate()));
		tasks.add(new Task(6, 3, Task.Category.BLUE, getRandomDate()));
		tasks.add(new Task(7, 3, Task.Category.RED, getRandomDate()));
		tasks.add(new Task(8, 3, Task.Category.GREEN, getRandomDate()));
		tasks.add(new Task(9, 1, Task.Category.BLUE, getRandomDate()));
		tasks.add(new Task(10, 5, Task.Category.GREEN, getRandomDate()));
		tasks.add(new Task(11, 0, Task.Category.RED, getRandomDate()));
		tasks.add(new Task(12, 1, Task.Category.RED, getRandomDate()));
		tasks.add(new Task(13, 3, Task.Category.BLUE, getRandomDate()));
		tasks.add(new Task(14, 1, Task.Category.GREEN, getRandomDate()));
		tasks.add(new Task(15, 2, Task.Category.BLUE, getRandomDate()));
		tasks.add(new Task(16, 2, Task.Category.RED, getRandomDate()));
		tasks.add(new Task(17, 3, Task.Category.GREEN, getRandomDate()));
		tasks.add(new Task(18, 4, Task.Category.BLUE, getRandomDate()));
		tasks.add(new Task(19, 3, Task.Category.RED, getRandomDate()));
		tasks.add(new Task(20, 3, Task.Category.GREEN, getRandomDate()));

		return tasks;
	}

	private static Date getRandomDate() {
		return new Date(ThreadLocalRandom.current().nextInt());

	}
}

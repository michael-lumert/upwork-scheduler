package com.lumert.upwork.scheduler;

import java.util.List;

public class Application {

	public static void main(String[] args) {

		List<Task> tasks = Tester.createSampleTasks();
		List<Task> sortedTasks = Scheduler.sort(tasks);
		printSortedTasks(sortedTasks);

	}

	private static void printSortedTasks(List<Task> sortedTasks) {
		for (Task task : sortedTasks) {
			System.out.println("task: " + task.toString());
		}

	}

}

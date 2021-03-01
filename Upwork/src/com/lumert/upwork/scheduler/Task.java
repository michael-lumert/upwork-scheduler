package com.lumert.upwork.scheduler;

import java.util.Date;

public class Task implements Comparable<Task> {

	private int taskId = 0;
	private int urgency;
	private Date time = null;
	private Category category;

	public enum Category {
		RED, BLUE, GREEN
	};

	public Task(int taskId, int urgency, Task.Category category, Date time) {
		this.taskId = taskId;
		this.urgency = urgency;
		this.category = category;
		this.time = time;

	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public int getUrgency() {
		return urgency;
	}

	public void setUrgency(int urgency) {
		this.urgency = urgency;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	/*
	 * --- SPECIFICATIONS ---
	 * 
	 * A task’s position in the list is determined first by the urgency parameter
	 * (an integer from 0 - 5 where 0 is the most urgent).
	 * 
	 * When two tasks have the same urgency, we look at it’s category. Categories
	 * are: RED (highest priority), BLUE and GREEN.
	 * 
	 * When we have two tasks have the same urgency and category, we then look at
	 * time submitted, putting the one with the earlier timestamp first.
	 * 
	 */
	@Override
	public int compareTo(Task o) {

		// URGENCY first
		int urgency = ((Integer) this.getUrgency()).compareTo((Integer) o.getUrgency());
		if (urgency != 0) {
			return urgency;
		}

		// CATEGORY second
		int category = this.getCategory().compareTo(o.getCategory());
		if (category != 0) {
			return category;
		}

		// TIME
		int time = this.getTime().compareTo(o.getTime());
		if (time != 0) {
			return time;
		}

		return 0;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", urgency=" + urgency + ", category=" + category + ", time=" + time + "]";
	}

}

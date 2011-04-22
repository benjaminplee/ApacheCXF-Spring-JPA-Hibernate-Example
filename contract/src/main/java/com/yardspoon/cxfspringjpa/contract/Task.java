package com.yardspoon.cxfspringjpa.contract;

import java.util.Date;

public class Task {
	private Long id;

	private String workToDo;

	private Date dueDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWorkToDo() {
		return workToDo;
	}

	public void setWorkToDo(String workToDo) {
		this.workToDo = workToDo;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", workToDo=" + workToDo + ", dueDate=" + dueDate + "]";
	}

}

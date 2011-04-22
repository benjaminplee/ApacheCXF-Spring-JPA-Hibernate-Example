package com.yardspoon.cxfspringjpa.contract;

import java.util.*;

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

}

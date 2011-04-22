package com.yardspoon.cxfspringjpa.contract;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class Task {

	@XmlAttribute
	private Long id;

	@XmlValue
	private String workToDo;

	@XmlAttribute
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

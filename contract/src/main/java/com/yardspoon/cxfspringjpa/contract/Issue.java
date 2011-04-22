package com.yardspoon.cxfspringjpa.contract;

import java.util.Set;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Issue {

	@XmlAttribute
	private Long id;

	private String description;

	@XmlElementWrapper(name = "comments")
	@XmlElement(name = "comment")
	private Set<Comment> comments;

	@XmlElementWrapper(name = "tasks")
	@XmlElement(name = "task")
	private Set<Task> tasks;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public Set<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public String toString() {
		return "Issue [id=" + id + ", description=" + description + ", comments=" + comments + ", tasks=" + tasks + "]";
	}

}

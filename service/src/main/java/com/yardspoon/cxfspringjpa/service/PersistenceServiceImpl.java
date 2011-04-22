package com.yardspoon.cxfspringjpa.service;

import java.util.Date;
import java.util.HashSet;

import com.yardspoon.cxfspringjpa.contract.Comment;
import com.yardspoon.cxfspringjpa.contract.Issue;
import com.yardspoon.cxfspringjpa.contract.PersistenceService;
import com.yardspoon.cxfspringjpa.contract.Task;

public class PersistenceServiceImpl implements PersistenceService {

	public Long create(Issue newIssue) {
		System.out.println("PersistenceServiceImpl.create()");
		System.out.println("newIssue = " + newIssue);

		return 1234L;
	}

	public Issue find(Long id) {
		System.out.println("PersistenceServiceImpl.find()");
		System.out.println("id = " + id);

		Issue issueBeingReturned = new Issue();
		issueBeingReturned.setId(1000L);
		issueBeingReturned.setDescription("fake!");
		HashSet<Comment> comments = new HashSet<Comment>();
		Comment comment = new Comment();
		comment.setId(2000L);
		comment.setText("This is neat!");
		comment.setParentIssueId(issueBeingReturned.getId());
		HashSet<Comment> subComments = new HashSet<Comment>();
		Comment subComment = new Comment();
		subComment.setId(4000L);
		subComment.setText("No way :(");
		subComment.setParentCommentId(comment.getId());
		subComments.add(subComment);
		comment.setComments(subComments);
		comments.add(comment);
		issueBeingReturned.setComments(comments);
		HashSet<Task> tasks = new HashSet<Task>();
		Task task = new Task();
		task.setId(3000L);
		task.setWorkToDo("Take out trash");
		task.setDueDate(new Date());
		tasks.add(task);
		issueBeingReturned.setTasks(tasks);

		System.out.println("issueBeingReturned = " + issueBeingReturned);

		return issueBeingReturned;
	}

	public void update(Issue existingIssue) {
		System.out.println("PersistenceServiceImpl.update()");
		System.out.println("existingIssue = " + existingIssue);
	}

}

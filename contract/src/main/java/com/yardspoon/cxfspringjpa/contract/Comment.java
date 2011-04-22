package com.yardspoon.cxfspringjpa.contract;

import java.util.Set;

public class Comment {
	private Long id;

	private Long parentIssueId;

	private Long parentCommentId;

	private String text;

	private Set<Comment> comments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getParentIssueId() {
		return parentIssueId;
	}

	public void setParentIssueId(Long parentIssueId) {
		this.parentIssueId = parentIssueId;
	}

	public Long getParentCommentId() {
		return parentCommentId;
	}

	public void setParentCommentId(Long parentCommentId) {
		this.parentCommentId = parentCommentId;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", parentIssueId=" + parentIssueId + ", parentCommentId=" + parentCommentId + ", text=" + text + ", comments=" + comments
				+ "]";
	}
}

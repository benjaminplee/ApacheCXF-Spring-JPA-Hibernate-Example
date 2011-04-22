package com.yardspoon.cxfspringjpa.contract;

import java.util.Set;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Comment {

	@XmlAttribute
	private Long id;

	@XmlAttribute
	private Long parentIssueId;

	@XmlAttribute
	private Long parentCommentId;

	private String text;

	@XmlElementWrapper(name = "comments")
	@XmlElement(name = "comment")
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
		return "Comment [id=" + id + ", parentIssueId=" + parentIssueId + ", parentCommentId=" + parentCommentId + ", text=" + text + ", comments=" + comments + "]";
	}
}

package com.yardspoon.cxfspringjpa.contract;

public interface PersistenceService {
	Long create(Issue newIssue);
	Issue find(Long id);
	void update(Issue existingIssue);
}

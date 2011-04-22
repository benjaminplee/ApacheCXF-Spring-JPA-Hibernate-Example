package com.yardspoon.cxfspringjpa.contract;

import javax.jws.WebService;

@WebService
public interface PersistenceService {
	Long create(Issue newIssue);

	Issue find(Long id);

	void update(Issue existingIssue);
}

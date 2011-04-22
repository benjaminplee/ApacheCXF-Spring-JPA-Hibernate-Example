package com.yardspoon.cxfspringjpa.contract;

import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface PersistenceService {

	@WebResult(name = "id")
	Long create(Issue newIssue);

	@WebResult(name = "issue")
	Issue find(Long id);

	void update(Issue existingIssue);
}

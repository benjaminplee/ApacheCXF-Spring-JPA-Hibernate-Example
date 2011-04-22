package com.yardspoon.cxfspringjpa.client;

import com.yardspoon.cxfspringjpa.contract.Issue;

public class Client {
	public static void main(String[] args) {
		Issue issue = new Issue();

		System.out.println("The issue is: " + issue);
	}
}

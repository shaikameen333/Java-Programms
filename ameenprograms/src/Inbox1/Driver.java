package Inbox1;

import Inbox.Search;

public class Driver {

	public static void main(String[] args) {
		Inbox1.Search s1 = new Inbox1.Search();
		Inbox.Search s2 = new Inbox.Search();
		s2 = s1;
		s1.bike();
		Search s3 = (Search) s2;
		s3.test();
		s1.car();
	}

}

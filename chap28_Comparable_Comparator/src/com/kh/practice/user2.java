package com.kh.practice;

import java.util.ArrayList;
import java.util.List;

public class user2 {

	public static void main(String[] args) {

		List<User> user = new ArrayList<>();
		user.add(new User("����1", 20));
		user.add(new User("����2", 30));
		user.add(new User("����3", 40));
		
		for(User player : user) {
			System.out.println(player);
		}
		
	}

}

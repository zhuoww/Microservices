package com.in28minutes.rest.webservices.resfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	private static Integer userCount = 0;
	
	static {
		users.add(new User(++userCount, "Vivian", LocalDate.now().minusYears(20)));
		users.add(new User(++userCount, "Zhuzhu", LocalDate.now().minusYears(10)));
		users.add(new User(++userCount, "Lala", LocalDate.now().minusYears(15)));
	}
	//public List<User> findAll()
	public List<User> findAll() {
		return users;
	}
	
	public User save(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}

}

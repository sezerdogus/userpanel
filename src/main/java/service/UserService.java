package service;

import java.util.List;
import java.util.UUID;

import repository.UserRepository;
import userlist.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	//creation of a user with random id
	public User create(User user) {
		user.setId(UUID.randomUUID().toString());

		return userRepository.save(user);
	}
	
	//methods of CRUD operations
	public User read(User user) {
		return user;
	}

	public List<User> readAll() {
		return userRepository.findAll();
	}

	public User update(User user) {
		User existingUser = userRepository.findByName(user.getName());

		if (existingUser == null) {
			return null;
		}

		existingUser.setName(user.getName());
		existingUser.setSurname(user.getSurname());

		return userRepository.save(existingUser);
	}

	public Boolean delete(User user) {
		User existingUser = userRepository.findByName(user.getName());

		if (existingUser == null) {
			return false;
		}

		userRepository.delete(existingUser);
		return true;
	}
}

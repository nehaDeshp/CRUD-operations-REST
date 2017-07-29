package examples.useroperations.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examples.useroperations.entity.User;
import examples.useroperations.exceptions.UserAlreadyPresentException;
import examples.useroperations.exceptions.UserNotFoundException;
import examples.useroperations.interfaces.UserRepository;
import examples.useroperations.interfaces.UserService;

@Service

public class UserServiceImplentation implements UserService {

	@Autowired
	private UserRepository repository;
	/*public UserServiceImplentation(UserRepository repository) {
		this.repository = repository;
	}*/
	@Override
	public List<User> findAllUsers() {
		return repository.findAllUsers();
	}

	@Override
	public User findOne(String id) {
		User existing = repository.findOne(id);
		if(existing == null) {
			throw new UserNotFoundException("User with "+id+" not found");
		}
		return existing;
	}

	@Override
	public User create(User user) {
		User createNew = repository.findOne(user.getEmail());
		if(createNew != null) {
			throw new UserAlreadyPresentException("User with email ID " +user.getEmail()+ " already exists !");
		}
		return repository.create(user);
	}

	@Override
	public boolean updateUser(String id) {
		User user = repository.findOne(id);
		if(user == null) {
			throw new UserNotFoundException("User with "+id+" not found");
		}
		repository.updateUser(id);
		return true;
	}

	@Override
	public void delete(User user) {
		 User u  = repository.findOne(user.getId());
	        if(u  == null){
	            throw new UserNotFoundException("User with "+user.getId()+" does not exist");
	        }
	        repository.delete(user);

	}
}

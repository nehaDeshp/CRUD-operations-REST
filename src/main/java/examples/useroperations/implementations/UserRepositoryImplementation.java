package examples.useroperations.implementations;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import examples.useroperations.entity.User;
import examples.useroperations.interfaces.UserRepository;

@Repository
public class UserRepositoryImplementation implements UserRepository {

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

}

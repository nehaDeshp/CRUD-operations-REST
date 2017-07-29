package examples.useroperations.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;
import examples.useroperations.entity.User;

@Service
public interface UserService {
	
	public List<User> findAllUsers();
	public User findOne(String id);
	public User create(User user);
	public boolean updateUser(String id);
	void delete(User user);
	
}

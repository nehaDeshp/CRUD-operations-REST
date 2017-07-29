package examples.useroperations.interfaces;

import java.util.List;

import org.springframework.context.annotation.Bean;

import examples.useroperations.entity.User;

public interface UserRepository {
	
	@Bean
	public List<User> findAllUsers();
	public User findOne(String id);
	public User create(User user);
	public boolean updateUser(String id);
	public void delete(User user);

}

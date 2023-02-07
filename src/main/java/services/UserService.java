package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.User;
import repositories.UserRepository;

@Service
public interface UserService {

	@Autowired
	public static final UserRepository userRepository = null;
	
	public static List<User> findAll(){
	   return userRepository.findAll();
	}
	
	public static Optional<User> findById(Long id){
		   return userRepository.findById(id);
	}
	
    public static void save(User user) {
    	userRepository.save(user);
    }
    
    public static void delete(Long id) {
    	userRepository.deleteById(id);
    }
    
}

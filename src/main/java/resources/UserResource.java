package resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.User;
import repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	public static UserRepository userRepository;
	
//	UserResource(UserResource userRepository) {
//	       this.userRepository = userRepository;
//	}
	
	@GetMapping
	public List<User> findAll(){
	   return userRepository.findAll();
	}
	
	@GetMapping(path = {"/{id}"})
	public ResponseEntity<User> findById(@PathVariable long id){
	   return userRepository.findById(id)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public User create(@RequestBody User user){
	   return userRepository.save(user);
	}
}

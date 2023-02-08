package aula.pratica.programacao.web.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import aula.pratica.programacao.web.entities.User;
import aula.pratica.programacao.web.services.UserService;

@RestController
@RequestMapping("users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/rest/getAll")
    public List<User> getUsers() {
        return userService.findAllUsers();
    }
	
	@GetMapping("/rest/get/{id}")
	public Optional<User> getUserById(@PathVariable("id") Long id) {
        return userService.findUserById(id);
    }
	
	@DeleteMapping("/rest/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }
	
	@PostMapping("/rest/update/{id}")
	public void updateUser(@RequestBody User user) {
		userService.insertUser(user);
    }
	
	@PostMapping("/rest/insert")
	public void createUser(@RequestBody User user) {
		userService.insertUser(user);
    }
}

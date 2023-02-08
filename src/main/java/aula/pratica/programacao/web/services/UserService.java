package aula.pratica.programacao.web.services;

import java.util.List;
import java.util.Optional;

import aula.pratica.programacao.web.entities.User;

public interface UserService {
	
	Optional<User> findUserById(Long id);
	
    List<User> findAllUsers();
    
    void deleteUser(Long id);

    void updateUser(User user);

    void insertUser(User user);
}

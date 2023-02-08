package aula.pratica.programacao.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aula.pratica.programacao.web.entities.User;
import aula.pratica.programacao.web.exceptions.ResourceNotFoundException;
import aula.pratica.programacao.web.repositores.UserRepository;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired 
	private UserRepository userRepository;	

	@Override
	public Optional<User> findUserById(Long id) {
		try {
			return userRepository.findById(id);

		}catch (Exception ex){
			throw new ResourceNotFoundException();
		}
	}

	@Override
	public List<User> findAllUsers() {
		try {
			return userRepository.findAll();
		}catch(Exception ex) {
			throw new ResourceNotFoundException();
		}
		
	}

	@Override
	public void deleteUser(Long id) {
		try {
			userRepository.deleteById(id);
		}catch(Exception ex) {
			throw new ResourceNotFoundException();
		}
		
	}

	@Override
	public void updateUser(User user) {
		try {
			userRepository.save(user);
		}catch(Exception ex) {
			throw new ResourceNotFoundException();
			}
		
	}

	@Override
	public void insertUser(User user) {
		try {
			userRepository.save(user);
		}catch(Exception ex) {
			throw new ResourceNotFoundException();
			}
		
			
	}
    
}

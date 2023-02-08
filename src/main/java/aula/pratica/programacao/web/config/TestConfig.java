package aula.pratica.programacao.web.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import aula.pratica.programacao.web.entities.User;
import aula.pratica.programacao.web.repositores.UserRepository;

@Component
@Order(1)
public class TestConfig implements CommandLineRunner {

	@Autowired
	  private UserRepository userRepository;

	  
	  public void run(String... args) throws Exception {
		  User userOne = new User("Maria Brown", "maria@gmail.com", "988888888", "123456");
		  User userTwo = new User("Alex Green", "alex@gmail.com", "977777777", "123456");
		  userRepository.saveAll(Arrays.asList(userOne, userTwo));
		  System.out.println("teste");
	  }

 }

package aula.pratica.programacao.web.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import aula.pratica.programacao.web.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

package br.com.andremarc.todolist.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface IUserRepository extends JpaRepository<UserModel, UUID>, JpaSpecificationExecutor<UserModel>  {
    UserModel findByUsername(String username);
}

package br.com.andremarc.todolist.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID>, JpaSpecificationExecutor<TaskModel> {
}

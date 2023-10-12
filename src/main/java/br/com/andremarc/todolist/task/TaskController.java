package br.com.andremarc.todolist.task;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final ITaskRepository repository;

    @PostMapping
    public TaskModel create(@RequestBody TaskModel taskModel) {
        var task = this.repository.save(taskModel);
        return task;
    }
}

package com.example.service;

import com.example.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
    List<Todo> findByUser(String userName);

    //service.retrieveTodos(name)

    //service.deleteTodo(id);
    //service.retrieveTodo(id)
    //service.updateTodo(todo)
    //service.addTodo(getLoggedInUserName(model), todo.getDesc(), todo.getTargetDate(),false);
}

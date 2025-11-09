package com.artuur.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.artuur.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{


    
}

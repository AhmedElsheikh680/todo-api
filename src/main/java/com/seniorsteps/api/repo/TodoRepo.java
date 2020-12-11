package com.seniorsteps.api.repo;

import com.seniorsteps.api.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Integer> {
    public Todo findByTitle(String title);
}

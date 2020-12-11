package com.seniorsteps.api.service;

import com.seniorsteps.api.exception.ConflictException;
import com.seniorsteps.api.exception.RecordNotFoundException;
import com.seniorsteps.api.model.Todo;
import com.seniorsteps.api.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepo todoRepo;

    public List<Todo> findAll(){
        return todoRepo.findAll();
    }

    public Todo findById(int id){
        try{
            return todoRepo.findById(id).get();

        }catch(Exception e){
            throw new RecordNotFoundException(String.format("No Redord With Id[%s] Was Found In Our Daatabase ",id));

        }

    }

    public Todo insert(Todo todo){
        if(todoRepo.findByTitle(todo.getTitle()) != null){
            throw new ConflictException("Another Record With The Sane Title Exists");
        }
        return todoRepo.save(todo);
    }

    public Todo update(Todo todo){
        return todoRepo.save(todo);
    }

    public void remove(int id){
         todoRepo.deleteById(id);
    }

















}

package com.seniorsteps.api.controller;

import com.seniorsteps.api.model.Todo;
import com.seniorsteps.api.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TodoController {
    @Autowired
    private TodoService todoService;
    @GetMapping("/todos")
    public ResponseEntity<List<Todo>> getAllTodos(){
        List<Todo> todos = todoService.findAll();
        if(todos !=null){
            return new ResponseEntity<List<Todo>>(todos, HttpStatus.OK);
        }else{
            return new ResponseEntity<List<Todo>>(todos, HttpStatus.NOT_FOUND);

        }
    }
    @GetMapping("/todos/{id}")
    public ResponseEntity<Todo> getById(@PathVariable int id){
        Todo todo = todoService.findById(id);
        if(todo !=null){
            return new ResponseEntity<Todo>(todo, HttpStatus.OK);
        }else{
            return new ResponseEntity<Todo>(todo, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/todos")
    public ResponseEntity<Todo> saveTodo(@Valid @RequestBody Todo todo){
        todo = todoService.insert(todo);
        if(todo != null){

                return new ResponseEntity<Todo>(todo, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<Todo>(todo, HttpStatus.NOT_FOUND);

        }
    }

    @PutMapping("/todos")
    public ResponseEntity<Todo> updateTodo(@RequestBody Todo todo){
        todo = todoService.update(todo);
        if(todo !=null){
            return new ResponseEntity<Todo>(todo, HttpStatus.OK);
        }else{
            return new ResponseEntity<Todo>(todo, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable int id){
        todoService.remove(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }







































}

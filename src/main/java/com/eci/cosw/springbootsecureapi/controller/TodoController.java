package com.eci.cosw.springbootsecureapi.controller;
import com.eci.cosw.springbootsecureapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.eci.cosw.springbootsecureapi.model.Todo;
import java.util.List;
@RestController
@RequestMapping( "api" )
public class TodoController {
    @Autowired
    private TodoService todoService;
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping( value = "/todos", method = RequestMethod.GET )
    public List<Todo> getTodoList(){
        return todoService.getTodoList();
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping( value = "/todos", method = RequestMethod.POST )
    public void addTodo(@RequestBody Todo todo){
        todoService.addTodo(todo);

    }
}

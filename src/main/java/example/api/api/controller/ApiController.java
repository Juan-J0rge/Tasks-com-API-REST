package example.api.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;

/**
 * Essa anotação(do spring boot) em resumo vai informar
 * que estamos definindo uma api dentro desta classe
 */
@RestController
public class ApiController {

    private List<String> tasks = new ArrayList<>();


    //ObjectMapper vai transformar a Lista de tarefas em um JSON, para podermos ver
    private ObjectMapper objectMapper;

    public ApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }


    // aqui vamos mapear a rota http, path é o caminho

    /**
     * Esse "/tasks" vai ser um caminho que usaremos,
     * se no navegador eu adicionar no localhost:8080 o /tasks, iremos
     * ser direcionados para esse caminho.
     */
    @GetMapping (path = "/tasks")
    public ResponseEntity<String> listTask() throws JsonProcessingException {
        return ResponseEntity.ok(objectMapper.writeValueAsString(tasks));
    }

    /**
     * Esse post vai ser usado para cadastrar a task, e o get para acessar as tasks
     * @param task
     * @return
     */
    @PostMapping (path = "/tasks")
    public ResponseEntity<Void> createTask(@RequestBody String task) {
        tasks.add(task);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping (path = "/tasks")
    public ResponseEntity<Void> clearTask() {
        tasks = new ArrayList<>();
        return ResponseEntity.ok().build();
    }
}

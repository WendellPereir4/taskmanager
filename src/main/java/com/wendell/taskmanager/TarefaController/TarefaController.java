package com.wendell.taskmanager.TarefaController;
import com.wendell.taskmanager.TarefaRepository.TarefaRepository;
import com.wendell.taskmanager.entity.Tarefa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController // informa ao Spring que essa classe vai receber requisições HTTP e devolver respostas, como JSON.
public class TarefaController {

    private final TarefaRepository tarefaRepository; // -> Declaramos um atributo para utilizar o Repository que você criou.

    public TarefaController(TarefaRepository tarefaRepository) { // -> construtor.
        this.tarefaRepository = tarefaRepository;
    }

    @GetMapping("/tarefas") //-> É uma interface do Java que representa uma lista de elementos.
    public List<Tarefa> listarTarefas() { //-> guarda os objetos em uma lista.
        return tarefaRepository.findAll(); //-> findAll() → busca todas as tarefas no banco.
    }
}
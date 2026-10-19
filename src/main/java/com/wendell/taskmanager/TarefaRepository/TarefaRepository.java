//Entity (Tarefa) → representa os dados da tarefa.
//
//
//
//Repository (TarefaRepository) → faz a comunicação com o banco para salvar, buscar, atualizar e excluir tarefas.
//
//
//
//Controller → vai receber as requisições da aplicação.




package com.wendell.taskmanager.TarefaRepository;
import com.wendell.taskmanager.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

}

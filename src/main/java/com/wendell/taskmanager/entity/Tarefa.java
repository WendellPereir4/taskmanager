package com.wendell.taskmanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // A Entity representa uma tabela do banco de dados, mas não é o banco de dados em si.
@Table(name = "tarefas") // nome da tabela.
public class Tarefa {

    @Id // indentificador unico.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerador sequencial automatico
    private Long id;

    private String titulo;
    private String descricao;
    private boolean concluida;

}
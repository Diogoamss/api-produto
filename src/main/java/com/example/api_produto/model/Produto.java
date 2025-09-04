package com.example.api_produto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;

    public Produto() {}

    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    //getters e setters
    public long getId() { return id;}
    public void setId(Long id) { this.id = id;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public Double getPreco() { return preco;}
    public void getPreco(Double preco) {this.preco = preco;}
    
}

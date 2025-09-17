package com.example.api_produto.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_produto.model.Produto;
import com.example.api_produto.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoRepository repository;

    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Produto create(@RequestBody Produto produto) {
        return repository.save(produto);
    }
    
    @GetMapping
    public List<Produto> list() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Produto search(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Produto update(@PathVariable Long id, @RequestBody Produto novoProduto) {
        return repository.findById(id).map(produto -> {
            produto.setName(novoProduto.getName());
            produto.setPrice(novoProduto.getPrice());
            return repository.save(produto);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}

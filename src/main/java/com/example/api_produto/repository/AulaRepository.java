package com.example.api_produto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.api_produto.model.Aula;

public interface AulaRepository extends JpaRepository<Aula, Long> {
    List<Aula> findByTitulo(String titulo);
    List<Aula> findByTituloContaining(String titulo);
}

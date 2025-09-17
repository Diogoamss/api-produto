package com.example.api_produto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.api_produto.model.Transcricao;


public interface TranscricaoRepository extends JpaRepository<Transcricao, Long> {
    List<Transcricao> findBytranscricaoContaining(String Transcricao);
}

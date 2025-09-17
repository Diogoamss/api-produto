package com.example.api_produto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.etecbentoquirino.api_produtos.model.Transcricao;

public interface TranscricaoRepository extends JpaRepository<Transcricao, Long> {
    List<Transcricao> findBytranscricaoContaining(String Transcricao);
}

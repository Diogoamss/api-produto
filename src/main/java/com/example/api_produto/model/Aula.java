package com.example.api_produto.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.*;

@Entity
@Table(name = "aulas")
@EntityListeners(AuditingEntityListener.class)
public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime dataCriacao;

    private Long idTranscricao;

    public Aula() {}

    public Aula(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }


    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public Long getIdTranscricao() {
        return idTranscricao;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setIdTranscricao(Long idTranscricao) {
        this.idTranscricao = idTranscricao;
    }
}

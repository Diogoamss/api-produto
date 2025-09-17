

import java.time.LocalDateTime;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@Entity(name="Transcricao")

public class Transcricao {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String transcricao;

    @CreatedDate
    private LocalDateTime dataCriacao;

    @LastModifiedDate
    private LocalDateTime dataAtualizacao;

    public Transcricao(){}

    public Transcricao(Long id, String transcricao){
        this.id = id;
        this.transcricao = transcricao;
    }

    public Long getId() {
        return id;
    }

    public String getTranscricao() {
        return transcricao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
    
    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTranscricao(String transcricao) {
        this.transcricao = transcricao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

}

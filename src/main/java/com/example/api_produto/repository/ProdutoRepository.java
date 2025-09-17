pakage com.example.api-produto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.api_produto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByName(String name);
    List<Produto> findByNameContaining(String PartOfName);    
}
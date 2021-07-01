package ads.pw.crud.livraria.livrariabackend;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LivrosRepository extends CrudRepository<Livros, Long>{

    List<Livros> findAll();
    
}

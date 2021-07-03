package ads.pw.crud.livraria.livrariabackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
@ResponseBody
@CrossOrigin
public class LivrosController {
 
 @Autowired
 LivrosRepository livrosRepository;

    @GetMapping(value="/")
    public List<Livros> getListarTodos() {
        List<Livros> lista = livrosRepository.findAll();
        return lista;
    }
    

    @GetMapping(value="/detalhes/{id}")
    public Livros getDetalhes(@PathVariable Long id) {
        Livros livros = new Livros();
        livros = livrosRepository.findById(id).get();        
        return livros;
    }

    @PostMapping(value="/adicionar")
    public Livros postAdicionar(@RequestBody Livros livros) {
        Livros livrosNovo = livrosRepository.save(livros);
        return livrosNovo;
    }

    @GetMapping(value="/deletar/{id}")
    public void getDeletar(@PathVariable Long id) {
        livrosRepository.deleteById(id);
    }
    




    
    



}

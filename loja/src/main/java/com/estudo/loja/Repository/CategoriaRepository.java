package com.estudo.loja.Repository;

import java.util.List;

import com.estudo.loja.Model.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
    public List<Categoria> findAllByGeneroContainingIgnoreCase (String genero);

    public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}

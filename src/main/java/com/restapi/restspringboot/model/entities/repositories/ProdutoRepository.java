package com.restapi.restspringboot.model.entities.repositories;

import com.restapi.restspringboot.model.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ProdutoRepository
        extends PagingAndSortingRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

    //Podemos ter também querys
    @Query("SELECT p From produto p WHERE p.nome like %:nome%")
    public Iterable<Produto> SearchByNameLike(@Param("nome") String Nome);

}
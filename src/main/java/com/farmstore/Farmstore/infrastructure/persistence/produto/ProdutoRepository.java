package com.farmstore.Farmstore.infrastructure.persistence.produto;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}

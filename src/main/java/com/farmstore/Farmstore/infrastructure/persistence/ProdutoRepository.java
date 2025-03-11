package com.farmstore.Farmstore.infrastructure.persistence;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}

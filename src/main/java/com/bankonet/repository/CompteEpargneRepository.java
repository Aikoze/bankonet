package com.bankonet.repository;

import com.bankonet.entity.CompteEpargne;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteEpargneRepository extends CrudRepository<CompteEpargne , Long> {

}

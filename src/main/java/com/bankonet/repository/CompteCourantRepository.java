package com.bankonet.repository;


import com.bankonet.entity.CompteCourant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteCourantRepository extends CrudRepository<CompteCourant, Long> {


}

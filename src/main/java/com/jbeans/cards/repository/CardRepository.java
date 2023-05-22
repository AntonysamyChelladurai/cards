package com.jbeans.cards.repository;

import com.jbeans.cards.model.Cards;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends CrudRepository<Cards, Long> {

    public List<Cards> findByCustomerId(int customerId);

}

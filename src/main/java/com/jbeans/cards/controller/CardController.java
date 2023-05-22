package com.jbeans.cards.controller;

import com.jbeans.cards.model.Cards;
import com.jbeans.cards.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    @Autowired
    private CardRepository cardRepository;

    @PostMapping("/myCards")
    public List<Cards> getCustomerCardDetails(@RequestBody Cards cards){
        List<Cards> cardsList=cardRepository.findByCustomerId(cards.getCustomerId());
        if(cardsList!=null){
            return cardsList;
        }
        else{
            return null;
        }
    }
}

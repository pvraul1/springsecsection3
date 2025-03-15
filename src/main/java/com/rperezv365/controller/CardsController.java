package com.rperezv365.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CardsController
 * <p>
 * Created by IntelliJ, Spring Framework Guru.
 *
 * @author architecture - pvraul
 * @version 14/03/2025 - 16:33
 * @since 1.17
 */
@RestController
public class CardsController {

    @GetMapping("/myCards")
    public String getCardDetails() {
        return "Here are the card details from the DB";
    }

}

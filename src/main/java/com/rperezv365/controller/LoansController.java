package com.rperezv365.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * LoansController
 * <p>
 * Created by IntelliJ, Spring Framework Guru.
 *
 * @author architecture - pvraul
 * @version 14/03/2025 - 16:34
 * @since 1.17
 */
@RestController
public class LoansController {

    @GetMapping("/myLoans")
    public String getLoanDetails() {
        return "Here are the loan details from the DB";
    }

}

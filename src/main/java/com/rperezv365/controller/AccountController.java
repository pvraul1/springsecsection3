package com.rperezv365.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AccountController
 * <p>
 * Created by IntelliJ, Spring Framework Guru.
 *
 * @author architecture - pvraul
 * @version 14/03/2025 - 16:32
 * @since 1.17
 */
@RestController
public class AccountController {

    @GetMapping("/myAccount")
    public String getAccountDetails() {
        return "Here are the account details from the DB";
    }

}

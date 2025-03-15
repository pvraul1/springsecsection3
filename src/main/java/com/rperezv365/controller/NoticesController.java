package com.rperezv365.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * NoticesController
 * <p>
 * Created by IntelliJ, Spring Framework Guru.
 *
 * @author architecture - pvraul
 * @version 14/03/2025 - 16:35
 * @since 1.17
 */
@RestController
public class NoticesController {

    @GetMapping("/notices")
    public String getNotices() {
        return "Here are the notices details from the DB";
    }

}

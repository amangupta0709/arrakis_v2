package com.db.grad.javaapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

  @GetMapping("/")
  public String getWelcome() {
    return "THIS IS GRP 3 CODING CHALLENGE!!!!";
  }

}

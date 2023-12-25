package com.example.loggingdemo.controller;

import com.example.loggingdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class DemoController {
  private final DemoService demoService;

  @Autowired
  public DemoController(DemoService demoService) {
    this.demoService = demoService;
  }

  @GetMapping("/demo")
  public void action() {
    demoService.execute();
  }
}

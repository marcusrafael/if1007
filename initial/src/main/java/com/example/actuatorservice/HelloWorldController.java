package com.example.actuatorservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/hello-world")
  @ResponseBody
  public Greeting helloGet(@RequestParam(name="name", required=false, defaultValue="Xavier") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }
  
  @PostMapping("/hello-world")
  @ResponseBody
  public Greeting helloPost(@RequestParam(name="name", required=false, defaultValue="Xavier") String name) {
    return null;
  }
  
  @PutMapping("/hello-world")
  @ResponseBody
  public Greeting helloPut(@RequestParam(name="name", required=false, defaultValue="Xavier") String name) {
    return null;
  }

  @DeleteMapping("/hello-world")
  @ResponseBody
  public Greeting helloDelete(@RequestParam(name="name", required=false, defaultValue="Xavier") String name) {
    return null;
  }
}
package tech.geek.flu.digital.profile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api")
public class DigitalProfileController {

  @GetMapping("/echo")
  public String pingPong(){
    return String.format("Estoy vivo servicio Perfil Digital %s", Instant.now().toString());
  }



}

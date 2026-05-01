package br.com.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import br.com.projeto.entity.User;
import br.com.projeto.repository.UserRepository;

@RestController
public class UserController {
  
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private PasswordEncoder passwordEncoder;

  @PostMapping("/registrar")
  public ResponseEntity<String> registerUser(@RequestBody User user) {
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    userRepository.save(user);
    return ResponseEntity.ok("Usuário registrado com sucesso");
  }

  @GetMapping("/visualizarcadastros") 
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }
}
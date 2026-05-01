package br.com.projeto.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import br.com.projeto.entity.Usuario;
import br.com.projeto.repository.UsuarioRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UsuarioRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserController(UsuarioRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/registrar")
    public ResponseEntity<String> registerUser(@RequestBody Usuario user) {

        // Criptografa a senha antes de salvar
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        userRepository.save(user);

        return ResponseEntity.ok("Usuário registrado com sucesso");
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> getAllUsers() {
        List<Usuario> usuarios = userRepository.findAll();
        return ResponseEntity.ok(usuarios);
    }
}
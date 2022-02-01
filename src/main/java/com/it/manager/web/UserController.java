package com.it.manager.web;

import com.it.manager.dto.LoginDTO;
import com.it.manager.dto.UserDTO;
import com.it.manager.dto.UsersDetailsDTO;
import com.it.manager.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> register(@RequestBody UserDTO userDTO) {
        userService.registerUser(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> login(@RequestBody LoginDTO loginDto) {
        UsersDetailsDTO dto = userService.login(loginDto.getLogin(), loginDto.getPassword());
        return ResponseEntity.status(HttpStatus.OK)
            .body(dto);
    }
}

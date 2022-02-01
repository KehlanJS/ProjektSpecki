package com.it.manager.service;

import com.it.manager.domain.UserEntity;
import com.it.manager.dto.UserDTO;
import com.it.manager.dto.UsersDetailsDTO;
import com.it.manager.exceptions.InvalidCredentialsException;
import com.it.manager.exceptions.UserLoginAlreadyUsedException;
import com.it.manager.mapper.UserMapper;
import com.it.manager.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public void registerUser(UserDTO userDTO) {
        validateLogin(userDTO);

        UserEntity userToSave = userMapper.toEntity(userDTO);
        userRepository.save(userToSave);
    }

    public UsersDetailsDTO login(String login, String password) {
        final Optional<UserEntity> user = userRepository.findByLoginAndPassword(login, password);

        if (user.isEmpty()) {
            throw new InvalidCredentialsException();
        }
        return userMapper.toUserDetailsDTO(user.get());
    }

    private void validateLogin(UserDTO userDTO) {
        userRepository.findByLogin(userDTO.getLogin())
            .ifPresent(existingUser -> {
                throw new UserLoginAlreadyUsedException();
            });
    }
}

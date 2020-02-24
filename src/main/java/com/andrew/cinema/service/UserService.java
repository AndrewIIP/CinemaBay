package com.andrew.cinema.service;

import com.andrew.cinema.repo.UserDetailsRepo;
import com.andrew.cinema.data.dto.UserDto;
import com.andrew.cinema.data.mapper.UserMapper;
import com.andrew.cinema.repo.UserDetailsRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {

    UserDetailsRepo userRepository;
    UserMapper userMapper;

    public String addSimpleUserToRepo(UserDto userDto){
        userRepository.save(userMapper.dtoToUser(userDto));
        return "All Ok";
    }

    public List<UserDto> getAllUsers(){
        return userRepository.findAll().stream().map(e -> userMapper.userToDto(e)).collect(Collectors.toList());
    }
}

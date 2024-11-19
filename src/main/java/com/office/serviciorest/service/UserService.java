package com.office.serviciorest.service;

import com.office.serviciorest.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    @Value("${spring.external.service.base-url}")
    private String basePath;

    private final RestTemplate restTemplate;

    public List<UserDTO> getUsers(){
        UserDTO[] response = restTemplate.getForObject(basePath+"user",UserDTO[].class);
        return Arrays.asList(response);
    }

    public void saveUser(UserDTO use){

    }
    public void updateUser(Integer id, UserDTO user){

    }
    public void deleteUser(Integer id){

    }
}

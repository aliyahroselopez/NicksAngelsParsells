package com.csb.appadvc.finalproject.NicksAngelsParsells.services;

import com.csb.appadvc.finalproject.NicksAngelsParsells.dto.UserDTO;

import java.util.List;

public interface UserService{

    List<UserDTO> list();

    void add(UserDTO user);

    UserDTO get(Long id);

    void update(UserDTO updatedUser);
    void delete(Long id);


}

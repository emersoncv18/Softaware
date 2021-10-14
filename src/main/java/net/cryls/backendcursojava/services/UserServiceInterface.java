package net.cryls.backendcursojava.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.cryls.backendcursojava.shared.dto.UserDTO;

public interface UserServiceInterface extends UserDetailsService{

    public UserDTO createUser(UserDTO userDTO);

}
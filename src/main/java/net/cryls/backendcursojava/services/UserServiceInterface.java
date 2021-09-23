package net.cryls.backendcursojava.services;

import net.cryls.backendcursojava.shared.dto.UserDTO;

public interface UserServiceInterface {

    UserDTO createUser(UserDTO userDTO);

}
package net.cryls.backendcursojava;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.cryls.backendcursojava.entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {


    //public UserEntity findUserByFirstName(String name);
    public UserEntity findUserByEmail(String email);
    
}

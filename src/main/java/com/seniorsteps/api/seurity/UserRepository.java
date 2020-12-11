package com.seniorsteps.api.seurity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser,Long > {
	
	Optional<AppUser> findByUserName (String userName);

}

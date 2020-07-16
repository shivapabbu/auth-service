package com.sgv.authservice.repository;

import com.sgv.authservice.model.Role;
import com.sgv.authservice.model.SGVRole;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(SGVRole role);
}

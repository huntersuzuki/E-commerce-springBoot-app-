package com.pranay.dreamshops.repository;

import com.pranay.dreamshops.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Collection<Object> findByName(String role);
}

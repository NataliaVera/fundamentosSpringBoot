package com.fundamentos.sprigboot.fundamentos.repository;

import com.fundamentos.sprigboot.fundamentos.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

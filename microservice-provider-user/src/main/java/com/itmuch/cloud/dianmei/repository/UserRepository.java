package com.itmuch.cloud.dianmei.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itmuch.cloud.dianmei.domain.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

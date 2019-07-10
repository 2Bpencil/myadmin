package com.tyf.myadmin.code.dao;

import com.tyf.myadmin.base.repository.ExpandJpaRepository;
import com.tyf.myadmin.code.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ExpandJpaRepository<User,Integer> {

    User findByUsername(String name);




}

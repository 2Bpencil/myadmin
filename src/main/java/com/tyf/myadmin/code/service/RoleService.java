package com.tyf.myadmin.code.service;

import com.tyf.myadmin.code.entity.Role;

import java.util.List;

public interface RoleService {

    List<Role> findAll();

    List<Role> findByMenuId(Integer id);

}

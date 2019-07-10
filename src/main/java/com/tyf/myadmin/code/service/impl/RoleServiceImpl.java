package com.tyf.myadmin.code.service.impl;

import com.tyf.myadmin.code.dao.MenuRepository;
import com.tyf.myadmin.code.dao.RoleRepository;
import com.tyf.myadmin.code.entity.Menu;
import com.tyf.myadmin.code.entity.Role;
import com.tyf.myadmin.code.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List<Role> findAll() {
        List<Role> allRoles = new ArrayList<>();
        List<Role> roles = roleRepository.findAll();
        roles.forEach(role -> {
            List<Menu> menus = menuRepository.findByRoleId(role.getId());
            role.setMenus(menus);
            allRoles.add(role);
        });
        return allRoles;
    }
    @Override
    public List<Role> findByMenuId(Integer id) {
        return roleRepository.findByMenuId(id);
    }
}

package com.tyf.myadmin.code.service.impl;

import com.tyf.myadmin.code.dao.MenuRepository;
import com.tyf.myadmin.code.entity.Menu;
import com.tyf.myadmin.code.service.MenuService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: tyf
 * @Date: 2019/7/9 19:55
 * @Description:
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    /**
     * 根据用户id获取该用户所有的菜单权限json数组
     * @param userId
     * @return
     */
    public String getMenusByUserId(Integer userId){
        List<Menu> list = menuRepository.findByUserId(userId);
        return JSONArray.fromObject(list).toString();
    }

}

package com.tyf.myadmin.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: tyf
 * @Date: 2019/7/11 11:01
 * @Description:
 */

@NoRepositoryBean
public abstract  interface BaseRepository <T, ID extends Serializable> extends JpaRepository<T,ID>, JpaSpecificationExecutor<T> {




}

package com.jingdianjichi.auth.infra.basic.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jingdianjichi.auth.infra.basic.entity.AuthUser;
import com.jingdianjichi.auth.infra.basic.mapper.AuthUserDao;
import com.jingdianjichi.auth.infra.basic.service.AuthUserService;

/**
 * (AuthUser)表服务实现类
 *
 * @author makejava
 * @since 2024-02-29 20:29:24
 */
@Service
public class AuthUserServiceImpl implements AuthUserService {
    @Resource
    private AuthUserDao authUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    @Override
    public AuthUser queryById() {
        return this.authUserDao.queryById();
    }


    /**
     * 新增数据
     *
     * @param authUser 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(AuthUser authUser) {
        return this.authUserDao.insert(authUser);
    }

    /**
     * 修改数据
     *
     * @param authUser 实例对象
     * @return 实例对象
     */
    @Override
    public Integer update(AuthUser authUser) {
        return this.authUserDao.update(authUser);
    }

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById() {
        return this.authUserDao.deleteById() > 0;
    }

    @Override
    public List<AuthUser> queryByCondition(AuthUser authUser) {

        return this.authUserDao.queryAllByLimit(authUser);
    }
}

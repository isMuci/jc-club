package com.jingdianjichi.auth.application.controller;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.jingdianjichi.auth.application.convert.AuthPermissionDTOConverter;
import com.jingdianjichi.auth.application.dto.AuthPermissionDTO;
import com.jingdianjichi.auth.common.entity.Result;
import com.jingdianjichi.auth.domain.entity.AuthPermissionBO;
import com.jingdianjichi.auth.domain.service.AuthPermissionDomainService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/permission/")
@Slf4j
public class PermissionController {
    @Resource
    private AuthPermissionDomainService authPermissionDomainService;

    @RequestMapping("add")
    public Result<Boolean> add(@RequestBody AuthPermissionDTO authPermissionDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("PermissionController.add.dto:{}", JSON.toJSONString(authPermissionDTO));
            }
            Preconditions.checkArgument(!StringUtils.isBlank(authPermissionDTO.getName()), "权限名称不能为空");
            Preconditions.checkNotNull(authPermissionDTO.getParentId(), "权限父id不能为空");

            AuthPermissionBO authPermissionBO = AuthPermissionDTOConverter.INSTANCE.convertDTOToBO(authPermissionDTO);
            return Result.ok(authPermissionDomainService.add(authPermissionBO));
        } catch (Exception e) {
            log.error("PermissionController.add.error:{}", e.getMessage(), e);
            return Result.fail("新增权限失败");
        }
    }

    @RequestMapping("update")
    public Result<Boolean> update(@RequestBody AuthPermissionDTO authPermissionDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("RoleController.update.dto:{}", JSON.toJSONString(authPermissionDTO));
            }
            Preconditions.checkNotNull(authPermissionDTO.getId(), "权限id不能为空");
            AuthPermissionBO authPermissionBO = AuthPermissionDTOConverter.INSTANCE.convertDTOToBO(authPermissionDTO);
            return Result.ok(authPermissionDomainService.update(authPermissionBO));
        } catch (Exception e) {
            log.error("RoleController.update.error:{}", e.getMessage(), e);
            return Result.fail("更新权限信息失败");
        }
    }

    @RequestMapping("delete")
    public Result<Boolean> delete(@RequestBody AuthPermissionDTO authPermissionDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("RoleController.delete.dto:{}", JSON.toJSONString(authPermissionDTO));
            }
            AuthPermissionBO authPermissionBO = AuthPermissionDTOConverter.INSTANCE.convertDTOToBO(authPermissionDTO);
            return Result.ok(authPermissionDomainService.delete(authPermissionBO));
        } catch (Exception e) {
            log.error("RoleController.delete.error:{}", e.getMessage(), e);
            return Result.fail("删除权限失败");
        }
    }

    @RequestMapping("getPermission")
    public Result<Boolean> getPermission(String userName) {
        try {
            log.info("RoleController.getPermission.userName:{}", userName);
            Preconditions.checkArgument(!StringUtils.isBlank(userName), "用户id不能为空");
            return Result.ok(authPermissionDomainService.getPermission(userName));
        } catch (Exception e) {
            log.error("RoleController.getPermission.error:{}", e.getMessage(), e);
            return Result.fail("查询用户权限失败");
        }
    }

}

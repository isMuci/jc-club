package com.jingdianjichi.auth.domain.convert;

import com.jingdianjichi.auth.domain.entity.AuthRolePermissionBO;
import com.jingdianjichi.auth.infra.basic.entity.AuthRolePermission;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-01T21:55:52+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
public class AuthRolePermissionBOConverterImpl implements AuthRolePermissionBOConverter {

    @Override
    public AuthRolePermission convertBOToEntity(AuthRolePermissionBO authRolePermissionBO) {
        if ( authRolePermissionBO == null ) {
            return null;
        }

        AuthRolePermission authRolePermission = new AuthRolePermission();

        authRolePermission.setId( authRolePermissionBO.getId() );
        authRolePermission.setRoleId( authRolePermissionBO.getRoleId() );
        authRolePermission.setPermissionId( authRolePermissionBO.getPermissionId() );

        return authRolePermission;
    }

    @Override
    public List<AuthRolePermission> convertListBOToEntity(List<AuthRolePermissionBO> boList) {
        if ( boList == null ) {
            return null;
        }

        List<AuthRolePermission> list = new ArrayList<AuthRolePermission>( boList.size() );
        for ( AuthRolePermissionBO authRolePermissionBO : boList ) {
            list.add( convertBOToEntity( authRolePermissionBO ) );
        }

        return list;
    }
}

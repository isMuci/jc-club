package com.jingdianjichi.auth.domain.convert;

import com.jingdianjichi.auth.domain.entity.AuthPermissionBO;
import com.jingdianjichi.auth.infra.basic.entity.AuthPermission;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-01T21:55:52+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
public class AuthPermissionBOConverterImpl implements AuthPermissionBOConverter {

    @Override
    public AuthPermission convertBOToEntity(AuthPermissionBO authPermissionBO) {
        if ( authPermissionBO == null ) {
            return null;
        }

        AuthPermission authPermission = new AuthPermission();

        authPermission.setId( authPermissionBO.getId() );
        authPermission.setName( authPermissionBO.getName() );
        authPermission.setParentId( authPermissionBO.getParentId() );
        authPermission.setType( authPermissionBO.getType() );
        authPermission.setMenuUrl( authPermissionBO.getMenuUrl() );
        authPermission.setStatus( authPermissionBO.getStatus() );
        authPermission.setShow( authPermissionBO.getShow() );
        authPermission.setIcon( authPermissionBO.getIcon() );
        authPermission.setPermissionKey( authPermissionBO.getPermissionKey() );
        authPermission.setCreatedBy( authPermissionBO.getCreatedBy() );
        authPermission.setCreatedTime( authPermissionBO.getCreatedTime() );
        authPermission.setUpdateBy( authPermissionBO.getUpdateBy() );
        authPermission.setUpdateTime( authPermissionBO.getUpdateTime() );
        authPermission.setIsDeleted( authPermissionBO.getIsDeleted() );

        return authPermission;
    }

    @Override
    public List<AuthPermission> convertListBOToEntity(List<AuthPermissionBO> boList) {
        if ( boList == null ) {
            return null;
        }

        List<AuthPermission> list = new ArrayList<AuthPermission>( boList.size() );
        for ( AuthPermissionBO authPermissionBO : boList ) {
            list.add( convertBOToEntity( authPermissionBO ) );
        }

        return list;
    }
}

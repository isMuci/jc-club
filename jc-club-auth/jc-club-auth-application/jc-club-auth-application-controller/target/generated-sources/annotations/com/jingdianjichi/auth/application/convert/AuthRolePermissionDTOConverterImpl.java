package com.jingdianjichi.auth.application.convert;

import com.jingdianjichi.auth.application.dto.AuthRolePermissionDTO;
import com.jingdianjichi.auth.domain.entity.AuthRolePermissionBO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-01T21:55:53+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
public class AuthRolePermissionDTOConverterImpl implements AuthRolePermissionDTOConverter {

    @Override
    public AuthRolePermissionBO convertDTOToBO(AuthRolePermissionDTO authRolePermissionDTO) {
        if ( authRolePermissionDTO == null ) {
            return null;
        }

        AuthRolePermissionBO authRolePermissionBO = new AuthRolePermissionBO();

        authRolePermissionBO.setId( authRolePermissionDTO.getId() );
        authRolePermissionBO.setRoleId( authRolePermissionDTO.getRoleId() );
        authRolePermissionBO.setPermissionId( authRolePermissionDTO.getPermissionId() );
        List<Integer> list = authRolePermissionDTO.getPermissionIdList();
        if ( list != null ) {
            authRolePermissionBO.setPermissionIdList( new ArrayList<Integer>( list ) );
        }

        return authRolePermissionBO;
    }

    @Override
    public List<AuthRolePermissionBO> convertListDTOToBO(List<AuthRolePermissionDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AuthRolePermissionBO> list = new ArrayList<AuthRolePermissionBO>( dtoList.size() );
        for ( AuthRolePermissionDTO authRolePermissionDTO : dtoList ) {
            list.add( convertDTOToBO( authRolePermissionDTO ) );
        }

        return list;
    }
}

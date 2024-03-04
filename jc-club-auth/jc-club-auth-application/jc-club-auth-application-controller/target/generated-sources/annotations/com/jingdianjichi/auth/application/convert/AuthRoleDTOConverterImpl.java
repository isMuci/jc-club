package com.jingdianjichi.auth.application.convert;

import com.jingdianjichi.auth.application.dto.AuthRoleDTO;
import com.jingdianjichi.auth.domain.entity.AuthRoleBO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-04T02:04:13+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_391 (Oracle Corporation)"
)
public class AuthRoleDTOConverterImpl implements AuthRoleDTOConverter {

    @Override
    public AuthRoleBO convertDTOToBO(AuthRoleDTO authRoleDTO) {
        if ( authRoleDTO == null ) {
            return null;
        }

        AuthRoleBO authRoleBO = new AuthRoleBO();

        authRoleBO.setId( authRoleDTO.getId() );
        authRoleBO.setRoleName( authRoleDTO.getRoleName() );
        authRoleBO.setRoleKey( authRoleDTO.getRoleKey() );

        return authRoleBO;
    }

    @Override
    public List<AuthRoleBO> convertListDTOToBO(List<AuthRoleDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AuthRoleBO> list = new ArrayList<AuthRoleBO>( dtoList.size() );
        for ( AuthRoleDTO authRoleDTO : dtoList ) {
            list.add( convertDTOToBO( authRoleDTO ) );
        }

        return list;
    }
}

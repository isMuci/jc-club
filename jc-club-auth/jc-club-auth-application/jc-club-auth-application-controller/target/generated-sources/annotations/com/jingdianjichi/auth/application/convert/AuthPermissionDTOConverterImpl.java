package com.jingdianjichi.auth.application.convert;

import com.jingdianjichi.auth.application.dto.AuthPermissionDTO;
import com.jingdianjichi.auth.domain.entity.AuthPermissionBO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-04T02:04:13+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_391 (Oracle Corporation)"
)
public class AuthPermissionDTOConverterImpl implements AuthPermissionDTOConverter {

    @Override
    public AuthPermissionBO convertDTOToBO(AuthPermissionDTO authPermissionDTO) {
        if ( authPermissionDTO == null ) {
            return null;
        }

        AuthPermissionBO authPermissionBO = new AuthPermissionBO();

        authPermissionBO.setId( authPermissionDTO.getId() );
        authPermissionBO.setName( authPermissionDTO.getName() );
        authPermissionBO.setParentId( authPermissionDTO.getParentId() );
        authPermissionBO.setType( authPermissionDTO.getType() );
        authPermissionBO.setMenuUrl( authPermissionDTO.getMenuUrl() );
        authPermissionBO.setStatus( authPermissionDTO.getStatus() );
        authPermissionBO.setShow( authPermissionDTO.getShow() );
        authPermissionBO.setIcon( authPermissionDTO.getIcon() );
        authPermissionBO.setPermissionKey( authPermissionDTO.getPermissionKey() );

        return authPermissionBO;
    }

    @Override
    public List<AuthPermissionBO> convertListDTOToBO(List<AuthPermissionDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AuthPermissionBO> list = new ArrayList<AuthPermissionBO>( dtoList.size() );
        for ( AuthPermissionDTO authPermissionDTO : dtoList ) {
            list.add( convertDTOToBO( authPermissionDTO ) );
        }

        return list;
    }
}

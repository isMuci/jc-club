package com.jingdianjichi.auth.application.convert;

import com.jingdianjichi.auth.application.dto.AuthUserDTO;
import com.jingdianjichi.auth.domain.entity.AuthUserBO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-01T21:55:53+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
public class AuthUserDTOConverterImpl implements AuthUserDTOConverter {

    @Override
    public AuthUserBO convertDTOToBO(AuthUserDTO authUserDTO) {
        if ( authUserDTO == null ) {
            return null;
        }

        AuthUserBO authUserBO = new AuthUserBO();

        authUserBO.setId( authUserDTO.getId() );
        authUserBO.setUserName( authUserDTO.getUserName() );
        authUserBO.setNickName( authUserDTO.getNickName() );
        authUserBO.setEmail( authUserDTO.getEmail() );
        authUserBO.setPhone( authUserDTO.getPhone() );
        authUserBO.setPassword( authUserDTO.getPassword() );
        authUserBO.setSex( authUserDTO.getSex() );
        authUserBO.setAvatar( authUserDTO.getAvatar() );
        authUserBO.setStatus( authUserDTO.getStatus() );
        authUserBO.setIntroduce( authUserDTO.getIntroduce() );
        authUserBO.setExtJson( authUserDTO.getExtJson() );

        return authUserBO;
    }

    @Override
    public List<AuthUserBO> convertListDTOToBO(List<AuthUserDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AuthUserBO> list = new ArrayList<AuthUserBO>( dtoList.size() );
        for ( AuthUserDTO authUserDTO : dtoList ) {
            list.add( convertDTOToBO( authUserDTO ) );
        }

        return list;
    }
}

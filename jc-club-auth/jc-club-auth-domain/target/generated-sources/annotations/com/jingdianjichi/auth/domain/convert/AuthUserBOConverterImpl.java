package com.jingdianjichi.auth.domain.convert;

import com.jingdianjichi.auth.domain.entity.AuthUserBO;
import com.jingdianjichi.auth.infra.basic.entity.AuthUser;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-04T16:41:30+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_391 (Oracle Corporation)"
)
public class AuthUserBOConverterImpl implements AuthUserBOConverter {

    @Override
    public AuthUser convertBOToEntity(AuthUserBO authUserBO) {
        if ( authUserBO == null ) {
            return null;
        }

        AuthUser authUser = new AuthUser();

        authUser.setId( authUserBO.getId() );
        authUser.setUserName( authUserBO.getUserName() );
        authUser.setNickName( authUserBO.getNickName() );
        authUser.setEmail( authUserBO.getEmail() );
        authUser.setPhone( authUserBO.getPhone() );
        authUser.setPassword( authUserBO.getPassword() );
        authUser.setSex( authUserBO.getSex() );
        authUser.setAvatar( authUserBO.getAvatar() );
        authUser.setStatus( authUserBO.getStatus() );
        authUser.setIntroduce( authUserBO.getIntroduce() );
        authUser.setExtJson( authUserBO.getExtJson() );

        return authUser;
    }

    @Override
    public AuthUserBO convertEntityToBO(AuthUser authUser) {
        if ( authUser == null ) {
            return null;
        }

        AuthUserBO authUserBO = new AuthUserBO();

        authUserBO.setId( authUser.getId() );
        authUserBO.setUserName( authUser.getUserName() );
        authUserBO.setNickName( authUser.getNickName() );
        authUserBO.setEmail( authUser.getEmail() );
        authUserBO.setPhone( authUser.getPhone() );
        authUserBO.setPassword( authUser.getPassword() );
        authUserBO.setSex( authUser.getSex() );
        authUserBO.setAvatar( authUser.getAvatar() );
        authUserBO.setStatus( authUser.getStatus() );
        authUserBO.setIntroduce( authUser.getIntroduce() );
        authUserBO.setExtJson( authUser.getExtJson() );

        return authUserBO;
    }

    @Override
    public List<AuthUser> convertListBOToEntity(List<AuthUserBO> boList) {
        if ( boList == null ) {
            return null;
        }

        List<AuthUser> list = new ArrayList<AuthUser>( boList.size() );
        for ( AuthUserBO authUserBO : boList ) {
            list.add( convertBOToEntity( authUserBO ) );
        }

        return list;
    }
}

package com.manage.common.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author author
 * @title: CustomAuthenticationException
 * @projectName x-springboot
 * @description: TODO
 * @date 2019/12/2416:45
 */
public class CustomAuthenticationException extends AuthenticationException {

    public CustomAuthenticationException(String msg){
        super(msg);
    }
}

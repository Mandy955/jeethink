package com.jeethink.common.exception.user;

/**
 * 用户账号已被删除
 * 
 * @author jeethink  官方网址：www.jeethink.vip
 */
public class UserDeleteException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserDeleteException()
    {
        super("user.password.delete", null);
    }
}

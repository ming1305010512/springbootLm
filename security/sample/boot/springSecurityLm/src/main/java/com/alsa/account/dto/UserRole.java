package com.alsa.account.dto;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/9/7
 * @Time: 16:10
 * @Description:
 */
public class UserRole {

    private Long surId;
    private Long userId;
    private Long roleId;

    public Long getSurId() {
        return surId;
    }

    public void setSurId(Long surId) {
        this.surId = surId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}

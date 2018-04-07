package com.system

/**
 *  用户-角色
 */
class ShiroUserRoleRel {

    ShiroUser user
    ShiroRole role

    ShiroUserRoleRel(ShiroUser user, ShiroRole role) {
        this.user = user
        this.role = role
    }
}

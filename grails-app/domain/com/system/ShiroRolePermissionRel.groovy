package com.system

/**
 *  角色权限
 */
class ShiroRolePermissionRel {

    //角色
    ShiroRole role

    //权限类型
    ShiroPermission permission

    //权限 例：*:*-表示拥有所有权限，test:save,update,show-表示拥有保存，修改，查看的权限
    String target

    //允许访问标识，默认为：*
    String actions

    ShiroRolePermissionRel(ShiroRole role, ShiroPermission permission, String target, String actions) {
        this.role = role
        this.permission = permission
        this.target = target
        this.actions = actions
    }

    static constraints = {
        actions(nullable: false, blank: false)
    }
}

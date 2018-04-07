package com.system

/**
 *  用户权限
 */
class ShiroUserPermissionRel {

    //用户
    ShiroUser user

    //权限类型
    ShiroPermission permission

    //权限 例：*:*-表示拥有所有权限，test:save,update,show-表示拥有保存，修改，查看的权限
    String target

    //允许访问标识，默认为：*
    String actions

    static constraints = {
        target(nullable: true, blank: false)
        actions(nullable: false, blank: false)
    }
}

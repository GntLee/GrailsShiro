package com.system

/**
 *  权限类型
 */
class ShiroPermission {

    //类型一般为：org.apache.shiro.authz.permission.WildcardPermission
    String type

    //默认为：*
    String possibleActions

    ShiroPermission(String type, String possibleActions) {
        this.type = type
        this.possibleActions = possibleActions
    }
    static constraints = {
        type(nullable: false, blank: false, unique: true)
        possibleActions(nullable:false, blank: false)
    }
}

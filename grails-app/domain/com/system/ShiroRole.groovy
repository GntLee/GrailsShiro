package com.system

/**
 *  角色
 */
class ShiroRole {

    //角色标识
    String name

    ShiroRole(String name) {
        this.name = name
    }
    static constraints = {
        name(nullable: false, blank: false, unique: true)
    }
}

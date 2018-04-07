package com.system

/**
 *  用户
 */
class ShiroUser {

    String username
    String passwordHash

    ShiroUser(String username, String passwordHash) {
        this.username = username
        this.passwordHash = passwordHash
    }

    static constraints = {
        username(nullable: false, blank: false, unique: true)
    }
}

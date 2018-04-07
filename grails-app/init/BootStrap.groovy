import com.system.ShiroPermission
import com.system.ShiroRole
import com.system.ShiroRolePermissionRel
import com.system.ShiroUser
import com.system.ShiroUserRoleRel
import org.apache.shiro.crypto.hash.Sha256Hash

class BootStrap {

    def init = { servletContext ->

        def exists = ShiroUser.findByUsername("admin")

        if(!exists) {

            def user1 = new ShiroUser("admin", new Sha256Hash("admin").toHex()).save(failOnError: true)
            def user2 = new ShiroUser("test", new Sha256Hash("test").toHex()).save(failOnError: true)
            def user3 = new ShiroUser("guest", new Sha256Hash("guest").toHex()).save(failOnError: true)

            def role1 = new ShiroRole("ROLE_ADMIN").save(failOnError: true)
            def role2 = new ShiroRole("ROLE_USER").save(failOnError: true)
            def role3 = new ShiroRole("ROLE_GUEST").save(failOnError: true)

            new ShiroUserRoleRel(user1, role1).save(failOnError: true)
            new ShiroUserRoleRel(user2, role2).save(failOnError: true)
            new ShiroUserRoleRel(user3, role3).save(failOnError: true)

            def p1 = new ShiroPermission("org.apache.shiro.authz.permission.WildcardPermission", "*").save(failOnError: true)

            new ShiroRolePermissionRel(role1, p1, "*:*", "*").save(failOnError: true)
            new ShiroRolePermissionRel(role2, p1, "test:index,create,show,edit,update", "*").save(failOnError: true)
            new ShiroRolePermissionRel(role3, p1, "*:*", "*").save(failOnError: true)

        }
       
    }

    def destroy = {
    }
}

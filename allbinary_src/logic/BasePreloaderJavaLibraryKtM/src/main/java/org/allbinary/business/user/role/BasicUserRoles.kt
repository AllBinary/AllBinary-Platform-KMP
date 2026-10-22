/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2026 AllBinary
 *
 *  By agreeing to this license you and any business entity you represent are
 *  legally bound to the AllBinary Open License Version 1 legal agreement.
 *
 *  You may obtain the AllBinary Open License Version 1 legal agreement from
 *  AllBinary or the root directory of AllBinary's AllBinary Platform repository.
 *
 *  Created By: Travis Berthelot
 */

/* Generated Code Do Not Modify */
package org.allbinary.business.user.role

import java.lang.Object
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD

open public class BasicUserRoles : Object {

    companion object {

        private val instance: BasicUserRoles = BasicUserRoles()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : BasicUserRoles {

            // if statement needs to be on the same line and ternary does not work the same way.
            return BasicUserRoles.instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    val roleVector: BasicArrayList = BasicArrayListD()

    @Throws(Exception::class)
    open fun getRole(
        role: String
    )
        // nullable = true from not(false or (false and false)) = true
        : BasicUserRole {
        var role = role

        var roleVector: BasicArrayList = this.getAll()!!

        var size: Int = roleVector!!.size()

        for (index in 0 until size) {

            var userRole: BasicUserRole = roleVector!!.get(index) as BasicUserRole

            if (role.compareTo(userRole!!.toString()) == 0) {

                // if statement needs to be on the same line and ternary does not work the same way.
                return userRole
            }
        }

        throw Exception("Unable to get role - Unknown Role")
    }

    open fun getAll()
    // nullable = true from not(false or (false and true)) = true
    : BasicArrayList {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.roleVector
    }
}

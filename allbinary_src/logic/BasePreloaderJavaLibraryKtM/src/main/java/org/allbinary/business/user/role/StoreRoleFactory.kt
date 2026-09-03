/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2011 AllBinary
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

open public class StoreRoleFactory : Object {

    companion object {

        private val instance: StoreRoleFactory = StoreRoleFactory()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : StoreRoleFactory {

            // if statement needs to be on the same line and ternary does not work the same way.
            return StoreRoleFactory.instance
        }
    }

    private val roles: BasicArrayList = BasicArrayListD()

    private val subscriberRoles: BasicArrayList = BasicArrayListD()

    private val wholesaleRoles: BasicArrayList = BasicArrayListD()

    private constructor() : super() {

        var basicUserRoleFactory: BasicUserRoleFactory = BasicUserRoleFactory.getInstance()!!

        this.roles.add(basicUserRoleFactory!!.CUSTOMER)
        this.roles.add(basicUserRoleFactory!!.SUBSCRIBERCUSTOMER)
        this.roles.add(basicUserRoleFactory!!.WHOLESALECUSTOMER)
        this.subscriberRoles!!.add(basicUserRoleFactory!!.SUBSCRIBERCUSTOMER)
        this.wholesaleRoles!!.add(basicUserRoleFactory!!.WHOLESALECUSTOMER)
    }

    open fun getRoles()
    // nullable = true from not(false or (false and true)) = true
    : BasicArrayList {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.roles
    }

    open fun getSubscriberRoles()
    // nullable = true from not(false or (false and true)) = true
    : BasicArrayList {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.subscriberRoles
    }

    open fun getWholesaleRoles()
    // nullable = true from not(false or (false and true)) = true
    : BasicArrayList {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.wholesaleRoles
    }
}

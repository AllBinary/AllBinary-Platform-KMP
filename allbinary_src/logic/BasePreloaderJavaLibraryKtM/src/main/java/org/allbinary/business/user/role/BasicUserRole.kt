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

import java.io.Serializable
import java.lang.Object

open public class BasicUserRole : Object, Serializable {

    private val m_int_RoleId: Int

    private val role: String

    private val displayValue: String

    private val sessionTimeout: Long

    private val sessionInactivityTimeout: Long

    constructor(
        aRole: String,
        a_int_RoleId: Int,
        aSessionTimeout: Long,
        aSessionInactivityTimeout: Long,
    ) : this(aRole, aRole, a_int_RoleId, aSessionTimeout, aSessionInactivityTimeout) {
        var aRole = aRole
        var a_int_RoleId = a_int_RoleId
        var aSessionTimeout = aSessionTimeout
        var aSessionInactivityTimeout = aSessionInactivityTimeout

        // For kotlin this is before the body of the constructor.

    }

    constructor(
        aRole: String,
        aDisplayValue: String,
        a_int_RoleId: Int,
        aSessionTimeout: Long,
        aSessionInactivityTimeout: Long,
    ) : super() {
        var aRole = aRole
        var aDisplayValue = aDisplayValue
        var a_int_RoleId = a_int_RoleId
        var aSessionTimeout = aSessionTimeout
        var aSessionInactivityTimeout = aSessionInactivityTimeout
        this.m_int_RoleId = a_int_RoleId
        this.role = aRole
        this.displayValue = aDisplayValue
        this.sessionTimeout = aSessionTimeout
        this.sessionInactivityTimeout = aSessionInactivityTimeout
        BasicUserRoles.getInstance()!!.roleVector!!.add(this)
    }

    open fun getRoleId()
    // nullable = true from not(false or (false and true)) = true
    : Int {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.m_int_RoleId
    }

    open fun getRole()
    // nullable = true from not(false or (false and true)) = true
    : String {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.role
    }

    open fun getSessionTimeout()
    // nullable = true from not(false or (false and true)) = true
    : Long {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.sessionTimeout
    }

    open fun getSessionInactivityTimeout()
    // nullable = true from not(false or (false and true)) = true
    : Long {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.sessionInactivityTimeout
    }

    open fun equals(
        basicUserRole: BasicUserRole?
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        var basicUserRole = basicUserRole

        if (this.getRoleId() == basicUserRole!!.getRoleId()) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return true
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return false
    }

    override fun toString()
    // nullable =  from not(false or (true and true)) =
    : String {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.getRole()
    }
}

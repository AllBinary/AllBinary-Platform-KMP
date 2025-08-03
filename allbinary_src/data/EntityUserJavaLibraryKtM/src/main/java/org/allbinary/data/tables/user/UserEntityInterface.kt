
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
        package org.allbinary.data.tables.user



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.UserInterface
import org.allbinary.business.user.role.UserRole
import org.allbinary.data.tables.BasicDataTableInterface
interface UserEntityInterface : BasicDataTableInterface {
        

                @Throws(Exception::class)
            
open fun getAdministrators()
        //nullable = true from not(false or (false and true)) = true
: Vector

                @Throws(Exception::class)
            
open fun getStoreManagers(storeFrontInterface: StoreFrontInterface)
        //nullable = true from not(false or (false and false)) = true
: Vector

                @Throws(Exception::class)
            
open fun getCustomers()
        //nullable = true from not(false or (false and true)) = true
: Vector

                @Throws(Exception::class)
            
open fun getUsersWithRole(userRole: UserRole)
        //nullable = true from not(false or (false and false)) = true
: Vector

                @Throws(Exception::class)
            
open fun getUsers(storeFrontInterface: StoreFrontInterface)
        //nullable = true from not(false or (false and false)) = true
: Vector

                @Throws(Exception::class)
            
open fun getUser(userName: String)
        //nullable = true from not(false or (false and false)) = true
: UserInterface

open fun login(userName: String, password: String)
        //nullable = true from not(false or (false and false)) = true
: String

open fun deleteWhere(key: String, value: String)
        //nullable = true from not(false or (false and false)) = true


open fun insert(values: Vector)
        //nullable = true from not(false or (false and false)) = true


open fun update(userName: String, updatedValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


}
                
            



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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector

open public class StoreRoleFactory
            : Object
         {
        

        companion object {
            
    private val instance: StoreRoleFactory = StoreRoleFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: StoreRoleFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val roles: Vector<Any> = Vector<Any>()

    private val subscriberRoles: Vector<Any> = Vector<Any>()

    private val wholesaleRoles: Vector<Any> = Vector<Any>()
private constructor        ()
            : super()
        {
    var basicUserRoleFactory: BasicUserRoleFactory = BasicUserRoleFactory.getInstance()!!
            

roles.add(basicUserRoleFactory!!.CUSTOMER)
roles.add(basicUserRoleFactory!!.SUBSCRIBERCUSTOMER)
roles.add(basicUserRoleFactory!!.WHOLESALECUSTOMER)
subscriberRoles!!.add(basicUserRoleFactory!!.SUBSCRIBERCUSTOMER)
wholesaleRoles!!.add(basicUserRoleFactory!!.WHOLESALECUSTOMER)
}


open fun getRoles()
        //nullable = true from not(false or (false and true)) = true
: Vector<Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return roles
}


open fun getSubscriberRoles()
        //nullable = true from not(false or (false and true)) = true
: Vector<Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return subscriberRoles
}


open fun getWholesaleRoles()
        //nullable = true from not(false or (false and true)) = true
: Vector<Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return wholesaleRoles
}


}
                
            


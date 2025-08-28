
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.Serializable
import org.allbinary.business.user.UserFactoryInterface

open public class UserRole
            : Object
        
                , Serializable {
        

    private var basicUserRole: BasicUserRole

    private var userFactoryInterface: UserFactoryInterface
protected constructor        (aBasicUserRole: BasicUserRole, aUserFactoryInterface: UserFactoryInterface)
            : super()
        

        Updates for KMP build        
        {
var aBasicUserRole = aBasicUserRole
var aUserFactoryInterface = aUserFactoryInterface
this.basicUserRole= aBasicUserRole
this.userFactoryInterface= aUserFactoryInterface
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.basicUserRole!!.toString()
}


open fun getBasicUserRole()
        //nullable = true from not(false or (false and true)) = true
: BasicUserRole

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.basicUserRole
}


                @Throws(Exception::class)
            
open fun getUserFactory()
        //nullable = true from not(false or (false and true)) = true
: UserFactoryInterface

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userFactoryInterface
}


open fun getSessionTimeout()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.basicUserRole!!.getSessionTimeout()
}


open fun getSessionInactivityTimeout()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.basicUserRole!!.getSessionInactivityTimeout()
}


}
                
            


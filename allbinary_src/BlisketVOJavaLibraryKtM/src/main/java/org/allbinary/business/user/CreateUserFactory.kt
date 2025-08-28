
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
        package org.allbinary.business.user




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.user.role.UserRole
import org.allbinary.business.user.role.UserRoleB
import org.allbinary.business.user.role.UserRoleData
import org.allbinary.logic.string.StringValidationUtil

open public class CreateUserFactory
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun getInstance(hashMap: HashMap<Any, Any>)
        //nullable =  from not(true or (false and false)) = 
: UserInterface{
var hashMap = hashMap

    
                        if(hashMap != 
                                    null
                                )
                        
                                    {
                                    
    var roleString: String = hashMap!!.get(UserRoleData.NAME.toString()) as String


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(roleString))
                        
                                    {
                                    
    var role: UserRole = UserRoleB.getRole(roleString)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return role.getUserFactory()!!.getInstance(hashMap)

                                    }
                                
                        else {
                            


                            throw Exception("No Role Specified")

                        }
                            

                                    }
                                
                        else {
                            


                            throw Exception("Null HashMap")

                        }
                            
}


        }
            private constructor        ()
            : super()
        {
}


}
                
            


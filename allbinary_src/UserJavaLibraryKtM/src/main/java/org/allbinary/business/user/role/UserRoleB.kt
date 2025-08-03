
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
import org.allbinary.business.user.UserFactoryInterface
import org.allbinary.logic.string.StringValidationUtil

open public class UserRoleB : UserRole {
        

        companion object {


    var roleVector: Vector = Vector()

                @Throws(Exception::class)
            
open fun getRole(role: String)
        //nullable = true from not(false or (false and false)) = true
: UserRole{

                    var role = role
UserRoleFactory.getInstance()

    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(role))
                        
                                    {
                                    
    var roleVector: Vector = UserRoleB.getAll()!!
            


    var size: Int = roleVector!!.size!!
            





                        for (index in 0 until size)


        {
    var userRole: UserRole = roleVector!!.get(index) as UserRole


    
                        if(role!!.compareTo(userRole!!.toString()) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return userRole

                                    }
                                
}


                                    }
                                



                            throw Exception("Unable to get role - Unknown Role = " +role)
}


open fun getAll()
        //nullable = true from not(false or (false and true)) = true
: Vector{UserRoleFactory.getInstance()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return UserRoleB.roleVector
}



        }
            protected constructor        (aBasicUserRole: BasicUserRole, aUserFactoryInterface: UserFactoryInterface)                        

                            : super(aBasicUserRole, aUserFactoryInterface){

                    var aBasicUserRole = aBasicUserRole


                    var aUserFactoryInterface = aUserFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    
roleVector!!.add(this)
}


}
                
            


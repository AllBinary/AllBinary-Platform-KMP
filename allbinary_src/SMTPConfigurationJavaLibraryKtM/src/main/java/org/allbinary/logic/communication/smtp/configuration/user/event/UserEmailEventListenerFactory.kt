
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
        package org.allbinary.logic.communication.smtp.configuration.user.event



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.UserInterface
import org.allbinary.logic.communication.smtp.event.UserEmailEventListenerInterface
import org.allbinary.logic.system.loader.AbeFactory
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface

open public class UserEmailEventListenerFactory
            : Object
         {
        

        companion object {


                @Throws(Exception::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, userEmailEventConfigurationInterface: UserEmailEventConfigurationInterface, userInterface: UserInterface)
        //nullable =  from not(true or (false and false)) = 
: UserEmailEventListenerInterface{

                    var abeClientInformation = abeClientInformation


                    var userEmailEventConfigurationInterface = userEmailEventConfigurationInterface


                    var userInterface = userInterface

    var params: Array<Any?> = arrayOfNulls(1)


    var classes: Array<KClass<*>?> = arrayOfNulls(1)

classes[0]= 
                                    //Otherwise - expression - AssignExpr - value - ClassExpr

params[0]= userInterface as Object



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbeFactory.getInstance()!!.getInstance(abeClientInformation, userEmailEventConfigurationInterface!!.getEventListenerClassPath(), classes, params) as UserEmailEventListenerInterface
}



        }
            private constructor        ()
            : super()
        {}


}
                
            


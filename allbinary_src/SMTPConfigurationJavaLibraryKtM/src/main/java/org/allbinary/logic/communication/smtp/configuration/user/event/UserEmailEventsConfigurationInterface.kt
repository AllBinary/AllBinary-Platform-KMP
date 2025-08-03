
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
        
import java.util.HashMap
import org.allbinary.business.user.UserInterface
import org.allbinary.logic.communication.smtp.event.UserEmailEventListenerInterface
import org.allbinary.logic.communication.smtp.event.UserEmailEventNameData
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
interface UserEmailEventsConfigurationInterface {
        

open fun getEventConfigurationHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

open fun addUserEmailEventConfiguration(userEmailEventConfigurationInterface: UserEmailEventConfigurationInterface)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun getEventListener(abeClientInformation: AbeClientInformationInterface, userEmailEventNameData: UserEmailEventNameData, userInterface: UserInterface)
        //nullable = true from not(false or (false and false)) = true
: UserEmailEventListenerInterface

}
                
            


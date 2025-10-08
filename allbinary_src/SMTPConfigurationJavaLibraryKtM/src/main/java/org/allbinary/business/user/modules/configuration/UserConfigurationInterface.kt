
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
        package org.allbinary.business.user.modules.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.time.created.TimeCreated
import org.allbinary.business.time.modified.TimeLastModified
import org.allbinary.logic.communication.smtp.configuration.user.UserEmailConfigurationInterface

interface UserConfigurationInterface {
        

    open fun getUserEmailConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: UserEmailConfigurationInterface

    open fun setUserEmailConfigurationInterface(userEmailConfigurationInterface: UserEmailConfigurationInterface)
        //nullable = true from not(false or (false and false)) = true


    open fun getTimeCreated()
        //nullable = true from not(false or (false and true)) = true
: TimeCreated

    open fun getTimeLastModified()
        //nullable = true from not(false or (false and true)) = true
: TimeLastModified

    open fun setTimeCreated(timeCreated: TimeCreated)
        //nullable = true from not(false or (false and false)) = true


    open fun setTimeLastModified(timeLastModified: TimeLastModified)
        //nullable = true from not(false or (false and false)) = true


}
                
            



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
        package org.allbinary.logic.communication.smtp.configuration.user



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.configuration.user.event.UserEmailEventsConfiguration
import org.allbinary.logic.communication.smtp.configuration.user.event.UserEmailEventsConfigurationInterface
import org.allbinary.string.CommonStrings

open public class UserEmailConfiguration
            : Object
        
                , UserEmailConfigurationInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var userEmailEventsConfigurationInterface: UserEmailEventsConfigurationInterface
public constructor        ()
            : super()
        {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.CONSTRUCTOR, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.setUserEmailEventsConfigurationInterface(UserEmailEventsConfiguration())
}

public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        {

                    var hashMap = hashMap

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.CONSTRUCTOR, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.setUserEmailEventsConfigurationInterface(UserEmailEventsConfiguration(hashMap))
}


open fun getUserEmailEventsConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: UserEmailEventsConfigurationInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userEmailEventsConfigurationInterface
}


open fun setUserEmailEventsConfigurationInterface(userEmailEventsConfigurationInterface: UserEmailEventsConfigurationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var userEmailEventsConfigurationInterface = userEmailEventsConfigurationInterface
this.userEmailEventsConfigurationInterface= userEmailEventsConfigurationInterface
}


}
                
            


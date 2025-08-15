
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.user.UserInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.event.UserEmailEventListenerInterface
import org.allbinary.logic.communication.smtp.event.UserEmailEventNameData
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonStrings

open public class UserEmailEventsConfiguration
            : Object
        
                , UserEmailEventsConfigurationInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var emailEventHashMap: HashMap<Any, Any>
public constructor        ()
            : super()
        {this.init()
}

public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        {

                    var hashMap = hashMap
this.init()
}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{this.emailEventHashMap= HashMap<Any, Any>()

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.CONSTRUCTOR, this, " Constructor")

                                    }
                                
}


open fun getEventConfigurationHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.emailEventHashMap
}


open fun addUserEmailEventConfiguration(userEmailEventConfigurationInterface: UserEmailEventConfigurationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var userEmailEventConfigurationInterface = userEmailEventConfigurationInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put("Adding: " +userEmailEventConfigurationInterface!!.log(), this, "addUserEmailEventConfiguration")

                                    }
                                
this.emailEventHashMap!!.put(userEmailEventConfigurationInterface!!.getName(), userEmailEventConfigurationInterface)
}


                @Throws(Exception::class)
            
open fun getEventListener(abeClientInformation: AbeClientInformationInterface, userEmailEventNameData: UserEmailEventNameData, userInterface: UserInterface)
        //nullable = true from not(false or (false and false)) = true
: UserEmailEventListenerInterface{

                    var abeClientInformation = abeClientInformation


                    var userEmailEventNameData = userEmailEventNameData


                    var userInterface = userInterface

    var userEmailEventConfigurationInterface: UserEmailEventConfigurationInterface = this.emailEventHashMap!!.get(userEmailEventNameData!!.toString()) as UserEmailEventConfigurationInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return UserEmailEventListenerFactory.getInstance(abeClientInformation, userEmailEventConfigurationInterface, userInterface)
}


}
                
            


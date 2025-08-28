
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
        package org.allbinary.logic.communication.smtp.event.handler.factory




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.user.UserInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.event.UserEmailEventNameData
import org.allbinary.logic.communication.smtp.event.handler.EmailEventHandlerUtil
import org.allbinary.logic.communication.smtp.event.handler.UserEmailEventHandler
import org.allbinary.logic.communication.smtp.event.modules.log.LogUserEmailEventListenerModule
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonStrings

open public class UserEmailEventHandlerSingletons
            : Object
         {
        

        companion object {
            
    private val instance: UserEmailEventHandlerSingletons = UserEmailEventHandlerSingletons()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: UserEmailEventHandlerSingletons

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val userEmailEventHandlerHashMap: HashMap<Any, Any> = HashMap<Any, Any>()
private constructor        ()
            : super()
        

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, userEmailEventNameData: UserEmailEventNameData, userInterface: UserInterface)
        //nullable =  from not(true or (false and false)) = 
: UserEmailEventHandler

        Updates for KMP build        
        {
    //var abeClientInformation = abeClientInformation
var userEmailEventNameData = userEmailEventNameData
var userInterface = userInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, commonStrings!!.GET_INSTANCE)

                                    }
                                

    var userEmailEventHandler: UserEmailEventHandler = this.userEmailEventHandlerHashMap!!.get(userEmailEventNameData as Object) as UserEmailEventHandler


    
                        if(userEmailEventHandler == 
                                    null
                                )
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put("Creating New Named UserEmailEventHandler", this, commonStrings!!.GET_INSTANCE)

                                    }
                                

    var newUserEmailEventHandler: UserEmailEventHandler = UserEmailEventHandler()


    var vector: Vector = EmailEventHandlerUtil.getUserEmailEventListenerVector(abeClientInformation, userEmailEventNameData, userInterface)!!

newUserEmailEventHandler!!.addListener(vector)
newUserEmailEventHandler!!.addListener(LogUserEmailEventListenerModule())
this.userEmailEventHandlerHashMap!!.put(userEmailEventNameData, newUserEmailEventHandler)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newUserEmailEventHandler

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put("Returning existing UserEmailEventHandler", this, commonStrings!!.GET_INSTANCE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return userEmailEventHandler

                        }
                            
}


}
                
            


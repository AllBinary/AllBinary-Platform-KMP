
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.data.tables.user.UserEntityFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.event.UserEmailEventNameData
import org.allbinary.logic.communication.smtp.event.handler.EmailEventHandlerUtil
import org.allbinary.logic.communication.smtp.event.handler.UserEmailEventHandler
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonStrings

open public class AdminUserEmailEventHandlerSingletons
            : Object
         {
        

        companion object {
            
    private val instance: AdminUserEmailEventHandlerSingletons = AdminUserEmailEventHandlerSingletons()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AdminUserEmailEventHandlerSingletons{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val userEmailEventHandlerHashMap: HashMap<Any, Any> = HashMap<Any, Any>()
private constructor        ()
            : super()
        {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, userEmailEventNameData: UserEmailEventNameData)
        //nullable =  from not(true or (false and false)) = 
: UserEmailEventHandler{

                    var abeClientInformation = abeClientInformation


                    var userEmailEventNameData = userEmailEventNameData

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, commonStrings!!.GET_INSTANCE)

                                    }
                                

    var userEmailEventHandler: UserEmailEventHandler = this.userEmailEventHandlerHashMap!!.get(userEmailEventNameData as Object?) as UserEmailEventHandler


    
                        if(userEmailEventHandler == 
                                    null
                                )
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put(
                            "Creating New Named UserEmailEventHandler", this, commonStrings!!.GET_INSTANCE)

                                    }
                                

    var userVector: Vector = UserEntityFactory.getInstance()!!.getAdministrators()!!
            


    var newUserEmailEventHandler: UserEmailEventHandler = EmailEventHandlerUtil.getInstance()!!.getEventHandler(abeClientInformation, userEmailEventNameData, userVector)!!
            

this.userEmailEventHandlerHashMap!!.put(userEmailEventNameData, newUserEmailEventHandler)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newUserEmailEventHandler

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put(
                            "Returning existing UserEmailEventHandler", this, commonStrings!!.GET_INSTANCE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return userEmailEventHandler

                        }
                            
}


}
                
            



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
        package org.allbinary.logic.communication.smtp.event.handler



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.user.UserInterface
import org.allbinary.business.user.modules.configuration.UserConfigurationInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.configuration.user.UserEmailConfigurationInterface
import org.allbinary.logic.communication.smtp.configuration.user.event.UserEmailEventsConfigurationInterface
import org.allbinary.logic.communication.smtp.event.UserEmailEventListenerInterface
import org.allbinary.logic.communication.smtp.event.UserEmailEventNameData
import org.allbinary.logic.communication.smtp.event.modules.log.LogUserEmailEventListenerModule
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface

open public class EmailEventHandlerUtil
            : Object
         {
        

        companion object {


    private val instance: EmailEventHandlerUtil = EmailEventHandlerUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: EmailEventHandlerUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


                @Throws(Exception::class)
            
open fun getUserEmailEventListenerVector(abeClientInformation: AbeClientInformationInterface, userEmailEventNameData: UserEmailEventNameData, userInterface: UserInterface)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var abeClientInformation = abeClientInformation


                    var userEmailEventNameData = userEmailEventNameData


                    var userInterface = userInterface

    var userConfigurationInterface: UserConfigurationInterface = userInterface!!.getUserConfigurationInterface()!!
            


    var userEmailConfigurationInterface: UserEmailConfigurationInterface = userConfigurationInterface!!.getUserEmailConfigurationInterface()!!
            


    var userEmailEventsConfigurationInterface: UserEmailEventsConfigurationInterface = userEmailConfigurationInterface!!.getUserEmailEventsConfigurationInterface()!!
            


    var userEmailEventListenerInterface: UserEmailEventListenerInterface = userEmailEventsConfigurationInterface!!.getEventListener(abeClientInformation, userEmailEventNameData, userInterface)!!
            


    var vector: Vector = Vector()

vector!!.add(userEmailEventListenerInterface)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getEventHandler(abeClientInformation: AbeClientInformationInterface, userEmailEventNameData: UserEmailEventNameData, userVector: Vector)
        //nullable = true from not(false or (false and false)) = true
: UserEmailEventHandler{

                    var abeClientInformation = abeClientInformation


                    var userEmailEventNameData = userEmailEventNameData


                    var userVector = userVector

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Returning UserEmailEventHandler for ")
stringBuffer!!.append(userVector!!.size)
stringBuffer!!.append(
                            " users.")
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "getEventHandler")

                                    }
                                

    var userEmailEventHandler: UserEmailEventHandler = UserEmailEventHandler()

userEmailEventHandler!!.addListener(LogUserEmailEventListenerModule())

    var size: Int = userVector!!.size!!
            





                        for (index in 0 until size)


        {
    var userInterface: UserInterface = userVector!!.get(index) as UserInterface


    var vector: Vector = EmailEventHandlerUtil.getUserEmailEventListenerVector(abeClientInformation, userEmailEventNameData, userInterface)!!
            

userEmailEventHandler!!.addListener(vector)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return userEmailEventHandler
}


}
                
            


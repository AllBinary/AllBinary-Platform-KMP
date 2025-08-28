
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
        package org.allbinary.logic.communication.log.config.type




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.config.type.LogConfigTypes
import org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory

open public class LogConfigTypeFactory
            : Object
         {
        

        companion object {
            
    private val instance: LogConfigTypeFactory = LogConfigTypeFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LogConfigTypeFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val NO_DESCRIPTION: String = "No Description"

    val INIT_SERVER: LogConfigType = LogConfigType("Init Server", NO_DESCRIPTION)

    val LOBBY_SERVER: LogConfigType = LogConfigType("Lobby Server", NO_DESCRIPTION)

    val GAME_SERVER: LogConfigType = LogConfigType("Game Server", NO_DESCRIPTION)

    val GAME_SIMULATOR: LogConfigType = LogConfigType("Game Simulator", NO_DESCRIPTION)

    val CUSTOM_TYPES: LogConfigType = LogConfigType("Custom Types", NO_DESCRIPTION)
private constructor        ()
            : super()
        {
LogConfigTypes.LOGGING.add(this.INIT_SERVER)
}


}
                
            


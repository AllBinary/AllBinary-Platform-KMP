
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
        package org.allbinary.game.configuration.persistance




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class GameConfigurationPersistanceSingleton : KeyValuePersistance {
        
companion object {
            
    private var GAME_PERSISTANCE: GameConfigurationPersistanceSingleton = GameConfigurationPersistanceSingleton()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameConfigurationPersistanceSingleton{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GAME_PERSISTANCE
}


        }
            private constructor ()                        

                            : super(GamePersistanceStrings.getInstance()!!.SAVED_GAME_CONFIGURATION_RECORD_ID){


                            //For kotlin this is before the body of the constructor.
                    
}


}
                
            


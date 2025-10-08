
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        

open public class GamePersistanceStrings
            : Object
         {
        
companion object {
            
    private val instance: GamePersistanceStrings = GamePersistanceStrings()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GamePersistanceStrings{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val SAVED_GAME_RECORD_ID: String = "_SG"

    val SAVED_GAME_CONFIGURATION_RECORD_ID: String = "_SGC"

    val DEFAULT_INPUT_MAPPING_RECORD_ID: String = "_DIM"

    val SAVED_INPUT_CONFIGURATION_RECORD_ID: String = "_SIC"

}
                
            


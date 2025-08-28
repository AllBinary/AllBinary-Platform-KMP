
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
        package org.allbinary.game.score.remote




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class RemoteHighScoresData
            : Object
         {
        

        companion object {
            
    private val SINGLETON: RemoteHighScoresData = RemoteHighScoresData()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RemoteHighScoresData{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val HIGH_SCORES: String = "HIGH_SCORES"

    var CUSTOMER_USER_NAME: String = "CUSTOMER_USER_NAME"

    var DISPLAY_NAME: String = "DISPLAY_NAME"

    var SCORE: String = "SCORE"

    var GAME_INFO: String = "GAME_INFO"

    var GAME_CONFIGURATION: String = "GAME_CONFIGURATION"

}
                
            


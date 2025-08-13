
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
        package org.allbinary.game



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil

open public class GameTypeFactory
            : Object
         {
        

        companion object {
            
    private val instance: GameTypeFactory = GameTypeFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameTypeFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var NONE: GameType = GameType(StringUtil.getInstance()!!.NULL_STRING)

    var SINGLE_PLAYER: GameType = GameType(
                            "Single Player")

    var MULTI_PLAYER: GameType = GameType(
                            "Multi Player")

    var BOT: GameType = GameType(
                            "Artificial Player")

}
                
            



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
        package org.allbinary.game.input.event



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class GameKeyEventUtil
            : Object
         {
        

        companion object {


open fun getKey(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var anyType = anyType

    var gameKeyEvent: GameKeyEvent = anyType as GameKeyEvent




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameKeyEvent!!.getKey()
}



        }
            private constructor        ()
            : super()
        {}


}
                
            



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
        package org.allbinary.game.state



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class GameStateFactory
            : Object
         {
        

        companion object {
            
    private var index: Int = 0

open fun getInstance(name: String)
        //nullable =  from not(true or (false and false)) = 
: GameState{

                    var name = name



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GameState(name, index++)
}


        }
            private constructor        ()
            : super()
        {}


}
                
            


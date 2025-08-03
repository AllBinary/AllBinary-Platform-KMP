
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
        package org.allbinary.game.input



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.util.BasicArrayList

open public class NoPlayerGameInput : PlayerGameInput {
        

        companion object {


    private val SINGLETON: NoPlayerGameInput = NoPlayerGameInput()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NoPlayerGameInput{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}



        }
            private constructor        ()                        

                            : super(BasicArrayList(),  -1){

                            //For kotlin this is before the body of the constructor.
                    
}

override fun onDownGameKeyEvent(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKeyEvent = gameKeyEvent
}

override fun onUpGameKeyEvent(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKeyEvent = gameKeyEvent
}


}
                
            


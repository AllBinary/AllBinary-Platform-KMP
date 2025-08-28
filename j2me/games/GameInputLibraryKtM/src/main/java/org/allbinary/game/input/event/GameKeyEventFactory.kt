
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.GameKeyEventSourceInterface
import org.allbinary.game.input.Input
import org.allbinary.game.input.InputFactory
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil

open public class GameKeyEventFactory
            : Object
         {
        

        companion object {
            
    private val instance: GameKeyEventFactory = GameKeyEventFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameKeyEventFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val TOUCH_BUTTON_SOURCE_ID: Int = 2

    val MOTION_GESTURE_SOURCE_ID: Int = 3

    private val MAX_SOURCES: Int = 4

    private var ARRAY: Array<Array<GameKeyEvent?>?> = Array(MAX_SOURCES) { arrayOfNulls<GameKeyEvent?>(InputFactory.getInstance()!!.MAX) }
                                                            
private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


open fun init()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var nullUtil: NullUtil = NullUtil.getInstance()!!


    var size: Int = InputFactory.getInstance()!!.MAX





                        for (index in MAX_SOURCES  - 1  downTo 0)

        

        Updates for KMP build        
        {




                        for (index2 in size  - 1  downTo 0)

        

        Updates for KMP build        
        {
ARRAY[index]!![index2]= GameKeyEvent(nullUtil!!.NULL_OBJECT, index, index2)
}

}

}


                @Throws(Exception::class)
            
open fun getInstance(anyType: GameKeyEventSourceInterface, key: Int)
        //nullable =  from not(true or (false and false)) = 
: GameKeyEvent

        Updates for KMP build        
        {
var anyType = anyType
var key = key

    var gameKeyEvent: GameKeyEvent = ARRAY[anyType!!.getSourceId()]!![key]!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameKeyEvent
}


                @Throws(Exception::class)
            
open fun getInstance(anyType: GameKeyEventSourceInterface, input: Input)
        //nullable =  from not(true or (false and false)) = 
: GameKeyEvent

        Updates for KMP build        
        {
var anyType = anyType
var input = input

    var gameKeyEvent: GameKeyEvent = ARRAY[anyType!!.getSourceId()]!![input.getId()]!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameKeyEvent
}


}
                
            


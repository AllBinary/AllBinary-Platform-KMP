
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
        package org.allbinary.game.input.motion.action



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.util.BasicArrayList

open public class GameKeyCompleteMotionGestureInputEventFactory
            : Object
         {
        

        companion object {


    private val SINGLETON: GameKeyCompleteMotionGestureInputEventFactory = GameKeyCompleteMotionGestureInputEventFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameKeyCompleteMotionGestureInputEventFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val eventList: BasicArrayList = BasicArrayList()

open fun add(gameKeyCompleteMotionGestureInputEvent: GameKeyCompleteMotionGestureInputEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKeyCompleteMotionGestureInputEvent = gameKeyCompleteMotionGestureInputEvent
eventList!!.add(gameKeyCompleteMotionGestureInputEvent)
}


open fun updateAll()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(StringMaker().
                            append(CommonLabels.getInstance()!!.START_LABEL)!!.append(eventList!!.size())!!.toString(), this, 
                            "updateAll")




                        for (index in eventList!!.size() -1 downTo 0)


        {
    var gameKeyCompleteMotionGestureInputEvent: GameKeyCompleteMotionGestureInputEvent = eventList!!.objectArray[index]!! as GameKeyCompleteMotionGestureInputEvent

gameKeyCompleteMotionGestureInputEvent!!.update()
}

}


}
                
            


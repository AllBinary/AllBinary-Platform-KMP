
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.graphics.form.ScrollSelectionForm
import org.allbinary.input.motion.gesture.observer.MotionGestureEvent
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.time.TimeDelayHelper
import org.allbinary.util.BasicArrayList

open public class ImmediateCommandFormInputProcessor : CommandFormInputProcessor {
        

    private val timeHelper: TimeDelayHelper = TimeDelayHelper(25)

    var gameCommandCanvas: GameCommandCanvas
public constructor        (gameKeyEventList: BasicArrayList, playerInputId: Int, gameCommandCanvas: GameCommandCanvas, form: ScrollSelectionForm)                        

                            : super(gameKeyEventList, playerInputId, gameCommandCanvas, form)

        Updates for KMP build        
        {
var gameKeyEventList = gameKeyEventList
var playerInputId = playerInputId
var gameCommandCanvas = gameCommandCanvas
var form = form


                            //For kotlin this is before the body of the constructor.
                    
this.gameCommandCanvas= gameCommandCanvas
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun onPressGameKeyEvent(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var gameKeyEvent = gameKeyEvent

        try {
            super.onPressGameKeyEvent(gameKeyEvent)

    
                        if(timeHelper!!.isTime())
                        
                                    {
                                    this.processInput()
this.gameCommandCanvas!!.repaintBehavior!!.onChangeRepaint(this.getCanvas())

                                    }
                                
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, gameInputStrings!!.ON_PRESS_GAME_KEY, e)
}

}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun onDownGameKeyEvent(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var gameKeyEvent = gameKeyEvent

        try {
            super.onDownGameKeyEvent(gameKeyEvent)

    
                        if(this.timeHelper!!.isTime())
                        
                                    {
                                    this.processInput()
this.gameCommandCanvas!!.repaintBehavior!!.onChangeRepaint(this.getCanvas())

                                    }
                                
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, gameInputStrings!!.ON_DOWN_GAME_KEY, e)
}

}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun onUpGameKeyEvent(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var gameKeyEvent = gameKeyEvent

        try {
            super.onUpGameKeyEvent(gameKeyEvent)

    
                        if(timeHelper!!.isTime())
                        
                                    {
                                    this.processInput()
this.gameCommandCanvas!!.repaintBehavior!!.onChangeRepaint(this.getCanvas())

                                    }
                                
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, gameInputStrings!!.ON_UP_GAME_KEY, e)
}

}

override fun onMotionGestureEvent(motionGestureEvent: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var motionGestureEvent = motionGestureEvent

        try {
            super.onMotionGestureEvent(motionGestureEvent)

    
                        if(timeHelper!!.isTime())
                        
                                    {
                                    this.processInput()
this.gameCommandCanvas!!.repaintBehavior!!.onChangeRepaint(this.getCanvas())

                                    }
                                
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "onMotionGestureEvent", e)
}

}


}
                
            


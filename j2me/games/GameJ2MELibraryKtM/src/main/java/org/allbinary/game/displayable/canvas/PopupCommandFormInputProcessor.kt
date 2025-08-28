
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
        
import org.allbinary.graphics.displayable.MyCanvas
import org.allbinary.graphics.form.ScrollSelectionForm
import org.allbinary.input.motion.gesture.observer.MotionGestureEvent
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.util.BasicArrayList

open public class PopupCommandFormInputProcessor : CommandFormInputProcessor {
        
public constructor        (gameKeyEventList: BasicArrayList, playerInputId: Int, gameCanvas: MyCanvas, form: ScrollSelectionForm, popupMenuInputProcessor: PopupMenuInputProcessor)                        

                            : super(gameKeyEventList, playerInputId, gameCanvas, form)

        Updates for KMP build        
        {
var gameKeyEventList = gameKeyEventList
var playerInputId = playerInputId
var gameCanvas = gameCanvas
var form = form
var popupMenuInputProcessor = popupMenuInputProcessor


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            override fun processInput(key: Int)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
var key = key



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.processInput(key)
}


                @Throws(Exception::class)
            override fun processMotionInput(motionGestureEvent: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var motionGestureEvent = motionGestureEvent
super.processMotionInput(motionGestureEvent)
}


}
                
            


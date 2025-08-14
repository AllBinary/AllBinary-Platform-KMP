
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
        package org.allbinary.input.motion.button




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.GameKey
import org.allbinary.game.input.GameKeyEventSourceInterface
import org.allbinary.game.input.Input
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.input.event.GameKeyEventFactory
import org.allbinary.game.input.mapping.InputToGameKeyMapping
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class TouchButtonInput : Input
                , GameKeyEventSourceInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val gameKeyEventFactory: GameKeyEventFactory = GameKeyEventFactory.getInstance()!!
            

    private val TOUCH_BUTTON_SOURCE_ID: Int = this.gameKeyEventFactory!!.TOUCH_BUTTON_SOURCE_ID

    private var gameKeyEvent: GameKeyEvent = GameKeyEvent.NONE
public constructor        (id: Int, name: String)                        

                            : super(id, name){

                    var id = id


                    var name = name


                            //For kotlin this is before the body of the constructor.
                    
this.inputFactory!!.add(this.getId(), this)
}


open fun update(inputToGameKeyMapping: InputToGameKeyMapping)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputToGameKeyMapping = inputToGameKeyMapping

        try {
            
    var gameKey: GameKey = inputToGameKeyMapping!!.getInstance(this.getId())!!
            

this.gameKeyEvent= this.gameKeyEventFactory!!.getInstance(this, gameKey)
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.UPDATE, e)
}

}

override fun getSourceId()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TOUCH_BUTTON_SOURCE_ID
}


open fun getGameKeyEvent()
        //nullable = true from not(false or (false and true)) = true
: GameKeyEvent{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameKeyEvent
}


}
                
            


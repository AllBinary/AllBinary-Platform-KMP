
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
        
import javax.microedition.lcdui.Canvas
import org.allbinary.game.input.GameInputStrings
import org.allbinary.game.input.GameKey
import org.allbinary.game.input.GameKeyEventSourceInterface
import org.allbinary.game.input.GameKeyFactory
import org.allbinary.game.input.Input
import org.allbinary.game.input.InputFactory
import org.allbinary.game.input.InputProcessor
import org.allbinary.game.input.PlatformKeyFactory
import org.allbinary.game.input.event.DownKeyEventHandler
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.input.event.GameKeyEventFactory
import org.allbinary.game.input.event.UpGameKeyEventHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class FormInputProcessor : InputProcessor {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val gameKeyEventFactory: GameKeyEventFactory = GameKeyEventFactory.getInstance()!!

    private val downKeyEventHandler: DownKeyEventHandler = DownKeyEventHandler.getInstance()!!

    private val upGameKeyEventHandler: UpGameKeyEventHandler = UpGameKeyEventHandler.getInstance()!!

    private val inputFactory: InputFactory = InputFactory.getInstance()!!

    private val platformKeyFactory: PlatformKeyFactory = PlatformKeyFactory.getInstance()!!

    private val allBinaryGameCanvas: AllBinaryGameCanvas
public constructor        (allBinaryGameCanvas: AllBinaryGameCanvas){

                    var allBinaryGameCanvas = allBinaryGameCanvas
this.allBinaryGameCanvas= allBinaryGameCanvas
}

override fun keyPressed(keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode


                    var deviceId = deviceId

        try {
            PreLogUtil.put(StringMaker().
                            append(inputFactory!!.KEY_CODE_LABEL)!!.append(keyCode)!!.append(CommonSeps.getInstance()!!.SPACE)!!.append(inputFactory!!.DEVICE_ID_LABEL)!!.append(deviceId)!!.toString(), this, this.gameInputStrings!!.KEY_PRESSED)

    var input: Input = inputFactory!!.getInstance(keyCode)!!


    var gameKeyEvent: GameKeyEvent = gameKeyEventFactory!!.getInstance(this.allBinaryGameCanvas, input)!!

downKeyEventHandler!!.fireEvent(gameKeyEvent)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, this.gameInputStrings!!.ADD_KEY_EVENT, e)
}

}

override fun keyReleased(canvas: Canvas, keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var canvas = canvas


                    var keyCode = keyCode


                    var deviceId = deviceId

        try {
            
    var input: Input = this.inputFactory!!.getInstance(keyCode)!!


    
                        if(platformKeyFactory!!.isEnter(input))
                        
                                    {
                                    PreLogUtil.put(StringMaker().
                            append(inputFactory!!.KEY_CODE_LABEL)!!.append(keyCode)!!.append(CommonSeps.getInstance()!!.SPACE)!!.append(inputFactory!!.DEVICE_ID_LABEL)!!.append(deviceId)!!.toString(), this, gameInputStrings!!.KEY_RELEASED)

    var gameKey: GameKey = GameKeyFactory.getInstance()!!.KEY_NUM0


    var gameKeyEvent: GameKeyEvent = gameKeyEventFactory!!.getInstance(canvas as GameKeyEventSourceInterface, gameKey)!!

upGameKeyEventHandler!!.fireEvent(gameKeyEvent)
upGameKeyEventHandler!!.getInstance(deviceId)!!.fireEvent(gameKeyEvent)

                                    }
                                
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, this.gameInputStrings!!.ADD_KEY_EVENT, e)
}

}


}
                
            


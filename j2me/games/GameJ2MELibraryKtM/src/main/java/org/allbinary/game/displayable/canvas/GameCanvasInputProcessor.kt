
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import org.allbinary.game.input.GameKey
import org.allbinary.game.input.GameKeyEventSourceInterface
import org.allbinary.game.input.GameKeyFactory
import org.allbinary.game.input.InputProcessor
import org.allbinary.game.input.PlatformInputMappingFactory
import org.allbinary.game.input.event.DownGameKeyEventHandler
import org.allbinary.game.input.event.DownKeyEventHandler
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.input.event.GameKeyEventFactory
import org.allbinary.game.input.event.UpGameKeyEventHandler
import org.allbinary.game.input.mapping.InputToGameKeyMapping
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker

open public class GameCanvasInputProcessor : InputProcessor {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val allBinaryGameCanvas: AllBinaryGameCanvas

    private val downGameKeyEventHandler: DownGameKeyEventHandler = DownGameKeyEventHandler.getInstance()!!
            

    private val upGameKeyEventHandler: UpGameKeyEventHandler = UpGameKeyEventHandler.getInstance()!!
            

    private val downKeyEventHandler: DownKeyEventHandler = DownKeyEventHandler.getInstance()!!
            

    private val smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!
            

    private val inputToGameKeyMapping: InputToGameKeyMapping = PlatformInputMappingFactory.getInstance()!!.getPersistentInputMappingInstance()!!.getInputMapping()!!
            
public constructor        (allBinaryGameCanvas: AllBinaryGameCanvas){

                    var allBinaryGameCanvas = allBinaryGameCanvas
this.allBinaryGameCanvas= allBinaryGameCanvas
this.inputToGameKeyMapping!!.init(this.allBinaryGameCanvas)
}


    private val NONE: GameKey = GameKeyFactory.getInstance()!!.NONE

    private val gameKeyEventFactory: GameKeyEventFactory = GameKeyEventFactory.getInstance()!!
            
override fun keyPressed(keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode


                    var deviceId = deviceId

        try {
            
    var gameKey: GameKey = this.inputToGameKeyMapping!!.getInstance(this.allBinaryGameCanvas, keyCode)!!
            


    
                        if(gameKey != NONE)
                        
                                    {
                                    
    var gameKeyEvent: GameKeyEvent = gameKeyEventFactory!!.getInstance(this.allBinaryGameCanvas, gameKey)!!
            

downGameKeyEventHandler!!.fireEvent(gameKeyEvent)
downGameKeyEventHandler!!.getInstance(deviceId)!!.fireEvent(gameKeyEvent)

                                    }
                                
                        else {
                            logUtil!!.put(StringMaker().
                            append(this.gameInputStrings!!.NO_KEY)!!.append(keyCode)!!.toString(), this, this.gameInputStrings!!.ADD_KEY_EVENT)

                        }
                            

    var keyCodeAsInteger: Integer = smallIntegerSingletonFactory!!.getInstanceNoThrow(keyCode)!!
            

downKeyEventHandler!!.fireEvent(keyCodeAsInteger)
downKeyEventHandler!!.getInstance(deviceId)!!.fireEvent(keyCodeAsInteger)
} catch(e: Exception)
            {logUtil!!.put(
                            "Key Event Error", this, this.gameInputStrings!!.ADD_KEY_EVENT, e)
}

}

override fun keyReleased(canvas: Canvas, keyCode: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var canvas = canvas


                    var keyCode = keyCode


                    var deviceId = deviceId
this.removeGameKeyEvent(canvas, keyCode, deviceId, false)
}


open fun removeGameKeyEvent(canvas: Canvas, keyCode: Int, deviceId: Int, repeated: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var canvas = canvas


                    var keyCode = keyCode


                    var deviceId = deviceId


                    var repeated = repeated

        try {
            
    var gameKey: GameKey = this.inputToGameKeyMapping!!.getInstance(canvas, keyCode)!!
            


    
                        if(gameKey != NONE)
                        
                                    {
                                    
    var gameKeyEvent: GameKeyEvent = gameKeyEventFactory!!.getInstance(canvas as GameKeyEventSourceInterface, gameKey)!!
            

upGameKeyEventHandler!!.fireEvent(gameKeyEvent)
upGameKeyEventHandler!!.getInstance(deviceId)!!.fireEvent(gameKeyEvent)

                                    }
                                
                        else {
                            logUtil!!.put(StringMaker().
                            append(this.gameInputStrings!!.NO_KEY)!!.append(keyCode)!!.toString(), this, this.gameInputStrings!!.REMOVE_KEY_EVENT)

                        }
                            
} catch(e: Exception)
            {logUtil!!.put(
                            "Key Event Error", this, this.gameInputStrings!!.REMOVE_KEY_EVENT, e)
}

}


}
                
            



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
        package org.allbinary.game.layer.hud.basic.notification




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.graphics.hud.BasicHud
import org.allbinary.game.graphics.hud.BasicHudFactory
import org.allbinary.game.layer.hud.event.GameNotificationEvent
import org.allbinary.game.layer.hud.event.GameNotificationListenerInterface
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings

open public class GameNotificationHud : BasicHud
                , GameNotificationListenerInterface {
        

        companion object {
            
    val NULL_GAME_NOTIFICATION: GameNotificationHud = GameNotificationHud(BasicHudFactory.getInstance()!!.TOPCENTER, BasicHudFactory.getInstance()!!.HORIZONTAL, 0, 0, 0, BasicColorFactory.getInstance()!!.RED)

        }
            public constructor        (location: Int, direction: Int, maxHeight: Int, maxWidth: Int, bufferZone: Int, basicColor: BasicColor)                        

                            : super(location, direction, maxHeight, maxWidth, bufferZone, basicColor)

        Updates for KMP build        
        {
var location = location
var direction = direction
var maxHeight = maxHeight
var maxWidth = maxWidth
var bufferZone = bufferZone
var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
}

override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


    private val METHOD_NAME: String = "onGameNotificationEvent"

    private var lastGameNotificationEvent: GameNotificationEvent = GameNotification.NULL_GAME_NOTIFICATION_EVENT

                @Throws(Exception::class)
            override fun onGameNotificationEvent(gameNotificationEvent: GameNotificationEvent)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var gameNotificationEvent = gameNotificationEvent

    
                        if(lastGameNotificationEvent != gameNotificationEvent)
                        
                                    {
                                    lastGameNotificationEvent= gameNotificationEvent
logUtil!!.put(gameNotificationEvent!!.getString(), this, METHOD_NAME)

                                    }
                                
this.add(gameNotificationEvent!!.getString(), gameNotificationEvent!!.getSeconds(), gameNotificationEvent!!.getBasicColorP(), gameNotificationEvent!!.getPermanent())
}


open fun add(string: String, seconds: Integer, basicColor: BasicColor, permanent: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var string = string
var seconds = seconds
var basicColor = basicColor
var permanent = permanent
}


                @Throws(Exception::class)
            
open fun processTick()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
}


open fun clear()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


}
                
            


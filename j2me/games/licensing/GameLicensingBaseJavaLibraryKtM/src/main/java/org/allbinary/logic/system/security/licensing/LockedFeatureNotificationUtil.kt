
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
        package org.allbinary.logic.system.security.licensing




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.hud.event.GameNotificationEvent
import org.allbinary.game.layer.hud.event.GameNotificationEventHandler
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.media.audio.ErrorSound
import org.allbinary.media.audio.PrimaryPlayerQueueFactory

open public class LockedFeatureNotificationUtil
            : Object
         {
        
companion object {
            
    private val instance: LockedFeatureNotificationUtil = LockedFeatureNotificationUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LockedFeatureNotificationUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val gameNotificationEvent: GameNotificationEvent = GameNotificationEvent(this, LicenseStrings.getInstance()!!.LOCKED, SmallIntegerSingletonFactory.getInstance()!!.getInstance(3), BasicColorFactory.getInstance()!!.RED, BooleanFactory.getInstance()!!.FALSE)

                @Throws(Exception::class)
            
    open fun fire()
        //nullable = true from not(false or (false and true)) = true
{
PrimaryPlayerQueueFactory.getInstance()!!.add(ErrorSound.getInstance())
GameNotificationEventHandler.getInstance()!!.fireEvent(gameNotificationEvent)
}


                @Throws(Exception::class)
            
    open fun fire(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{
var basicColor = basicColor
PrimaryPlayerQueueFactory.getInstance()!!.add(ErrorSound.getInstance())
gameNotificationEvent!!.setBasicColorP(basicColor)
GameNotificationEventHandler.getInstance()!!.fireEvent(gameNotificationEvent)
}


}
                
            


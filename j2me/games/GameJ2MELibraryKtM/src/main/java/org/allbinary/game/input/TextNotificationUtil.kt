
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
        
import org.allbinary.game.layer.hud.event.GameNotificationEvent
import org.allbinary.game.layer.hud.event.GameNotificationEventHandler
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.media.audio.ErrorSound
import org.allbinary.media.audio.PrimaryPlayerQueueFactory
import org.allbinary.media.audio.SelectSound

open public class TextNotificationUtil
            : Object
         {
        

        companion object {


    private val instance: TextNotificationUtil = TextNotificationUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TextNotificationUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun fireError(message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var message = message
PrimaryPlayerQueueFactory.getInstance()!!.add(ErrorSound.getInstance())
this.fire(message)
}


                @Throws(Exception::class)
            
open fun fireNew(message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var message = message
PrimaryPlayerQueueFactory.getInstance()!!.add(SelectSound.getInstance())
this.fire(message)
}


                @Throws(Exception::class)
            
open fun fireSuccess(message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var message = message
PrimaryPlayerQueueFactory.getInstance()!!.add(SelectSound.getInstance())
this.fire(message)
}


    private val TWO: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(2)!!
            

    private val FALSE: Boolean = BooleanFactory.getInstance()!!.FALSE

    private val gameNotificationEventHandler: GameNotificationEventHandler = GameNotificationEventHandler.getInstance()!!
            

                @Throws(Exception::class)
            
open fun fire(message: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var message = message

    var gameNotificationEvent: GameNotificationEvent = GameNotificationEvent(this, message, TWO, BasicColorFactory.getInstance()!!.RED, FALSE)

gameNotificationEventHandler!!.fireEvent(gameNotificationEvent)
}


}
                
            


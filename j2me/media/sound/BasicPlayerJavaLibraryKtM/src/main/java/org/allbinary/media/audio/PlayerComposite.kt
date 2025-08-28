
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
        package org.allbinary.media.audio




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.media.Control
import javax.microedition.media.Controllable
import javax.microedition.media.Player
import javax.microedition.media.PlayerListener
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.time.GameTickTimeDelayHelper
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper

open public class PlayerComposite
            : Object
        
                , Controllable
                , Player {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val player: Player

    private val timeElapsedHelper: TimeDelayHelper = TimeDelayHelper(0)
public constructor        (player: Player)
            : super()
        

        Updates for KMP build        
        {
    //var player = player
this.player= player
this.timeElapsedHelper!!.delay= 570
}

public constructor        (player: Player, repeatTime: Int)
            : super()
        

        Updates for KMP build        
        {
    //var player = player
    //var repeatTime = repeatTime
this.player= player
this.timeElapsedHelper!!.delay= repeatTime
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun addPlayerListener(playerListener: PlayerListener)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var playerListener = playerListener
this.player.addPlayerListener(playerListener)
}

override fun removePlayerListener(playerListener: PlayerListener)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var playerListener = playerListener
this.player.removePlayerListener(playerListener)
}

override fun close()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.player.close()
}

override fun deallocate()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.player.deallocate()
}

override fun getContentType()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.player.getContentType()
}

override fun getDuration()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.player.getDuration()
}

override fun getMediaTime()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.player.getMediaTime()
}

override fun prefetch()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

        try {
            this.player.prefetch()
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "prefetch", e)
}

}

override fun realize()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

        try {
            this.player.realize()
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "realize", e)
}

}

override fun getState()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.player.getState()
}

override fun setLoopCount(count: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var count = count
this.player.setLoopCount(count)
}

override fun setMediaTime(now: Long)
        //nullable = true from not(false or (false and false)) = true
: Long

        Updates for KMP build        
        {
var now = now

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.player.setMediaTime(now)
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "setMediaTime", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}

}


    private val gameTickTimeDelayHelper: GameTickTimeDelayHelper = GameTickTimeDelayHelperFactory.getInstance()!!
override fun start()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

        try {
            
    
                        if(timeElapsedHelper!!.isTime(gameTickTimeDelayHelper!!.startTime))
                        
                                    {
                                    this.player.start()

                                    }
                                
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.START_METHOD_NAME, e)
}

}

override fun stop()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

        try {
            this.player.stop()
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "stop", e)
}

}

override fun getControl(controlType: String)
        //nullable = true from not(false or (false and false)) = true
: Control

        Updates for KMP build        
        {
var controlType = controlType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.player.getControl(controlType)
}

override fun getControls()
        //nullable = true from not(false or (false and true)) = true
: Array<Control?>

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getControls()
}


open fun setVolume(leftVolume: Int, rightVolume: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var leftVolume = leftVolume
    //var rightVolume = rightVolume

    var controllable2: Controllable2 = (this.player as Controllable2)

controllable2.setVolume(leftVolume, rightVolume)
}


open fun getPlayerP()
        //nullable = true from not(false or (false and true)) = true
: Player

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.player
}


}
                
            



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
import javax.microedition.media.MediaException
import javax.microedition.media.Player
import javax.microedition.media.PlayerListener
import javax.microedition.media.TimeBase
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
        {

                    var player = player
this.player= player
this.timeElapsedHelper!!.delay= 570
}

public constructor        (player: Player, repeatTime: Int)
            : super()
        {

                    var player = player


                    var repeatTime = repeatTime
this.player= player
this.timeElapsedHelper!!.delay= repeatTime
}


open fun addPlayerListener(playerListener: PlayerListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var playerListener = playerListener
this.player.addPlayerListener(playerListener)
}


open fun removePlayerListener(playerListener: PlayerListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var playerListener = playerListener
this.player.removePlayerListener(playerListener)
}


open fun close()
        //nullable = true from not(false or (false and true)) = true
{this.player.close()
}


open fun deallocate()
        //nullable = true from not(false or (false and true)) = true
{this.player.deallocate()
}


open fun getContentType()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.player.getContentType()
}


open fun getDuration()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.player.getDuration()
}


open fun getMediaTime()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.player.getMediaTime()
}


open fun getTimeBase()
        //nullable = true from not(false or (false and true)) = true
: TimeBase{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 
                                    (player as TimeBaseInterface).getTimeBase()
}


                @Throws(MediaException::class)
            
open fun setTimeBase(timeBase: TimeBase)
        //nullable = true from not(false or (false and false)) = true
{

                    var timeBase = timeBase
player = this.playerplayer as TimeBaseInterface
player.
                    setTimeBase(timeBase)
}


open fun prefetch()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            this.player.prefetch()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, "prefetch", e)
}

}


open fun realize()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            this.player.realize()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, "realize", e)
}

}


open fun getState()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.player.getState()
}


open fun setLoopCount(count: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var count = count
this.player.setLoopCount(count)
}


open fun setMediaTime(now: Long)
        //nullable = true from not(false or (false and false)) = true
: Long{

                    var now = now

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.player.setMediaTime(now)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, "setMediaTime", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}

}


    private val gameTickTimeDelayHelper: GameTickTimeDelayHelper = GameTickTimeDelayHelperFactory.getInstance()!!

open fun start()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    
                        if(timeElapsedHelper!!.isTime(gameTickTimeDelayHelper!!.startTime))
                        
                                    {
                                    this.player.start()

                                    }
                                
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.START_METHOD_NAME, e)
}

}


open fun stop()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            this.player.stop()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, "stop", e)
}

}


open fun getControl(controlType: String)
        //nullable = true from not(false or (false and false)) = true
: Control{

                    var controlType = controlType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.player.getControl(controlType)
}


open fun getControls()
        //nullable = true from not(false or (false and true)) = true
: Array<Control?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getControls()
}


open fun setVolume(leftVolume: Int, rightVolume: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var leftVolume = leftVolume


                    var rightVolume = rightVolume
player = this.playerplayer as Controllable2
player.
                    setVolume(leftVolume, rightVolume)
}


open fun getPlayerP()
        //nullable = true from not(false or (false and true)) = true
: Player{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.player
}


}
                
            


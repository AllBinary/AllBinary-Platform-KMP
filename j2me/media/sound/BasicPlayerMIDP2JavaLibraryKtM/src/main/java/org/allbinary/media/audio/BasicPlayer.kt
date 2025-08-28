
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
import javax.microedition.media.MediaException
import javax.microedition.media.Player
import javax.microedition.media.PlayerListener
import javax.microedition.media.TimeBase
import org.allbinary.logic.string.StringUtil
import org.allbinary.util.BasicArrayList

open public class BasicPlayer
            : Object
        
                , Player
                , TimeBaseInterface
                , Controllable2 {
        

        companion object {
            
    var CONTROL_TYPE: String = "ToneControl"

        }
            
    private var state: Int= 0

    private var loopCount: Int= 0

    private var timeBase: TimeBase

    val listenersList: BasicArrayList = BasicArrayList()
public constructor        ()
            : super()
        

        Updates for KMP build        
        {
this.setLoopCount(0)
this.setState(Player.UNREALIZED)
}


open fun getContentType()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


open fun getControl(controlType: String)
        //nullable = true from not(false or (false and false)) = true
: Control

        Updates for KMP build        
        {
var controlType = controlType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullControl()
}


open fun getControls()
        //nullable = true from not(false or (false and true)) = true
: Array<Control?>

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayOfNulls(0)
}


open fun close()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun addPlayerListener(playerListener: PlayerListener)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var playerListener = playerListener

    
                        if(!this.listenersList!!.contains(playerListener))
                        
                                    {
                                    this.listenersList!!.add(playerListener)

                                    }
                                
}


open fun removePlayerListener(playerListener: PlayerListener)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var playerListener = playerListener
this.listenersList!!.remove(playerListener)
}


open fun getState()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.state
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun setState(state: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var state = state
this.state= state
}


open fun getDuration()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun getMediaTime()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun getTimeBase()
        //nullable = true from not(false or (false and true)) = true
: TimeBase

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.timeBase
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun setTimeBase(timeBase: TimeBase)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var timeBase = timeBase
this.timeBase= timeBase
}


open fun deallocate()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


                @Throws(MediaException::class)
            
open fun prefetch()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


                @Throws(MediaException::class)
            
open fun realize()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun setLoopCount(count: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var count = count
this.loopCount= count
}


open fun getLoopCount()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.loopCount
}


                @Throws(MediaException::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun setMediaTime(now: Long)
        //nullable = true from not(false or (false and false)) = true
: Long

        Updates for KMP build        
        {
var now = now



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


                @Throws(MediaException::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun start()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.setState(Player.STARTED)
}


                @Throws(MediaException::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun stop()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.setState(Player.PREFETCHED)
}


open fun setVolume(leftVolume: Int, rightVolume: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var leftVolume = leftVolume
    //var rightVolume = rightVolume
}


}
                
            


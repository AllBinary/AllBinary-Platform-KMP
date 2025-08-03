
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.media.Control
import javax.microedition.media.MediaException
import javax.microedition.media.Player
import javax.microedition.media.PlayerListener
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class BasicPlayer
            : Object
        
                , Player
                , Controllable2 {
        

        companion object {


    var CONTROL_TYPE: String = "ToneControl"


        }
            
    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var state: Int= 0

    private var loopCount: Int= 0

    val listenersList: BasicArrayList = BasicArrayList()
public constructor        ()
            : super()
        {this.setLoopCount(0)
this.setState(Player.UNREALIZED)
}

override fun getContentType()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}

override fun getControl(controlType: String)
        //nullable = true from not(false or (false and false)) = true
: Control{

                    var controlType = controlType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullControl()
}

override fun getControls()
        //nullable = true from not(false or (false and true)) = true
: Array<Control?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayOfNulls(0)
}

override fun close()
        //nullable = true from not(false or (false and true)) = true
{}

override fun addPlayerListener(playerListener: PlayerListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var playerListener = playerListener

    
                        if(!this.listenersList!!.contains(playerListener))
                        
                                    {
                                    this.listenersList!!.add(playerListener)

                                    }
                                
}

override fun removePlayerListener(playerListener: PlayerListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var playerListener = playerListener
this.listenersList!!.remove(playerListener)
}

override fun getState()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.state
}


open fun setState(state: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var state = state
this.state= state
}

override fun getDuration()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun getMediaTime()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun deallocate()
        //nullable = true from not(false or (false and true)) = true
{}


                @Throws(MediaException::class)
            override fun prefetch()
        //nullable = true from not(false or (false and true)) = true
{}


                @Throws(MediaException::class)
            override fun realize()
        //nullable = true from not(false or (false and true)) = true
{}

override fun setLoopCount(count: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var count = count
this.loopCount= count
}


open fun getLoopCount()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.loopCount
}


                @Throws(MediaException::class)
            override fun setMediaTime(now: Long)
        //nullable = true from not(false or (false and false)) = true
: Long{

                    var now = now



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


                @Throws(MediaException::class)
            override fun start()
        //nullable = true from not(false or (false and true)) = true
{this.setState(Player.STARTED)
}


                @Throws(MediaException::class)
            override fun stop()
        //nullable = true from not(false or (false and true)) = true
{this.setState(Player.PREFETCHED)
}

override fun setVolume(leftVolume: Int, rightVolume: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var leftVolume = leftVolume


                    var rightVolume = rightVolume
}


}
                
            


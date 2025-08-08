
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
        
import javax.microedition.media.MediaException
import javax.microedition.media.Player
import javax.microedition.media.PlayerListener
import android.media.MediaPlayer
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.logic.communication.log.LogUtil

open public class AndroidMediaPlayerWrapper : BasicPlayer {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var mediaPlayer: MediaPlayer
public constructor        (resource: String){

                    var resource = resource

        try {
            
    var resourceUtil: ResourceUtil = ResourceUtil.getInstance()!!
            

this.setMediaPlayer(MediaPlayer.create(resourceUtil!!.getContext(), resourceUtil!!.getResourceId(resource)!!.toInt()))

    
                        if(this.getMediaPlayer() == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Failed to create media player for: " +resource +" with id: " +resourceUtil!!.getResourceId(resource))

                                    }
                                
this.mediaPlayer!!.setLooping(false)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION_LABEL +resource, this, commonStrings!!.CONSTRUCTOR, e)



                            throw e
}

}


open fun setLoopCount(count: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var count = count
super.setLoopCount(count)

    
                        if(this.mediaPlayer != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(count == 0)
                        
                                    {
                                    this.mediaPlayer!!.setLooping(false)

                                    }
                                
                        else {
                            
                        }
                            

                                    }
                                
}


open fun addPlayerListener(playerListener: PlayerListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var playerListener = playerListener
super.addPlayerListener(playerListener)
}


open fun removePlayerListener(playerListener: PlayerListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var playerListener = playerListener
super.removePlayerListener(playerListener)
}


open fun getState()
        //nullable = true from not(false or (false and true)) = true
: Int{
    
                        if(this.mediaPlayer!!.isPlaying())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Player.STARTED

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Player.PREFETCHED

                        }
                            
}


open fun close()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            this.mediaPlayer!!.release()
this.mediaPlayer= 
                                        null
                                    
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CLOSE, e)
}

}


                @Throws(MediaException::class)
            
open fun start()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    
                        if(this.mediaPlayer!!.isPlaying())
                        
                                    {
                                    this.mediaPlayer!!.pause()
this.mediaPlayer!!.seekTo(0)

                                    }
                                
this.mediaPlayer!!.start()
super.start()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.START_METHOD_NAME, e)
}

}


                @Throws(MediaException::class)
            
open fun stop()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            this.mediaPlayer!!.stop()
this.mediaPlayer!!.prepare()
super.stop()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "stop", e)
}

}


open fun update(event: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var event = event
logUtil!!.put("LineEvent: " +event, this, commonStrings!!.UPDATE)

    var size: Int = this.listenersList!!.size()!!
            





                        for (index in 0 until size)


        {
    var listener: PlayerListener = this.listenersList!!.objectArray[index]!! as PlayerListener

listener.playerUpdate(this, event, 
                            null)
}

}


open fun setVolume(leftVolume: Int, rightVolume: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var leftVolume = leftVolume


                    var rightVolume = rightVolume
this.mediaPlayer!!.setVolume((leftVolume.toFloat()) /100.0f, (rightVolume.toFloat()) /100.0f)
}


open fun getDuration()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mediaPlayer!!.getDuration()
}


open fun setMediaPlayer(mediaPlayer: MediaPlayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var mediaPlayer = mediaPlayer
this.mediaPlayer= mediaPlayer
}


open fun getMediaPlayer()
        //nullable = true from not(false or (false and true)) = true
: MediaPlayer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mediaPlayer
}


}
                
            


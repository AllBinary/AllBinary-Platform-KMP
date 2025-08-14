
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
        
import javax.microedition.media.MediaException
import javax.microedition.media.Player
import javax.microedition.media.PlayerListener
import android.media.MediaPlayer
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker

open public class AndroidMediaPlayerWrapper : BasicPlayer {
        

        companion object {
            
    val NULL_ANDROID_MEDIA_PLAYER_WRAPPER: AndroidMediaPlayerWrapper = AndroidMediaPlayerWrapper()

    private val NULL_MEDIA_PLAYER: MediaPlayer = MediaPlayer()

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var mediaPlayer: MediaPlayer = AndroidMediaPlayerWrapper.NULL_MEDIA_PLAYER
private constructor        (){}

public constructor        (resource: String){

                    var resource = resource

        try {
            
    var resourceUtil: ResourceUtil = ResourceUtil.getInstance()!!
            

this.setMediaPlayer(MediaPlayer.create(resourceUtil!!.getContext(), resourceUtil!!.getResourceId(resource)!!.toInt()))

    
                        if(this.getMediaPlayer() == AndroidMediaPlayerWrapper.NULL_MEDIA_PLAYER)
                        
                                    {
                                    


                            throw Exception(StringMaker().
                            append(
                            "Failed to create media player for: ")!!.append(resource)!!.append(
                            " with id: ")!!.append(resourceUtil!!.getResourceId(resource)!!.toString())!!.toString())

                                    }
                                
this.mediaPlayer!!.setLooping(false)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION_LABEL +resource, this, commonStrings!!.CONSTRUCTOR, e)



                            throw e
}

}

override fun setLoopCount(count: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var count = count
super.setLoopCount(count)

    
                        if(this.mediaPlayer != AndroidMediaPlayerWrapper.NULL_MEDIA_PLAYER)
                        
                                    {
                                    
    
                        if(count == 0)
                        
                                    {
                                    this.mediaPlayer!!.setLooping(false)

                                    }
                                
                        else {
                            
                        }
                            

                                    }
                                
}

override fun addPlayerListener(playerListener: PlayerListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var playerListener = playerListener
super.addPlayerListener(playerListener)
}

override fun removePlayerListener(playerListener: PlayerListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var playerListener = playerListener
super.removePlayerListener(playerListener)
}

override fun getState()
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

override fun close()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            this.mediaPlayer!!.release()
this.mediaPlayer= AndroidMediaPlayerWrapper.NULL_MEDIA_PLAYER
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CLOSE, e)
}

}


                @Throws(MediaException::class)
            override fun start()
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
            override fun stop()
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

listener.playerUpdate(this, event, NullUtil.getInstance()!!.NULL_OBJECT)
}

}

override fun setVolume(leftVolume: Int, rightVolume: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var leftVolume = leftVolume


                    var rightVolume = rightVolume
this.mediaPlayer!!.setVolume((leftVolume.toFloat()) /100.0f, (rightVolume.toFloat()) /100.0f)
}

override fun getDuration()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mediaPlayer!!.getDuration().toLong()
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
                
            



        /* Generated Code Do Not Modify */
        package org.allbinary.media.audio




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.media.PlayerListener
import android.media.MediaPlayer
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings

open public class AndroidMediaPlayerWrapperListener
            : Object
         {
        

        companion object {
            
    private val ON_BUFFERING_UPDATE: String = "onBufferingUpdate()"

    private val ON_PREPARE: String = "onPrepare()"

    private val ON_ERROR: String = "onError()"

    private val ON_COMPLETE: String = "onComplete()"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var androidMediaPlayerWrapper: AndroidMediaPlayerWrapper = AndroidMediaPlayerWrapper.NULL_ANDROID_MEDIA_PLAYER_WRAPPER
public constructor        (androidMediaPlayerWrapper: AndroidMediaPlayerWrapper, listeningLevel: Int)
            : super()
        {
    //var androidMediaPlayerWrapper = androidMediaPlayerWrapper
    //var listeningLevel = listeningLevel

        try {
            logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
this.androidMediaPlayerWrapper= androidMediaPlayerWrapper

    var mediaPlayer: MediaPlayer = androidMediaPlayerWrapper!!.getMediaPlayer()!!


    
                        if(listeningLevel == 1)
                        
                                    {
                                    mediaPlayer!!.setOnCompletionListener(mOnCompletionListener)

                                    }
                                
                        else {
                            


                            throw Exception("Unknow Listening Leve")

                        }
                            
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}

public constructor        (androidMediaPlayerWrapper: AndroidMediaPlayerWrapper)
            : super()
        {
    //var androidMediaPlayerWrapper = androidMediaPlayerWrapper

        try {
            logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
this.androidMediaPlayerWrapper= androidMediaPlayerWrapper

    var mediaPlayer: MediaPlayer = androidMediaPlayerWrapper!!.getMediaPlayer()!!

mediaPlayer!!.setOnCompletionListener(mOnCompletionListener)
mediaPlayer!!.setOnBufferingUpdateListener(mOnBufferingUpdateListener)
mediaPlayer!!.setOnPreparedListener(mOnPreparedListener)
mediaPlayer!!.setOnErrorListener(mOnErrorListener)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}


open public inner class MediaPlayerOnBufferingUpdateListener
            : Object
        
                , MediaPlayer.OnBufferingUpdateListener {
        
/*Static stuff is not allowed for Kotlin inner classes
        companion object {
            *//*
        }
            */


            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun onBufferingUpdate(mediaPlayer: MediaPlayer, i: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var mediaPlayer = mediaPlayer
    //var i = i
}


}
                
            
open public inner class MediaPlayerOnPreparedListener
            : Object
        
                , MediaPlayer.OnPreparedListener {
        
/*Static stuff is not allowed for Kotlin inner classes
        companion object {
            *//*
        }
            */


            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun onPrepared(mp: MediaPlayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var mp = mp
}


}
                
            
open public inner class MediaPlayerOnErrorListener
            : Object
        
                , MediaPlayer.OnErrorListener {
        
/*Static stuff is not allowed for Kotlin inner classes
        companion object {
            *//*
        }
            */


            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun onError(mp: MediaPlayer, what: Int, extra: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var mp = mp
    //var what = what
    //var extra = extra



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            
open public inner class MediaPlayerOnCompletionListener
            : Object
        
                , MediaPlayer.OnCompletionListener {
        
/*Static stuff is not allowed for Kotlin inner classes
        companion object {
            *//*
        }
            */


            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun onCompletion(mp: MediaPlayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var mp = mp
}


}
                
            
    private var mOnBufferingUpdateListener: MediaPlayer.OnBufferingUpdateListener = object: MediaPlayerOnBufferingUpdateListener()
                                {
                                override fun onBufferingUpdate(mediaPlayer: MediaPlayer, i: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var mediaPlayer = mediaPlayer
    //var i = i
logUtil!!.put(StringMaker().
                            append("Update buffer: ")!!.append(i)!!.append("%")!!.toString(), this, AndroidMediaPlayerWrapperListener.ON_BUFFERING_UPDATE)
this@AndroidMediaPlayerWrapperListener.androidMediaPlayerWrapper!!.update(PlayerListener.DEVICE_UNAVAILABLE)
}

                                }
                            

    private var mOnPreparedListener: MediaPlayer.OnPreparedListener = object: MediaPlayerOnPreparedListener()
                                {
                                override fun onPrepared(mp: MediaPlayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var mp = mp
logUtil!!.put(commonStrings!!.START, this, AndroidMediaPlayerWrapperListener.ON_PREPARE)
this@AndroidMediaPlayerWrapperListener.androidMediaPlayerWrapper!!.update(PlayerListener.DEVICE_AVAILABLE)
}

                                }
                            

    private var mOnErrorListener: MediaPlayer.OnErrorListener = object: MediaPlayerOnErrorListener()
                                {
                                
open override fun onError(mp: MediaPlayer, what: Int, extra: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var mp = mp
    //var what = what
    //var extra = extra
logUtil!!.put(StringMaker().
                            append(CommonLabels.getInstance()!!.START_LABEL)!!.append("What: ")!!.append(what)!!.append(" Extra: ")!!.append(extra)!!.toString(), this, AndroidMediaPlayerWrapperListener.ON_ERROR)
this@AndroidMediaPlayerWrapperListener.androidMediaPlayerWrapper!!.update(PlayerListener.ERROR)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}

                                }
                            

    private var mOnCompletionListener: MediaPlayer.OnCompletionListener = object: MediaPlayerOnCompletionListener()
                                {
                                
open override fun onCompletion(mp: MediaPlayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var mp = mp
logUtil!!.put(commonStrings!!.START, this, AndroidMediaPlayerWrapperListener.ON_COMPLETE)
this@AndroidMediaPlayerWrapperListener.androidMediaPlayerWrapper!!.update(PlayerListener.END_OF_MEDIA)
}

                                }
                            

}
                
            


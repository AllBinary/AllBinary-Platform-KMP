
        /* Generated Code Do Not Modify */
        package org.allbinary.media.audio



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
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
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var androidMediaPlayerWrapper: AndroidMediaPlayerWrapper
public constructor        (androidMediaPlayerWrapper: AndroidMediaPlayerWrapper, listeningLevel: Int)
            : super()
        {

                    var androidMediaPlayerWrapper = androidMediaPlayerWrapper


                    var listeningLevel = listeningLevel

        try {
            logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
this.androidMediaPlayerWrapper= androidMediaPlayerWrapper

    var mediaPlayer: MediaPlayer = androidMediaPlayerWrapper!!.getMediaPlayer()!!
            


    
                        if(listeningLevel == 1)
                        
                                    {
                                    mediaPlayer!!.setOnCompletionListener(mOnCompletionListener)

                                    }
                                
                        else {
                            


                            throw Exception(
                            "Unknow Listening Leve")

                        }
                            
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}

public constructor        (androidMediaPlayerWrapper: AndroidMediaPlayerWrapper)
            : super()
        {

                    var androidMediaPlayerWrapper = androidMediaPlayerWrapper

        try {
            logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
this.androidMediaPlayerWrapper= androidMediaPlayerWrapper

    var mediaPlayer: MediaPlayer = androidMediaPlayerWrapper!!.getMediaPlayer()!!
            

mediaPlayer!!.setOnCompletionListener(mOnCompletionListener)
mediaPlayer!!.setOnBufferingUpdateListener(mOnBufferingUpdateListener)
mediaPlayer!!.setOnPreparedListener(mOnPreparedListener)
mediaPlayer!!.setOnErrorListener(mOnErrorListener)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}


    private var mOnBufferingUpdateListener: MediaPlayer.OnBufferingUpdateListener = object: MediaPlayer.OnBufferingUpdateListener()
                                {
                                
open override fun onBufferingUpdate(mediaPlayer: MediaPlayer, i: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var mediaPlayer = mediaPlayer


                    var i = i
logUtil!!.put("Update buffer: " +i +"%", this, 
                            "onBufferingUpdate(")
this@AndroidMediaPlayerWrapperListener.androidMediaPlayerWrapper!!.update(PlayerListener.DEVICE_UNAVAILABLE)
}

                                }
                            

    private var mOnPreparedListener: MediaPlayer.OnPreparedListener = object: MediaPlayer.OnPreparedListener()
                                {
                                
open override fun onPrepared(mp: MediaPlayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var mp = mp
logUtil!!.put(commonStrings!!.START, this, 
                            "onPrepare()")
this@AndroidMediaPlayerWrapperListener.androidMediaPlayerWrapper!!.update(PlayerListener.DEVICE_AVAILABLE)
}

                                }
                            

    private var mOnErrorListener: MediaPlayer.OnErrorListener = object: MediaPlayer.OnErrorListener()
                                {
                                
open override fun onError(mp: MediaPlayer, what: Int, extra: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var mp = mp


                    var what = what


                    var extra = extra
logUtil!!.put(StringMaker().
                            append(CommonLabels.getInstance()!!.START_LABEL)!!.append(
                            "What: ")!!.append(what)!!.append(
                            " Extra: ")!!.append(extra)!!.toString(), this, 
                            "onError()")
this@AndroidMediaPlayerWrapperListener.androidMediaPlayerWrapper!!.update(PlayerListener.ERROR)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}

                                }
                            

    private var mOnCompletionListener: MediaPlayer.OnCompletionListener = object: MediaPlayer.OnCompletionListener()
                                {
                                
open override fun onCompletion(mp: MediaPlayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var mp = mp
logUtil!!.put(commonStrings!!.START, this, 
                            "onComplete())")
this@AndroidMediaPlayerWrapperListener.androidMediaPlayerWrapper!!.update(PlayerListener.END_OF_MEDIA)
}

                                }
                            

}
                
            


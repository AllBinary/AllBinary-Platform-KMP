
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
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayInputStream
import java.io.InputStream
import javax.microedition.media.Control
import javax.microedition.media.MediaException
import javax.microedition.media.PlayerListener
import javax.sound.sampled.AudioInputStream
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.Clip
import javax.sound.sampled.FloatControl
import javax.sound.sampled.LineEvent
import javax.sound.sampled.LineListener
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.thread.MusicThreadPool

open public class PCClipWavPlayer : BasicPlayer
                , LineListener {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val audioInputStream: AudioInputStream

    private val clip: Clip
public constructor        (inputStream: InputStream){

                    var inputStream = inputStream

    var audioInputStream: AudioInputStream = AudioInputStream(ByteArrayInputStream(NullUtil.getInstance()!!.NULL_BYTE_ARRAY), NullAudioFormat.NULL_AUDIO_FORMAT, 0)


    var clip: Clip = NullClip()


        try {
            audioInputStream= AudioSystem.getAudioInputStream(inputStream)
clip= this.create(audioInputStream)

    
                        if(clip == 
                                    null
                                )
                        
                                    {
                                    logUtil!!.put(
                            "Clip was null", this, commonStrings!!.CONSTRUCTOR, Exception())



                            throw RuntimeException()

                                    }
                                
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

this.audioInputStream= audioInputStream
this.clip= clip
}

override fun close()
        //nullable = true from not(false or (false and true)) = true
{MusicThreadPool.getInstance()!!.runTask(object: Runnable()
                                {
                                override fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            close2()
} catch(e: Exception)
            {PreLogUtil.put(commonStrings!!.EXCEPTION, this, commonStrings!!.PROCESS, e)
}

}

                                }
                            )
}


                @Throws(Exception::class)
            
open fun close2()
        //nullable = true from not(false or (false and true)) = true
{this.clip.drain()
this.clip.flush()
this.clip.close()
}

override fun getContentType()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


                @Throws(MediaException::class)
            override fun start()
        //nullable = true from not(false or (false and true)) = true
{MusicThreadPool.getInstance()!!.runTask(object: Runnable()
                                {
                                override fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            start2()
} catch(e: Exception)
            {PreLogUtil.put(commonStrings!!.EXCEPTION, this, commonStrings!!.PROCESS, e)
}

}

                                }
                            )
}


                @Throws(Exception::class)
            
open fun start2()
        //nullable = true from not(false or (false and true)) = true
{this.clip.setFramePosition(0)
this.clip.loop(this.getLoopCount())
this.clip.start()
super.start()
}


                @Throws(Exception::class)
            
open fun create(audioInputStream: AudioInputStream)
        //nullable = true from not(false or (false and false)) = true
: Clip{

                    var audioInputStream = audioInputStream

    var clip: Clip = AudioSystem.getClip()!!
            

clip.addLineListener(this)
clip.open(audioInputStream)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return clip
}


                @Throws(MediaException::class)
            override fun stop()
        //nullable = true from not(false or (false and true)) = true
{MusicThreadPool.getInstance()!!.runTask(object: Runnable()
                                {
                                override fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            stop2()
} catch(e: Exception)
            {PreLogUtil.put(commonStrings!!.EXCEPTION, this, commonStrings!!.PROCESS, e)
}

}

                                }
                            )
}


                @Throws(Exception::class)
            
open fun stop2()
        //nullable = true from not(false or (false and true)) = true
{clip.stop()
super.stop()
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

override fun setVolume(leftVolume: Int, rightVolume: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var leftVolume = leftVolume


                    var rightVolume = rightVolume
this.setVolume((leftVolume.toFloat()) /100.0f)
}


open fun getVolume()
        //nullable = true from not(false or (false and true)) = true
: Float{
    var masterGainFloatControl: FloatControl = clip.getControl(FloatControl.Type.MASTER_GAIN) as FloatControl




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Math.pow(10f, masterGainFloatControl!!.getValue() /20f).toFloat()
}


open fun setVolume(volume: Float)
        //nullable = true from not(false or (false and false)) = true
{

                    var volume = volume

    
                        if(volume < 0f || volume > 1f)
                        
                                    {
                                    


                            throw IllegalArgumentException("Volume: " +volume)

                                    }
                                

    var masterGainFloatControl: FloatControl = clip.getControl(FloatControl.Type.MASTER_GAIN) as FloatControl

masterGainFloatControl!!.setValue(20f *Math.log10(volume).toFloat())
}

override fun getDuration()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.clip.getMicrosecondLength() /1000
}

override fun update(event: LineEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var event = event

    
                        if(event.getType()!!.equals(LineEvent.Type.STOP))
                        
                                    {
                                    
    var size: Int = this.listenersList!!.size()!!
            





                        for (index in 0 until size)


        {
    var listener: PlayerListener = this.listenersList!!.get(size) as PlayerListener

listener.playerUpdate(this, PlayerListener.END_OF_MEDIA, 
                            null)
}


                                    }
                                
}


}
                
            


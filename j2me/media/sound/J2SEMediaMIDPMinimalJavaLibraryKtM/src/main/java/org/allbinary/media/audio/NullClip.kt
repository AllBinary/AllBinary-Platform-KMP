
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        
import java.io.IOException
import javax.sound.sampled.AudioFormat
import javax.sound.sampled.AudioInputStream
import javax.sound.sampled.BooleanControl
import javax.sound.sampled.Clip
import javax.sound.sampled.Control
import javax.sound.sampled.Control.Type
import javax.sound.sampled.Line.Info
import javax.sound.sampled.LineListener
import javax.sound.sampled.LineUnavailableException

open public class NullClip
            : Object
        
                , Clip {
        

        companion object {
            
    val NULL_CONTROL: NullJ2SEControl = NullJ2SEControl(BooleanControl.Type.MUTE)

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(LineUnavailableException::class)
            override fun open(format: AudioFormat, data: ByteArray, offset: Int, bufferSize: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var format = format
var data = data
var offset = offset
var bufferSize = bufferSize
}


                @Throws(LineUnavailableException::class, IOException::class)
            override fun open(stream: AudioInputStream)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var stream = stream
}

override fun getFrameLength()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun getMicrosecondLength()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun setFramePosition(frames: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var frames = frames
}

override fun setMicrosecondPosition(microseconds: Long)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var microseconds = microseconds
}

override fun setLoopPoints(start: Int, end: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var start = start
var end = end
}

override fun loop(count: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var count = count
}

override fun drain()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

override fun flush()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

override fun start()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

override fun stop()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

override fun isRunning()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun isActive()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun getFormat()
        //nullable = true from not(false or (false and true)) = true
: AudioFormat

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullAudioFormat.NULL_AUDIO_FORMAT
}

override fun getBufferSize()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun available()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun getFramePosition()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}

override fun getLongFramePosition()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0L
}

override fun getMicrosecondPosition()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0L
}

override fun getLevel()
        //nullable = true from not(false or (false and true)) = true
: Float

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0.0f
}

override fun getLineInfo()
        //nullable = true from not(false or (false and true)) = true
: Info

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Info(this::class, NullAudioFormat.NULL_AUDIO_FORMAT)
}


                @Throws(LineUnavailableException::class)
            override fun open()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

override fun close()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

override fun isOpen()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun getControls()
        //nullable = true from not(false or (false and true)) = true
: Array<Control?>

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayOfNulls(0)
}

override fun isControlSupported(control: Type)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var control = control



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun getControl(control: Type)
        //nullable = true from not(false or (false and false)) = true
: Control

        Updates for KMP build        
        {
var control = control



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullClip.NULL_CONTROL
}

override fun addLineListener(listener: LineListener)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var listener = listener
}

override fun removeLineListener(listener: LineListener)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var listener = listener
}


}
                
            


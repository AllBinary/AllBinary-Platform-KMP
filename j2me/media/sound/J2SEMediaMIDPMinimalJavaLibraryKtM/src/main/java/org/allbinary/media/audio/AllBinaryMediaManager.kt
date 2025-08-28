
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
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.BufferedInputStream
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import javax.microedition.media.Manager
import javax.microedition.media.MediaException
import javax.microedition.media.Player
import org.allbinary.audio.AudioContentTypeDataFactory
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureFactory
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class AllBinaryMediaManager
            : Object
         {
        

        companion object {
            
    private val THIS: String = "AllBinaryMediaManagerPC"

open fun isMuted()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun setMuted(aMuted: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var aMuted = aMuted
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


                @Throws(Exception::class)
            
open fun init(soundsFactoryInterface: SoundsFactoryInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var soundsFactoryInterface = soundsFactoryInterface

    var logUtil: LogUtil = LogUtil.getInstance()!!


    var commonString: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonString!!.START, THIS, commonString!!.INIT)
ProgressCanvasFactory.getInstance()!!.addPortion(50, "Media Manager")
Sounds(soundsFactoryInterface).
                            init()
}


                @Throws(Exception::class)
            
open fun shutdown(soundsFactoryInterface: SoundsFactoryInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var soundsFactoryInterface = soundsFactoryInterface
Sounds(soundsFactoryInterface).
                            stopAll()
Sounds(soundsFactoryInterface).
                            closeAll()
System.gc()
}


    private val CREATE_PLAYER: String = "createPlayer"

                @Throws(Exception::class)
            
open fun createPlayer(resource: String)
        //nullable = true from not(false or (false and false)) = true
: Player

        Updates for KMP build        
        {
    //var resource = resource

    
                        if(resource.startsWith(Manager.TONE_DEVICE_LOCATOR))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return createPlayer(ByteArrayInputStream(NullUtil.getInstance()!!.NULL_BYTE_ARRAY), AudioContentTypeDataFactory.getInstance()!!.MIME_AUDIO_TONE.getName())

                                    }
                                
                             else 
    
                        if(Features.getInstance()!!.isFeature(GameFeatureFactory.getInstance()!!.SOUND))
                        
                                    {
                                    
        try {
            
    var inputStream: InputStream = ResourceUtil.getInstance()!!.getResourceAsStream(resource)!!


    var bufferedInputStream: BufferedInputStream = BufferedInputStream(inputStream)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PCClipWavPlayer(bufferedInputStream)
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var logUtil: LogUtil = LogUtil.getInstance()!!


    var commonString: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonString!!.EXCEPTION, THIS, CREATE_PLAYER, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NoPlayer.NO_PLAYER
}


                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NoPlayer.NO_PLAYER

                        }
                            
}


                @Throws(IOException::class, MediaException::class)
            
open fun createPlayer(stream: InputStream, type: String)
        //nullable = true from not(false or (false and false)) = true
: Player

        Updates for KMP build        
        {
    //var stream = stream
    //var type = type



                            throw MediaException("No Impl")
}


                @Throws(MediaException::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun playTone(frequency: Int, time: Int, volume: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var frequency = frequency
    //var time = time
    //var volume = volume



                            throw MediaException("No Impl")
}


open fun isInitialized()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


        }
            private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


}
                
            


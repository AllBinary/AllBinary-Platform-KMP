
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
        
import java.io.IOException
import java.io.InputStream
import javax.microedition.media.MediaException
import javax.microedition.media.Player
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureFactory
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings

open public class AllBinaryMediaManager
            : Object
         {
        

        companion object {
            
    private val THIS: String = "AllBinaryMediaManagerAndroid"

    private var mostUsedTotal: Int = 0

open fun isMuted()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun setMuted(aMuted: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var aMuted = aMuted
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


                @Throws(Exception::class)
            
open fun init(soundsFactoryInterface: SoundsFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var soundsFactoryInterface = soundsFactoryInterface

    var logUtil: LogUtil = LogUtil.getInstance()!!
            


    var commonString: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonString!!.START, THIS, commonString!!.INIT)
AllBinaryMediaManager.shutdown(soundsFactoryInterface)
ProgressCanvasFactory.getInstance()!!.addPortion(50, 
                            "Media Manager")
System.gc()
Sounds(soundsFactoryInterface).
                            init()
logUtil!!.put(commonString!!.END, THIS, commonString!!.INIT)
}


                @Throws(Exception::class)
            
open fun shutdown(soundsFactoryInterface: SoundsFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var soundsFactoryInterface = soundsFactoryInterface

    var logUtil: LogUtil = LogUtil.getInstance()!!
            


    var commonString: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonString!!.START, THIS, 
                            "shutdown")

    
                        if(soundsFactoryInterface!!.isInitialized())
                        
                                    {
                                    Sounds(soundsFactoryInterface).
                            stopAll()

    var soundInterfaceArray: Array<Sound?> = soundsFactoryInterface!!.getSoundInterfaceArray()!!
            


    var player: Player


    var player2: Player


    var androidMediaPlayerWrapper: AndroidMediaPlayerWrapper





                        for (i in 0 until soundInterfaceArray!!.size)


        {
    
                        if(soundInterfaceArray[i] != 
                                    null
                                )
                        
                                    {
                                    player= soundInterfaceArray[i]!!.getPlayerP()

    
                        if(player != 
                                    null
                                )
                        
                                    {
                                    player2= 
                                    (player as PlayerComposite).getPlayerP()

    
                        if(player2 is AndroidMediaPlayerWrapper)
                        
                                    {
                                    androidMediaPlayerWrapper= player2 as AndroidMediaPlayerWrapper
MediaPlayerUtil.getInstance()!!.wait(androidMediaPlayerWrapper!!.getMediaPlayer())

                                    }
                                
                        else {
                            


                            throw Exception("Unknown Property Player: " +player::class.qualifiedName!!)

                        }
                            

                                    }
                                

                                    }
                                
}

Sounds(soundsFactoryInterface).
                            closeAll()
System.gc()
soundsFactoryInterface!!.setInitialized(false)
mostUsedTotal= 0

                                    }
                                
logUtil!!.put(commonString!!.START, THIS, 
                            "shutdown")
}


                @Throws(Exception::class)
            
open fun createPlayer(resource: String)
        //nullable = true from not(false or (false and false)) = true
: Player{

                    var resource = resource
mostUsedTotal++

    var logUtil: LogUtil = LogUtil.getInstance()!!
            


    
                        if(Features.getInstance()!!.isFeature(GameFeatureFactory.getInstance()!!.SOUND))
                        
                                    {
                                    
        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AndroidMediaPlayerWrapper(resource)
} catch(e: Exception)
            {logUtil!!.put("Could not create AndroidMediaPlayerWrapper using NoPlayer at " +CommonLabels.getInstance()!!.TOTAL_LABEL +mostUsedTotal, THIS, 
                            "createPlayer", e)



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
: Player{

                    var stream = stream


                    var type = type



                            throw MediaException(
                            "No Input Stream Player")
}


                @Throws(MediaException::class)
            
open fun playTone(frequency: Int, time: Int, volume: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var frequency = frequency


                    var time = time


                    var volume = volume



                            throw MediaException(
                            "No Tone Player")
}


open fun isInitialized()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


        }
            private constructor        ()
            : super()
        {}


}
                
            



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
        
import javax.microedition.media.Manager
import javax.microedition.media.MediaException
import javax.microedition.media.Player
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureFactory
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class AllBinaryMediaManager
            : Object
         {
        

        companion object {


    private val THIS: String = "AllBinaryMediaManagerHTML5"

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
ProgressCanvasFactory.getInstance()!!.addPortion(50, 
                            "Media Manager")
Sounds(soundsFactoryInterface).
                            init()
}


                @Throws(Exception::class)
            
open fun shutdown(soundsFactoryInterface: SoundsFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var soundsFactoryInterface = soundsFactoryInterface
Sounds(soundsFactoryInterface).
                            stopAll()
Sounds(soundsFactoryInterface).
                            closeAll()
System.gc()
}


                @Throws(Exception::class)
            
open fun createPlayer(resource: String)
        //nullable = true from not(false or (false and false)) = true
: Player{

                    var resource = resource

    
                        if(Features.getInstance()!!.isFeature(GameFeatureFactory.getInstance()!!.SOUND))
                        
                                    {
                                    
    
                        if(resource.compareTo(Manager.TONE_DEVICE_LOCATOR) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Manager.createPlayer(resource)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Manager.createPlayer(resource.substring(0, resource.length -4))

                        }
                            

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NoPlayer.NO_PLAYER

                        }
                            
}


                @Throws(MediaException::class)
            
open fun playTone(frequency: Int, time: Int, volume: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var frequency = frequency


                    var time = time


                    var volume = volume

    
                        if(Features.getInstance()!!.isFeature(GameFeatureFactory.getInstance()!!.SOUND))
                        
                                    {
                                    Manager.playTone(frequency, time, volume)

                                    }
                                
}



        }
            private constructor        ()
            : super()
        {}


}
                
            


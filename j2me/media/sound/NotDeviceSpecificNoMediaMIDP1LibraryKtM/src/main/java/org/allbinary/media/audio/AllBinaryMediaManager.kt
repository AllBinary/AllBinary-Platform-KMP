
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
        
import java.io.InputStream
import javax.microedition.media.Player
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class AllBinaryMediaManager
            : Object
         {
        

        companion object {
            
    private val THIS: String = "AllBinaryMediaManagerNoMediaMIDP1"

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


open fun createPlayer(stream: InputStream, type: String)
        //nullable = true from not(false or (false and false)) = true
: Player{

                    var stream = stream


                    var type = type

    var logUtil: LogUtil = LogUtil.getInstance()!!
            


    var commonString: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonString!!.START, THIS, 
                            "creatPlayer(InputStream)")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NoPlayer.NO_PLAYER as Player
}


open fun createPlayer(locator: String)
        //nullable = true from not(false or (false and false)) = true
: Player{

                    var locator = locator

    var logUtil: LogUtil = LogUtil.getInstance()!!
            


    var commonString: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonString!!.START, THIS, 
                            "creatPlayer(locator)")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NoPlayer.NO_PLAYER as Player
}


open fun playTone(frequency: Int, time: Int, volume: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var frequency = frequency


                    var time = time


                    var volume = volume
}


open fun getSupportedContentTypes(protocol: String)
        //nullable = true from not(false or (false and false)) = true
: Array<String?>{

                    var protocol = protocol



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.getArrayInstance()
}


open fun getSupportedProtocols(content_type: String)
        //nullable = true from not(false or (false and false)) = true
: Array<String?>{

                    var content_type = content_type



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.getArrayInstance()
}


        }
            private constructor        ()
            : super()
        {}


}
                
            


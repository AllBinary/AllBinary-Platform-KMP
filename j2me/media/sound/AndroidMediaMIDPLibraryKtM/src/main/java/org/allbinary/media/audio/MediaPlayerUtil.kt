
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
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.media.MediaPlayer
import org.allbinary.logic.communication.log.LogUtil

open public class MediaPlayerUtil
            : Object
         {
        

        companion object {
            
    private val instance: MediaPlayerUtil = MediaPlayerUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MediaPlayerUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

                @Throws(Exception::class)
            
open fun wait(mediaPlayer: MediaPlayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var mediaPlayer = mediaPlayer

    var MESSAGE: String = "Not Stopped Waiting"


    var METHOD_NAME: String = "wait"


    var index: Int = 0


        while(mediaPlayer!!.isPlaying() && index < 50)
        {logUtil!!.put(MESSAGE, this, METHOD_NAME)
Thread.sleep(100)
index++
}

}


}
                
            


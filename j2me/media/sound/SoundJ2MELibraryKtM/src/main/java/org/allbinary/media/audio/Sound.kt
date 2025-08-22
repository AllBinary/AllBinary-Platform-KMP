
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
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.media.Player
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.string.CommonStrings

open public class Sound
            : Object
        
                , SoundInterface
                , Runnable {
        

    private var resource: String

    var player: Player = NoPlayer.NO_PLAYER
protected constructor        (resource: String)
            : super()
        {

                    var resource = resource
this.resource= resource
}

override fun getResource()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.resource
}

override fun getPlayerP()
        //nullable = true from not(false or (false and true)) = true
: Player{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.player
}


open fun setPlayerP(player: Player)
        //nullable = true from not(false or (false and false)) = true
{

                    var player = player
this.player= player
}


                @Throws(Exception::class)
            override fun init()
        //nullable = true from not(false or (false and true)) = true
{}


open fun getDuration()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}

override fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            this.player.start()
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

PreLogUtil.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN)
}

}


}
                
            


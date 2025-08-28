
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
        package org.allbinary.game.multiplayer.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil

open public class MultiplayerBehavior
            : Object
         {
        

        companion object {
            
    val NULL_MULTIPLAYER_BEHAVIOR: MultiplayerBehavior = MultiplayerBehavior(StringUtil.getInstance()!!.EMPTY_STRING)

        }
            protected constructor        (username: String)
            : super()
        {
var username = username
}


open fun startTick()
        //nullable = true from not(false or (false and true)) = true
{
}


open fun endTick()
        //nullable = true from not(false or (false and true)) = true
{
}


open fun getApproximateElapsed()
        //nullable = true from not(false or (false and true)) = true
: Long{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


}
                
            


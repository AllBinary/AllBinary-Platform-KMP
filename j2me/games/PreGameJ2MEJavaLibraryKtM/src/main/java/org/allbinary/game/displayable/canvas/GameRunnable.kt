
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        import java.lang.Runnable
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.displayable.DisplayInfoSingleton

open public class GameRunnable
            : Object
        
                , Runnable {
        

    val WAIT: Int = 240

    val FAST: Int = 60

    var wait: Long = WAIT.toLong()
public constructor ()
            : super()
        {
}


    override fun run()
        //nullable = true from not(false or (false and true)) = true
{
DisplayInfoSingleton.getInstance()!!.process()
}


                @Throws(Exception::class)
            
    open fun processLoopSleep()
        //nullable = true from not(false or (false and true)) = true
{
Thread.sleep(wait)
}


}
                
            


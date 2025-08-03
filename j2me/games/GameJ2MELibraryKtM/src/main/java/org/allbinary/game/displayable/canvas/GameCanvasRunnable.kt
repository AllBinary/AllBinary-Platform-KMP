
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.time.GameTickTimeDelayHelper
import org.allbinary.time.GameTickTimeDelayHelperFactory

open public class GameCanvasRunnable : GameRunnable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val allBinaryGameCanvas: AllBinaryGameCanvas
public constructor        (allBinaryGameCanvas: AllBinaryGameCanvas){

                    var allBinaryGameCanvas = allBinaryGameCanvas
this.allBinaryGameCanvas= allBinaryGameCanvas
}


    private val gameTickTimeDelayHelper: GameTickTimeDelayHelper = GameTickTimeDelayHelperFactory.getInstance()!!
            
override fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            allBinaryGameCanvas!!.getLoopTimeHelperP()!!.setStartTime(gameTickTimeDelayHelper!!.setStartTime())
allBinaryGameCanvas!!.processGame()
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}


                @Throws(Exception::class)
            override fun processLoopSleep()
        //nullable = true from not(false or (false and true)) = true
{allBinaryGameCanvas!!.processLoopSleep()
}


}
                
            


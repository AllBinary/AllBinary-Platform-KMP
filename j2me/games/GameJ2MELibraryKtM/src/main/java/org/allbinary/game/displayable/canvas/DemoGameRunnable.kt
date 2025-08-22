
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.time.GameTickTimeDelayHelper
import org.allbinary.time.GameTickTimeDelayHelperFactory

open public class DemoGameRunnable : GameRunnable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val demoCanvas: DemoCanvas
public constructor        (demoCanvas: DemoCanvas){

                    var demoCanvas = demoCanvas
this.demoCanvas= demoCanvas
}


    private val gameTickTimeDelayHelper: GameTickTimeDelayHelper = GameTickTimeDelayHelperFactory.getInstance()!!
override fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            demoCanvas!!.getLoopTimeHelperP()!!.setStartTime(gameTickTimeDelayHelper!!.setStartTime())
demoCanvas!!.processGame()
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}


                @Throws(Exception::class)
            override fun processLoopSleep()
        //nullable = true from not(false or (false and true)) = true
{demoCanvas!!.processLoopSleep()
}


}
                
            


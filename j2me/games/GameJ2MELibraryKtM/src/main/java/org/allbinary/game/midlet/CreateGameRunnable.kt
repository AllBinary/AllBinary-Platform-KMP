
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
        package org.allbinary.game.midlet




        import java.lang.Object        
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvas
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.graphics.displayable.command.MyCommandsFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class CreateGameRunnable
            : Object
        
                , Runnable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val demoGameMidlet: DemoGameMidlet

    private val hashtable: Hashtable<Any, Any>

    private val startGameMidletEvent: DemoGameMidletEvent
public constructor        (demoGameMidlet: DemoGameMidlet, hashtable: Hashtable<Any, Any>)
            : super()
        

        Updates for KMP build        
        {
var demoGameMidlet = demoGameMidlet
var hashtable = hashtable
this.demoGameMidlet= demoGameMidlet
this.hashtable= hashtable
this.startGameMidletEvent= DemoGameMidletEvent(this, DemoGameMidletStateFactory.getInstance()!!.START_GAME)
}

override fun run()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

        try {
            logUtil!!.put(commonStrings!!.START_RUNNABLE, this, commonStrings!!.RUN)

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!

this.demoGameMidlet!!.commandAction(MyCommandsFactory.getInstance()!!.SET_DISPLAYABLE, progressCanvas)
this.demoGameMidlet!!.stopGameCanvasRunnableInterface()
this.demoGameMidlet!!.setGameCanvasRunnableInterface(this.demoGameMidlet!!.createGameCanvasRunnableInterface())
this.demoGameMidlet!!.getGameCanvasRunnableInterface()!!.setLoadStateHashtable(hashtable)
this.demoGameMidlet!!.startGameCanvasRunnableInterface()
DemoGameMidletEventHandler.getInstance()!!.fireEvent(this.startGameMidletEvent)
logUtil!!.put(commonStrings!!.END_RUNNABLE, this, commonStrings!!.RUN)
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}


}
                
            


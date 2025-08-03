
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.graphics.displayable.command.MyCommandsFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings

open public class DemoRunnable
            : Object
        
                , Runnable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val demoGameMidlet: DemoGameMidlet

    private val startDemoGameMidletEvent: DemoGameMidletEvent
public constructor        (demoGameMidlet: DemoGameMidlet)
            : super()
        {

                    var demoGameMidlet = demoGameMidlet
this.demoGameMidlet= demoGameMidlet
this.startDemoGameMidletEvent= DemoGameMidletEvent(this.demoGameMidlet, DemoGameMidletStateFactory.getInstance()!!.START_DEMO)
}

override fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            logUtil!!.put(StringMaker().
                            append(CommonLabels.getInstance()!!.START_LABEL)!!.append(
                            "GameCanvasRunnableInterface")!!.toString(), this, commonStrings!!.RUN)
this.demoGameMidlet!!.commandAction(MyCommandsFactory.getInstance()!!.SET_DISPLAYABLE, ProgressCanvasFactory.getInstance())
this.demoGameMidlet!!.setGameCanvasRunnableInterface(this.demoGameMidlet!!.createDemoGameCanvasRunnableInterface())
this.demoGameMidlet!!.demoSetup()
DemoGameMidletEventHandler.getInstance()!!.fireEvent(this.startDemoGameMidletEvent)
this.demoGameMidlet!!.startGameCanvasRunnableInterface()
this.demoGameMidlet!!.postDemoSetup()
logUtil!!.put(commonStrings!!.END_RUNNABLE, this, commonStrings!!.RUN)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}


}
                
            


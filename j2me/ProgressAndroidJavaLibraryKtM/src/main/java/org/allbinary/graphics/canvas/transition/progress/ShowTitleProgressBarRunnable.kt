
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
        package org.allbinary.graphics.canvas.transition.progress




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.transition.TransistionTypes
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import android.app.Activity

open public class ShowTitleProgressBarRunnable : ProgressRunnable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        (midletActivity: Activity, progressCanvas: ProgressCanvas)                        

                            : super(midletActivity, progressCanvas){
var midletActivity = midletActivity
var progressCanvas = progressCanvas


                            //For kotlin this is before the body of the constructor.
                    
}


    private val FADE_IN_HALF: IntArray = intArrayOf(TransistionTypes.getInstance()!!.FADE_IN_TO_HALF_ALPHA,TransistionTypes.getInstance()!!.FADE_IN_FROM_HALF_ALPHA)
override fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            this.midletActivity!!.onShowProgress(false, FADE_IN_HALF)
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}


}
                
            


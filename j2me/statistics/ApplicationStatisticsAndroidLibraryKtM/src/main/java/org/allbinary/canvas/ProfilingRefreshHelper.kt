
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
        package org.allbinary.canvas




        import java.lang.Object        
        
        import java.lang.Integer
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.view.View
import org.allbinary.logic.string.StringMaker

open public class ProfilingRefreshHelper : AndroidGameStatistics {
        
companion object {
            
    private val instance: ProfilingRefreshHelper = ProfilingRefreshHelper()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AndroidGameStatistics{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private var firstTime: Boolean = true

    private var bestFrameProcessingTime: Int= 0

    private var worstFrameProcessingTime: Int= 0

    private var frameProcessingTimeElapsed: Long= 0
private constructor (){
}


    override fun init(view: View)
        //nullable = true from not(false or (false and false)) = true
{
var view = view
super.init(view)
frameProcessingTimeElapsed= this.getTimeDelayHelper()!!.getStartTime()
bestFrameProcessingTime= Integer.MAX_VALUE
worstFrameProcessingTime= 0
}


    override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{
frameProcessingTimeElapsed= System.currentTimeMillis() -frameProcessingTimeElapsed

    
                        if(firstTime != true)
                        
                                    {
                                    
    
                        if(frameProcessingTimeElapsed > worstFrameProcessingTime)
                        worstFrameProcessingTime= frameProcessingTimeElapsed.toInt()

    
                        if(frameProcessingTimeElapsed < bestFrameProcessingTime)
                        bestFrameProcessingTime= frameProcessingTimeElapsed.toInt()

                                    }
                                
                        else {
                            firstTime= false

                        }
                            
super.nextFrame()
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(super.toString())!!.append(" Worst: ")!!.append(worstFrameProcessingTime)!!.append(" Best: ")!!.append(bestFrameProcessingTime)!!.toString()
}


}
                
            


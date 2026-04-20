
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
this.frameProcessingTimeElapsed= this.getTimeDelayHelper()!!.getStartTime()
this.bestFrameProcessingTime= Integer.MAX_VALUE
this.worstFrameProcessingTime= 0
}


    override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{
this.frameProcessingTimeElapsed= System.currentTimeMillis() -this.frameProcessingTimeElapsed

    
                        if(this.firstTime != true)
                        
                                    {
                                    
    
                        if(this.frameProcessingTimeElapsed > this.worstFrameProcessingTime)
                        this.worstFrameProcessingTime= this.frameProcessingTimeElapsed.toInt()

    
                        if(this.frameProcessingTimeElapsed < this.bestFrameProcessingTime)
                        this.bestFrameProcessingTime= this.frameProcessingTimeElapsed.toInt()

                                    }
                                
                        else {
                            this.firstTime= false

                        }
                            
super.nextFrame()
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(super.toString())!!.append(" Worst: ")!!.appendint(worstFrameProcessingTime)!!.append(" Best: ")!!.appendint(bestFrameProcessingTime)!!.toString()
}


}
                
            


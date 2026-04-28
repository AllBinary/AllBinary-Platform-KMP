
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
        package org.allbinary.time




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonLabels

open public class TimeDelayHelper
            : Object
         {
        

    private var startTime: Long =  -1

    private var elapsedTimeAtPause: Long = Long.MIN_VALUE

    var delay: Int
public constructor (delay: Int)
            : super()
        {
    //var delay = delay
this.delay= delay
this.setStartTimeTNT()
}


    open fun isTimeTNT()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    var currentTime: Long = System.currentTimeMillis()!!


    
                        if(currentTime -this.startTime > this.delay)
                        
                                    {
                                    this.startTime= currentTime



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isTimeSinceTNT(delay: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var delay = delay

    var currentTime: Long = System.currentTimeMillis()!!


    
                        if(currentTime -this.startTime > delay)
                        
                                    {
                                    this.startTime= currentTime



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isTime(currentTime: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var currentTime = currentTime

    
                        if(currentTime -this.startTime > this.delay)
                        
                                    {
                                    this.startTime= currentTime



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isTimeWithoutReset(currentTime: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var currentTime = currentTime

    
                        if(currentTime -this.startTime > this.delay)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isTimeSince(delay: Int, currentTime: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var delay = delay
var currentTime = currentTime

    
                        if(currentTime -this.startTime > this.delay)
                        
                                    {
                                    this.startTime= currentTime



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun getElapsedTNT()
        //nullable = true from not(false or (false and true)) = true
: Long{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return System.currentTimeMillis() -this.startTime
}


    open fun getElapsed(currentTime: Long)
        //nullable = true from not(false or (false and false)) = true
: Long{
var currentTime = currentTime



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentTime -this.startTime
}


    open fun isElapsed(currentTime: Long, time: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var currentTime = currentTime
var time = time

    
                        if(this.getElapsed(currentTime) > time)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


    open fun isElapsedTNT(time: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var time = time

    
                        if(this.getElapsedTNT() > time)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


    open fun setStartTime(startTime: Long)
        //nullable = true from not(false or (false and false)) = true
{
var startTime = startTime
this.startTime= startTime
}


    open fun getStartTime()
        //nullable = true from not(false or (false and true)) = true
: Long{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.startTime
}


    open fun setStartTimeTNT()
        //nullable = true from not(false or (false and true)) = true
{
this.startTime= System.currentTimeMillis()
}


    open fun pause()
        //nullable = true from not(false or (false and true)) = true
{
this.elapsedTimeAtPause= this.getElapsedTNT()
this.startTime= Long.MAX_VALUE
}


    open fun resume()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(this.elapsedTimeAtPause != Long.MIN_VALUE)
                        
                                    {
                                    this.startTime= System.currentTimeMillis() +this.elapsedTimeAtPause
this.elapsedTimeAtPause= Long.MIN_VALUE
this.setStartTimeTNT()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun toStringAt(currentTime: Long)
        //nullable = true from not(false or (false and false)) = true
: String{
var currentTime = currentTime

    var elapsed: Long = this.getElapsed(currentTime)!!


    
                        if(elapsed > 0)
                        
                                    {
                                    
    var commonLabels: CommonLabels = CommonLabels.getInstance()!!


    var elapsedAsString: String = (elapsed).toString()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(commonLabels!!.START)!!.appendlong(this.startTime)!!.append(commonLabels!!.CURRENT)!!.appendlong(currentTime)!!.append(commonLabels!!.ELAPSED)!!.append(elapsedAsString)!!.toString()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING

                        }
                            
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var currentTime: Long = System.currentTimeMillis()!!


    var elapsed: Long = this.getElapsed(currentTime)!!


    
                        if(elapsed > 0)
                        
                                    {
                                    
    var commonLabels: CommonLabels = CommonLabels.getInstance()!!


    var elapsedAsString: String = (elapsed).toString()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(commonLabels!!.START)!!.appendlong(this.startTime)!!.append(commonLabels!!.CURRENT)!!.appendlong(currentTime)!!.append(commonLabels!!.ELAPSED)!!.append(elapsedAsString)!!.toString()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING

                        }
                            
}


}
                
            


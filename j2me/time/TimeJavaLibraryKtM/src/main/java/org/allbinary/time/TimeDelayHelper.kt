
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
public constructor        (delay: Int)
            : super()
        

        Updates for KMP build        
        {
    //var delay = delay
this.delay= delay
this.setStartTime()
}


open fun isTime()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

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


open fun isTimeSince(delay: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
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
: Boolean

        Updates for KMP build        
        {
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
: Boolean

        Updates for KMP build        
        {
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
: Boolean

        Updates for KMP build        
        {
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


open fun getElapsed()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return System.currentTimeMillis() -this.startTime
}


open fun getElapsed(currentTime: Long)
        //nullable = true from not(false or (false and false)) = true
: Long

        Updates for KMP build        
        {
var currentTime = currentTime



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentTime -this.startTime
}


open fun isElapsed(currentTime: Long, time: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
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


open fun isElapsed(time: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var time = time

    
                        if(this.getElapsed() > time)
                        
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


        Updates for KMP build        
        {
var startTime = startTime
this.startTime= startTime
}


open fun getStartTime()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return startTime
}


open fun setStartTime()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.startTime= System.currentTimeMillis()
}


open fun pause()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.elapsedTimeAtPause= this.getElapsed()
this.startTime= Long.MAX_VALUE
}


open fun resume()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

    
                        if(this.elapsedTimeAtPause != Long.MIN_VALUE)
                        
                                    {
                                    this.startTime= System.currentTimeMillis() +this.elapsedTimeAtPause
this.elapsedTimeAtPause= Long.MIN_VALUE
this.setStartTime()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun toString(currentTime: Long)
        //nullable = true from not(false or (true and false)) = true
: String

        Updates for KMP build        
        {
var currentTime = currentTime

    var elapsed: Long = this.getElapsed(currentTime)!!


    
                        if(elapsed > 0)
                        
                                    {
                                    
    var commonLabels: CommonLabels = CommonLabels.getInstance()!!


    var elapsedAsString: String = (elapsed).toString()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(commonLabels!!.START)!!.append(this.startTime)!!.append(commonLabels!!.CURRENT)!!.append(currentTime)!!.append(commonLabels!!.ELAPSED)!!.append(elapsedAsString)!!.toString()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING

                        }
                            
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {

    var currentTime: Long = System.currentTimeMillis()!!


    var elapsed: Long = this.getElapsed(currentTime)!!


    
                        if(elapsed > 0)
                        
                                    {
                                    
    var commonLabels: CommonLabels = CommonLabels.getInstance()!!


    var elapsedAsString: String = (elapsed).toString()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(commonLabels!!.START)!!.append(this.startTime)!!.append(commonLabels!!.CURRENT)!!.append(currentTime)!!.append(commonLabels!!.ELAPSED)!!.append(elapsedAsString)!!.toString()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING

                        }
                            
}


}
                
            


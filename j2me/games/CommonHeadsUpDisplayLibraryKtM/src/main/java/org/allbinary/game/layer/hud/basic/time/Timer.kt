
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
        package org.allbinary.game.layer.hud.basic.time




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.math.PrimitiveLongSingleton
import org.allbinary.logic.math.PrimitiveLongUtil
import org.allbinary.time.GameTickTimeDelayHelper
import org.allbinary.time.GameTickTimeDelayHelperFactory

open public class Timer
            : Object
         {
        

    private var startTime: Long =  -1

    private var hundredthTime: Long= 0

    private var maxTime: Long

    private var modifier: Long= 0

    private var hundrethsString: CharArray = PrimitiveLongSingleton.getInstance()!!.ZERO

    private var totalDigits: Int = 1

    private var primitiveLongUtil: PrimitiveLongUtil

    private val MAX: CharArray = charArrayOf('L','O','L')

    private val gameTickTimeDelayHelper: GameTickTimeDelayHelper = GameTickTimeDelayHelperFactory.getInstance()!!
public constructor        (maxTime: Int)
            : super()
        

        Updates for KMP build        
        {
var maxTime = maxTime
this.primitiveLongUtil= PrimitiveLongUtil(maxTime)
this.maxTime= maxTime.toLong()
}


open fun start()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.hundredthTime= 0
this.startTime= this.gameTickTimeDelayHelper!!.startTime
}


open fun get()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hundredthTime
}


open fun update()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var lastLowerTime: Long = this.hundredthTime


    var currentTime: Long = ((this.modifier +this.gameTickTimeDelayHelper!!.startTime) -this.startTime)


    
                        if(currentTime < 0)
                        
                                    {
                                    currentTime= 0

                                    }
                                
this.hundredthTime= currentTime /100

    
                        if(this.hundredthTime >= this.maxTime)
                        
                                    {
                                    
    
                        if(this.startTime > 0)
                        
                                    {
                                    this.hundrethsString= MAX

                                    }
                                

                                    }
                                
                             else 
    
                        if(lastLowerTime != this.hundredthTime)
                        
                                    {
                                    this.hundrethsString= primitiveLongUtil!!.getCharArray(this.hundredthTime.toInt())
this.totalDigits= this.primitiveLongUtil!!.getCurrentTotalDigits()

                                    }
                                
}


open fun reduce(value: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.modifier -= value
}


open fun add(value: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.modifier += value
}


open fun getTimeChars()
        //nullable = true from not(false or (false and true)) = true
: CharArray

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hundrethsString
}


open fun getCurrentTotalDigits()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return totalDigits
}


}
                
            


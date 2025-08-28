
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
        package org.allbinary.logic.math




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class PrimitiveLongUtil
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var powerOfTen: Int

    private var maxValue: Int

    private var maxDigits: Int

    private val charArray: CharArray

    private var currentTotalDigits: Int= 0

    private val primitiveLongSingleton: PrimitiveLongSingleton = PrimitiveLongSingleton.getInstance()!!
public constructor        (powerOfTen: Int)                        

                            : this(powerOfTen, false)

        Updates for KMP build        
        {
var powerOfTen = powerOfTen


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(powerOfTen % 10 != 0)
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, Exception("Max must be power of 10"))

                                    }
                                
}

public constructor        (powerOfTen: Int, throwException: Boolean)
            : super()
        

        Updates for KMP build        
        {
var powerOfTen = powerOfTen
var throwException = throwException
this.maxDigits= MathUtil.getInstance()!!.getTotalDigits(powerOfTen)
this.powerOfTen= powerOfTen
this.maxValue= (powerOfTen *10) -1
this.charArray= CharArray(this.maxDigits)
}


open fun getCharArray(value: Int)
        //nullable = true from not(false or (false and false)) = true
: CharArray

        Updates for KMP build        
        {
var value = value

    
                        if(value < 10)
                        
                                    {
                                    this.setCurrentTotalDigits(1)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.primitiveLongSingleton!!.NUMBER_CHAR_ARRAYS[value]!!

                                    }
                                

    
                        if(value > maxValue)
                        
                                    {
                                    this.setCurrentTotalDigits(3)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.primitiveLongSingleton!!.UNK

                                    }
                                

    var index: Int = 0


    var div: Int = powerOfTen


    var lastValue: Int = 0


        while(div >= 1)
        

        Updates for KMP build        
        {

    var digit: Int = (value -lastValue) /div


    
                        if(digit >= 0 && digit < 10)
                        
                                    {
                                    
    
                        if(digit == 0 && index == 0)
                        
                                    {
                                    
                                    }
                                
                        else {
                            this.charArray[index++]= this.primitiveLongSingleton!!.NUMBER_CHAR_ARRAY[digit]!!

                        }
                            
lastValue += digit *div

                                    }
                                
div= div /10
}

this.setCurrentTotalDigits(index)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.charArray
}


open fun setCurrentTotalDigits(currentTotalDigits: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var currentTotalDigits = currentTotalDigits
this.currentTotalDigits= currentTotalDigits
}


open fun getCurrentTotalDigits()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentTotalDigits
}


open fun getMaxDigits()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxDigits
}


}
                
            


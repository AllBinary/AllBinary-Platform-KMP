
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
        

open public class BasicDecimal
            : Object
         {
        

        companion object {
            
    val ZERO_BIGDECIMAL: BasicDecimal = BasicDecimal()

        }
            
    private var units: Long
public constructor        (bigDecimal: BasicDecimal)
            : super()
        

        Updates for KMP build        
        {
var bigDecimal = bigDecimal
this.units= bigDecimal!!.getUnscaled()
this.updateScaled()
}

public constructor        ()
            : super()
        

        Updates for KMP build        
        {
this.units= 0
this.updateScaled()
}

public constructor        (units: Long)
            : super()
        

        Updates for KMP build        
        {
var units = units
this.units= units
this.updateScaled()
}


open fun set(value: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.units= value.toLong()
this.updateScaled()
}


open fun set(value: Long)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.units= value
this.updateScaled()
}


open fun set(bigDecimal: BasicDecimal)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var bigDecimal = bigDecimal
this.units= bigDecimal!!.getUnscaled()
this.updateScaled()
}


open fun add(value: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.units= this.units +value
this.updateScaled()
}


open fun add(value: Long)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.units= this.units +value
this.updateScaled()
}


open fun add(bigDecimal: BasicDecimal)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var bigDecimal = bigDecimal
this.units= this.units +bigDecimal!!.getUnscaled()
this.updateScaled()
}


open fun subtract(value: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.units= this.units -value
this.updateScaled()
}


open fun subtract(value: Long)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.units= this.units -value
this.updateScaled()
}


open fun subtract(bigDecimal: BasicDecimal)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var bigDecimal = bigDecimal
this.units= this.units -bigDecimal!!.getUnscaled()
this.updateScaled()
}


open fun multiply(value: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.units= this.units *value
this.updateScaled()
}


open fun multiply(value: Long)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.units= this.units *value
this.updateScaled()
}


open fun multiply(bigDecimal: BasicDecimal)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var bigDecimal = bigDecimal
this.units= this.units *bigDecimal!!.getUnscaled()
this.updateScaled()
}


open fun divide(value: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.units= this.units /value
this.updateScaled()
}


open fun divide(value: Long)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value
this.units= this.units /value
this.updateScaled()
}


open fun divide(bigDecimal: BasicDecimal)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var bigDecimal = bigDecimal
this.units= this.units /bigDecimal!!.getUnscaled()
this.updateScaled()
}


open fun getUnscaled()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.units
}


    private var scaled: Int= 0

open fun updateScaled()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.scaled= (this.units /factorValue).toInt()
}


open fun getScaled()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.scaled
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (this.units).toString()
}


    private val factor: Int = ScaleFactorFactory.getInstance()!!.DEFAULT_SCALE_FACTOR

    private val factorValue: Int = ScaleFactorFactory.getInstance()!!.DEFAULT_SCALE_VALUE

open fun getScaledFactor()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return factor
}


open fun getScaledFactorValue()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return factorValue
}


}
                
            


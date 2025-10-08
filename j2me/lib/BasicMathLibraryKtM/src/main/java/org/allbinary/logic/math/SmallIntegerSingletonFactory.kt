
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
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class SmallIntegerSingletonFactory
            : Object
         {
        
companion object {
            
    private val instance: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SmallIntegerSingletonFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val NEGATIVE_MAX: Int = 500

    val POSITIVE_MAX: Int = 0x2D1

    private val INTEGER_ARRAY: Array<Integer?> = arrayOfNulls(NEGATIVE_MAX +POSITIVE_MAX)

    private val STRING_ARRAY: Array<String?> = arrayOfNulls(NEGATIVE_MAX +POSITIVE_MAX)

    var MIN: Int = 0

    var lastMin: Int = 0

    var lastNegativeMin: Int = 0

    open fun init(value: Int, negativeValue: Int)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
var negativeValue = negativeValue




                        for (index in value -1 downTo lastMin)

        {
INTEGER_ARRAY[index +NEGATIVE_MAX]= Integer(index)
}





                        for (index in negativeValue -1 downTo lastNegativeMin)

        {
INTEGER_ARRAY[index]= Integer( -index)
}


    
                        if(lastMin < value)
                        
                                    {
                                    lastMin= value
MIN= value

                                    }
                                

    
                        if(lastNegativeMin < negativeValue)
                        
                                    {
                                    lastNegativeMin= negativeValue

                                    }
                                
}


    open fun init()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(lastMin < POSITIVE_MAX || lastNegativeMin < NEGATIVE_MAX)
                        
                                    {
                                    



                        for (index in POSITIVE_MAX -1 downTo lastMin)

        {
INTEGER_ARRAY[index +NEGATIVE_MAX]= Integer(index)
}





                        for (index in NEGATIVE_MAX -1 downTo lastNegativeMin)

        {
INTEGER_ARRAY[index]= Integer( -index)
}

lastMin= POSITIVE_MAX
lastNegativeMin= NEGATIVE_MAX

                                    }
                                
}

private constructor ()
            : super()
        {
}


    open fun getInstance(index: Int)
        //nullable =  from not(true or (false and false)) = 
: Integer{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return INTEGER_ARRAY[index +NEGATIVE_MAX]!!
}


    open fun getInstanceNoThrow(index: Int)
        //nullable = true from not(false or (false and false)) = true
: Integer{
var index = index

    
                        if(index +NEGATIVE_MAX > this.INTEGER_ARRAY.size -1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return INTEGER_ARRAY[ -1 +NEGATIVE_MAX]!!

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return INTEGER_ARRAY[index +NEGATIVE_MAX]!!
}


    open fun createInstance(index: Int)
        //nullable = true from not(false or (false and false)) = true
: Integer{
var index = index

    var integer: Integer = getInstance(index)!!


    
                        if(integer == 
                                    null
                                )
                        
                                    {
                                    integer= Integer(index)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return integer
}


    open fun getString(index: Int)
        //nullable = true from not(false or (false and false)) = true
: String{
var index = index

    var i: Int = index +NEGATIVE_MAX


    
                        if(STRING_ARRAY[i] == 
                                    null
                                )
                        
                                    {
                                    STRING_ARRAY[i]= this.INTEGER_ARRAY[i]!!.toString()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return STRING_ARRAY[i]!!
}


}
                
            


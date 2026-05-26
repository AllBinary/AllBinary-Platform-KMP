
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.math




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps

open public class MathUtil
            : Object
         {
        
companion object {
            
    private val instance: MathUtil = MathUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MathUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return MathUtil.instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun getTotalDigits(digits: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var digits = digits

    var total: Int = 0


        while(digits > 0)
        {
digits= digits /10
total++
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return total
}


    open fun sqrt(value: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var value = value

    
                        if(value <= 1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value

                                    }
                                

    var accumulated: Int = value shr 1


    var result: Int = (accumulated +(value /accumulated)) shr 1


        do
        {
accumulated= result
result= (accumulated +(value /accumulated)) shr 1
}

        while(accumulated > result)
    



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return accumulated
}


    private val ACCURACY: Int = 100

    open fun sqrtd(x: Int)
        //nullable = true from not(false or (false and false)) = true
: Double{
var x = x

    
                        if(x == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0.0f.toDouble()

                                    }
                                

    
                        if(x < 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1.0f.toDouble()

                                    }
                                

    var result: Double = x.toDouble()





                        for (index in 0 until this.ACCURACY)

        {
result= (result +(x /result)) /2
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}


    open fun abs(value: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var value = value



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return if((value < 0)) {
                            
                             -value
                        
                            } else {
                            value
                            }
    
}


    open fun abslong(value: Long)
        //nullable = true from not(false or (false and false)) = true
: Long{
var value = value



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return if((value < 0)) {
                            
                             -value
                        
                            } else {
                            value
                            }
    
}


    open fun min(value: Int, value2: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var value = value
var value2 = value2



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return if((value <= value2)) {
                            
                            value
                        
                            } else {
                            value2
                            }
    
}


    open fun max(value: Int, value2: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var value = value
var value2 = value2



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return if((value >= value2)) {
                            
                            value
                        
                            } else {
                            value2
                            }
    
}


}
                
            


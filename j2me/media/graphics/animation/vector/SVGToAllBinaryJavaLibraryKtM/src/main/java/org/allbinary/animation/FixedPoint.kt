
        /* Generated Code Do Not Modify */
        package org.allbinary.animation




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class FixedPoint
            : Object
         {
        
companion object {
            
    private val instance: FixedPoint = FixedPoint()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FixedPoint{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val ONE: Int = 1 shl 16

    open fun toFixed(val: Double)
        //nullable = true from not(false or (false and false)) = true
: Int{
var val = val



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (val *65536.0).toInt()
}


    open fun toFixed(val: Float)
        //nullable = true from not(false or (false and false)) = true
: Int{
var val = val



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (val *65536.0f).toInt()
}


    open fun mul(a: Int, b: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var a = a
var b = b



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ((a.toLong() *b) shr 16).toInt()
}


    open fun div(a: Int, b: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var a = a
var b = b



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (((a.toLong()) shl 16) /b).toInt()
}


    open fun toInt(fixed: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var fixed = fixed



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fixed shr 16
}


}
                
            


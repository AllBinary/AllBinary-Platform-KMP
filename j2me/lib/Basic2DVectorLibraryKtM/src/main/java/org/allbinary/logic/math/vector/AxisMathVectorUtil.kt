
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
        package org.allbinary.logic.math.vector




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.math.NoDecimalTrigTable

open public class AxisMathVectorUtil
            : Object
         {
        

        companion object {
            
    private val instance: AxisMathVectorUtil = AxisMathVectorUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AxisMathVectorUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val noDecimalTrigTable: NoDecimalTrigTable = NoDecimalTrigTable.getInstance()!!
            

open fun calculateX(magnitude: Long, angle: Int)
        //nullable = true from not(false or (false and false)) = true
: Long{

                    var magnitude = magnitude


                    var angle = angle



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return magnitude *noDecimalTrigTable!!.cos(angle) /10
}


open fun calculateY(magnitude: Long, angle: Int)
        //nullable = true from not(false or (false and false)) = true
: Long{

                    var magnitude = magnitude


                    var angle = angle



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return magnitude *noDecimalTrigTable!!.sin(angle) /10
}


open fun calculateZ(magnitude: Long, otherAngle: Int)
        //nullable = true from not(false or (false and false)) = true
: Long{

                    var magnitude = magnitude


                    var otherAngle = otherAngle



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return magnitude *noDecimalTrigTable!!.sin(otherAngle) /10
}


}
                
            


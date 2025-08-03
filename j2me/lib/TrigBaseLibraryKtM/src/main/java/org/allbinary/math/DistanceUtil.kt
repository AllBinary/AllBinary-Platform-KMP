
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
        package org.allbinary.math



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.math.MathUtil

open public class DistanceUtil
            : Object
         {
        

        companion object {


    private val instance: DistanceUtil = DistanceUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DistanceUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val mathUtil: MathUtil = MathUtil.getInstance()!!
            

open fun getDistance(x1: Int, y1: Int, x2: Int, y2: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var x1 = x1


                    var y1 = y1


                    var x2 = x2


                    var y2 = y2

    var dx: Int = x1 -x2


    var dy: Int = y1 -y2




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mathUtil!!.sqrt((dx *dx) +(dy *dy)).toInt()
}


}
                
            


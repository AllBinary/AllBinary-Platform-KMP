
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
        package org.allbinary.graphics




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class PointFactory
            : Object
         {
        

        companion object {
            
    private val instance: PointFactory = PointFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PointFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    var ZERO_ZERO: GPoint = this.getInstance(0, 0, 0)!!

open fun init()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


open fun getInstance(x: Int, y: Int)
        //nullable =  from not(true or (false and false)) = 
: GPoint

        Updates for KMP build        
        {
var x = x
var y = y



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GPoint(x, y, 0)
}


open fun getInstance(x: Int, y: Int, z: Int)
        //nullable =  from not(true or (false and false)) = 
: GPoint

        Updates for KMP build        
        {
var x = x
var y = y
var z = z



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GPoint(x, y, z)
}


}
                
            


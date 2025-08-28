
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
        package org.allbinary.logic.control.contraints




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
interface MinMaxDoubleConstraintInterface {
        

open fun getMax()
        //nullable = true from not(false or (false and true)) = true
: Double

open fun getMin()
        //nullable = true from not(false or (false and true)) = true
: Double

open fun setMax(max: Double)
        //nullable = true from not(false or (false and false)) = true


open fun setMin(min: Double)
        //nullable = true from not(false or (false and false)) = true


}
                
            


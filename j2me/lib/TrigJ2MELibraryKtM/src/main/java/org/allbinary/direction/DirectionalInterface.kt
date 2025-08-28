
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
        package org.allbinary.direction




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.math.Angle
interface DirectionalInterface {
        

open fun setFrame(direction: Direction)
        //nullable = true from not(false or (false and false)) = true


open fun setFrame(angle: Angle)
        //nullable = true from not(false or (false and false)) = true


open fun adjustFrame(newAngle: Angle)
        //nullable = true from not(false or (false and false)) = true


open fun adjustFrame(angle: Short)
        //nullable = true from not(false or (false and false)) = true


}
                
            


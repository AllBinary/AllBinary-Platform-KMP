
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
        package org.allbinary.input.motion.button




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.mapping.InputMappingInterface
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.paint.ProcessPaintable

open public class TouchButtonsPaintableCompositeFactory
            : Object
         {
        

        companion object {
            
open fun getInstance(inputMappingInterface: InputMappingInterface, basicColor: BasicColor)
        //nullable =  from not(true or (false and false)) = 
: ProcessPaintable

        Updates for KMP build        
        {
var inputMappingInterface = inputMappingInterface
var basicColor = basicColor



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TouchButtonsPaintableComposite(inputMappingInterface, basicColor)
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            



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
        package org.allbinary.logic.visual.dhtml.style.css




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.control.validate.ValidationInterface
import org.w3c.dom.Node

open public class CssElementValidationFactory
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun getInstance(node: Node)
        //nullable =  from not(true or (false and false)) = 
: ValidationInterface{
var node = node



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CssElementValidation(node) as ValidationInterface
}


        }
            private constructor        ()
            : super()
        {
}


}
                
            


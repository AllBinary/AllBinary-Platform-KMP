
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
        package org.allbinary.data.tree.dom




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class ToDomHelper
            : Object
         {
        

        companion object {
            
open fun convertNull(value: String)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
var value = value

    
                        if(value == 
                                    null
                                )
                        value= "null"



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value
}


        }
            private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


}
                
            



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
        package org.allbinary.logic.math




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonSeps

open public class MathData
            : Object
         {
        

        companion object {
            
    private val instance: MathData = MathData()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MathData{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {
}


    var EQUALS: String = CommonSeps.getInstance()!!.EQUALS

    var PLUS: String = "+"

    var MINUS: String = "-"

    var DIVIDE: String = "/"

    var MULTIPLY: String = CommonPhoneStrings.getInstance()!!.STAR

}
                
            


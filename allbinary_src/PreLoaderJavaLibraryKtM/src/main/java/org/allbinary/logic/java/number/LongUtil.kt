
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
        package org.allbinary.logic.java.number



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class LongUtil
            : Object
         {
        

        companion object {
            
open fun fillIn(end: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var end = end

    var frameStringBuffer: StringMaker = StringMaker()


    
                        if(frameStringBuffer!!.length() < LongData.MAX_LONG_LENGTH)
                        
                                    {
                                    
    var size: Int = LongData.MAX_LONG_LENGTH -frameStringBuffer!!.length()





                        for (index in 0 until size)


        {frameStringBuffer!!.append(
                            '0')
}


                                    }
                                
frameStringBuffer!!.append(end)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return frameStringBuffer!!.toString()
}


        }
            private constructor        ()
            : super()
        {}


}
                
            


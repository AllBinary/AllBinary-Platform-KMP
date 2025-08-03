
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
        package org.allbinary.logic.java



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class PrimitiveArrayToString
            : Object
         {
        

        companion object {


open fun toString(floats: FloatArray)
        //nullable = true from not(false or (true and false)) = true
: String{

                    var floats = floats

    var stringBuffer: StringMaker = StringMaker()





                        for (index in 0 until floats!!.size)


        {stringBuffer!!.append(floats[index]!!)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            


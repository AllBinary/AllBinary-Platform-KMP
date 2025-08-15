
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
        package org.allbinary.logic.java.anyType




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class ParamsUtil
            : Object
         {
        

        companion object {
            
open fun viewParams(params: Array<KClass<*>?>)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var params = params

    
                        if(params != 
                                    null
                                )
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()





                        for (index in 0 until params.size)


        {stringBuffer!!.append(" ")
stringBuffer!!.append(params[index]!!.getName())
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()

                                    }
                                
                             else 
    
                        if()
                        
}


        }
            private constructor        ()
            : super()
        {}


}
                
            


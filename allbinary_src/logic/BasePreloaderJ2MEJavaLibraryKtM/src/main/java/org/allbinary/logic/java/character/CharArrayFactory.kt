
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
        package org.allbinary.logic.java.character




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class CharArrayFactory
            : Object
         {
        

        companion object {
            
    private val instance: CharArrayFactory = CharArrayFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CharArrayFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val zeroCharArray: CharArray = 
                                                        
                                                        CharArray(0)
                                                    

open fun getZeroCharArray()
        //nullable = true from not(false or (false and true)) = true
: CharArray

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return zeroCharArray
}


}
                
            


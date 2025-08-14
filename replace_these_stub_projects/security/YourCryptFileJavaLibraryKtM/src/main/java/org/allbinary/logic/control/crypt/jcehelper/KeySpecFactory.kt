
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2002 AllBinary 
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
        package org.allbinary.logic.control.crypt.jcehelper




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.security.spec.KeySpec

open public class KeySpecFactory
            : Object
         {
        

        companion object {
            
    val DES: String = "DES"

    val DESEDE: String = "DESede"

open fun getInstance(algorithm: String, keyData: ByteArray)
        //nullable =  from not(true or (false and false)) = 
: KeySpec{

                    var algorithm = algorithm


                    var keyData = keyData



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


        }
            private constructor        ()
            : super()
        {}


}
                
            


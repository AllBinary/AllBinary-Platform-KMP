
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
        package org.allbinary.logic.java.characters




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class CharacterSetData
            : Object
         {
        
companion object {
            
    private val instance: CharacterSetData = CharacterSetData()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CharacterSetData{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor ()
            : super()
        {
}


    val US_ASCII: String = "US-ASCII"

    val ISO_8859_1: String = "ISO-8859-1"

    val UTF_8: String = "UTF-8"

    val UTF_16: String = "UTF-16"

    val UTF_16BE: String = "UTF-16BE"

    val UTF_16LE: String = "UTF-16LE"

}
                
            


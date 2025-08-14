
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
        package org.allbinary.business.context.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.file.DataFileData

open public class ContextConfigurationData
            : Object
         {
        

        companion object {
            
    private val instance: ContextConfigurationData = ContextConfigurationData()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ContextConfigurationData{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {}


    val NAME: String = "CONTEXT_CONFIGURATION_NAME"

    val UNCRYPTED_EXTENSION: String = DataFileData.UNCRYPTED_EXTENSION

    val ENCRYPTED_EXTENSION: String = DataFileData.ENCRYPTED_EXTENSION

}
                
            


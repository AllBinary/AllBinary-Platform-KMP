
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        package org.allbinary.game.configuration.persistance




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.rms.RecordFilter

open public class NullRecordFilter
            : Object
        
                , RecordFilter {
        

        companion object {
            
    var NULL_RECORD_FILTER: NullRecordFilter = NullRecordFilter()

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun matches(candidate: ByteArray)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var candidate = candidate



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


}
                
            



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
        package org.allbinary.data.tree.dom.document




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.document.mapping.DomDocumentMappingInterface
interface DomDocumentQueueInterface {
        

                @Throws(Exception::class)
            
open fun offer(domDocumentMappingInterface: DomDocumentMappingInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean

                @Throws(Exception::class)
            
open fun remove()
        //nullable = true from not(false or (false and true)) = true
: DomDocumentMappingInterface

}
                
            


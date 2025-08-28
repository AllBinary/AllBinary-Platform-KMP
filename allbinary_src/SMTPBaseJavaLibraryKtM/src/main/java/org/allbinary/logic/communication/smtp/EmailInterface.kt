
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
        package org.allbinary.logic.communication.smtp




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.mail.internet.MimeMessage
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.document.mapping.DomDocumentMappingInterface
interface EmailInterface : DomNodeInterface, DomDocumentMappingInterface {
        

open fun getDebugInfo()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getMimeMessage()
        //nullable = true from not(false or (false and true)) = true
: MimeMessage

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun log()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

}
                
            


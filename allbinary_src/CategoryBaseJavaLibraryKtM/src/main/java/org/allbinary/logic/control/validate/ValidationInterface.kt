
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
        package org.allbinary.logic.control.validate



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.w3c.dom.Document
import org.w3c.dom.Node
interface ValidationInterface {
        

                @Throws(Exception::class)
            
open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

                @Throws(Exception::class)
            
open fun toValidationInfoNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

                @Throws(Exception::class)
            
open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: Document

                @Throws(Exception::class)
            
open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String

}
                
            



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
        package org.allbinary.input.automation.module.generic.configuration.profile




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.w3c.dom.Document
import org.w3c.dom.Node
interface GenericProfileDataWorkerTypeInterface {
        

open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

}
                
            



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
        
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.data.tree.dom.document.mapping.DomDocumentMappingInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class ContextConfigurationDomDocumentMapping
            : Object
        
                , DomDocumentMappingInterface {
        

    private var contextConfigurationInterface: ContextConfigurationInterface
public constructor        (contextConfigurationInterface: ContextConfigurationInterface)
            : super()
        

        Updates for KMP build        
        {
var contextConfigurationInterface = contextConfigurationInterface
this.contextConfigurationInterface= contextConfigurationInterface
}


                @Throws(Exception::class)
            
open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document

        Updates for KMP build        
        {

    var document: Document = DomDocumentHelper.create()!!


    var node: Node = ContextConfigurationView(this.contextConfigurationInterface).
                            toXmlNode(document)!!

document.appendChild(node)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document
}


                @Throws(Exception::class)
            
open fun toDomDocumentString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DomDocumentHelper.toString(this.toXmlDoc())
}


}
                
            



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
        package org.allbinary.business.user.modules.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.data.tree.dom.document.mapping.DomDocumentMappingInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class UserConfigurationDomDocumentMapping
            : Object
        
                , DomDocumentMappingInterface {
        

    private var userConfigurationInterface: UserConfigurationInterface
public constructor        (userConfigurationInterface: UserConfigurationInterface)
            : super()
        {

                    var userConfigurationInterface = userConfigurationInterface
this.userConfigurationInterface= userConfigurationInterface
}


                @Throws(Exception::class)
            
open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{
    var document: Document = DomDocumentHelper.create()!!
            


    var node: Node = UserConfigurationView(this.userConfigurationInterface).
                            toXmlNode(document)!!
            

document.appendChild(node)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document
}


                @Throws(Exception::class)
            
open fun toDomDocumentString()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DomDocumentHelper.toString(this.toXmlDoc())
}


}
                
            


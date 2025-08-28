
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
        package org.allbinary.input.automation.actions.script.condition.processors




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.DomSearchHelper
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class BasicProfileActionScriptProcessorNode
            : Object
         {
        
public constructor        (node: Node)
            : super()
        

        Updates for KMP build        
        {
var node = node

    var actionNode: Node = DomSearchHelper.getNode(GenericProfileActionScriptProcessorData.NAME, node.getChildNodes())!!

}

public constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document

    var node: Node = document.createElement(GenericProfileActionScriptProcessorData.NAME)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            


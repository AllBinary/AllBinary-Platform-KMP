
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
        package org.allbinary.input.automation.module.actions.script.condition.processors.output




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.automation.actions.script.condition.processors.BasicProfileActionScriptProcessor
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class BasicProfileActionScriptOutput : BasicProfileActionScriptProcessor
                , ProfileActionScriptOutputInterface {
        
public constructor        (label: String, node: Node)                        

                            : super(label, node){

                    var label = label


                    var node = node


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (label: String)                        

                            : super(label){

                    var label = label


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = document.createElement(GenericProfileActionScriptOutputData.NAME)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            


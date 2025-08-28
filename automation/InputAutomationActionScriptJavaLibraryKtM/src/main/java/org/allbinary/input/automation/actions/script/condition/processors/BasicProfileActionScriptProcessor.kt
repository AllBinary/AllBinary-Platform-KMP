
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
        
import java.awt.event.ActionEvent
import org.allbinary.input.automation.actions.script.JTreeInterfaceFactory
import org.allbinary.input.automation.actions.script.ProfileActionScriptItem
import org.allbinary.input.automation.actions.script.condition.ProfileActionScriptConditionInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class BasicProfileActionScriptProcessor : ProfileActionScriptItem
                , ProfileActionScriptProcessorInterface {
        
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


open fun actionPerformed(actionEvent: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var actionEvent = actionEvent
super.actionPerformed(actionEvent)

    
                        if(actionEvent!!.getActionCommand()!!.compareTo(DELETE) == 0)
                        
                                    {
                                    
    
                        if(this.getParent() is ProfileActionScriptConditionInterface)
                        
                                    {
                                    
    var profileActionScriptConditionInterface: ProfileActionScriptConditionInterface = this.getParent() as ProfileActionScriptConditionInterface

profileActionScriptConditionInterface!!.removeProcessor(this as ProfileActionScriptProcessorInterface)
JTreeInterfaceFactory.getInstance()!!.getJTreeInterface()!!.updateJTree()

                                    }
                                

                                    }
                                
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document

    var node: Node = document.createElement(GenericProfileActionScriptProcessorData.NAME)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            


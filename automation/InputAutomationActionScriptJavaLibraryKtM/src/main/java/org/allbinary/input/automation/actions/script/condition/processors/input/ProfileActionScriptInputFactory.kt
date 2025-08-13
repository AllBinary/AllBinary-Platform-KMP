
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
        package org.allbinary.input.automation.actions.script.condition.processors.input



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.DomSearchHelper
import org.w3c.dom.Node

open public class ProfileActionScriptInputFactory
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun getInstance(node: Node)
        //nullable =  from not(true or (false and false)) = 
: ProfileActionScriptInputInterface{

                    var node = node

    var profileActionScriptInputInterface: ProfileActionScriptInputInterface = 
                null
            


    
                        if(DomSearchHelper.getNodeNoThrow(KeyboardActionScriptInputData.NAME, node.getChildNodes()) != 
                                    null
                                )
                        
                                    {
                                    profileActionScriptInputInterface= KeyboardActionScriptInput(node)

                                    }
                                
                             else 
    
                        if(DomSearchHelper.getNodeNoThrow(MouseActionScriptInputData.NAME, node.getChildNodes()) != 
                                    null
                                )
                        
                                    {
                                    profileActionScriptInputInterface= MouseActionScriptInput(node)

                                    }
                                
                        else {
                            


                            throw Exception(
                            "No Such ActionScript Input")

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return profileActionScriptInputInterface
}


        }
            private constructor        ()
            : super()
        {}


}
                
            


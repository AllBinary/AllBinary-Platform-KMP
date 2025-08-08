
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.DomSearchHelper
import org.w3c.dom.Node

open public class ProfileActionScriptOutputFactory
            : Object
         {
        

        companion object {


                @Throws(Exception::class)
            
open fun getInstance(node: Node)
        //nullable =  from not(true or (false and false)) = 
: ProfileActionScriptOutputInterface{

                    var node = node

    var profileActionScriptOutputInterface: ProfileActionScriptOutputInterface = 
                null
            


    
                        if(DomSearchHelper.getNodeNoThrow(ImageActionScriptOutputData.NAME, node.getChildNodes()) != 
                                    null
                                )
                        
                                    {
                                    profileActionScriptOutputInterface= ImageActionScriptOutput(node)

                                    }
                                
                        else {
                            


                            throw Exception(
                            "No Such ActionScript Output")

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return profileActionScriptOutputInterface
}



        }
            private constructor        ()
            : super()
        {}


}
                
            


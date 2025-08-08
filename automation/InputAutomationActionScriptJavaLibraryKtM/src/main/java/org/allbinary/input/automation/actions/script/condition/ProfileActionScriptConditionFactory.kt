
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
        package org.allbinary.input.automation.actions.script.condition



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.DomSearchHelper
import org.w3c.dom.Node

open public class ProfileActionScriptConditionFactory
            : Object
         {
        

        companion object {


                @Throws(Exception::class)
            
open fun getInstance(node: Node)
        //nullable =  from not(true or (false and false)) = 
: ProfileActionScriptConditionInterface{

                    var node = node

    var profileActionScriptConditionInterface: ProfileActionScriptConditionInterface = 
                null
            


    
                        if(DomSearchHelper.getNodeNoThrow(ColorAtActionScriptConditionData.NAME, node.getChildNodes()) != 
                                    null
                                )
                        
                                    {
                                    profileActionScriptConditionInterface= ColorAtActionScriptCondition(node)

                                    }
                                
                             else 
    
                        if(DomSearchHelper.getNodeNoThrow(TimeIntervalActionScriptConditionData.NAME, node.getChildNodes()) != 
                                    null
                                )
                        
                                    {
                                    profileActionScriptConditionInterface= TimeIntervalActionScriptCondition(node)

                                    }
                                
                             else 
    
                        if(DomSearchHelper.getNodeNoThrow(AlwaysActionScriptConditionData.NAME, node.getChildNodes()) != 
                                    null
                                )
                        
                                    {
                                    profileActionScriptConditionInterface= AlwaysActionScriptCondition(node)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return profileActionScriptConditionInterface
}



        }
            private constructor        ()
            : super()
        {}


}
                
            


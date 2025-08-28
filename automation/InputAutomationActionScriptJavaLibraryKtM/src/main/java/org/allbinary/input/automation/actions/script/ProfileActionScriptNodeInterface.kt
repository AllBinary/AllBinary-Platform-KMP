
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
        package org.allbinary.input.automation.actions.script




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.swing.tree.MutableTreeNode
import org.allbinary.data.tree.dom.DomNodeInterface
interface ProfileActionScriptNodeInterface : DomNodeInterface, MutableTreeNode {
        

open fun addCondition(profileActionConditionInterface: ProfileActionScriptNodeInterface)
        //nullable = true from not(false or (false and false)) = true


open fun removeCondition(profileActionConditionInterface: ProfileActionScriptNodeInterface)
        //nullable = true from not(false or (false and false)) = true


}
                
            


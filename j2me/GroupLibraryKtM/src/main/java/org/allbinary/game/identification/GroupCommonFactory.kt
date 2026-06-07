
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        package org.allbinary.game.identification




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.NullUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory

open public class GroupCommonFactory
            : Object
         {
        
companion object {
            
    private var instance: Any = NullUtil.getInstance()!!.NULL_OBJECT

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GroupCommonFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GroupCommonFactory.instance as GroupCommonFactory
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val ID: Integer = SmallIntegerSingletonFactory.getInstance()!!.getAt(10)!!

    val GROUP_NAME_LABEL: String = "Group Name: "

    val ID_LABEL: String = " Id: "

    val ADDING_LABEL: String = "Adding: "

    val TO_LABEL: String = " to: "

}
                
            


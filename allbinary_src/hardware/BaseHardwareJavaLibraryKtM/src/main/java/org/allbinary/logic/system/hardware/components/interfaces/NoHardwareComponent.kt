
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
        package org.allbinary.logic.system.hardware.components.interfaces




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil

open public class NoHardwareComponent
            : Object
        
                , HardwareComponentInterface {
        
companion object {
            
    private val instance: NoHardwareComponent = NoHardwareComponent()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NoHardwareComponent{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    override fun compareTo(componentInterface: HardwareComponentInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var componentInterface = componentInterface

    
                        if(this == componentInterface)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.NULL_STRING
}


}
                
            


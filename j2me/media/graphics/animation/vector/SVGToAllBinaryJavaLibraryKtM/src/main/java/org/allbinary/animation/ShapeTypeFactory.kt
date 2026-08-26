
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2026 AllBinary 
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
        package org.allbinary.animation




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class ShapeTypeFactory
            : Object
         {
        
companion object {
            
    private val instance: ShapeTypeFactory = ShapeTypeFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ShapeTypeFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val KEY_LINE: String = "line"

    val KEY_CIRCLE: String = "circle"

    val KEY_RECTANGLE: String = "rectangle"

    val KEY_RECT: String = "rect"

    val LINE: ShapeType = ShapeType(KEY_LINE)

    val CIRCLE: ShapeType = ShapeType(KEY_CIRCLE)

    val RECTANGLE: ShapeType = ShapeType(KEY_RECTANGLE)

}
                
            


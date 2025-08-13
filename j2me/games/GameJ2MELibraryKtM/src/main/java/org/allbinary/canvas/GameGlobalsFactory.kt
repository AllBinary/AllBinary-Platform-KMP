
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.canvas



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory

open public class GameGlobalsFactory
            : Object
         {
        

        companion object {
            
    private val instance: GameGlobalsFactory = GameGlobalsFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameGlobalsFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var newCanvas: Boolean = true

    var newDisplaybleTime: Long = Integer.MIN_VALUE.toLong()

    var point: GPoint = PointFactory.getInstance()!!.ZERO_ZERO

}
                
            


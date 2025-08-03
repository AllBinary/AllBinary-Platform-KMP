
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
        package org.allbinary.graphics.threed



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class GLHolder
            : Object
         {
        

    var isCreated: Boolean = true
public constructor        ()
            : super()
        {}


open fun runOnSurfaceCreated(renderer: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var renderer = renderer
}


open fun runOnSurfaceChanged(renderer: Any, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var renderer = renderer


                    var width = width


                    var height = height
}


open fun run(renderer: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var renderer = renderer
}


}
                
            


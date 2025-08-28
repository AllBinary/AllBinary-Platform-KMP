
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




        import java.lang.Object        
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.midlet.MIDlet

open public class SWTJOGLProcessor
            : Object
        
                , Runnable {
        

        companion object {
            
    private val instance: SWTJOGLProcessor = SWTJOGLProcessor()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SWTJOGLProcessor

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var glHolder: GLHolder = object: GLHolder()
                                {
                                override fun run(renderer: Any)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var renderer = renderer
}

                                }
                            

open fun init(display: Any, comp: Any)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var display = display
    //var comp = comp
}


open fun setRenderer(renderer: Any)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var renderer = renderer
}


open fun isJOGL()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun createSurface()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun onSurfaceCreated()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun onSurfaceChanged(event: Any)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var event = event
}


open fun onSurfaceChanged()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun onSurfaceChanged(width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var width = width
    //var height = height
}


open fun addListener()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun addListeners(midlet: MIDlet)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var midlet = midlet
}

override fun run()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun clear()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


}
                
            


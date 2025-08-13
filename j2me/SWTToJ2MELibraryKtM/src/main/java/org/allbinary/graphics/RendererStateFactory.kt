
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
        package org.allbinary.graphics



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class RendererStateFactory
            : Object
         {
        

        companion object {
            
    private val instance: RendererStateFactory = RendererStateFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RendererStateFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var loaded: Boolean = false

    private var surfaceChanged: Boolean = false

open fun setLoaded(loaded: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var loaded = loaded
this.loaded= loaded
}


open fun isLoaded()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return loaded
}


open fun setSurfaceChanged(initialized: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var initialized = initialized
surfaceChanged= initialized
}


open fun isSurfaceChanged()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return surfaceChanged
}


}
                
            


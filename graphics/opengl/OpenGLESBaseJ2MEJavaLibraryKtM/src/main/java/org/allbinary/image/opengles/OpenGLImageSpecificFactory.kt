
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
        package org.allbinary.image.opengles



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class OpenGLImageSpecificFactory
            : Object
         {
        

        companion object {
            
    private val instance: OpenGLImageSpecificFactory = OpenGLImageSpecificFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLImageSpecificFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var imageFactory: OpenGLImageFactory = OpenGLImageFactory.NULL_OPENGL_IMAGE_FACTORY

    var updating: Boolean = false

open fun setImageFactory(imageFactory: OpenGLImageFactory)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageFactory = imageFactory
this.imageFactory= imageFactory
PreLogUtil.put(StringMaker().
                            append(
                            "Selected Image Factory: ")!!.append(StringUtil.getInstance()!!.toString(this.imageFactory))!!.toString(), this, 
                            "setImageFactory")
}


open fun getImageFactory()
        //nullable = true from not(false or (false and true)) = true
: OpenGLImageFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageFactory
}


}
                
            


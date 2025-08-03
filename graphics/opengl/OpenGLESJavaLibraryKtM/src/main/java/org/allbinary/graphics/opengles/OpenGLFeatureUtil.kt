
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
        package org.allbinary.graphics.opengles



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.game.configuration.feature.Features

open public class OpenGLFeatureUtil
            : Object
         {
        

        companion object {


    private val instance: OpenGLFeatureUtil = OpenGLFeatureUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLFeatureUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    private val anyThreed: Boolean
public constructor        ()
            : super()
        {
    var openGLConfiguration: OpenGLConfiguration = OpenGLConfiguration.getInstance()!!
            


    var features: Features = Features.getInstance()!!
            


    var openGLFeatureFactory: OpenGLFeatureFactory = OpenGLFeatureFactory.getInstance()!!
            

this.anyThreed= openGLConfiguration!!.isOpenGL() && (features!!.isFeature(openGLFeatureFactory!!.OPENGL_2D_AND_3D) || features!!.isFeature(openGLFeatureFactory!!.OPENGL_3D))
}


open fun isAnyThreed()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyThreed
}


}
                
            



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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureChoiceGroups
import org.allbinary.util.BasicArrayList

open public class OpenGLOptions
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun init()
        //nullable = true from not(false or (false and true)) = true
{

    var openGLFeatureFactory: OpenGLFeatureFactory = OpenGLFeatureFactory.getInstance()!!


    
                        if(Features.getInstance()!!.isFeature(openGLFeatureFactory!!.OPENGL_OPTIONS))
                        
                                    {
                                    
    var openGLMultipleList: BasicArrayList = BasicArrayList()

openGLMultipleList!!.add(openGLFeatureFactory!!.OPENGL)
GameFeatureChoiceGroups.getMultipleInstance()!!.add("OpenGL (Complete Restart)", openGLMultipleList)

    var openGLVersionSelectorMultipleList: BasicArrayList = BasicArrayList()

openGLVersionSelectorMultipleList!!.add(openGLFeatureFactory!!.OPENGL_AUTO_SELECT)
openGLVersionSelectorMultipleList!!.add(openGLFeatureFactory!!.OPENGL_MINIMUM)
GameFeatureChoiceGroups.getExclusiveInstance()!!.add("OpenGL Version Selector", openGLVersionSelectorMultipleList)

    var openGLImageColorMultipleList: BasicArrayList = BasicArrayList()

openGLImageColorMultipleList!!.add(openGLFeatureFactory!!.IMAGE_COLOR_DEPTH_4444)
openGLImageColorMultipleList!!.add(openGLFeatureFactory!!.IMAGE_COLOR_DEPTH_8888)
GameFeatureChoiceGroups.getExclusiveInstance()!!.add("OpenGL Image Color RGBA", openGLImageColorMultipleList)

                                    }
                                
}


}
                
            



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
        package org.allbinary.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.configuration.feature.Features
import org.allbinary.graphics.opengles.OpenGLFeatureFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps
import org.allbinary.system.Memory

open public class SpecialMessageUtil
            : Object
         {
        

        companion object {
            
    private val SINGLETON: SpecialMessageUtil = SpecialMessageUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SpecialMessageUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun get()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(Memory.getInfo())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(GameStatisticsFactory.getInstance()!!.toString())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(" Option: ")

    
                        if(Features.getInstance()!!.isDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL_AUTO_SELECT))
                        
                                    {
                                    stringBuffer!!.append(OpenGLFeatureFactory.getInstance()!!.OPENGL_AUTO_SELECT.getName())

                                    }
                                
                        else {
                            stringBuffer!!.append(OpenGLFeatureFactory.getInstance()!!.OPENGL_MINIMUM.getName())

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            


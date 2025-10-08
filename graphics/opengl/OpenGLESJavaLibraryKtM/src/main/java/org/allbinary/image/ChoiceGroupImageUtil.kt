
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
        package org.allbinary.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL
import javax.microedition.lcdui.ChoiceGroupImageFactory
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.allbinary.graphics.opengles.OpenGLFeatureFactory
import org.allbinary.game.configuration.feature.Features

open public class ChoiceGroupImageUtil
            : Object
         {
        
companion object {
            
    private val instance: ChoiceGroupImageUtil = ChoiceGroupImageUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ChoiceGroupImageUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun init()
        //nullable = true from not(false or (false and true)) = true
{

    var features: Features = Features.getInstance()!!


    var choiceGroupFactory: ChoiceGroupImageFactory = ChoiceGroupImageFactory.getInstance()!!


    var imageArray: Array<Image?> = choiceGroupFactory!!.getImageArray()!!


    
                        if(features.isDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL))
                        
                                    {
                                    
    var preResourceImageUtil: PreResourceImageUtil = PreResourceImageUtil.getInstance()!!


    var size: Int = imageArray!!.size
                





                        for (index in 0 until size)

        {
imageArray[index]= preResourceImageUtil!!.encapsulate(imageArray[index]!!)
}

choiceGroupFactory!!.init(imageArray)

                                    }
                                
}


    open fun update(gl: GL)
        //nullable = true from not(false or (false and false)) = true
{
var gl = gl

    var features: Features = Features.getInstance()!!


    var choiceGroupFactory: ChoiceGroupImageFactory = ChoiceGroupImageFactory.getInstance()!!


    var imageArray: Array<Image?> = choiceGroupFactory!!.getImageArray()!!


    
                        if(features.isDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL))
                        
                                    {
                                    
    var preResourceImageUtil: PreResourceImageUtil = PreResourceImageUtil.getInstance()!!


    var size: Int = imageArray!!.size
                





                        for (index in 0 until size)

        {
preResourceImageUtil!!.update(gl, imageArray[index]!!)
}


                                    }
                                
choiceGroupFactory!!.init(imageArray)
}


    open fun update(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    var features: Features = Features.getInstance()!!


    var choiceGroupFactory: ChoiceGroupImageFactory = ChoiceGroupImageFactory.getInstance()!!


    var imageArray: Array<Image?> = choiceGroupFactory!!.getImageArray()!!


    
                        if(features.isDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL))
                        
                                    {
                                    
    var preResourceImageUtil: PreResourceImageUtil = PreResourceImageUtil.getInstance()!!


    var size: Int = imageArray!!.size
                





                        for (index in 0 until size)

        {
preResourceImageUtil!!.update(graphics, imageArray[index]!!)
}


                                    }
                                
choiceGroupFactory!!.init(imageArray)
}


}
                
            


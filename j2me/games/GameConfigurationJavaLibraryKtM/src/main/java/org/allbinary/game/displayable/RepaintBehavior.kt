
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
        package org.allbinary.game.displayable




        import java.lang.Object        
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import org.allbinary.game.configuration.feature.Features
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.opengles.OpenGLFeatureFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.thread.NullRunnable

open public class RepaintBehavior
            : Object
         {
        

        companion object {
            
    private val instance: RepaintBehavior = RepaintBehavior()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RepaintBehavior{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

open fun repaint(canvas: Canvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var canvas = canvas
}


    private val NAME: String = "RepaintBehavior"

open fun onChangeRepaint(canvas: Canvas)
        //nullable = true from not(false or (false and false)) = true
{
    //var canvas = canvas

    var features: Features = Features.getInstance()!!


    var openGLFeatureFactory: OpenGLFeatureFactory = OpenGLFeatureFactory.getInstance()!!


    
                        if(features.isFeature(openGLFeatureFactory!!.OPENGL))
                        
                                    {
                                    DisplayInfoSingleton.getInstance()!!.process()

                                    }
                                
                        else {
                            
    var thread: Thread = Thread(object: NullRunnable()
                                {
                                override fun run()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            canvas.repaint()
DisplayInfoSingleton.getInstance()!!.process()
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}

                                }
                            , NAME)

thread.start()

                        }
                            
}


}
                
            


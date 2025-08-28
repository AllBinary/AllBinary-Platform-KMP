
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
        package org.allbinary.media




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle

open public class DisplaysUtil
            : Object
         {
        

        companion object {
            
open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DisplaysUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


    private val instance: DisplaysUtil = DisplaysUtil()

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun getPrimaryScreenSize()
        //nullable = true from not(false or (false and true)) = true
: Rectangle{

    var dimension: Dimension = Toolkit.getDefaultToolkit()!!.getScreenSize()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Rectangle(PointFactory.getInstance()!!.ZERO_ZERO, dimension.width, dimension.height)
}


open fun getScreenSizesAsRectangleArray()
        //nullable = true from not(false or (false and true)) = true
: Array<Rectangle?>{

    var graphicsEnvironment: GraphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment()!!


    var graphicsDeviceArray: Array<GraphicsDevice?> = graphicsEnvironment!!.getScreenDevices()!!


    var graphicsDevice: GraphicsDevice


    var displayMode: DisplayMode


    var rectangle: Rectangle


    var size: Int = graphicsDeviceArray!!.size
                


    var rectangleArray: Array<Rectangle?> = arrayOfNulls(size)





                        for (index in 0 until size)

        {
graphicsDevice= graphicsDeviceArray[index]!!
displayMode= graphicsDevice!!.getDisplayMode()
rectangle= Rectangle(PointFactory.getInstance()!!.ZERO_ZERO, displayMode!!.getWidth(), displayMode!!.getHeight())
rectangleArray[index]= rectangle
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rectangleArray
}


}
                
            


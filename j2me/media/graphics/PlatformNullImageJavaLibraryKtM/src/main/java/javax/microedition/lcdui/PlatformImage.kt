
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
        package javax.microedition.lcdui




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.NullUtil

open public class PlatformImage
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun getImage(graphicsSurface2: Any)
        //nullable = true from not(false or (false and false)) = true
: Any

        Updates for KMP build        
        {
    //var graphicsSurface2 = graphicsSurface2



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullCanvas.NULL_IMAGE
}


open fun getWidth(graphicsSurface2: Any, width: Int)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
    //var graphicsSurface2 = graphicsSurface2
    //var width = width



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return width
}


open fun getHeight(graphicsSurface2: Any, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
    //var graphicsSurface2 = graphicsSurface2
    //var height = height



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return height
}


open fun getWidth(image: Image, width: Int)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
    //var image = image
    //var width = width



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return width
}


open fun getHeight(image: Image, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
    //var image = image
    //var height = height



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return height
}


open fun getGraphics(graphicsSurface: Any, width: Int, height: Int, image: Image)
        //nullable = true from not(false or (false and false)) = true
: javax.microedition.lcdui.Graphics

        Updates for KMP build        
        {
    //var graphicsSurface = graphicsSurface
    //var width = width
    //var height = height
    //var image = image



                            throw RuntimeException()
}


open fun drawImage(image: Image, x: Int, y: Int, anchor: Int, g2: javax.microedition.lcdui.Graphics, g: Any)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var image = image
    //var x = x
    //var y = y
var anchor = anchor
    //var g2 = g2
    //var g = g
}


open fun drawRegion(image: Image, x_src: Int, y_src: Int, width: Int, height: Int, transform: Int, x_dst: Int, y_dst: Int, anchor: Int, g: javax.microedition.lcdui.Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var image = image
    //var x_src = x_src
    //var y_src = y_src
    //var width = width
    //var height = height
    //var transform = transform
    //var x_dst = x_dst
    //var y_dst = y_dst
    //var anchor = anchor
    //var g = g
}


open fun getRGB(argb: IntArray, offset: Int, scanlength: Int, x: Int, y: Int, width: Int, height: Int, image: Image)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var argb = argb
    //var offset = offset
    //var scanlength = scanlength
    //var x = x
    //var y = y
    //var width = width
    //var height = height
    //var image = image
}


open fun setRGB(argb: IntArray, offset: Int, scanlength: Int, x: Int, y: Int, width: Int, height: Int, image: Image)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var argb = argb
    //var offset = offset
    //var scanlength = scanlength
    //var x = x
    //var y = y
    //var width = width
    //var height = height
    //var image = image
}


open fun getData(image: Image)
        //nullable = true from not(false or (false and false)) = true
: IntArray

        Updates for KMP build        
        {
    //var image = image



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_INT_ARRAY
}


}
                
            


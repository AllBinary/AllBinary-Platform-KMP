
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.allbinary.graphics.paint.PaintableInterface

open public class PaintableToImageUtil
            : Object
         {
        

        companion object {


    private val instance: PaintableToImageUtil = PaintableToImageUtil()

                @Throws(Exception::class)
            
open fun getImage(paintableInterface: PaintableInterface, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var paintableInterface = paintableInterface


                    var width = width


                    var height = height

    var image: Image = GameFeatureImageCacheFactory.getInstance()!!.get(instance!!::class.qualifiedName!!, width, height)!!
            


    var graphics: Graphics = image!!.getGraphics()!!
            

paintableInterface!!.paint(graphics)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            


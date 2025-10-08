
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
        package org.allbinary.input.automation.module.game




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage
import org.allbinary.graphics.color.ColorCacheFactory
import org.allbinary.graphics.color.ColorCacheable
import org.allbinary.logic.util.cache.AutomaticCacheInterface

open public class GraphicsAnalysisUtil
            : Object
         {
        
companion object {
            
    private val MAX: Int = 122

                @Throws(Exception::class)
            
    open fun getNominator(bufferedImage: BufferedImage, min_x: Integer, max_x: Integer, y: Integer)
        //nullable = true from not(false or (false and false)) = true
: Double{
var bufferedImage = bufferedImage
var min_x = min_x
var max_x = max_x
var y = y




                        for (index in max_x.toInt()!! downTo min_x.toInt()!!)

        {

    var colorInteger: Integer = Integer(Integer.valueOf(bufferedImage!!.getRGB(index, y.toInt())))!!


    var automaticCacheInterface: AutomaticCacheInterface = ColorCacheFactory.getInstance()!!


    var colorCacheable: ColorCacheable = automaticCacheInterface!!.get(colorInteger) as ColorCacheable


    var color: Color = colorCacheable!!.getColor()!!


    
                        if(color.getRed() < MAX && color.getGreen() < MAX && color.getBlue() < MAX)
                        
                                    {
                                    
                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return index -min_x.toInt()

                        }
                            
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


        }
            private constructor ()
            : super()
        {
}


}
                
            


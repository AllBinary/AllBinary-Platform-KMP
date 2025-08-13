
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
        package org.allbinary.media.graphics.geography.map



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.displayable.canvas.AllBinaryGameCanvas
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory

open public class ColorFromEventUtil
            : Object
         {
        

        companion object {
            
    private val instance: ColorFromEventUtil = ColorFromEventUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ColorFromEventUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val YELLOW: BasicColor = BasicColorFactory.getInstance()!!.YELLOW

    val COLOR_INT: Int = YELLOW.toInt()!!
            

open fun getForegroundColor(gameCanvasInterface: AllBinaryGameCanvas)
        //nullable = true from not(false or (false and false)) = true
: BasicColor{

                    var gameCanvasInterface = gameCanvasInterface

    var color: BasicColor = YELLOW


    var geographicMapCompositeInterface: GeographicMapCompositeInterface = gameCanvasInterface!!.getLayerManager() as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    
                        if(geographicMapInterface != 
                                    null
                                )
                        
                                    {
                                    
    var foregroundBasicColor: BasicColor = geographicMapInterface!!.getForegroundBasicColor()!!
            

color= foregroundBasicColor

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return color
}


}
                
            


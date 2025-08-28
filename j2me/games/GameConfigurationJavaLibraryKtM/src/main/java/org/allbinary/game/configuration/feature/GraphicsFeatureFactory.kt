
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
        package org.allbinary.game.configuration.feature




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil

open public class GraphicsFeatureFactory
            : Object
         {
        

        companion object {
            
    private val instance: GraphicsFeatureFactory = GraphicsFeatureFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GraphicsFeatureFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


    val NONE: GraphicsFeature = GraphicsFeature(StringUtil.getInstance()!!.NULL_STRING)

    val TRANSPARENT_IMAGE_CREATION: GraphicsFeature = GraphicsFeature("Transparent Image Creation")

    val IMAGE_GRAPHICS: GraphicsFeature = GraphicsFeature("Image Graphics")

    val IMAGE_ROTATION_ON_THE_FLY: GraphicsFeature = GraphicsFeature("Image Rotated On The Fly")

    val IMAGE_TO_ARRAY_GRAPHICS: GraphicsFeature = GraphicsFeature("Image To Array Graphics")

    val SPRITE_QUARTER_ROTATION_GRAPHICS: GraphicsFeature = GraphicsFeature("Sprite Quarter Rotation Graphics")

    val SPRITE_FULL_GRAPHICS: GraphicsFeature = GraphicsFeature("Sprite Full Rotation Graphics")

    val VECTOR_GRAPHICS: GraphicsFeature = GraphicsFeature("Vector Graphics")

    val VECTOR_TO_IMAGE_GRAPHICS: GraphicsFeature = GraphicsFeature("Vector To Image Graphics")

}
                
            


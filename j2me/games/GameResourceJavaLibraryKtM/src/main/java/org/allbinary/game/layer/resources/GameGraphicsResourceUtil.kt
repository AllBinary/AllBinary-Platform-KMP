
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
        package org.allbinary.game.layer.resources




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GraphicsFeature
import org.allbinary.game.configuration.feature.GraphicsFeatureFactory
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.graphics.opengles.OpenGLFeatureUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class GameGraphicsResourceUtil
            : Object
         {
        

        companion object {
            
    private val instance: GameGraphicsResourceUtil = GameGraphicsResourceUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameGraphicsResourceUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val SPRITE: String = "_sprite"

    val QUARTER: String = "_quarter"

    private var name: String = StringUtil.getInstance()!!.EMPTY_STRING
public constructor        ()
            : super()
        {
        try {
            this.name= this.getString()
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}


                @Throws(Exception::class)
            
open fun getString()
        //nullable = true from not(false or (false and true)) = true
: String{
    var graphicsFeatureFactory: GraphicsFeatureFactory = GraphicsFeatureFactory.getInstance()!!
            


    var graphicsFeature: GraphicsFeature = graphicsFeatureFactory!!.NONE


    var features: Features = Features.getInstance()!!
            


    
                        if(features.isFeature(graphicsFeatureFactory!!.IMAGE_TO_ARRAY_GRAPHICS))
                        
                                    {
                                    graphicsFeature= graphicsFeatureFactory!!.IMAGE_TO_ARRAY_GRAPHICS

                                    }
                                
                             else 
    
                        if(features.isFeature(graphicsFeatureFactory!!.SPRITE_FULL_GRAPHICS))
                        
                                    {
                                    graphicsFeature= graphicsFeatureFactory!!.SPRITE_FULL_GRAPHICS

                                    }
                                
                             else 
    
                        if(features.isFeature(graphicsFeatureFactory!!.SPRITE_QUARTER_ROTATION_GRAPHICS))
                        
                                    {
                                    graphicsFeature= graphicsFeatureFactory!!.SPRITE_QUARTER_ROTATION_GRAPHICS

                                    }
                                
                             else 
    
                        if(features.isFeature(graphicsFeatureFactory!!.IMAGE_ROTATION_ON_THE_FLY))
                        
                                    {
                                    graphicsFeature= graphicsFeatureFactory!!.IMAGE_ROTATION_ON_THE_FLY

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getString(graphicsFeature)
}


                @Throws(Exception::class)
            
open fun getString(graphicsFeature: GraphicsFeature)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var graphicsFeature = graphicsFeature

    var stringBuffer: StringMaker = StringMaker()


    var graphicsFeatureFactory: GraphicsFeatureFactory = GraphicsFeatureFactory.getInstance()!!
            

stringBuffer!!.delete(0, stringBuffer!!.length())

    var features: Features = Features.getInstance()!!
            


    
                        if(features.isFeature(graphicsFeatureFactory!!.VECTOR_GRAPHICS))
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(features.isFeature(graphicsFeatureFactory!!.IMAGE_GRAPHICS))
                        
                                    {
                                    
    
                        if(graphicsFeature == graphicsFeatureFactory!!.IMAGE_TO_ARRAY_GRAPHICS || graphicsFeature == graphicsFeatureFactory!!.IMAGE_ROTATION_ON_THE_FLY)
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(graphicsFeature == graphicsFeatureFactory!!.SPRITE_FULL_GRAPHICS)
                        
                                    {
                                    stringBuffer!!.append(SPRITE)

                                    }
                                
                             else 
    
                        if(graphicsFeature == graphicsFeatureFactory!!.SPRITE_QUARTER_ROTATION_GRAPHICS)
                        
                                    {
                                    stringBuffer!!.append(QUARTER)
stringBuffer!!.append(SPRITE)

                                    }
                                
                        else {
                            


                            throw Exception("None/Unknown Sub Image Resource Type Specified")

                        }
                            

                                    }
                                
                             else 
    
                        if(OpenGLFeatureUtil.getInstance()!!.isAnyThreed())
                        
                                    {
                                    stringBuffer!!.append(CanvasStrings.getInstance()!!.OBJ_MODEL)

                                    }
                                
                        else {
                            


                            throw Exception("None/Unknown Main Image Resource Type Specified")

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


}
                
            


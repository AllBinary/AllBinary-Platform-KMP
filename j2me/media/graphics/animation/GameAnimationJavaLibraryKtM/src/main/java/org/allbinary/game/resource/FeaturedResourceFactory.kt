
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
        package org.allbinary.game.resource




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureControlledInterface
import org.allbinary.game.configuration.feature.GraphicsFeatureFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class FeaturedResourceFactory
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val list: BasicArrayList = BasicArrayList()
public constructor        ()
            : super()
        {}


    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val ANIMATION_FEATURES: String = "Animation Features: Vector: "

    private val IMAGE_LABEL: String = " Image: "

    private val IMAGE_GRAPHICS_ARRAY: String = "Image Array: "

    private val IMAGE_GRAPHICS_ROTATION: String = "Image Rotate: "

    private val SPRITE_QUARTER: String = " Sprite Quarter: "

    private val SPRITE_FULL: String = " Sprite Full: "

    private val IS_LOADING_LEVEL_LABEL: String = " isLoadingLevel "

    private val IS_FEATURE: String = " isFeature: "

    private val GAME_FEATURE_CONTROLLED: String = "GameFeatureControlledInterface: "

                @Throws(Exception::class)
            
open fun init(level: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var level = level

    var size: Int = this.list.size()!!





                        for (index in 0 until size)


        {
    var featureInterface: GameFeatureControlledInterface = this.list.objectArray[index]!! as GameFeatureControlledInterface


    var isLoadingLevel: Boolean = featureInterface!!.isLoadingLevel(level)!!


    var isFeature: Boolean = featureInterface!!.isFeature()!!

logUtil!!.put(StringMaker().
                            append(this.GAME_FEATURE_CONTROLLED)!!.append(featureInterface!!.toString())!!.append(this.IS_LOADING_LEVEL_LABEL)!!.append(ResourceLoadingLevelFactory.getInstance()!!.getLevelString(level))!!.append(CommonSeps.getInstance()!!.COLON_SEP)!!.append(isLoadingLevel)!!.append(this.IS_FEATURE)!!.append(isFeature)!!.toString(), this, commonStrings!!.INIT)

    
                        if(isLoadingLevel && isFeature)
                        
                                    {
                                    featureInterface!!.init(level)

                                    }
                                
}


    var features: Features = Features.getInstance()!!


    var graphicsFeatureFactory: GraphicsFeatureFactory = GraphicsFeatureFactory.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(ANIMATION_FEATURES)
stringBuffer!!.append(features.isFeature(graphicsFeatureFactory!!.VECTOR_GRAPHICS))
stringBuffer!!.append(IMAGE_LABEL)
stringBuffer!!.append(features.isFeature(graphicsFeatureFactory!!.IMAGE_GRAPHICS))
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.INIT)

    
                        if(features.isFeature(graphicsFeatureFactory!!.IMAGE_GRAPHICS))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(IMAGE_GRAPHICS_ARRAY)
stringBuffer!!.append(features.isFeature(graphicsFeatureFactory!!.IMAGE_TO_ARRAY_GRAPHICS))
stringBuffer!!.append(IMAGE_GRAPHICS_ROTATION)
stringBuffer!!.append(features.isFeature(graphicsFeatureFactory!!.IMAGE_TO_ARRAY_GRAPHICS))
stringBuffer!!.append(SPRITE_QUARTER)
stringBuffer!!.append(features.isFeature(graphicsFeatureFactory!!.SPRITE_QUARTER_ROTATION_GRAPHICS))
stringBuffer!!.append(SPRITE_FULL)
stringBuffer!!.append(features.isFeature(graphicsFeatureFactory!!.SPRITE_FULL_GRAPHICS))
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.INIT)

                                    }
                                
}


open fun clear()
        //nullable = true from not(false or (false and true)) = true
{this.list.clear()
}


open fun add(featureInterface: GameFeatureControlledInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var featureInterface = featureInterface
logUtil!!.put(StringMaker().
                            append(CommonLabels.getInstance()!!.START_LABEL)!!.append(StringUtil.getInstance()!!.toString(featureInterface))!!.toString(), this, commonStrings!!.ADD)
this.list.add(featureInterface)
}


open fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


}
                
            


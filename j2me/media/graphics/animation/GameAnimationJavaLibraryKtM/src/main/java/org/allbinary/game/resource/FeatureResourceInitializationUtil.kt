
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
        
import org.allbinary.animation.FeaturedAnimationInterfaceFactoryInterfaceFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class FeatureResourceInitializationUtil
            : Object
         {
        
companion object {
            
    private val instance: FeatureResourceInitializationUtil = FeatureResourceInitializationUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FeatureResourceInitializationUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

                @Throws(Exception::class)
            
    open fun init(level: Int)
        //nullable = true from not(false or (false and false)) = true
{
var level = level

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.START, this, commonStrings!!.INIT)

    var featuredResourceFactory: FeaturedResourceFactory = FeaturedAnimationInterfaceFactoryInterfaceFactory.getInstance()!!

featuredResourceFactory!!.init(level)
FeaturedResourceRelativeRelationshipFactory.getInstance()!!.init(level)
}


}
                
            


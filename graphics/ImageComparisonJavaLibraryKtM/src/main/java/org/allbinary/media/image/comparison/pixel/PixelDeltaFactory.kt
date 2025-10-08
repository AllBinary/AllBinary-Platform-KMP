
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
        package org.allbinary.media.image.comparison.pixel




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.cache.AutomaticCacheInterface
import org.allbinary.logic.util.cache.CacheInterfaceFactory
import org.allbinary.logic.util.cache.CachePolicyFactory
import org.allbinary.logic.util.cache.CacheTypeFactory
import org.allbinary.media.image.comparison.color.ColorDelta
import org.allbinary.media.image.comparison.color.ColorDeltaFactory
import org.allbinary.string.CommonStrings

open public class PixelDeltaFactory
            : Object
         {
        
companion object {
            
    private var cacheInterface: AutomaticCacheInterface = 
                null
            

                init{

    var logUtil: LogUtil = LogUtil.getInstance()!!


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var STATIC_BLOCK: String = "Static Block"


    var instance: String = "PixelDeltaFactory"


        try {
            logUtil!!.put(commonStrings!!.START, instance, STATIC_BLOCK)
cacheInterface= CacheInterfaceFactory.getInstance(CacheTypeFactory.getInstance()!!.CACHE, CachePolicyFactory.getInstance()!!.THIRTY_MINUTES_TEN_THOUSAND_MAX) as AutomaticCacheInterface
logUtil!!.put(commonStrings!!.END, instance, STATIC_BLOCK)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, instance, STATIC_BLOCK, e)
}

}

                @Throws(Exception::class)
            
    open fun getInstance(x: Int, y: Int, rgb1: Int, rgb2: Int)
        //nullable =  from not(true or (false and false)) = 
: PixelDelta{
var x = x
var y = y
var rgb1 = rgb1
var rgb2 = rgb2

    var point: GPoint = PointFactory.getInstance()!!.getInstance(x, y)!!


    var colorDelta: ColorDelta = ColorDeltaFactory.getInstance(rgb1, rgb2)!!


    var pixelDelta: PixelDelta = cacheInterface!!.get(PixelDelta.getKey(point, colorDelta)) as PixelDelta


    
                        if(pixelDelta == 
                                    null
                                )
                        
                                    {
                                    pixelDelta= PixelDelta(point, colorDelta)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pixelDelta
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor ()
            : super()
        {
}


}
                
            


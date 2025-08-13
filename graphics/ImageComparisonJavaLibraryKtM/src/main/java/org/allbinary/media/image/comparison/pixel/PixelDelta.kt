
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.cache.CacheableInterface
import org.allbinary.media.image.comparison.color.ColorDelta
import org.allbinary.string.CommonSeps

open public class PixelDelta
            : Object
        
                , CacheableInterface {
        

        companion object {
            
open fun getKey(point: GPoint, colorDelta: ColorDelta)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var point = point


                    var colorDelta = colorDelta



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(point.hashCode())!!.append(CommonSeps.getInstance()!!.UNDERSCORE)!!.append(colorDelta!!.getKey()!!.toString())!!.toString()
}


        }
            
    private var point: GPoint

    private var colorDelta: ColorDelta

    private var key: Any
public constructor        (point: GPoint, colorDelta: ColorDelta)
            : super()
        {

                    var point = point


                    var colorDelta = colorDelta
this.setPoint(point)
this.setColorDelta(colorDelta)
this.key= PixelDelta.getKey(this.getPoint(), this.getColorDelta())
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return key
}


open fun getPoint()
        //nullable = true from not(false or (false and true)) = true
: GPoint{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return point
}


open fun setPoint(point: GPoint)
        //nullable = true from not(false or (false and false)) = true
{

                    var point = point
this.point= point
}


open fun getColorDelta()
        //nullable = true from not(false or (false and true)) = true
: ColorDelta{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return colorDelta
}


open fun setColorDelta(colorDelta: ColorDelta)
        //nullable = true from not(false or (false and false)) = true
{

                    var colorDelta = colorDelta
this.colorDelta= colorDelta
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(
                            "PixelDelta: Point: ")!!.append(point.toString())!!.append(CommonSeps.getInstance()!!.SPACE)!!.append(colorDelta!!.toString())!!.toString()
}


}
                
            


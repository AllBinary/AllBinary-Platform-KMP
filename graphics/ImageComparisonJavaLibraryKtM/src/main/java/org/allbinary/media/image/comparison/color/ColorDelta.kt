
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
        package org.allbinary.media.image.comparison.color



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.cache.CacheableInterface
import org.allbinary.string.CommonSeps

open public class ColorDelta
            : Object
        
                , CacheableInterface {
        

        companion object {


open fun getKey(rgb1: Int, rgb2: Int)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var rgb1 = rgb1


                    var rgb2 = rgb2



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(Integer.toString(rgb1))!!.append(CommonSeps.getInstance()!!.UNDERSCORE)!!.append(Integer.toString(rgb2))!!.toString()
}



        }
            
    private var rgb1: Int= 0

    private var rgb2: Int= 0

    private var key: Any
public constructor        (rgb1: Int, rgb2: Int)
            : super()
        {

                    var rgb1 = rgb1


                    var rgb2 = rgb2
this.setRgb1(rgb1)
this.setRgb2(rgb2)
this.key= ColorDelta.getKey(rgb1, rgb2)
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return key
}


open fun getRgb1()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rgb1
}


open fun setRgb1(rgb1: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var rgb1 = rgb1
this.rgb1= rgb1
}


open fun getRgb2()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rgb2
}


open fun setRgb2(rgb2: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var rgb2 = rgb2
this.rgb2= rgb2
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(
                            "ColorDelta: ")!!.append(StringUtil.getInstance()!!.toString(this.getKey()))!!.append(
                            " RGB1: ")!!.append(this.getRgb1())!!.append(
                            " RGB2: ")!!.append(this.getRgb2())!!.toString()
}


}
                
            


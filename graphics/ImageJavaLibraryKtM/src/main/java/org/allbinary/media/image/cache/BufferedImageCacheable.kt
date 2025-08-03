
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
        package org.allbinary.media.image.cache



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.cache.CacheableInterface

open public class BufferedImageCacheable
            : Object
        
                , CacheableInterface {
        

    private var key: BufferedImageInfo

    private var bufferedImage: BufferedImage
public constructor        (key: BufferedImageInfo)
            : super()
        {

                    var key = key
this.key= key
this.setBufferedImage(BufferedImage(key!!.getWidth(), key!!.getHeight(), key!!.getType()))
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.key
}


open fun getBufferedImage()
        //nullable = true from not(false or (false and true)) = true
: BufferedImage{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImage
}


open fun setBufferedImage(bufferedImage: BufferedImage)
        //nullable = true from not(false or (false and false)) = true
{

                    var bufferedImage = bufferedImage
this.bufferedImage= bufferedImage
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this::class.qualifiedName!!)
stringBuffer!!.append(
                            " ")
stringBuffer!!.append(this.getKey()!!.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            


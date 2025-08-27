
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
        package org.allbinary.media.image.io




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import javax.imageio.IIOImage
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.cache.CacheableInterface

open public class IIOImageCacheable
            : Object
        
                , CacheableInterface {
        

    private var key: String

    private var iioImage: IIOImage
public constructor        (key: String)
            : super()
        {

                    var key = key
this.key= key
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.key
}


open fun setBufferedImage(bufferedImage: BufferedImage)
        //nullable = true from not(false or (false and false)) = true
{

                    var bufferedImage = bufferedImage
this.setIioImage(IIOImage(bufferedImage, 
                            null, 
                            null))
}


open fun getIioImage()
        //nullable = true from not(false or (false and true)) = true
: IIOImage{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return iioImage
}


open fun setIioImage(iioImage: IIOImage)
        //nullable = true from not(false or (false and false)) = true
{

                    var iioImage = iioImage
this.iioImage= iioImage
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this::class.toString()!!)
stringBuffer!!.append(" Reusable IIOImage")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            


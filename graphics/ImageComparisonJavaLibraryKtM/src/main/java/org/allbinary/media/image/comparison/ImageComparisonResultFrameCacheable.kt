
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
        package org.allbinary.media.image.comparison




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.cache.CacheableInterface

open public class ImageComparisonResultFrameCacheable
            : Object
        
                , CacheableInterface {
        

    private var frame: Long

    private var imageComparisonResult: ImageComparisonResult
public constructor        (imageComparisonResult: ImageComparisonResult, frame: Long)
            : super()
        {

                    var imageComparisonResult = imageComparisonResult


                    var frame = frame
this.setImageComparisonResult(imageComparisonResult)
this.frame= frame
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.frame
}


open fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return frame
}


open fun setFrame(frame: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var frame = frame
this.frame= frame
}


open fun getImageComparisonResult()
        //nullable = true from not(false or (false and true)) = true
: ImageComparisonResult{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageComparisonResult
}


open fun setImageComparisonResult(imageComparisonResult: ImageComparisonResult)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageComparisonResult = imageComparisonResult
this.imageComparisonResult= imageComparisonResult
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this::class.qualifiedName!!)
stringBuffer!!.append(" Frame: ")
stringBuffer!!.append(this.getFrame())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            


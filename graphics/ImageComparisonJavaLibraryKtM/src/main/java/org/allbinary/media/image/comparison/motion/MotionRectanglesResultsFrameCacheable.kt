
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
        package org.allbinary.media.image.comparison.motion




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.cache.CacheableInterface

open public class MotionRectanglesResultsFrameCacheable
            : Object
        
                , CacheableInterface {
        

    private var motionRectangles: MotionRectangles

    private var frame: Long
public constructor        (motionRectangles: MotionRectangles, frame: Long)
            : super()
        {

                    var motionRectangles = motionRectangles


                    var frame = frame
this.frame= frame
this.setMotionRectangles(motionRectangles)
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.frame
}


open fun getMotionRectangles()
        //nullable = true from not(false or (false and true)) = true
: MotionRectangles{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return motionRectangles
}


open fun setMotionRectangles(motionRectangles: MotionRectangles)
        //nullable = true from not(false or (false and false)) = true
{

                    var motionRectangles = motionRectangles
this.motionRectangles= motionRectangles
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this::class.qualifiedName!!)
stringBuffer!!.append(" Frame: ")
stringBuffer!!.append(this.getKey()!!.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            


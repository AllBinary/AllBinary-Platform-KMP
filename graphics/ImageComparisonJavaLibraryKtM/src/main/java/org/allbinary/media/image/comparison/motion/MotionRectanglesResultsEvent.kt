
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
        
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class MotionRectanglesResultsEvent : AllBinaryEventObject {
        

    private val frame: Long

    private var motionRectangles: MotionRectangles
public constructor        (anyType: Any, frame: Long, motionRectangles: MotionRectangles)                        

                            : super(anyType){

                    var anyType = anyType


                    var frame = frame


                    var motionRectangles = motionRectangles


                            //For kotlin this is before the body of the constructor.
                    
this.frame= frame
this.setMotionRectangles(motionRectangles)
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


open fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return frame
}


}
                
            


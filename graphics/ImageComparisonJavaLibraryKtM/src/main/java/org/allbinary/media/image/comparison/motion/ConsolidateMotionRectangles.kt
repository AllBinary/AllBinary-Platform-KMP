
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.util.Vector
import org.allbinary.logic.communication.log.LogUtil

open public class ConsolidateMotionRectangles : MotionRectangles {
        

        companion object {


    private val NAME: String = "consolidatedMotionRectangles_"


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        (motionRectangles: MotionRectangles)                        

                            : super(NAME, motionRectangles!!.getImageComparisonResult()){

                    var motionRectangles = motionRectangles


                            //For kotlin this is before the body of the constructor.
                    

    var vector: Vector = motionRectangles!!.getVector()!!
            


    var size: Int = vector!!.size!!
            





                        for (index in 0 until size)


        {
    var motionRectangle: MotionRectangle = vector!!.get(index) as MotionRectangle

vector!!.add(motionRectangle!!.clone())
}

consolidateMotionRectangles()
}


open fun consolidateMotionRectangles()
        //nullable = true from not(false or (false and true)) = true
{
    var vector: Vector = this.getVector()!!
            

logUtil!!.put("Start - Size Before: " +vector!!.size, this, 
                            "consolidateMotionRectangleConstraints")

    var removeVector: Vector = Vector()


    var size: Int = vector!!.size!!
            





                        for (index in 0 until size)


        {
    var motionRectangle: MotionRectangle = vector!!.get(index) as MotionRectangle





                        for (i in index +1 until vector!!.size!!)


        {
    var motionRectangle2: MotionRectangle = vector!!.get(i) as MotionRectangle


    var rectangle: Rectangle = motionRectangle!!.getRectangle()!!
            


    var rectangle2: Rectangle = motionRectangle2!!.getRectangle()!!
            


    var x2: Int = rectangle!!.x +rectangle!!.width


    var y2: Int = rectangle!!.y +rectangle!!.height


    var rightX: Int = rectangle2!!.x +rectangle2!!.width


    var bottomY: Int = rectangle2!!.y +rectangle2!!.height


    
                        if(rectangle!!.x <= rectangle2!!.x && rectangle!!.y <= rectangle2!!.y && x2 >= rightX && y2 >= bottomY)
                        
                                    {
                                    removeVector!!.add(motionRectangle2)

                                    }
                                
}

}

this.remove(removeVector)
}


open fun remove(removeVector: Vector)
        //nullable = true from not(false or (false and false)) = true
{

                    var removeVector = removeVector

    var vector: Vector = this.getVector()!!
            


    var size: Int = removeVector!!.size!!
            





                        for (index in 0 until size)


        {vector!!.remove(removeVector!!.get(index))
}

}


}
                
            


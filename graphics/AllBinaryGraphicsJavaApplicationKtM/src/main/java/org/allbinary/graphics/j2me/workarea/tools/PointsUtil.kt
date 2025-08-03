
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
        package org.allbinary.graphics.j2me.workarea.tools



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.VectorRotationGenerator
import org.allbinary.graphics.GPoint
import org.allbinary.math.AngleFactory
import org.allbinary.util.BasicArrayList

open public class PointsUtil
            : Object
         {
        

        companion object {


    private val instance: PointsUtil = PointsUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PointsUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun doTransforms(pointVector: BasicArrayList, angle: Double, fulcrumPoint: GPoint)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var pointVector = pointVector


                    var angle = angle


                    var fulcrumPoint = fulcrumPoint



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return VectorRotationGenerator.getInstance()!!.getInstance(fulcrumPoint!!.getX(), fulcrumPoint!!.getY(), pointVector, AngleFactory.getInstance()!!.getInstance(angle!!.toInt()))
}


}
                
            


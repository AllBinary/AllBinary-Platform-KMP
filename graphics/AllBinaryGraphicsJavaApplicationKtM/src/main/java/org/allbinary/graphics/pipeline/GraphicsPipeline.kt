
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
        package org.allbinary.graphics.pipeline



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.util.BasicArrayList

open public class GraphicsPipeline : BasicGraphicsPipeline {
        
public constructor        (points: BasicArrayList)                        

                            : super(points){

                    var points = points


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun rotateTheta(aTheta: Double)
        //nullable = true from not(false or (false and false)) = true
{

                    var aTheta = aTheta

    var newVector: BasicArrayList = BasicArrayList()


    var size: Int = this.pointBasicArrayList!!.size()!!
            





                        for (index in 0 until size)


        {
    var secondPoint: GPoint = pointBasicArrayList!!.get(index) as GPoint


    var secondX: Double = (secondPoint!!.getX() *Math.cos(aTheta)) -(secondPoint!!.getY() *Math.sin(aTheta))


    var secondY: Double = (secondPoint!!.getX() *Math.sin(aTheta)) +(secondPoint!!.getY() *Math.cos(aTheta))


    var point: GPoint = PointFactory.getInstance()!!.getInstance((secondX.toInt()), (secondY.toInt()))!!
            

newVector!!.add(point)
}

this.pointBasicArrayList= newVector
}


}
                
            


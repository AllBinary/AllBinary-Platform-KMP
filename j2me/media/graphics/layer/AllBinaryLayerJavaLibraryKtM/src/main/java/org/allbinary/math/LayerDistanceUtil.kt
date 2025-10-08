
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
        package org.allbinary.math




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.math.MathUtil

open public class LayerDistanceUtil
            : Object
         {
        
companion object {
            
    private val instance: LayerDistanceUtil = LayerDistanceUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LayerDistanceUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val mathUtil: MathUtil = MathUtil.getInstance()!!

    open fun getDistance(layerInterface: AllBinaryLayer, layerInterface2: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var layerInterface = layerInterface
    //var layerInterface2 = layerInterface2

    var dx: Int = (layerInterface!!.getXP() +layerInterface!!.getHalfWidth()) -(layerInterface2!!.getXP() +layerInterface2!!.getHalfWidth())


    var dy: Int = (layerInterface!!.getYP() +layerInterface!!.getHalfHeight()) -(layerInterface2!!.getYP() +layerInterface2!!.getHalfHeight())




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mathUtil!!.sqrt((dx *dx) +(dy *dy)).toInt()
}


    open fun getDistance3D(layerInterface: AllBinaryLayer, layerInterface2: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var layerInterface = layerInterface
    //var layerInterface2 = layerInterface2

    var dx: Int = (layerInterface!!.getXP() +layerInterface!!.getHalfWidth()) -(layerInterface2!!.getXP() +layerInterface2!!.getHalfWidth())


    var dy: Int = (layerInterface!!.getYP() +layerInterface!!.getHalfHeight()) -(layerInterface2!!.getYP() +layerInterface2!!.getHalfHeight())


    var dz: Int = (layerInterface!!.getZP() +layerInterface!!.getHalfDepth()) -(layerInterface2!!.getZP() +layerInterface2!!.getHalfDepth())




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mathUtil!!.sqrt((dx *dx) +(dy *dy) +(dz *dz)).toInt()
}


    open fun getDistance(layerInterface: AllBinaryLayer, point: GPoint)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var layerInterface = layerInterface
    //var point = point

    var dx: Int = layerInterface!!.getXP() -point.getX()


    var dy: Int = layerInterface!!.getYP() -point.getY()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mathUtil!!.sqrt((dx *dx) +(dy *dy)).toInt()
}


}
                
            


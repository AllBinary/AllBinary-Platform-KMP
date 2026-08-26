
        /* Generated Code Do Not Modify */
        package org.allbinary.animation




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class PGUtil
            : Object
         {
        
companion object {
            
    private val instance: PGUtil = PGUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PGUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun flattenCubicBezier(x0: Int, y0: Int, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, outX: IntArray, outY: IntArray, count: IntArray, maxPoints: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x0 = x0
var y0 = y0
var x1 = x1
var y1 = y1
var x2 = x2
var y2 = y2
var x3 = x3
var y3 = y3
var outX = outX
var outY = outY
var count = count
var maxPoints = maxPoints

    var fixedPoint: FixedPoint = FixedPoint.getInstance()!!


    var steps: Int = 10





                        for (i in 1 until steps)

        {

    var t: Int = fixedPoint!!.div(fixedPoint!!.toFixed(i.toDouble()), fixedPoint!!.toFixed(steps))!!


    var mt: Int = fixedPoint!!.ONE -t


    var mt3: Int = fixedPoint!!.mul(fixedPoint!!.mul(mt, mt), mt)!!


    var mt2t3: Int = 3 *fixedPoint!!.mul(fixedPoint!!.mul(mt, mt), t)


    var mtt23: Int = 3 *fixedPoint!!.mul(fixedPoint!!.mul(mt, t), t)


    var t3: Int = fixedPoint!!.mul(fixedPoint!!.mul(t, t), t)!!


    var x: Int = fixedPoint!!.mul(mt3, x0) +fixedPoint!!.mul(mt2t3, x1) +fixedPoint!!.mul(mtt23, x2) +fixedPoint!!.mul(t3, x3)


    var y: Int = fixedPoint!!.mul(mt3, y0) +fixedPoint!!.mul(mt2t3, y1) +fixedPoint!!.mul(mtt23, y2) +fixedPoint!!.mul(t3, y3)


    
                        if(count[0] < maxPoints)
                        
                                    {
                                    outX[count[0]]= x
outY[count[0]]= y
count[0]++

                                    }
                                
}

}


}
                
            


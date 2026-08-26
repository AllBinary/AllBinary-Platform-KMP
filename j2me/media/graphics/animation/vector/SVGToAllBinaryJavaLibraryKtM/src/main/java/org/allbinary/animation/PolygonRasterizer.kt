
        /* Generated Code Do Not Modify */
        package org.allbinary.animation




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class PolygonRasterizer
            : Object
         {
        
companion object {
            
    private val instance: PolygonRasterizer = PolygonRasterizer()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PolygonRasterizer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun getPixelBuffer(svgPath: String, pathX: IntArray, pathY: IntArray, pixelBuffer: IntArray, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: IntArray{
    //var svgPath = svgPath
    //var pathX = pathX
    //var pathY = pathY
    //var pixelBuffer = pixelBuffer
    //var width = width
    //var height = height

    var pointCount: Int = PathParser.parsePath(svgPath, pathX, pathY, pathX!!.size)!!





                        for (i in 0 until pixelBuffer!!.size)

        {
pixelBuffer[i]= 0xFFFFFFFF
}

PolygonRasterizer.getInstance()!!.fillPolygon(pathX, pathY, pointCount, pixelBuffer, width, height, 0xFFFF00FF)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pixelBuffer
}


    open fun fillPolygon(polyX: IntArray, polyY: IntArray, numPoints: Int, buffer: IntArray, width: Int, height: Int, colorRGB: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var polyX = polyX
    //var polyY = polyY
    //var numPoints = numPoints
    //var buffer = buffer
    //var width = width
    //var height = height
    //var colorRGB = colorRGB

    
                        if(numPoints < 3)
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

    var fixedPoint: FixedPoint = FixedPoint.getInstance()!!


    var x: IntArray = IntArray(numPoints)


    var y: IntArray = IntArray(numPoints)


    var minY: Int = height
var maxY: Int = 0





                        for (i in 0 until numPoints)

        {
x[i]= fixedPoint!!.toInt(polyX[i]!!)
y[i]= fixedPoint!!.toInt(polyY[i]!!)

    
                        if(y[i] < minY)
                        minY= y[i]!!

    
                        if(y[i] > maxY)
                        maxY= y[i]!!
}


    
                        if(minY < 0)
                        minY= 0

    
                        if(maxY >= height)
                        maxY= height -1

    var scanlineX: IntArray = IntArray(numPoints)





                        for (scanY in minY until maxY)

        {

    var intersectCount: Int = 0





                        for (i in 0 until numPoints)

        {

    var next: Int = (i +1) % numPoints


    var x1: Int = x[i]!!
var y1: Int = y[i]!!


    var x2: Int = x[next]!!
var y2: Int = y[next]!!


    
                        if((y1 < scanY && y2 >= scanY) || (y2 < scanY && y1 >= scanY))
                        
                                    {
                                    
    
                        if(y2 != y1)
                        
                                    {
                                    
    var interX: Int = x1 +(scanY -y1) *(x2 -x1) /(y2 -y1)

scanlineX[intersectCount++]= interX

                                    }
                                

                                    }
                                
}





                        for (i in 0 until intersectCount -1)

        {




                        for (j in i +1 until intersectCount)

        {

    
                        if(scanlineX[i] > scanlineX[j])
                        
                                    {
                                    
    var temp: Int = scanlineX[i]!!

scanlineX[i]= scanlineX[j]!!
scanlineX[j]= temp

                                    }
                                
}

}





                        for (i in 0 until intersectCount)

        {

    
                        if(i +1 >= intersectCount)
                        
                                    //Otherwise - thenStmt - BreakStmt


    var startX: Int = scanlineX[i]!!


    var endX: Int = scanlineX[i +1]!!


    
                        if(startX < 0)
                        startX= 0

    
                        if(endX >= width)
                        endX= width -1

    var rowOffset: Int = scanY *width





                        for (pixelX in startX until endX)

        {
buffer[rowOffset +pixelX]= colorRGB
}

}

}

}


    open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{
    //var args = args

    var width: Int = 100


    var height: Int = 100


    var pathX: IntArray = IntArray(200)


    var pathY: IntArray = IntArray(200)


    var pixelBuffer: IntArray = IntArray(width *height)


    var svgPath: String = "M 32.139812,81.554575 14.450128,74.294372 V 50.000034 25.705697 l 17.73231,-7.268329 C 41.935209,14.439788 49.953112,11.168898 50,11.168723 c 0.04689,-1.74e-4 8.064791,3.270238 17.817562,7.267583 l 17.73231,7.267899 V 50 74.295795 l -17.73231,7.2679 c -9.752771,3.997344 -17.789855,7.264116 -17.860188,7.259492 -0.07033,-0.0046 -8.088235,-3.275499 -17.817562,-7.268612 z"

PolygonRasterizer.getInstance()!!.getPixelBuffer(svgPath, pathX, pathY, pixelBuffer, width, height)
}


}
                
            


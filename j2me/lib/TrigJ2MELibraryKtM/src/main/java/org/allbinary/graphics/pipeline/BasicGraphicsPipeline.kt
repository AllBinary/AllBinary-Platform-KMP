
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.math.Angle
import org.allbinary.math.NoDecimalTrigTable
import org.allbinary.util.BasicArrayList

open public class BasicGraphicsPipeline
            : Object
         {
        

    var pointBasicArrayList: BasicArrayList
public constructor        (points: BasicArrayList)
            : super()
        {

                    var points = points
pointBasicArrayList= points
}


open fun setInitMatrix(points: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var points = points
pointBasicArrayList= points
}


open fun createMatrix()
        //nullable = true from not(false or (false and true)) = true
{}


                @Throws(Exception::class)
            
open fun translate(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y

    var newBasicArrayList: BasicArrayList = BasicArrayList()


    var size: Int = pointBasicArrayList!!.size()!!


    var pointFactory: PointFactory = PointFactory.getInstance()!!


    var secondPoint: GPoint





                        for (index in 0 until size)

        {secondPoint= pointBasicArrayList!!.objectArray[index]!! as GPoint

    
                        if(secondPoint!!.getX() != 1000)
                        
                                    {
                                    newBasicArrayList!!.add(pointFactory!!.getInstance(secondPoint!!.getX() +x, secondPoint!!.getY() +y))

                                    }
                                
                        else {
                            newBasicArrayList!!.add(secondPoint)

                        }
                            
}

this.pointBasicArrayList= newBasicArrayList
}


                @Throws(Exception::class)
            
open fun rotate(angle: Angle)
        //nullable = true from not(false or (false and false)) = true
{

                    var angle = angle
this.rotate(angle.getValue().toInt())
}


    private val noDecimalTrigTable: NoDecimalTrigTable = NoDecimalTrigTable.getInstance()!!

                @Throws(Exception::class)
            
open fun rotate(angle: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var angle = angle

    var newBasicArrayList: BasicArrayList = BasicArrayList()


    var secondPoint: GPoint


    var y: Long= 0


    var secondX: Long= 0


    var secondY: Long= 0


    var point: GPoint


    var pointFactory: PointFactory = PointFactory.getInstance()!!


    var size: Int = this.pointBasicArrayList!!.size()!!


    var sin: Long= 0


    var cos: Long= 0





                        for (index in 0 until size)

        {secondPoint= pointBasicArrayList!!.objectArray[index]!! as GPoint

    
                        if(secondPoint!!.getX() != 1000)
                        
                                    {
                                    sin= noDecimalTrigTable!!.sin(angle)
cos= noDecimalTrigTable!!.cos(angle)
y= secondPoint!!.getY() *sin
secondX= (secondPoint!!.getX() *cos) -y
secondY= (secondPoint!!.getX() *sin) +(secondPoint!!.getY() *cos)
point= pointFactory!!.getInstance(secondX.toInt() /10000, secondY.toInt() /10000)
newBasicArrayList!!.add(point)

                                    }
                                
                        else {
                            newBasicArrayList!!.add(secondPoint)

                        }
                            
}

this.pointBasicArrayList= newBasicArrayList
}


                @Throws(Exception::class)
            
open fun mirror(width: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var width = width

    var pointFactory: PointFactory = PointFactory.getInstance()!!


    var halfWidth: Int = (width shr 1)


    var newBasicArrayList: BasicArrayList = BasicArrayList()


    var secondPoint: GPoint


    var newX: Int= 0


    var point: GPoint


    var size: Int = this.pointBasicArrayList!!.size()!!





                        for (index in 0 until size)

        {secondPoint= pointBasicArrayList!!.objectArray[index]!! as GPoint

    
                        if(secondPoint!!.getX() != 1000)
                        
                                    {
                                    newX= 0

    
                        if(secondPoint!!.getX() > halfWidth)
                        
                                    {
                                    newX= halfWidth -(secondPoint!!.getX() -halfWidth)

                                    }
                                
                        else {
                            newX= halfWidth +(halfWidth -secondPoint!!.getX())

                        }
                            
point= pointFactory!!.getInstance(newX, secondPoint!!.getY())
newBasicArrayList!!.add(point)

                                    }
                                
                        else {
                            newBasicArrayList!!.add(secondPoint)

                        }
                            
}

this.pointBasicArrayList= newBasicArrayList
}


open fun getMatrix()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.pointBasicArrayList
}


}
                
            


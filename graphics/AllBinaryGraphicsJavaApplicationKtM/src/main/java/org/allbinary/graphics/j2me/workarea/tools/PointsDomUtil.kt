
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
        
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.j2me.workarea.WorkAreaJPanel
import org.allbinary.graphics.j2me.workarea.canvas.CanvasDom
import org.allbinary.math.PositionStrings
import org.allbinary.util.BasicArrayList
import org.w3c.dom.Node

open public class PointsDomUtil
            : Object
         {
        

        companion object {


    private val instance: PointsDomUtil = PointsDomUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PointsDomUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val LINES: String = "lines"

    val POINTONE: String = "pointOne"

    val POINTTWO: String = "pointTwo"

    private val ROTATEDPOINTONE: String = "rotatedPointOne"

    private val ROTATEDPOINTTWO: String = "rotatedPointTwo"

    private val LINE: String = "line"

                @Throws(Exception::class)
            
open fun toDom(canvasDom: CanvasDom, pointVector: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var canvasDom = canvasDom


                    var pointVector = pointVector

    var tempPointVector: BasicArrayList = PointsUtil.getInstance()!!.doTransforms(pointVector, Double(canvasDom!!.getAngle()), PointFactory.getInstance()!!.getInstance(canvasDom!!.getDimension()!!.getWidth(), canvasDom!!.getDimension()!!.getHeight()))!!
            


    var document: Document = WorkAreaJPanel.getDocument()!!
            


    var linesNode: Node = document!!.createElement(LINES) as Node


    var size2: Int = tempPointVector!!.size()!!
            


    var size: Int = pointVector!!.size()!!
            


    var firstPoint: GPoint = 
                null
            


    var rotatedFirstPoint: GPoint = 
                null
            


    var index: Int = 0


    
                        if(index < size && index < size2)
                        
                                    {
                                    rotatedFirstPoint= tempPointVector!!.get(index) as GPoint
firstPoint= pointVector!!.get(index) as GPoint
index++

                                    }
                                

        while(index < size && index < size2)
        {
    var lineNode: Node = document!!.createElement(LINE) as Node


    var rotatedSecondPoint: GPoint = tempPointVector!!.get(index) as GPoint


    var secondPoint: GPoint = pointVector!!.get(index) as GPoint


    var pointOneNode: Node = this.getPointNode(firstPoint, this.POINTONE)!!
            


    var pointTwoNode: Node = this.getPointNode(secondPoint, this.POINTTWO)!!
            


    var rotatedPointOneNode: Node = this.getPointNode(rotatedFirstPoint, this.ROTATEDPOINTONE)!!
            


    var rotatedPointTwoNode: Node = this.getPointNode(rotatedSecondPoint, this.ROTATEDPOINTTWO)!!
            

lineNode!!.appendChild(pointOneNode)
lineNode!!.appendChild(pointTwoNode)
lineNode!!.appendChild(rotatedPointOneNode)
lineNode!!.appendChild(rotatedPointTwoNode)
firstPoint= secondPoint
rotatedFirstPoint= rotatedSecondPoint
linesNode!!.appendChild(lineNode)
index++
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return linesNode
}


open fun getPointNode(point: GPoint, pointName: String)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var point = point


                    var pointName = pointName

    var document: Document = WorkAreaJPanel.getDocument()!!
            


    var pointNode: Node = document!!.createElement(pointName) as Node


    var xNode: Node = document!!.createElement(PositionStrings.getInstance()!!.X) as Node


    var xTextNode: Node = document!!.createTextNode(Integer.toString(point!!.getX())) as Node

xNode!!.appendChild(xTextNode)

    var yNode: Node = document!!.createElement(PositionStrings.getInstance()!!.Y) as Node


    var yTextNode: Node = document!!.createTextNode(Integer.toString(point!!.getY())) as Node

yNode!!.appendChild(yTextNode)
pointNode!!.appendChild(xNode)
pointNode!!.appendChild(yNode)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pointNode
}


}
                
            


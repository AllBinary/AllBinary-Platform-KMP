
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
        package org.allbinary.graphics.j2me.workarea.canvas



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.animation.vector.VectorCenterGenerator
import org.allbinary.dom.DomHelper
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.j2me.workarea.WorkAreaJPanel
import org.allbinary.graphics.j2me.workarea.tools.GraphicItemFactory
import org.allbinary.graphics.j2me.workarea.tools.GraphicItemInterface
import org.allbinary.graphics.j2me.workarea.tools.LinesGraphicItem
import org.allbinary.util.BasicArrayList
import org.w3c.dom.Node

open public class CanvasDom
            : Object
         {
        

        companion object {


    val FRAME: String = "frame"

    val ROTATE: String = "rotate"

    val SIZE: String = "size"

    val X: String = "X"

    val Y: String = "Y"

    val ZOOM: String = "zoom"

    val GRID: String = "grid"

    val ENABLED: String = "enabled"

    val POSSIBLE: String = "possible"

    val GRAPHICITEMS: String = "graphicItems"

    val REAL_SIZE: String = "realSize"

    val WIDTH: String = "width"

    val HEIGHT: String = "height"


        }
            
    private var graphicItemHashMap: HashMap<Any, Any>

    private var angle: Double

    private var dimension: IntegerDimension

    private val grid: Grid
public constructor        (canvasNode: Node)
            : super()
        {

                    var canvasNode = canvasNode
this.grid= Grid()
this.grid!!.grid= PointFactory.getInstance()!!.getInstance(0, 0)
this.dimension= IntegerDimension(0, 0)

    var name: String = canvasNode!!.getNodeName()!!
            


    
                        if(name!!.compareTo(FRAME) == 0)
                        
                                    {
                                    this.graphicItemHashMap= HashMap<Any, Any>()

    var angleNode: Node = DomHelper.getInstance()!!.searchNodeList(this.ROTATE, canvasNode!!.getChildNodes())!!
            


    var angleTextNode: Node = angleNode!!.getFirstChild()!!
            


    var angle: Double = Double(angleTextNode!!.getNodeValue()).
                            doubleValue()!!
            

this.setAngle(angle)

    var sizeNode: Node = DomHelper.getInstance()!!.searchNodeList(this.SIZE, canvasNode!!.getChildNodes())!!
            


    var xNode: Node = DomHelper.getInstance()!!.searchNodeList(this.X, sizeNode!!.getChildNodes())!!
            


    var xTextNode: Node = xNode!!.getFirstChild()!!
            


    var x: Int = Integer(xTextNode!!.getNodeValue()).
                            toInt()!!
            


    var yNode: Node = DomHelper.getInstance()!!.searchNodeList(this.Y, sizeNode!!.getChildNodes())!!
            


    var yTextNode: Node = yNode!!.getFirstChild()!!
            


    var y: Int = Integer(yTextNode!!.getNodeValue()).
                            toInt()!!
            

this.setWorkArea(x, y)

    var zoomNode: Node = DomHelper.getInstance()!!.searchNodeList(this.ZOOM, canvasNode!!.getChildNodes())!!
            


    var zoomTextNode: Node = zoomNode!!.getFirstChild()!!
            

this.grid!!.setZoom(Integer(zoomTextNode!!.getNodeValue()).
                            toInt())

    var gridNode: Node = DomHelper.getInstance()!!.searchNodeList(this.GRID, canvasNode!!.getChildNodes())!!
            


    var gridSizeNode: Node = DomHelper.getInstance()!!.searchNodeList(this.SIZE, gridNode!!.getChildNodes())!!
            


    var gridXNode: Node = DomHelper.getInstance()!!.searchNodeList(this.X, gridSizeNode!!.getChildNodes())!!
            


    var gridXTextNode: Node = gridXNode!!.getFirstChild()!!
            


    var gridX: Int = Integer(gridXTextNode!!.getNodeValue()).
                            toInt()!!
            


    var gridYNode: Node = DomHelper.getInstance()!!.searchNodeList(this.Y, gridSizeNode!!.getChildNodes())!!
            


    var gridYTextNode: Node = gridYNode!!.getFirstChild()!!
            


    var gridY: Int = Integer(gridYTextNode!!.getNodeValue()).
                            toInt()!!
            

this.setGrid(gridX, gridY)

    var enableNode: Node = DomHelper.getInstance()!!.searchNodeList(this.ENABLED, gridNode!!.getChildNodes())!!
            


    var enableTextNode: Node = enableNode!!.getFirstChild()!!
            

this.grid!!.showGrid(Boolean(enableTextNode!!.getNodeValue()).
                            )

    var possibleNode: Node = DomHelper.getInstance()!!.searchNodeList(this.POSSIBLE, gridNode!!.getChildNodes())!!
            


    var possibleTextNode: Node = possibleNode!!.getFirstChild()!!
            

this.grid!!.isGridPossible= Boolean(possibleTextNode!!.getNodeValue()).
                            

    var graphicItemNodeList: BasicArrayList = DomHelper.getInstance()!!.getChildrenWithoutTextNodes(this.GRAPHICITEMS, canvasNode!!.getChildNodes())!!
            


    
                        if(graphicItemNodeList != 
                                    null
                                )
                        
                                    {
                                    this.graphicItemHashMap= GraphicItemFactory.getInstance()!!.getInstance(graphicItemNodeList)

                                    }
                                

                                    }
                                
                        else {
                            


                            throw Exception("Frame Element Not Found but Found: " +name)

                        }
                            
}

public constructor        (canvasJPanel: CanvasJPanel)
            : super()
        {

                    var canvasJPanel = canvasJPanel
this.angle= canvasJPanel!!.getAngle()
this.graphicItemHashMap= canvasJPanel!!.getGraphicItemHashMap()
this.dimension= canvasJPanel!!.getCanvasDimension()
this.grid= Grid(canvasJPanel!!.getGrid())
this.angle= canvasJPanel!!.getAngle()
}


open fun getAngle()
        //nullable = true from not(false or (false and true)) = true
: Double{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.angle
}


open fun getGraphicItemHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.graphicItemHashMap
}


open fun setAngle(angle: Double)
        //nullable = true from not(false or (false and false)) = true
{

                    var angle = angle
this.angle= angle
}


                @Throws(Exception::class)
            
open fun setWorkArea(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y
this.setDimension(IntegerDimension(x, y))
}


                @Throws(Exception::class)
            
open fun setGrid(gridX: Int, gridY: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var gridX = gridX


                    var gridY = gridY
this.grid!!.grid= PointFactory.getInstance()!!.getInstance(gridX, gridY)
}


open fun getPointNode(point: GPoint, pointName: String)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var point = point


                    var pointName = pointName

    var document: Document = WorkAreaJPanel.getDocument()!!
            


    var pointNode: Node = document!!.createElement(pointName) as Node


    var xNode: Node = document!!.createElement(this.X) as Node


    var xTextNode: Node = document!!.createTextNode(Integer.toString(point!!.getX())) as Node

xNode!!.appendChild(xTextNode)

    var yNode: Node = document!!.createElement(this.Y) as Node


    var yTextNode: Node = document!!.createTextNode(Integer.toString(point!!.getY())) as Node

yNode!!.appendChild(yTextNode)
pointNode!!.appendChild(xNode)
pointNode!!.appendChild(yNode)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pointNode
}


                @Throws(Exception::class)
            
open fun toDom()
        //nullable = true from not(false or (false and true)) = true
: Node{
    var document: Document = WorkAreaJPanel.getDocument()!!
            


    var frameNode: Node = document!!.createElement(this.FRAME) as Node


    var angleNode: Node = document!!.createElement(this.ROTATE) as Node


    var angleTextNode: Node = document!!.createTextNode(Double(this.getAngle()).
                            toString()) as Node

angleNode!!.appendChild(angleTextNode)

    var sizeNode: Node = this.getPointNode(PointFactory.getInstance()!!.getInstance(this.getDimension()!!.getWidth(), this.getDimension()!!.getHeight()), this.SIZE) as Node


    var zoomNode: Node = document!!.createElement(this.ZOOM) as Node


    var zoomTextNode: Node = document!!.createTextNode(Integer(this.getGrid()!!.getZoom()).
                            toString()) as Node

zoomNode!!.appendChild(zoomTextNode)

    var gridNode: Node = document!!.createElement(this.GRID) as Node


    var gridSizeNode: Node = this.getPointNode(this.getGrid()!!.grid, this.SIZE) as Node

gridNode!!.appendChild(gridSizeNode)

    var enableNode: Node = document!!.createElement(this.ENABLED) as Node


    var enableTextNode: Node = document!!.createTextNode(Boolean(this.getGrid()!!.isGridOn()).
                            toString()) as Node

enableNode!!.appendChild(enableTextNode)
gridNode!!.appendChild(enableNode)

    var possibleNode: Node = document!!.createElement(this.POSSIBLE) as Node


    var possibleTextNode: Node = document!!.createTextNode(Boolean(this.getGrid()!!.isGridPossible()).
                            toString()) as Node

possibleNode!!.appendChild(possibleTextNode)
gridNode!!.appendChild(possibleNode)

    var realSizeNode: Node = document!!.createElement(REAL_SIZE) as Node


    var vectorCenterGenerator: VectorCenterGenerator = VectorCenterGenerator()

vectorCenterGenerator!!.calculate(this.getGraphicItemHashMap())

    var widthNode: Node = document!!.createElement(WIDTH) as Node


    var widthTextNode: Node = document!!.createTextNode(Integer.toString(vectorCenterGenerator!!.getWidth())) as Node

widthNode!!.appendChild(widthTextNode)
realSizeNode!!.appendChild(widthNode)

    var heightNode: Node = document!!.createElement(HEIGHT) as Node


    var heightTextNode: Node = document!!.createTextNode(Integer.toString(vectorCenterGenerator!!.getHeight())) as Node

heightNode!!.appendChild(heightTextNode)
realSizeNode!!.appendChild(heightNode)
frameNode!!.appendChild(angleNode)
frameNode!!.appendChild(sizeNode)
frameNode!!.appendChild(zoomNode)
frameNode!!.appendChild(gridNode)
frameNode!!.appendChild(realSizeNode)

    var graphicItemNode: Node = document!!.createElement(this.GRAPHICITEMS) as Node


    var graphicItemArray: Array<Any?> = this.getGraphicItemHashMap()!!.keySet()!!.toArray()!!
            


    var size: Int = graphicItemArray!!.size
                





                        for (index in 0 until size)


        {
    var item: GraphicItemInterface = this.graphicItemHashMap!!.get(graphicItemArray[index]!!) as GraphicItemInterface


    
                        if(item!!.getName() == LinesGraphicItem.getStaticName())
                        
                                    {
                                    
    
                        if(item!!.isValid())
                        
                                    {
                                    graphicItemNode!!.appendChild(item!!.toDom(this))

                                    }
                                

                                    }
                                
}

frameNode!!.appendChild(graphicItemNode)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return frameNode
}


open fun getDimension()
        //nullable = true from not(false or (false and true)) = true
: IntegerDimension{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dimension
}


open fun setDimension(dimension: IntegerDimension)
        //nullable = true from not(false or (false and false)) = true
{

                    var dimension = dimension
this.dimension= dimension
}


open fun getGrid()
        //nullable = true from not(false or (false and true)) = true
: Grid{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return grid
}


}
                
            


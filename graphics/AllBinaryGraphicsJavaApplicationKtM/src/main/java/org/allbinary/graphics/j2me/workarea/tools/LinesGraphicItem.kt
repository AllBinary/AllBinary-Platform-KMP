
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
        
import java.awt
import java.util.Vector
import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.MutableTreeNode
import org.allbinary.dom.DomHelper
import org.allbinary.game.input.GameInputStrings
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.j2me.StatusFactory
import org.allbinary.graphics.j2me.workarea.canvas.CanvasDom
import org.allbinary.graphics.j2me.workarea.canvas.IntegerDimension
import org.allbinary.graphics.pipeline.BasicGraphicsPipeline
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.math.PositionStrings
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class LinesGraphicItem
            : Object
        
                , GraphicItemInterface {
        

        companion object {


    private val RECT: String = "rect"

    private val ARC: String = "arc"

    private val STRING: String = "string"

    private val CHAR: String = "char"

    private val IMAGE: String = "image"

    private var item: Int = 0

    private val NAME: String = "Line Tool"

open fun getStaticName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NAME
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val gameInputStrings: GameInputStrings = GameInputStrings.getInstance()!!
            

    private var treeNode: DefaultMutableTreeNode

    private var pointTreeNodeVector: Vector

    private var currentMousePoint: GPoint

    private var fulcrumPoint: GPoint

    private var active: Boolean = false

    private var theta: Double = 0

    private var color: Color = Color(BasicColorFactory.getInstance()!!.WHITE.toInt())

    private var points: Points
public constructor        ()
            : super()
        {this.points= Points()

        try {
            init()
this.active= true
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}

public constructor        (linesNode: Node)
            : super()
        {

                    var linesNode = linesNode
this.points= Points()
init()
this.active= false

    var lineNodes: BasicArrayList = DomHelper.getInstance()!!.getWithoutTextNodes(linesNode!!.getChildNodes())!!
            


    var numberOfLines: Int = lineNodes!!.size()!!
            





                        for (index in 0 until numberOfLines)


        {
    var lineNode: Node = lineNodes!!.get(index) as Node


    var pointNodes: BasicArrayList = DomHelper.getInstance()!!.getWithoutTextNodes(lineNode!!.getChildNodes())!!
            


    var pointOneNode: Node = DomHelper.getInstance()!!.searchNodeList(PointsDomUtil.getInstance()!!.POINTONE, pointNodes)!!
            

this.addPoint(pointOneNode!!.getChildNodes())

    
                        if(index == numberOfLines -1)
                        
                                    {
                                    
    var pointTwoNode: Node = DomHelper.getInstance()!!.searchNodeList(PointsDomUtil.getInstance()!!.POINTTWO, pointNodes)!!
            

this.addPoint(pointTwoNode!!.getChildNodes())

                                    }
                                
}


    
                        if(numberOfLines == 0)
                        
                                    {
                                    


                            throw Exception(
                            "Lines node does not contain a line")

                                    }
                                
}


                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true
{this.treeNode= DefaultMutableTreeNode(PointsDomUtil.getInstance()!!.LINES +item)
item++
this.points!!.init()
this.pointTreeNodeVector= Vector()
this.fulcrumPoint= PointFactory.getInstance()!!.getInstance(0, 0)
}


                @Throws(Exception::class)
            
open fun translate(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y
StatusFactory.getInstance()!!.setStatus("Translating: " +this.points!!.getPoints())

    var basicGraphicsPipeline: BasicGraphicsPipeline = BasicGraphicsPipeline(this.points!!.getPoints())

basicGraphicsPipeline!!.translate(x, y)
this.points= Points()
this.points!!.addPoints(basicGraphicsPipeline!!.getMatrix())
}


open fun setRotate(theta: Double)
        //nullable = true from not(false or (false and false)) = true
{

                    var theta = theta

        while(theta > 2 *Math.PI)
        {theta -= 2 *Math.PI
}


        while(theta < 0)
        {theta += 2 *Math.PI
}

this.theta= theta
}


open fun addRotate(theta: Double)
        //nullable = true from not(false or (false and false)) = true
{

                    var theta = theta
this.setRotate(this.theta +theta)
}


open fun setAngle(angle: Double)
        //nullable = true from not(false or (false and false)) = true
{

                    var angle = angle
this.setRotate(Math.toRadians(angle))
}


open fun addAngle(angle: Double)
        //nullable = true from not(false or (false and false)) = true
{

                    var angle = angle
this.setRotate(this.theta +Math.toRadians(angle))
}


open fun getTreeNode()
        //nullable = true from not(false or (false and true)) = true
: MutableTreeNode{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.treeNode as MutableTreeNode
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NAME
}


                @Throws(Exception::class)
            
open fun addPoint(pointNodes: NodeList)
        //nullable = true from not(false or (false and false)) = true
{

                    var pointNodes = pointNodes

    var list: BasicArrayList = DomHelper.getInstance()!!.getWithoutTextNodes(pointNodes)!!
            


    var xNode: Node = DomHelper.getInstance()!!.searchNodeList(PositionStrings.getInstance()!!.X, list)!!
            


    var xTextNode: Node = xNode!!.getFirstChild()!!
            


    var xInteger: Integer = Integer(xTextNode!!.getNodeValue())


    var yNode: Node = DomHelper.getInstance()!!.searchNodeList(PositionStrings.getInstance()!!.Y, list)!!
            


    var yTextNode: Node = yNode!!.getFirstChild()!!
            


    var yInteger: Integer = Integer(yTextNode!!.getNodeValue())


    var point: GPoint = PointFactory.getInstance()!!.getInstance(xInteger!!.toInt()yInteger!!.toInt())!!
            

this.addPoint(point)
}


open fun addPoint(point: GPoint)
        //nullable = true from not(false or (false and false)) = true
{

                    var point = point
this.points!!.getPoints()!!.add(point)
logUtil!!.put(point!!.toString(), this, 
                            "addPoint")
this.pointTreeNodeVector!!.add(DefaultMutableTreeNode(point!!.toString()))
this.treeNode!!.add(this.pointTreeNodeVector!!.get(this.pointTreeNodeVector!!.size -1) as DefaultMutableTreeNode)
}


open fun removePoint()
        //nullable = true from not(false or (false and true)) = true
: GPoint{
    var point: GPoint = 
                null
            


    
                        if(this.points!!.getSize() > 0)
                        
                                    {
                                    
    var lastPoint: Int = this.points!!.getSize() -1

point= this.points!!.getPoints()!!.remove(lastPoint) as GPoint

    var index: Int = this.pointTreeNodeVector!!.size -1


    
                        if(index > 0)
                        
                                    {
                                    this.treeNode!!.remove(this.pointTreeNodeVector!!.get(index) as DefaultMutableTreeNode)
this.pointTreeNodeVector!!.remove(index)

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return point
}


open fun isActive()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.active
}


open fun deactivate()
        //nullable = true from not(false or (false and true)) = true
{this.active= false
}


open fun activate()
        //nullable = true from not(false or (false and true)) = true
{this.active= true
}


                @Throws(Exception::class)
            
open fun duplicatePoints(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var list = list

    var size: Int = list!!.size()!!
            





                        for (index in 0 until size)


        {
    var point: GPoint = list!!.get(index) as GPoint


    
                        if(point != 
                                    null
                                )
                        
                                    {
                                    this.points!!.getPoints()!!.add(PointFactory.getInstance()!!.getInstance(point!!.getX(), point!!.getY()))
this.pointTreeNodeVector!!.add(DefaultMutableTreeNode(point!!.toString()))
this.treeNode!!.add(this.pointTreeNodeVector!!.get(this.pointTreeNodeVector!!.size -1) as DefaultMutableTreeNode)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun duplicate()
        //nullable = true from not(false or (false and true)) = true
: GraphicItemInterface{
    var linesGraphicItem: LinesGraphicItem = LinesGraphicItem()

linesGraphicItem!!.duplicatePoints(this.points!!.getPoints())
linesGraphicItem!!.deactivate()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return linesGraphicItem
}


open fun getAngle()
        //nullable = true from not(false or (false and true)) = true
: Double{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Math.toDegrees(this.theta)
}


open fun setFulcrumPoint(point: GPoint)
        //nullable = true from not(false or (false and false)) = true
{

                    var point = point
this.fulcrumPoint= point
}


open fun paint(g: Graphics, canvasAngle: Double, dimension: IntegerDimension, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var g = g


                    var canvasAngle = canvasAngle


                    var dimension = dimension


                    var x = x


                    var y = y

        try {
            
    var graphics: Graphics2D = g as Graphics2D

graphics!!.setColor(getColor())
graphics!!.setStroke(BasicStroke(x))

    
                        if(this.isActive() && this.currentMousePoint != 
                                    null
                                )
                        
                                    {
                                    this.points!!.getPoints()!!.add(this.currentMousePoint)

                                    }
                                

    var tempPointVector: BasicArrayList = PointsUtil.getInstance()!!.doTransforms(this.points!!.getPoints(), canvasAngle, PointFactory.getInstance()!!.getInstance(dimension!!.getWidth(), dimension!!.getHeight()))!!
            


    
                        if(this.isActive() && this.currentMousePoint != 
                                    null
                                )
                        
                                    {
                                    this.currentMousePoint= this.points!!.getPoints()!!.remove(this.points!!.getSize() -1) as GPoint

                                    }
                                

    var size: Int = tempPointVector!!.size()!!
            


    var firstPoint: GPoint = 
                null
            


    
                        if(size > 0)
                        
                                    {
                                    firstPoint= tempPointVector!!.get(0) as GPoint

                                    }
                                




                        for (index in 1 until size)


        {
    var secondPoint: GPoint = tempPointVector!!.get(index) as GPoint

graphics!!.drawLine((firstPoint!!.getX() *x) -(x /4), (firstPoint!!.getY() *y) -(y /4), (secondPoint!!.getX() *x) -(x /4), (secondPoint!!.getY() *y) -(y /4))
firstPoint= secondPoint
}

} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "mouseMoved", e)
}

}


                @Throws(Exception::class)
            
open fun toDom(canvasDom: CanvasDom)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var canvasDom = canvasDom



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PointsDomUtil.getInstance()!!.toDom(canvasDom, this.points!!.getPoints())
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.points!!.isValid()
}


open fun getPointsInterface()
        //nullable = true from not(false or (false and true)) = true
: Points{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.points
}


open fun setPointsInterface(points: Points)
        //nullable = true from not(false or (false and false)) = true
{

                    var points = points
this.points= points
}


open fun getColor()
        //nullable = true from not(false or (false and true)) = true
: Color{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return color
}


open fun setColor(color: Color)
        //nullable = true from not(false or (false and false)) = true
{

                    var color = color
this.color= color
}


open fun mouseClicked(mouseEvent: MouseEvent, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var mouseEvent = mouseEvent


                    var x = x


                    var y = y

        try {
            
    var mousePoint: GPoint = PointFactory.getInstance()!!.getInstance(mouseEvent!!.getPoint()!!.x, mouseEvent!!.getPoint()!!.y)!!
            


    
                        if((mouseEvent!!.getModifiers() and mouseEvent!!.BUTTON1_MASK) == mouseEvent!!.BUTTON1_MASK)
                        
                                    {
                                    
    var point: GPoint = PointFactory.getInstance()!!.getInstance(mousePoint!!.getX() /x, mousePoint!!.getY() /y)!!
            

StatusFactory.getInstance()!!.setStatus("Line Point Added: " +point!!.toString())
this.addPoint(point)

                                    }
                                
                             else 
    
                        if((mouseEvent!!.getModifiers() and mouseEvent!!.BUTTON3_MASK) == mouseEvent!!.BUTTON3_MASK)
                        
                                    {
                                    StatusFactory.getInstance()!!.setStatus(
                            "Line Point Removed")
this.removePoint()

                                    }
                                
this.currentMousePoint= mousePoint
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "mouseMoved", e)
}

}


open fun mouseEntered(mouseEvent: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var mouseEvent = mouseEvent
}


open fun mouseExited(mouseEvent: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var mouseEvent = mouseEvent
}


open fun mousePressed(mouseEvent: MouseEvent, xPixelsPerCell: Int, yPixelsPerCell: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var mouseEvent = mouseEvent


                    var xPixelsPerCell = xPixelsPerCell


                    var yPixelsPerCell = yPixelsPerCell
}


open fun mouseReleased(mouseEvent: MouseEvent, xPixelsPerCell: Int, yPixelsPerCell: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var mouseEvent = mouseEvent


                    var xPixelsPerCell = xPixelsPerCell


                    var yPixelsPerCell = yPixelsPerCell
}


open fun mouseDragged(mouseEvent: MouseEvent, xPixelsPerCell: Int, yPixelsPerCell: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var mouseEvent = mouseEvent


                    var xPixelsPerCell = xPixelsPerCell


                    var yPixelsPerCell = yPixelsPerCell
}


open fun mouseMoved(mouseEvent: MouseEvent, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var mouseEvent = mouseEvent


                    var x = x


                    var y = y

        try {
            
    var mousePoint: GPoint = PointFactory.getInstance()!!.getInstance(mouseEvent!!.getPoint()!!.x, mouseEvent!!.getPoint()!!.y)!!
            


    var point: GPoint = PointFactory.getInstance()!!.getInstance(mousePoint!!.getX() /x, mousePoint!!.getY() /y)!!
            

this.currentMousePoint= point
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "mouseMoved", e)
}

}


open fun keyPressed(keyEvent: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyEvent = keyEvent

        try {
            
    var keyCode: Int = keyEvent!!.getKeyCode()!!
            


    
                        if(keyCode == keyEvent!!.VK_ESCAPE)
                        
                                    {
                                    StatusFactory.getInstance()!!.setStatus(
                            "Deactivated")
this.deactivate()

                                    }
                                
                             else 
    
                        if(keyCode == keyEvent!!.VK_UP)
                        
                                    {
                                    this.translate(0,  -1)

                                    }
                                
                             else 
    
                        if(keyCode == keyEvent!!.VK_DOWN)
                        
                                    {
                                    this.translate(0, 1)

                                    }
                                
                             else 
    
                        if(keyCode == keyEvent!!.VK_LEFT)
                        
                                    {
                                    this.translate( -1, 0)

                                    }
                                
                             else 
    
                        if(keyCode == keyEvent!!.VK_RIGHT)
                        
                                    {
                                    this.translate(1, 0)

                                    }
                                
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, gameInputStrings!!.KEY_PRESSED, e)
}

}


open fun keyReleased(keyEvent: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyEvent = keyEvent
}


open fun keyTyped(keyEvent: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyEvent = keyEvent
}


}
                
            



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
import java.util.HashMap
import javax.swing.tree.MutableTreeNode
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.j2me.workarea.canvas.CanvasDom
import org.allbinary.graphics.j2me.workarea.canvas.CanvasJPanel
import org.allbinary.graphics.j2me.workarea.canvas.IntegerDimension
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.math.RectangleCollisionPointUtil
import org.allbinary.string.CommonStrings
import org.w3c.dom.Node

open public class SelectionTool
            : Object
        
                , GraphicItemInterface {
        

        companion object {


    private val NAME: String = "Selection Tool"

open fun getStaticName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NAME
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val canvasJPanel: CanvasJPanel

    private var active: Boolean = true
public constructor        (canvasJPanel: CanvasJPanel)
            : super()
        {

                    var canvasJPanel = canvasJPanel
this.canvasJPanel= canvasJPanel
}


open fun setColor(color: Color)
        //nullable = true from not(false or (false and false)) = true
{

                    var color = color
}


open fun getTreeNode()
        //nullable = true from not(false or (false and true)) = true
: MutableTreeNode{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun getPointsInterface()
        //nullable = true from not(false or (false and true)) = true
: Points{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun setPointsInterface(points: Points)
        //nullable = true from not(false or (false and false)) = true
{

                    var points = points
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun isActive()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.active
}


open fun deactivate()
        //nullable = true from not(false or (false and true)) = true
{}


open fun activate()
        //nullable = true from not(false or (false and true)) = true
{}


open fun setFulcrumPoint(point: GPoint)
        //nullable = true from not(false or (false and false)) = true
{

                    var point = point
}


                @Throws(Exception::class)
            
open fun translate(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y
}


open fun setRotate(theta: Double)
        //nullable = true from not(false or (false and false)) = true
{

                    var theta = theta
}


open fun addRotate(theta: Double)
        //nullable = true from not(false or (false and false)) = true
{

                    var theta = theta
}


open fun setAngle(angle: Double)
        //nullable = true from not(false or (false and false)) = true
{

                    var angle = angle
}


open fun addAngle(angle: Double)
        //nullable = true from not(false or (false and false)) = true
{

                    var angle = angle
}


open fun getAngle()
        //nullable = true from not(false or (false and true)) = true
: Double{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


    private var controlIdDown: Boolean= false

open fun makeSelection()
        //nullable = true from not(false or (false and true)) = true
{
    var xRect: Int = this.getXRect()!!
            


    var xRect2: Int = Math.abs(this.endPoint!!.getX() -this.startPoint!!.getX()) +xRect


    var yRect: Int = this.getYRect()!!
            


    var yRect2: Int = Math.abs(this.endPoint!!.getY() -this.startPoint!!.getY()) +yRect


    var hashMap: HashMap<Any, Any> = this.canvasJPanel!!.getGraphicItemHashMap()!!
            


    var graphicItemArray: Array<Any?> = hashMap!!.keySet()!!.toArray()!!
            


    var size: Int = graphicItemArray!!.size
                





                        for (index in 0 until size)


        {
    var item: GraphicItemInterface = hashMap!!.get(graphicItemArray[index]!!) as GraphicItemInterface


    
                        if(item!!.getName() == LinesGraphicItem.getStaticName())
                        
                                    {
                                    
    
                        if(RectangleCollisionPointUtil.allPointsInside(xRect, yRect, xRect2, yRect2, item!!.getPointsInterface()!!.getPoints(), this.canvasJPanel!!.getXPixelsPerWorkAreaPixel(), this.canvasJPanel!!.getYPixelsPerWorkAreaPixel()))
                        
                                    {
                                    item!!.setColor(Color.YELLOW)
item!!.activate()

                                    }
                                
                             else 
    
                        if(!this.controlIdDown)
                        
                                    {
                                    item!!.setColor(Color.WHITE)
item!!.deactivate()

                                    }
                                

                                    }
                                
}

}


    private val rectColor: Color = Color(BasicColorFactory.getInstance()!!.RED.toInt())

open fun getXRect()
        //nullable = true from not(false or (false and true)) = true
: Int{
    var xDiff: Int = this.endPoint!!.getX() -this.startPoint!!.getX()


    var xRect: Int = this.startPoint!!.getX()!!
            


    
                        if(xDiff < 0)
                        
                                    {
                                    xRect= this.endPoint!!.getX()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return xRect
}


open fun getYRect()
        //nullable = true from not(false or (false and true)) = true
: Int{
    var yDiff: Int = this.endPoint!!.getY() -this.startPoint!!.getY()


    var yRect: Int = this.startPoint!!.getY()!!
            


    
                        if(yDiff < 0)
                        
                                    {
                                    yRect= this.endPoint!!.getY()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return yRect
}


open fun paint(g: Graphics, canvasAngle: Double, dimension: IntegerDimension, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var g = g


                    var canvasAngle = canvasAngle


                    var dimension = dimension


                    var x = x


                    var y = y
g!!.setColor(this.rectColor)

    var xRect: Int = this.getXRect()!!
            


    var width: Int = Math.abs(this.endPoint!!.getX() -this.startPoint!!.getX())!!
            


    var yRect: Int = this.getYRect()!!
            


    var height: Int = Math.abs(this.endPoint!!.getY() -this.startPoint!!.getY())!!
            

g!!.drawRect(xRect, yRect, width, height)
}


                @Throws(Exception::class)
            
open fun toDom(canvasDom: CanvasDom)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var canvasDom = canvasDom



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun removePoint()
        //nullable = true from not(false or (false and true)) = true
: GPoint{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun addPoint(point: GPoint)
        //nullable = true from not(false or (false and false)) = true
{

                    var point = point
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NAME
}


    private var startPoint: GPoint = PointFactory.getInstance()!!.ZERO_ZERO

    private var endPoint: GPoint = startPoint

open fun mouseClicked(mouseEvent: MouseEvent, xPixelsPerCell: Int, yPixelsPerCell: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var mouseEvent = mouseEvent


                    var xPixelsPerCell = xPixelsPerCell


                    var yPixelsPerCell = yPixelsPerCell
}


open fun mouseMoved(mouseEvent: MouseEvent, xPixelsPerCell: Int, yPixelsPerCell: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var mouseEvent = mouseEvent


                    var xPixelsPerCell = xPixelsPerCell


                    var yPixelsPerCell = yPixelsPerCell
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
logUtil!!.put(commonStrings!!.START, this, MouseStrings.getInstance()!!.MOUSE_PRESSED)
this.startPoint= PointFactory.getInstance()!!.getInstance(mouseEvent!!.getX(), mouseEvent!!.getY())
this.endPoint= this.startPoint
}


open fun mouseReleased(mouseEvent: MouseEvent, xPixelsPerCell: Int, yPixelsPerCell: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var mouseEvent = mouseEvent


                    var xPixelsPerCell = xPixelsPerCell


                    var yPixelsPerCell = yPixelsPerCell
logUtil!!.put(commonStrings!!.START, this, MouseStrings.getInstance()!!.MOUSE_RELEASED)
this.endPoint= PointFactory.getInstance()!!.getInstance(mouseEvent!!.getX(), mouseEvent!!.getY())
this.active= false
this.makeSelection()
}


open fun mouseDragged(mouseEvent: MouseEvent, xPixelsPerCell: Int, yPixelsPerCell: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var mouseEvent = mouseEvent


                    var xPixelsPerCell = xPixelsPerCell


                    var yPixelsPerCell = yPixelsPerCell
this.endPoint= PointFactory.getInstance()!!.getInstance(mouseEvent!!.getX(), mouseEvent!!.getY())
}


open fun keyPressed(keyEvent: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyEvent = keyEvent

    
                        if(keyEvent!!.getKeyCode() == keyEvent!!.VK_CONTROL)
                        
                                    {
                                    this.controlIdDown= true

                                    }
                                
}


open fun keyReleased(keyEvent: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyEvent = keyEvent

    
                        if(keyEvent!!.getKeyCode() == keyEvent!!.VK_CONTROL)
                        
                                    {
                                    this.controlIdDown= false

                                    }
                                
}


open fun keyTyped(keyEvent: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyEvent = keyEvent
}


                @Throws(Exception::class)
            
open fun duplicate()
        //nullable = true from not(false or (false and true)) = true
: GraphicItemInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            


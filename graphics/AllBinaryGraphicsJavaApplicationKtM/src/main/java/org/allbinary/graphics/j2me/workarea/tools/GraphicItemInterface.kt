
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import javax.swing.tree.MutableTreeNode
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.j2me.workarea.canvas.CanvasDom
import org.allbinary.graphics.j2me.workarea.canvas.IntegerDimension
import org.w3c.dom.Node

interface GraphicItemInterface {
        

    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun setColor(color: Color)
        //nullable = true from not(false or (false and false)) = true


    open fun getTreeNode()
        //nullable = true from not(false or (false and true)) = true
: MutableTreeNode

    open fun getPointsInterface()
        //nullable = true from not(false or (false and true)) = true
: Points

    open fun setPointsInterface(points: Points)
        //nullable = true from not(false or (false and false)) = true


    open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun isActive()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun deactivate()
        //nullable = true from not(false or (false and true)) = true


    open fun activate()
        //nullable = true from not(false or (false and true)) = true


    open fun setFulcrumPoint(point: GPoint)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun translate(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


    open fun setRotate(theta: Double)
        //nullable = true from not(false or (false and false)) = true


    open fun addRotate(theta: Double)
        //nullable = true from not(false or (false and false)) = true


    open fun setAngle(angle: Double)
        //nullable = true from not(false or (false and false)) = true


    open fun addAngle(angle: Double)
        //nullable = true from not(false or (false and false)) = true


    open fun getAngle()
        //nullable = true from not(false or (false and true)) = true
: Double

    open fun paint(g: Graphics, canvasAngle: Double, dimension: IntegerDimension, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun toDom(canvasDom: CanvasDom)
        //nullable = true from not(false or (false and false)) = true
: Node

    open fun removePoint()
        //nullable = true from not(false or (false and true)) = true
: GPoint

    open fun addPoint(point: GPoint)
        //nullable = true from not(false or (false and false)) = true


    open fun mouseClicked(mouseEvent: java.awt.event.MouseEvent, xPixelsPerCell: Int, yPixelsPerCell: Int)
        //nullable = true from not(false or (false and false)) = true


    open fun mouseEntered(mouseEvent: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true


    open fun mouseExited(mouseEvent: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true


    open fun mousePressed(mouseEvent: java.awt.event.MouseEvent, xPixelsPerCell: Int, yPixelsPerCell: Int)
        //nullable = true from not(false or (false and false)) = true


    open fun mouseReleased(mouseEvent: java.awt.event.MouseEvent, xPixelsPerCell: Int, yPixelsPerCell: Int)
        //nullable = true from not(false or (false and false)) = true


    open fun mouseDragged(mouseEvent: java.awt.event.MouseEvent, xPixelsPerCell: Int, yPixelsPerCell: Int)
        //nullable = true from not(false or (false and false)) = true


    open fun mouseMoved(mouseEvent: java.awt.event.MouseEvent, xPixelsPerCell: Int, yPixelsPerCell: Int)
        //nullable = true from not(false or (false and false)) = true


    open fun keyPressed(keyEvent: java.awt.event.KeyEvent)
        //nullable = true from not(false or (false and false)) = true


    open fun keyReleased(keyEvent: java.awt.event.KeyEvent)
        //nullable = true from not(false or (false and false)) = true


    open fun keyTyped(keyEvent: java.awt.event.KeyEvent)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun duplicate()
        //nullable = true from not(false or (false and true)) = true
: GraphicItemInterface

}
                
            


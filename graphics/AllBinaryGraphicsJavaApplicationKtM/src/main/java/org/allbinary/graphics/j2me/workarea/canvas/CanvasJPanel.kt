
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




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.util.HashMap
import java.util.Vector
import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.MutableTreeNode
import org.allbinary.animation.VectorExplosionGenerator
import org.allbinary.animation.VectorMirrorGenerator
import org.allbinary.animation.vector.VectorCenterGenerator
import org.allbinary.game.input.GameInputStrings
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.j2me.GraphicsException
import org.allbinary.graphics.j2me.StatusFactory
import org.allbinary.graphics.j2me.workarea.WorkAreaJTreeJPanel
import org.allbinary.graphics.j2me.workarea.tools.GraphicItemFactory
import org.allbinary.graphics.j2me.workarea.tools.GraphicItemInterface
import org.allbinary.graphics.j2me.workarea.tools.LinesGraphicItem
import org.allbinary.graphics.j2me.workarea.tools.MouseStrings
import org.allbinary.graphics.j2me.workarea.tools.Points
import org.allbinary.graphics.j2me.workarea.tools.ToolFactory
import org.allbinary.graphics.j2me.workarea.tools.event.MyGraphicItemEvent
import org.allbinary.graphics.j2me.workarea.tools.event.MyGraphicItemEventListener
import org.allbinary.graphics.j2me.workarea.tools.event.MyGraphicItemEventService
import org.allbinary.graphics.pipeline.RandomRotationFactory
import org.allbinary.log.LOGGING
import org.allbinary.logic.communication.log.GuiLog
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.math.PositionStrings
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList
import org.w3c.dom.Node

open public class CanvasJPanel : javax.swing.JPanel
                , java.awt.event.MouseListener
                , java.awt.event.MouseMotionListener
                , java.awt.event.KeyListener
                , MyGraphicItemEventListener {
        
companion object {
            
    private var frame: Int = 0

    private val gridColor: Color = Color(BasicColorFactory.getInstance()!!.WHITE.toInt())

    private val backgroundColor: Color = Color(BasicColorFactory.getInstance()!!.CLEAR_COLOR.toInt())

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val guiLog: GuiLog = GuiLog.getInstance()!!

    private val gameInputStrings: GameInputStrings = GameInputStrings.getInstance()!!

    private var selectedTool: GraphicItemInterface = 
                null
            

    private var graphicItemHashMap: HashMap<Any, Any>

    private var canvasDimension: IntegerDimension

    private var angle: Double = 0

    private var canvasTreeNode: DefaultMutableTreeNode

    private var frameLabel: CanvasTreeLabel

    private var workAreaJTreeJPanel: WorkAreaJTreeJPanel

    private val grid: Grid
public constructor (workAreaJTreeJPanel: WorkAreaJTreeJPanel, dimension: Dimension, x: Int, y: Int){
var workAreaJTreeJPanel = workAreaJTreeJPanel
var dimension = dimension
var x = x
var y = y
this.grid= Grid()

        try {
            this.workAreaJTreeJPanel= workAreaJTreeJPanel
initComponents()
initMyComponents()
this.setSize(dimension)
this.setCanvasSize(x, y)
} catch(e: Exception)
            {

    
                        if(LOGGING.contains(LOGGING.GRAPHICSCREATION))
                        
                                    {
                                    guiLog!!.put("Constructor Error", this, "contructor", e)

                                    }
                                
}

}

public constructor (workAreaJTreeJPanel: WorkAreaJTreeJPanel, dimension: Dimension, canvasDom: CanvasDom){
var workAreaJTreeJPanel = workAreaJTreeJPanel
var dimension = dimension
var canvasDom = canvasDom
this.grid= Grid(canvasDom!!.getGrid())

        try {
            this.workAreaJTreeJPanel= workAreaJTreeJPanel
initComponents()
initMyComponents()
this.setSize(dimension)
this.setCanvasSize(canvasDom!!.getDimension()!!.getWidth(), canvasDom!!.getDimension()!!.getHeight())
this.graphicItemHashMap= canvasDom!!.getGraphicItemHashMap()

    var graphicItemArray: Array<Any?> = graphicItemHashMap!!.keys.toTypedArray()!!


    var size: Int = graphicItemArray!!.size
                





                        for (index in 0 until size)

        {

    var graphicItemTreeNode: MutableTreeNode = graphicItemArray[index]!! as MutableTreeNode

canvasTreeNode!!.add(graphicItemTreeNode)
}

this.repaint()
this.setAngle(canvasDom!!.getAngle())
this.workAreaJTreeJPanel!!.updateTree()
this.workAreaJTreeJPanel!!.expand()
this.workAreaJTreeJPanel!!.repaint()
} catch(e: Exception)
            {

    
                        if(LOGGING.contains(LOGGING.GRAPHICSCREATION))
                        
                                    {
                                    guiLog!!.put("Constructor Error", this, "contructor", e)

                                    }
                                
}

}


                @Throws(Exception::class)
            
    open fun initMyComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.frameLabel= CanvasTreeLabel("FrameLabel" +Integer(frame).
                            toString())
this.canvasTreeNode= DefaultMutableTreeNode(this.frameLabel)
frame++
this.workAreaJTreeJPanel!!.add(this.getTreeNode())
this.graphicItemHashMap= HashMap<Any, Any>()
this.grid.grid= PointFactory.getInstance()!!.getInstance(0, 0)
this.setCanvasDimension(IntegerDimension(0, 0))
this.selectedTool= 
                                        null
                                    
this.addKeyListener(this)
this.addMouseListener(this)
this.addMouseMotionListener(this)
MyGraphicItemEventService.addListener(this)
}


    open fun getTreeNode()
        //nullable = true from not(false or (false and true)) = true
: MutableTreeNode{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.canvasTreeNode
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
setLayout(java.awt.GridLayout(1, 1))
}


                @Throws(Exception::class)
            
    open fun setCanvasSize(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
var x = x
var y = y
this.grid.isGridPossible= true

    
                        if(x <= 0)
                        
                                    {
                                    this.grid.isGridPossible= false



                            throw GraphicsException("X Size Error: " +x, this, "setWorkAreaSize")

                                    }
                                

    
                        if(y <= 0)
                        
                                    {
                                    this.grid.isGridPossible= false



                            throw GraphicsException("Y Size Error: " +y, this, "setWorkAreaSize")

                                    }
                                

    
                        if(x > this.getWidth())
                        
                                    {
                                    this.grid.isGridPossible= false

                                    }
                                

    
                        if(y > this.getHeight())
                        
                                    {
                                    this.grid.isGridPossible= false

                                    }
                                
this.setCanvasDimension(IntegerDimension(x, y))
this.grid.isChanged= true
}


    open fun setGrid(point: GPoint)
        //nullable = true from not(false or (false and false)) = true
{
var point = point
this.setGrid(point.getX(), point.getY())
}


    open fun setGrid(xSize: Int, ySize: Int)
        //nullable = true from not(false or (false and false)) = true
{
var xSize = xSize
var ySize = ySize

        try {
            
    
                        if(xSize >= getCanvasDimension()!!.getWidth() /2 || xSize < 1)
                        
                                    {
                                    


                            throw GraphicsException("X Size Error: " +xSize +" WorkArea X: " +getCanvasDimension()!!.getWidth(), this, "setGrid")

                                    }
                                

    
                        if(ySize >= getCanvasDimension()!!.getHeight() /2 || ySize < 1)
                        
                                    {
                                    


                            throw GraphicsException("Y Size Error" +ySize +" WorkArea Y: " +getCanvasDimension()!!.getHeight(), this, "setGrid")

                                    }
                                
this.grid.grid= PointFactory.getInstance()!!.getInstance(xSize, ySize)
this.grid.isChanged= true
} catch(e: Exception)
            {
}

}


                @Throws(Exception::class)
            
    open fun setDefaultGrid()
        //nullable = true from not(false or (false and true)) = true
{

    var xPixelsPerWorkAreaPixel: Int = this.getWidth() /this.getCanvasDimension()!!.getWidth()


    var yPixelsPerWorkAreaPixel: Int = this.getHeight() /this.getCanvasDimension()!!.getHeight()

this.setGrid(1, 1)
this.grid.isChanged= true
}


    open fun getAngle()
        //nullable = true from not(false or (false and true)) = true
: Double{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.angle
}


    open fun setAngle(angle: Double)
        //nullable = true from not(false or (false and false)) = true
{
var angle = angle
this.angle= angle
}


    open fun addAngle(angle: Double)
        //nullable = true from not(false or (false and false)) = true
{
var angle = angle
this.setAngle(this.angle +angle)
}


    open fun explodeAll()
        //nullable = true from not(false or (false and true)) = true
{

    var newPoints: Vector = Vector()


    var graphicItemArray: Array<Any?> = this.getGraphicItemHashMap()!!.keys.toTypedArray()!!


    var size: Int = graphicItemArray!!.size
                





                        for (index in 0 until size)

        {

    var graphicItemNode: MutableTreeNode = graphicItemArray[index]!! as MutableTreeNode


    var graphicItem: GraphicItemInterface = this.getGraphicItemHashMap()!!.get(graphicItemNode as Object) as GraphicItemInterface


    
                        if(graphicItem!!.getName() == LinesGraphicItem.getStaticName())
                        
                                    {
                                    
        while(graphicItem!!.getPointsInterface()!!.getSize() > 2)
        {

    var newGraphicItem: GraphicItemInterface = GraphicItemFactory.getInstance()!!.getInstance(graphicItem!!.getName())!!.getInstance(this)!!


    var pointOne: GPoint = GPoint(graphicItem!!.removePoint())


    var pointTwo: GPoint = GPoint(graphicItem!!.removePoint())


    
                        if(pointOne != 
                                    null
                                 && pointTwo != 
                                    null
                                )
                        
                                    {
                                    newGraphicItem!!.addPoint(pointOne)
newGraphicItem!!.addPoint(pointTwo)

                                    }
                                
newPoints!!.add(newGraphicItem)
}


                                    }
                                
}


    var size2: Int = newPoints!!.size!!





                        for (index in 0 until size2)

        {

    var newGraphicItem: GraphicItemInterface = newPoints!!.get(index) as GraphicItemInterface

canvasTreeNode!!.add(newGraphicItem!!.getTreeNode())
this.getGraphicItemHashMap()!!.put(newGraphicItem!!.getTreeNode(), newGraphicItem)
}

this.workAreaJTreeJPanel!!.updateTree()
this.workAreaJTreeJPanel!!.expand()
this.workAreaJTreeJPanel!!.repaint()
}


                @Throws(Exception::class)
            
    open fun explode(howMuch: Int, explosionType: Int)
        //nullable = true from not(false or (false and false)) = true
{
var howMuch = howMuch
var explosionType = explosionType

    var graphicItemArray: Array<Any?> = this.getGraphicItemHashMap()!!.keys.toTypedArray()!!


    var size: Int = graphicItemArray!!.size
                





                        for (index in 0 until size)

        {

    var item: GraphicItemInterface = this.getGraphicItemHashMap()!!.get(graphicItemArray[index]!!) as GraphicItemInterface


    var basicArrayList: BasicArrayList = VectorExplosionGenerator.getInstance()!!.getInstance(item.getPointsInterface()!!.getPoints(), howMuch, VectorExplosionGenerator.getInstance()!!.RANDOM)!!


    var newPoints: Points = Points()

newPoints!!.addPoints(basicArrayList)
item.setPointsInterface(newPoints)

    var angleDelta: Int = RandomRotationFactory.getInstance()!!.getNextRandomAngle(howMuch)!!

item.setAngle(angleDelta)
}

this.repaint()
}


                @Throws(Exception::class)
            
    open fun mirror()
        //nullable = true from not(false or (false and true)) = true
{

    var width: Int = this.getCanvasDimension()!!.getWidth()!!


    var graphicItemArray: Array<Any?> = this.getGraphicItemHashMap()!!.keys.toTypedArray()!!


    var size: Int = graphicItemArray!!.size
                





                        for (index in 0 until size)

        {

    var item: GraphicItemInterface = this.getGraphicItemHashMap()!!.get(graphicItemArray[index]!!) as GraphicItemInterface


    var basicArrayList: BasicArrayList = VectorMirrorGenerator.getInstance()!!.getInstance(item.getPointsInterface()!!.getPoints(), width)!!


    var newPoints: Points = Points()

newPoints!!.addPoints(basicArrayList)
item.setPointsInterface(newPoints)
}

this.repaint()
}


                @Throws(Exception::class)
            
    open fun center()
        //nullable = true from not(false or (false and true)) = true
{
VectorCenterGenerator().
                            transform(this.getGraphicItemHashMap())
this.repaint()
}


    open fun setNewTool()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            StatusFactory.getInstance()!!.setStatus("Tool Selected")
this.selectedTool= ToolFactory.getInstance()!!.getSelectedToolFactory()!!.getInstance(this)

    var newNode: MutableTreeNode = this.selectedTool!!.getTreeNode()!!

this.getGraphicItemHashMap()!!.put(newNode, this.selectedTool)
this.canvasTreeNode!!.add(newNode)

    
                        if(this.getSelectedTool() == 
                                    null
                                )
                        
                                    {
                                    


                            throw GraphicsException("No Tool Selected", this, "setSelectedTool")

                                    }
                                
} catch(e: Exception)
            {
}

}


                @Throws(Exception::class)
            
    open fun duplicateGraphicItem(graphicItem: GraphicItemInterface)
        //nullable = true from not(false or (false and false)) = true
{
var graphicItem = graphicItem

    var graphicItemClone: GraphicItemInterface = graphicItem!!.duplicate()!!

this.getGraphicItemHashMap()!!.put(graphicItemClone!!.getTreeNode(), graphicItemClone)
canvasTreeNode!!.add(graphicItemClone!!.getTreeNode())
}


                @Throws(Exception::class)
            
    open fun duplicateGraphicItemHashMap(hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{
var hashMap = hashMap

    var mutableTreeNodeArray: Array<Any?> = hashMap!!.keys.toTypedArray()!!


    var size: Int = mutableTreeNodeArray!!.size
                





                        for (index in 0 until size)

        {

    var treeNode: MutableTreeNode = mutableTreeNodeArray[index]!! as MutableTreeNode


    var graphicItem: GraphicItemInterface = hashMap!!.get(treeNode as Object) as GraphicItemInterface

this.duplicateGraphicItem(graphicItem)
}

}


    open fun getGraphicItemHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.graphicItemHashMap
}


    open fun getXPixelsPerWorkAreaPixel()
        //nullable = true from not(false or (false and true)) = true
: Int{

    var x: Int = this.getGrid()!!.grid.getX() *(this.getWidth() -10) /this.getCanvasDimension()!!.getWidth()


    
                        if(this.getGrid()!!.getZoom() == 1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 1

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return x

                        }
                            
}


    open fun getYPixelsPerWorkAreaPixel()
        //nullable = true from not(false or (false and true)) = true
: Int{

    var y: Int = this.getGrid()!!.grid.getY() *(this.getHeight() -10) /this.getCanvasDimension()!!.getHeight()


    
                        if(this.getGrid()!!.getZoom() == 1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 1

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return y

                        }
                            
}


    open fun getSelectedTool()
        //nullable = true from not(false or (false and true)) = true
: GraphicItemInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.selectedTool
}


    open fun drawItems(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    var angleDouble: Double = Double(this.angle)


    var graphicItemArray: Array<Any?> = this.getGraphicItemHashMap()!!.keys.toTypedArray()!!


    var size: Int = graphicItemArray!!.size
                





                        for (index in 0 until size)

        {

    var item: GraphicItemInterface = this.getGraphicItemHashMap()!!.get(graphicItemArray[index]!!) as GraphicItemInterface

item.paint(graphics, angleDouble, this.getCanvasDimension(), this.getXPixelsPerWorkAreaPixel(), this.getYPixelsPerWorkAreaPixel())
}

}


    open fun drawGrid(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    var xAdjust: Int = (this.getWidth() % this.getXPixelsPerWorkAreaPixel()) /2


    var yAdjust: Int = (this.getHeight() % this.getYPixelsPerWorkAreaPixel()) /2


    var xLeft: Int = xAdjust


    var yUpper: Int = yAdjust


    var xRight: Int = this.getWidth() -xAdjust


    var yLower: Int = this.getHeight() -yAdjust

graphics.setColor(gridColor)




                        for (value in yAdjust until this.getHeight() -yAdjust)

        {
graphics.drawLine(xLeft, value, xRight, value)
}





                        for (value in xAdjust until this.getWidth() -xAdjust)

        {
graphics.drawLine(value, yUpper, value, yLower)
}

}


    open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

        try {
            
    
                        if(this.getGrid()!!.isChanged)
                        
                                    {
                                    graphics.setColor(backgroundColor)
graphics.fillRect(0, 0, getWidth(), getHeight())

    
                        if(this.getGrid()!!.getZoom() > 2 && this.getGrid()!!.isGridOn && this.getGrid()!!.isGridPossible)
                        
                                    {
                                    this.setDefaultGrid()
this.drawGrid(graphics)

                                    }
                                
this.drawItems(graphics)
graphics.drawString(Double(this.getAngle()).
                            toString(), this.getWidth() -75, this.getHeight() -15)
this.grid.isChanged= false

                                    }
                                
} catch(e: Exception)
            {
}

}


    open fun repaint()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.grid != 
                                    null
                                )
                        
                                    {
                                    this.grid.isChanged= true

                                    }
                                
super.repaint()
}


                @Throws(Exception::class)
            
    open fun toDom()
        //nullable = true from not(false or (false and true)) = true
: Node{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CanvasDom(this).
                            toDom()
}


    open fun changed()
        //nullable = true from not(false or (false and true)) = true
{
this.grid.isChanged= true
}


    open fun mouseClicked(mouseEvent: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var mouseEvent = mouseEvent
StatusFactory.getInstance()!!.setStatusNoLog(MouseStrings.getInstance()!!.MOUSE_CLICKED_LABEL +this.logMouseEvent(mouseEvent))

    
                        if(this.getSelectedTool() != 
                                    null
                                 && this.getSelectedTool()!!.isActive())
                        
                                    {
                                    
    var graphicItem: GraphicItemInterface = this.getSelectedTool()!!

graphicItem!!.mouseClicked(mouseEvent, this.getXPixelsPerWorkAreaPixel(), this.getYPixelsPerWorkAreaPixel())

                                    }
                                
                        else {
                            this.setNewTool()

    var graphicItem: GraphicItemInterface = this.getSelectedTool()!!


    
                        if(graphicItem != 
                                    null
                                )
                        
                                    {
                                    graphicItem!!.mouseClicked(mouseEvent, this.getXPixelsPerWorkAreaPixel(), this.getYPixelsPerWorkAreaPixel())

                                    }
                                

                        }
                            
this.grid.isChanged= true
this.repaint()
this.workAreaJTreeJPanel!!.updateTree()
this.workAreaJTreeJPanel!!.expand()
this.workAreaJTreeJPanel!!.repaint()
}


    open fun mouseEntered(mouseEvent: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var mouseEvent = mouseEvent
StatusFactory.getInstance()!!.setStatusNoLog(this.logMouseEvent(mouseEvent))
}


    open fun mouseExited(mouseEvent: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var mouseEvent = mouseEvent
StatusFactory.getInstance()!!.setStatusNoLog(this.logMouseEvent(mouseEvent))
}


    open fun mousePressed(mouseEvent: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var mouseEvent = mouseEvent
StatusFactory.getInstance()!!.setStatusNoLog(MouseStrings.getInstance()!!.MOUSE_PRESSED_LABEL +this.logMouseEvent(mouseEvent))

    
                        if(this.getSelectedTool() != 
                                    null
                                )
                        
                                    {
                                    
    var graphicItem: GraphicItemInterface = this.getSelectedTool()!!

graphicItem!!.mousePressed(mouseEvent, this.getXPixelsPerWorkAreaPixel(), this.getYPixelsPerWorkAreaPixel())

                                    }
                                
this.requestFocus()
this.grid.isChanged= true
this.repaint()
}


    open fun mouseReleased(mouseEvent: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var mouseEvent = mouseEvent
StatusFactory.getInstance()!!.setStatusNoLog(MouseStrings.getInstance()!!.MOUSE_RELEASED_LABEL +this.logMouseEvent(mouseEvent))

    var graphicItem: GraphicItemInterface = this.getSelectedTool()!!


    
                        if(graphicItem != 
                                    null
                                )
                        
                                    {
                                    graphicItem!!.mouseReleased(mouseEvent, this.getXPixelsPerWorkAreaPixel(), this.getYPixelsPerWorkAreaPixel())

                                    }
                                
this.requestFocus()
this.grid.isChanged= true
this.repaint()
}


    open fun mouseDragged(mouseEvent: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var mouseEvent = mouseEvent
StatusFactory.getInstance()!!.setStatusNoLog(MouseStrings.getInstance()!!.MOUSE_DRAGGED_LABEL +this.logMouseEvent(mouseEvent))

    var graphicItem: GraphicItemInterface = this.getSelectedTool()!!


    
                        if(graphicItem != 
                                    null
                                )
                        
                                    {
                                    graphicItem!!.mouseDragged(mouseEvent, this.getXPixelsPerWorkAreaPixel(), this.getYPixelsPerWorkAreaPixel())

                                    }
                                
this.requestFocus()
this.grid.isChanged= true
this.repaint()
}


    open fun mouseMoved(mouseEvent: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var mouseEvent = mouseEvent
StatusFactory.getInstance()!!.setStatusNoLog(MouseStrings.getInstance()!!.MOUSE_MOVED_LABEL +this.logMouseEvent(mouseEvent))

    
                        if(this.getSelectedTool() != 
                                    null
                                 && this.getSelectedTool()!!.isActive())
                        
                                    {
                                    
    var graphicItem: GraphicItemInterface = this.getSelectedTool()!!

graphicItem!!.mouseMoved(mouseEvent, this.getXPixelsPerWorkAreaPixel(), this.getYPixelsPerWorkAreaPixel())

                                    }
                                
this.requestFocus()
this.grid.isChanged= true
this.repaint()
}


    open fun logMouseEvent(mouseEvent: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
: String{
var mouseEvent = mouseEvent

    var stringBuffer: StringBuilder = StringBuilder()

stringBuffer!!.append(PositionStrings.getInstance()!!.X_LABEL)
stringBuffer!!.append(mouseEvent!!.getX() /this.getXPixelsPerWorkAreaPixel())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(PositionStrings.getInstance()!!.Y_LABEL)
stringBuffer!!.append(mouseEvent!!.getY() /this.getYPixelsPerWorkAreaPixel())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


    open fun keyPressed(keyEvent: java.awt.event.KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
var keyEvent = keyEvent
StatusFactory.getInstance()!!.setStatus("Key Pressed")

        try {
            
    var graphicItemArray: Array<Any?> = this.graphicItemHashMap!!.keys.toTypedArray()!!


    var size: Int = graphicItemArray!!.size
                





                        for (index in 0 until size)

        {

    var graphicItemInterface: GraphicItemInterface = this.graphicItemHashMap!!.get(graphicItemArray[index]!!) as GraphicItemInterface


    var keyCode: Int = keyEvent!!.getKeyCode()!!


    
                        if(graphicItemInterface!!.isActive())
                        
                                    {
                                    
    
                        if(keyCode == keyEvent!!.VK_UP)
                        
                                    {
                                    graphicItemInterface!!.translate(0,  -1)

                                    }
                                
                             else 
    
                        if(keyCode == keyEvent!!.VK_DOWN)
                        
                                    {
                                    graphicItemInterface!!.translate(0, 1)

                                    }
                                
                             else 
    
                        if(keyCode == keyEvent!!.VK_LEFT)
                        
                                    {
                                    graphicItemInterface!!.translate( -1, 0)

                                    }
                                
                             else 
    
                        if(keyCode == keyEvent!!.VK_RIGHT)
                        
                                    {
                                    graphicItemInterface!!.translate(1, 0)

                                    }
                                

                                    }
                                
}

} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, gameInputStrings!!.KEY_PRESSED, e)
}


    
                        if(this.getSelectedTool() != 
                                    null
                                 && this.getSelectedTool()!!.isActive())
                        
                                    {
                                    StatusFactory.getInstance()!!.setStatus("Key Pressed for Tool")

    var graphicItem: GraphicItemInterface = this.getSelectedTool()!!

graphicItem!!.keyPressed(keyEvent)

                                    }
                                
                        else {
                            this.setNewTool()

                        }
                            
this.grid.isChanged= true
this.repaint()
}


    open fun keyReleased(keyEvent: java.awt.event.KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
var keyEvent = keyEvent
}


    open fun keyTyped(keyEvent: java.awt.event.KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
var keyEvent = keyEvent
}


    open fun delete(evt: MyGraphicItemEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.getGraphicItemHashMap()!!.remove(evt.getTreeNode())
this.workAreaJTreeJPanel!!.updateTree()
this.workAreaJTreeJPanel!!.expand()
this.workAreaJTreeJPanel!!.repaint()
}


    open fun deselect(evt: MyGraphicItemEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

    var graphicItemInterface: GraphicItemInterface = this.getGraphicItemHashMap()!!.get(evt.getTreeNode()) as GraphicItemInterface


    
                        if(graphicItemInterface != 
                                    null
                                )
                        
                                    {
                                    graphicItemInterface!!.setColor(Color.WHITE)
graphicItemInterface!!.deactivate()
this.workAreaJTreeJPanel!!.repaint()

                                    }
                                
}


    open fun highlight(evt: MyGraphicItemEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

    var graphicItemInterface: GraphicItemInterface = this.getGraphicItemHashMap()!!.get(evt.getTreeNode()) as GraphicItemInterface


    
                        if(graphicItemInterface != 
                                    null
                                )
                        
                                    {
                                    graphicItemInterface!!.setColor(Color.YELLOW)
graphicItemInterface!!.activate()
this.workAreaJTreeJPanel!!.repaint()

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun duplicate()
        //nullable = true from not(false or (false and true)) = true
: CanvasJPanel{

    var newCanvasJPanel: CanvasJPanel = CanvasJPanel(this.workAreaJTreeJPanel, this.getSize(), this.getCanvasDimension()!!.getWidth(), this.getCanvasDimension()!!.getHeight())

newCanvasJPanel!!.setGrid(this.getGrid()!!.getGrid())
newCanvasJPanel!!.setAngle(this.getAngle())
newCanvasJPanel!!.duplicateGraphicItemHashMap(this.getGraphicItemHashMap())
this.workAreaJTreeJPanel!!.updateTree()
this.workAreaJTreeJPanel!!.expand()
this.workAreaJTreeJPanel!!.repaint()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newCanvasJPanel
}


                @Throws(Exception::class)
            
    open fun duplicate(event: MyGraphicItemEvent)
        //nullable = true from not(false or (false and false)) = true
{
var event = event

    var treeNode: MutableTreeNode = event.getTreeNode()!!


    var graphicItem: GraphicItemInterface = this.getGraphicItemHashMap()!!.get(treeNode as Object) as GraphicItemInterface


    
                        if(graphicItem != 
                                    null
                                )
                        
                                    {
                                    this.duplicateGraphicItem(graphicItem)
this.workAreaJTreeJPanel!!.updateTree()
this.workAreaJTreeJPanel!!.expand()
this.workAreaJTreeJPanel!!.repaint()

                                    }
                                
}


    open fun rotate(event: MyGraphicItemEvent)
        //nullable = true from not(false or (false and false)) = true
{
var event = event

    var treeNode: MutableTreeNode = event.getTreeNode()!!


    var graphicItem: GraphicItemInterface = this.getGraphicItemHashMap()!!.get(treeNode as Object) as GraphicItemInterface


    
                        if(graphicItem != 
                                    null
                                )
                        
                                    {
                                    graphicItem!!.addAngle(event.getAngle())

                                    }
                                
}


    open fun getCanvasDimension()
        //nullable = true from not(false or (false and true)) = true
: IntegerDimension{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return canvasDimension
}


    open fun setCanvasDimension(canvasDimension: IntegerDimension)
        //nullable = true from not(false or (false and false)) = true
{
var canvasDimension = canvasDimension
this.canvasDimension= canvasDimension
}


    open fun getGrid()
        //nullable = true from not(false or (false and true)) = true
: Grid{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return grid
}


}
                
            


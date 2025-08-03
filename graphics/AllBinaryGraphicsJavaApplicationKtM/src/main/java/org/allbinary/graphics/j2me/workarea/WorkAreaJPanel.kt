
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
        package org.allbinary.graphics.j2me.workarea



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        import java.lang.Runnable
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.util.EventListener
import java.util.HashMap
import java.util.LinkedList
import javax.swing
import javax.swing.tree.MutableTreeNode
import org.allbinary.dom.DomHelper
import org.allbinary.graphics.j2me.StatusFactory
import org.allbinary.graphics.j2me.workarea.canvas.CanvasDom
import org.allbinary.graphics.j2me.workarea.canvas.CanvasJPanel
import org.allbinary.graphics.j2me.workarea.canvas.event.MyCanvasEvent
import org.allbinary.graphics.j2me.workarea.canvas.event.MyCanvasEventListener
import org.allbinary.graphics.j2me.workarea.canvas.event.MyCanvasEventService
import org.allbinary.graphics.j2me.workarea.properties.PropertiesJPanel
import org.allbinary.graphics.j2me.workarea.tools.ToolJPanel
import org.allbinary.log.LOGGING
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.util.BasicArrayList
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class WorkAreaJPanel : JPanel
                , WorkAreaJPanelInterface
                , MyCanvasEventListener
                , EventListener
                , Runnable {
        

        companion object {


    private var document: Document

open fun getDocument()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var canvasJPanelList: LinkedList

    private var canvasHolderJPanel: JPanel

    private var name: String

    private var selectedFrame: Int= 0

    private var propertiesJPanel: PropertiesJPanel

    private var workAreaJTreeJPanel: WorkAreaJTreeJPanel

    private var isPlaying: Boolean = false
public constructor        (name: String, dimension: Dimension, x: Int, y: Int){

                    var name = name


                    var dimension = dimension


                    var x = x


                    var y = y

        try {
            initComponents()
this.name= name
initMyComponents(dimension)
this.workAreaJTreeJPanel= WorkAreaJTreeJPanel(this.name)

    var canvasJPanel: CanvasJPanel = CanvasJPanel(this.workAreaJTreeJPanel, this.getSize(), x, y)

this.canvasJPanelList!!.add(canvasJPanel)
this.selectedFrame= 0
this.propertiesJPanel!!.set(this.workAreaJTreeJPanel)
this.canvasHolderJPanel!!.add(canvasJPanel as Component)
} catch(e: Exception)
            {


                            throw e
}

}

public constructor        (workAreaDom: WorkAreaDom, dimension: Dimension){

                    var workAreaDom = workAreaDom


                    var dimension = dimension

        try {
            initComponents()
this.name= workAreaDom!!.getName()
initMyComponents(dimension)

    var canvasNodeList: BasicArrayList = workAreaDom!!.getCanvasNodes()!!
            


    var numberOfFrames: Int = canvasNodeList!!.size()!!
            





                        for (index in 0 until numberOfFrames)


        {
    var node: Node = canvasNodeList!!.get(index) as Node


    var canvasJPanel: CanvasJPanel = CanvasJPanel(this.workAreaJTreeJPanel, this.getSize(), CanvasDom(node))

this.canvasJPanelList!!.add(canvasJPanel)
}

this.selectedFrame= 0
this.canvasHolderJPanel!!.add(this.getCurrentFrame() as Component)
this.propertiesJPanel!!.set(this.workAreaJTreeJPanel)
} catch(e: Exception)
            {
    
                        if(LOGGING.contains(LOGGING.LOADINGERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Constructor Error", this, 
                            "WorkAreaJPanel", e)

                                    }
                                



                            throw e
}

}


open fun initMyComponents(dimension: Dimension)
        //nullable = true from not(false or (false and false)) = true
{

                    var dimension = dimension
this.workAreaJTreeJPanel= WorkAreaJTreeJPanel(this.name)
this.canvasHolderJPanel= JPanel()
this.canvasHolderJPanel!!.setSize(dimension)
this.canvasHolderJPanel!!.setLayout(GridLayout(1, 1))
this.setSize(dimension)
this.canvasJPanelList= LinkedList()

    var gridBagLayout: GridBagLayout = GridBagLayout()


    var gridBagConstraints: GridBagConstraints = GridBagConstraints()

this.innerJPanel!!.setLayout(gridBagLayout)
gridBagConstraints!!.gridx= 0
gridBagConstraints!!.gridy= 0
gridBagConstraints!!.gridwidth= 1
gridBagConstraints!!.fill= java!!.awt!!.GridBagConstraints.BOTH
gridBagConstraints!!.weightx= .05
gridBagConstraints!!.weighty= .05

    var toolJPanel: ToolJPanel = ToolJPanel()

gridBagLayout!!.setConstraints(toolJPanel, gridBagConstraints)
this.innerJPanel!!.add(toolJPanel)
gridBagConstraints= GridBagConstraints()
gridBagConstraints!!.gridx= 1
gridBagConstraints!!.gridy= 0
gridBagConstraints!!.gridwidth= 6
gridBagConstraints!!.fill= java!!.awt!!.GridBagConstraints.BOTH
gridBagConstraints!!.weightx= 1
gridBagConstraints!!.weighty= 1
gridBagLayout!!.setConstraints(canvasHolderJPanel, gridBagConstraints)
this.innerJPanel!!.add(canvasHolderJPanel)
gridBagConstraints= GridBagConstraints()
gridBagConstraints!!.gridx= 8
gridBagConstraints!!.gridy= 0
gridBagConstraints!!.gridwidth= java!!.awt!!.GridBagConstraints.REMAINDER
gridBagConstraints!!.fill= java!!.awt!!.GridBagConstraints.BOTH
gridBagConstraints!!.weightx= .1
gridBagConstraints!!.weighty= .1
propertiesJPanel= PropertiesJPanel()
gridBagLayout!!.setConstraints(propertiesJPanel, gridBagConstraints)
this.innerJPanel!!.add(propertiesJPanel)
MyCanvasEventService.addListener(this as MyCanvasEventListener)
}


open fun getCanvasHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var canvasJPanelHashMap: HashMap<Any, Any> = HashMap<Any, Any>()





                        for (index in 0 until this.canvasJPanelList!!.size()!!)


        {
    var canvasJPanel: CanvasJPanel = this.canvasJPanelList!!.get(index) as CanvasJPanel

canvasJPanelHashMap!!.put(canvasJPanel!!.getTreeNode(), Integer(index))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return canvasJPanelHashMap
}


open fun play()
        //nullable = true from not(false or (false and true)) = true
{isPlaying= true
}


open fun stop()
        //nullable = true from not(false or (false and true)) = true
{isPlaying= false
}


open fun isPlaying()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isPlaying
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


open fun setName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.name= value
}


open fun disableCanvas()
        //nullable = true from not(false or (false and true)) = true
{this.canvasHolderJPanel!!.removeAll()
}


open fun enableCanvas()
        //nullable = true from not(false or (false and true)) = true
{this.canvasHolderJPanel!!.add(this.getCurrentFrame() as Component)
}


open fun deselect()
        //nullable = true from not(false or (false and true)) = true
{super.setVisible(false)
}


open fun select()
        //nullable = true from not(false or (false and true)) = true
{super.setVisible(true)

    
                        if(this.canvasHolderJPanel!!.getComponentCount() == 1)
                        
                                    {
                                    
    var component: Component = this.canvasHolderJPanel!!.getComponent(0)!!
            


    
                        if(component != 
                                    null
                                )
                        
                                    {
                                    component!!.repaint()

                                    }
                                

                                    }
                                
}


open fun changeZoom(factor: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var factor = factor

    var size: Int = canvasJPanelList!!.size()!!
            





                        for (index in 0 until size)


        {
    var canvasJPanel: CanvasJPanel = canvasJPanelList!!.get(index) as CanvasJPanel

canvasJPanel!!.getGrid()!!.setZoom(canvasJPanel!!.getGrid()!!.getZoom() +factor)
}

}


open fun getCurrentFrame()
        //nullable = true from not(false or (false and true)) = true
: CanvasJPanel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.canvasJPanelList!!.get(this.selectedFrame) as CanvasJPanel
}


open fun initDuplicate(newCanvasJPanel: CanvasJPanel)
        //nullable = true from not(false or (false and false)) = true
{

                    var newCanvasJPanel = newCanvasJPanel

    
                        if(newCanvasJPanel != 
                                    null
                                )
                        
                                    {
                                    this.canvasJPanelList!!.add(newCanvasJPanel)
this.select(this.canvasJPanelList!!.size() -1)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun duplicate(treeNode: MutableTreeNode)
        //nullable = true from not(false or (false and false)) = true
{

                    var treeNode = treeNode

    var canvasJPanelHashMap: HashMap<Any, Any> = this.getCanvasHashMap()!!
            


    
                        if(canvasJPanelHashMap!!.containsKey(treeNode))
                        
                                    {
                                    
    var frameInteger: Integer = canvasJPanelHashMap!!.get(treeNode as Object?) as Integer


    var canvasJPanel: CanvasJPanel = this.canvasJPanelList!!.get(frameInteger!!.toInt()) as CanvasJPanel

initDuplicate(canvasJPanel!!.duplicate())

                                    }
                                
}


                @Throws(Exception::class)
            
open fun autoRotate(increments: Int, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var increments = increments


                    var totalAngle = totalAngle

    var incrementAngle: Int = (totalAngle /increments).toInt()





                        for (index in 1 until increments)


        {
    var canvasJPanel: CanvasJPanel = this.getCurrentFrame() as CanvasJPanel


    var newCanvasJPanel: CanvasJPanel = canvasJPanel!!.duplicate()!!
            

newCanvasJPanel!!.setAngle(incrementAngle *index)
initDuplicate(newCanvasJPanel)
}

}


open fun explodeAll()
        //nullable = true from not(false or (false and true)) = true
{
    var canvasJPanel: CanvasJPanel = this.getCurrentFrame() as CanvasJPanel

canvasJPanel!!.explodeAll()
}


                @Throws(Exception::class)
            
open fun autoExplode(numberOfFrames: Int, explodeType: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var numberOfFrames = numberOfFrames


                    var explodeType = explodeType




                        for (index in 1 until numberOfFrames)


        {
    var canvasJPanel: CanvasJPanel = this.getCurrentFrame() as CanvasJPanel


    var newCanvasJPanel: CanvasJPanel = canvasJPanel!!.duplicate()!!
            

newCanvasJPanel!!.explode(index +1, explodeType)
initDuplicate(newCanvasJPanel)
}

}


                @Throws(Exception::class)
            
open fun autoMirror()
        //nullable = true from not(false or (false and true)) = true
{
    var canvasJPanel: CanvasJPanel = this.getCurrentFrame() as CanvasJPanel


    var newCanvasJPanel: CanvasJPanel = canvasJPanel!!.duplicate()!!
            

newCanvasJPanel!!.mirror()
initDuplicate(newCanvasJPanel)
}


open fun select(index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var index = index

    
                        if(index < this.canvasJPanelList!!.size())
                        
                                    {
                                    
    var canvasJPanel: CanvasJPanel = this.canvasJPanelList!!.get(index) as CanvasJPanel


    
                        if(canvasJPanel != 
                                    null
                                )
                        
                                    {
                                    this.canvasHolderJPanel!!.removeAll()
this.canvasHolderJPanel!!.add(canvasJPanel)
this.selectedFrame= index
canvasJPanel!!.changed()
this.canvasHolderJPanel!!.repaint()
canvasJPanel!!.repaint()

                                    }
                                

                                    }
                                
}


open fun select(treeNode: MutableTreeNode)
        //nullable = true from not(false or (false and false)) = true
{

                    var treeNode = treeNode

    var canvasJPanelHashMap: HashMap<Any, Any> = this.getCanvasHashMap()!!
            


    var frameInteger: Integer = canvasJPanelHashMap!!.get(treeNode as Object?) as Integer


    
                        if(frameInteger != 
                                    null
                                )
                        
                                    {
                                    this.select(frameInteger!!.toInt())

                                    }
                                
}


                @Throws(Exception::class)
            
open fun toDocument()
        //nullable = true from not(false or (false and true)) = true
: Document{document= DomHelper.getInstance()!!.createDocument()

    var workAreaNode: Node = document!!.createElement(WorkAreaDom.WORKAREA)!!
            


    var nameNode: Node = document!!.createElement(WorkAreaDom.NAME)!!
            


    var nameTextNode: Node = document!!.createTextNode(this.name)!!
            

nameNode!!.appendChild(nameTextNode)

    var framesNode: Node = document!!.createElement(WorkAreaDom.FRAMES)!!
            


    var size: Int = canvasJPanelList!!.size()!!
            





                        for (index in 0 until size)


        {
    var canvasJPanel: CanvasJPanel = canvasJPanelList!!.get(index) as CanvasJPanel

framesNode!!.appendChild(canvasJPanel!!.toDom())
}

workAreaNode!!.appendChild(nameNode)
workAreaNode!!.appendChild(framesNode)
document!!.appendChild(workAreaNode)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{innerJPanel= JPanel()
setLayout(GridLayout(1, 1))
innerJPanel!!.addKeyListener(object: KeyAdapter()
                                {
                                
open override fun keyTyped(evt: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
innerJPanelKeyTyped(evt)
}

open override fun keyPressed(evt: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
innerJPanelKeyPressed(evt)
}

open override fun keyReleased(evt: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
innerJPanelKeyReleased(evt)
}

                                }
                            )
add(innerJPanel)
}


open fun innerJPanelKeyReleased(evt: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
StatusFactory.getInstance()!!.setStatus(
                            "Key Pressed1")
}


open fun innerJPanelKeyPressed(evt: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
StatusFactory.getInstance()!!.setStatus(
                            "Key Pressed2")
}


open fun innerJPanelKeyTyped(evt: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
StatusFactory.getInstance()!!.setStatus(
                            "Key Pressed3")
}


open fun keyPressed(keyEvent: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyEvent = keyEvent
this.getCurrentFrame()!!.keyPressed(keyEvent)
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


open fun delete(evt: MyCanvasEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

    var canvasJPanelHashMap: HashMap<Any, Any> = this.getCanvasHashMap()!!
            


    
                        if(canvasJPanelHashMap!!.containsKey(evt!!.getTreeNode()))
                        
                                    {
                                    this.canvasHolderJPanel!!.removeAll()

    var frameInt: Integer = canvasJPanelHashMap!!.get(evt!!.getTreeNode()) as Integer

this.canvasJPanelList!!.remove(frameInt!!.toInt())
this.select(frameInt!!.toInt())

                                    }
                                
}


                @Throws(Exception::class)
            
open fun duplicate(evt: MyCanvasEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.duplicate(evt!!.getTreeNode())
}


open fun select(evt: MyCanvasEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.select(evt!!.getTreeNode())
StatusFactory.getInstance()!!.setStatus(
                            "Frame Selected")
}


open fun rotate(evt: MyCanvasEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

    var canvasJPanelHashMap: HashMap<Any, Any> = this.getCanvasHashMap()!!
            


    var treeNode: MutableTreeNode = evt!!.getTreeNode()!!
            


    var frameInt: Integer = canvasJPanelHashMap!!.get(evt!!.getTreeNode()) as Integer


    var canvasJPanel: CanvasJPanel = this.canvasJPanelList!!.get(frameInt!!.toInt()) as CanvasJPanel


    
                        if(canvasJPanel != 
                                    null
                                )
                        
                                    {
                                    canvasJPanel!!.addAngle(evt!!.getAngle())
this.select(frameInt!!.toInt())

                                    }
                                
StatusFactory.getInstance()!!.setStatus(
                            "Canvas Rotated")
}


open fun explode(evt: MyCanvasEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.explodeAll()
}


                @Throws(Exception::class)
            
open fun autoExplode(evt: MyCanvasEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.autoExplode(10, 0)
}


                @Throws(Exception::class)
            
open fun center()
        //nullable = true from not(false or (false and true)) = true
{
    var canvasJPanel: CanvasJPanel = this.getCurrentFrame() as CanvasJPanel

canvasJPanel!!.center()
}


                @Throws(Exception::class)
            
open fun center(evt: MyCanvasEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.center()
}


open fun run()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            )


        {
    
                        if(this.isPlaying())
                        
                                    {
                                    



                        for (index in 0 until this.canvasJPanelList!!.size()!!)


        {
    
                        if(!this.isPlaying())
                        
                                    {
                                    break;

                    

                                    }
                                
this.select(index)
Thread.sleep(100)
}


                                    }
                                
                        else {
                            Thread.sleep(500)

                        }
                            
Thread.sleep(250)
}

} catch(e: Exception)
            {}

}


    private var innerJPanel: JPanel

}
                
            


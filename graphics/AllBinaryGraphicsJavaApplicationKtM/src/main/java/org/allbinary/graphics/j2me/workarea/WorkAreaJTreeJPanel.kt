
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.swing
import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.MutableTreeNode
import javax.swing.tree.TreePath
import org.allbinary.graphics.j2me.workarea.canvas.CanvasTreeLabel
import org.allbinary.graphics.j2me.workarea.canvas.event.MyCanvasEvent
import org.allbinary.graphics.j2me.workarea.canvas.event.MyCanvasEventService
import org.allbinary.graphics.j2me.workarea.canvas.event.MyCanvasEventSource
import org.allbinary.graphics.j2me.workarea.tools.event.MyGraphicItemEvent
import org.allbinary.graphics.j2me.workarea.tools.event.MyGraphicItemEventService
import org.allbinary.graphics.j2me.workarea.tools.event.MyGraphicItemEventSource
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class WorkAreaJTreeJPanel : swing.JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var rootTreeNode: DefaultMutableTreeNode

    private var workAreaJTree: JTree

    private var highlightedBasicArrayList: BasicArrayList
public constructor        (workAreaName: String){

                    var workAreaName = workAreaName
initComponents()
this.rootTreeNode= DefaultMutableTreeNode(workAreaName)
this.workAreaPropertiesJPanel!!.removeAll()
updateTree()
this.highlightedBasicArrayList= BasicArrayList()
}


open fun add(treeNode: MutableTreeNode)
        //nullable = true from not(false or (false and false)) = true
{

                    var treeNode = treeNode
this.rootTreeNode!!.add(treeNode)
}


open fun updateTree()
        //nullable = true from not(false or (false and true)) = true
{this.workAreaJTree= JTree(rootTreeNode)
this.workAreaJTree!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
workAreaJTreeMousePressed(evt)
}

                                }
                            )
this.workAreaPropertiesJPanel!!.removeAll()
this.workAreaPropertiesJPanel!!.add(this.workAreaJTree)
}


open fun getNode(treePathArray: Array<TreePath?>)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var treePathArray = treePathArray

    var basicArrayList: BasicArrayList = BasicArrayList()


    
                        if(treePathArray != 
                                    null
                                )
                        
                                    {
                                    



                        for (index in 0 until treePathArray!!.size)


        {basicArrayList!!.add(this.getNode(treePathArray[index]!!))
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicArrayList
}


open fun getNode(treePath: TreePath)
        //nullable = true from not(false or (false and false)) = true
: DefaultMutableTreeNode{

                    var treePath = treePath

    
                        if(treePath != 
                                    null
                                )
                        
                                    {
                                    
    var obj: Array<Any?> = treePath!!.getPath()!!
            


    
                        if(obj != 
                                    null
                                )
                        
                                    {
                                    
    var node: DefaultMutableTreeNode = obj[obj!!.size -1]!! as DefaultMutableTreeNode




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun deselectAll()
        //nullable = true from not(false or (false and true)) = true
{
    var size: Int = highlightedBasicArrayList!!.size()!!
            

logUtil!!.put("size: " +size, this, 
                            "deselectAll")




                        for (index in 0 until size)


        {
    var node: DefaultMutableTreeNode = highlightedBasicArrayList!!.get(index) as DefaultMutableTreeNode

MyGraphicItemEventService.fire(MyGraphicItemEvent(MyGraphicItemEventSource(MyGraphicItemEventService.DESELECT, node) as Object))
}

this.highlightedBasicArrayList!!.clear()
}


                @Throws(Exception::class)
            
open fun selectGraphicItem(node: DefaultMutableTreeNode)
        //nullable = true from not(false or (false and false)) = true
{

                    var node = node
highlightedBasicArrayList!!.add(node)
MyGraphicItemEventService.fire(MyGraphicItemEvent(MyGraphicItemEventSource(MyGraphicItemEventService.SELECT, node) as Object))
}


                @Throws(Exception::class)
            
open fun removeGraphicItem(node: DefaultMutableTreeNode)
        //nullable = true from not(false or (false and false)) = true
{

                    var node = node
MyGraphicItemEventService.fire(MyGraphicItemEvent(MyGraphicItemEventSource(MyGraphicItemEventService.DELETE, node) as Object))
}


                @Throws(Exception::class)
            
open fun removeCanvas(node: DefaultMutableTreeNode)
        //nullable = true from not(false or (false and false)) = true
{

                    var node = node
MyCanvasEventService.fire(MyCanvasEvent(MyCanvasEventSource(MyCanvasEventService.DELETE, node) as Object))
}


                @Throws(Exception::class)
            
open fun remove(treePath: TreePath)
        //nullable = true from not(false or (false and false)) = true
{

                    var treePath = treePath

    var node: DefaultMutableTreeNode = this.getNode(treePath)!!
            


    
                        if(node != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(node!!.getUserObject() is CanvasTreeLabel)
                        
                                    {
                                    this.removeCanvas(node)

                                    }
                                
                        else {
                            this.removeGraphicItem(node)

                        }
                            

                                    }
                                

    var parent: DefaultMutableTreeNode = node!!.getParent() as DefaultMutableTreeNode

parent!!.remove(node)
}


                @Throws(Exception::class)
            
open fun copy()
        //nullable = true from not(false or (false and true)) = true
{
    var treePath: TreePath = this.workAreaJTree!!.getSelectionPath()!!
            

this.copy(treePath)
this.updateTree()
this.expand()
this.repaint()
}


                @Throws(Exception::class)
            
open fun copy(treePath: TreePath)
        //nullable = true from not(false or (false and false)) = true
{

                    var treePath = treePath

    var node: DefaultMutableTreeNode = this.getNode(treePath)!!
            


    
                        if(node != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(node!!.getUserObject() is CanvasTreeLabel)
                        
                                    {
                                    MyCanvasEventService.fire(MyCanvasEvent(MyCanvasEventSource(MyCanvasEventService.DUPLICATE, node) as Object))

                                    }
                                
                        else {
                            MyGraphicItemEventService.fire(MyGraphicItemEvent(MyGraphicItemEventSource(MyGraphicItemEventService.DUPLICATE, node) as Object))

                        }
                            

                                    }
                                
}


                @Throws(Exception::class)
            
open fun rotate(treePath: TreePath, angle: Double)
        //nullable = true from not(false or (false and false)) = true
{

                    var treePath = treePath


                    var angle = angle

    var node: DefaultMutableTreeNode = this.getNode(treePath)!!
            


    
                        if(node != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(node!!.getUserObject() is CanvasTreeLabel)
                        
                                    {
                                    MyCanvasEventService.fire(MyCanvasEvent(MyCanvasEventSource(MyCanvasEventService.ROTATE, angle, node) as Object))

                                    }
                                
                        else {
                            MyGraphicItemEventService.fire(MyGraphicItemEvent(MyGraphicItemEventSource(MyGraphicItemEventService.ROTATE, angle, node) as Object))

                        }
                            

                                    }
                                
}


open fun getRootTreeNode()
        //nullable = true from not(false or (false and true)) = true
: MutableTreeNode{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.rootTreeNode
}


open fun expand()
        //nullable = true from not(false or (false and true)) = true
{this.workAreaJTree!!.expandRow(0)
this.workAreaJTree!!.expandRow(1)
}


open fun expand(treePath: TreePath)
        //nullable = true from not(false or (false and false)) = true
{

                    var treePath = treePath
this.workAreaJTree!!.expandPath(treePath)
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{itemJPopupMenu= JPopupMenu()
deleteJMenuItem= JMenuItem()
copyJMenuItem= JMenuItem()
rotateJMenuItem= JMenuItem()
itemJScrollPane1= JScrollPane()
workAreaPropertiesJPanel= JPanel()
itemJPopupMenu!!.addPopupMenuListener(object: PopupMenuListener()
                                {
                                
open override fun popupMenuCanceled(evt: PopupMenuEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
}

open override fun popupMenuWillBecomeInvisible(evt: PopupMenuEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
itemJPopupMenuPopupMenuWillBecomeInvisible(evt)
}

open override fun popupMenuWillBecomeVisible(evt: PopupMenuEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
itemJPopupMenuPopupMenuWillBecomeVisible(evt)
}

                                }
                            )
deleteJMenuItem!!.setText(
                            "Delete")
deleteJMenuItem!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
deleteJMenuItemMousePressed(evt)
}

                                }
                            )
itemJPopupMenu!!.add(deleteJMenuItem)
copyJMenuItem!!.setText(
                            "Copy")
copyJMenuItem!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
copyJMenuItemMousePressed(evt)
}

                                }
                            )
itemJPopupMenu!!.add(copyJMenuItem)
rotateJMenuItem!!.setText(
                            "Rotate 45*")
rotateJMenuItem!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
rotateJMenuItemMousePressed(evt)
}

                                }
                            )
itemJPopupMenu!!.add(rotateJMenuItem)
setLayout(GridLayout(1, 1))
workAreaPropertiesJPanel!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
workAreaPropertiesJPanelMousePressed(evt)
}

                                }
                            )
workAreaPropertiesJPanel!!.setLayout(GridLayout(1, 0))
itemJScrollPane1!!.setViewportView(workAreaPropertiesJPanel)
add(itemJScrollPane1)
}


open fun rotateJMenuItemMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            
    var treePath: TreePath = this.workAreaJTree!!.getSelectionPath()!!
            

this.rotate(treePath, 45)
this.updateTree()
this.expand()
this.repaint()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "rotateJMenuItemMousePressed", e)
}

}


open fun workAreaJTreeMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            
    var selectedTreePathArray: Array<TreePath?> = this.workAreaJTree!!.getSelectionPaths()!!
            


    var list: BasicArrayList = this.getNode(selectedTreePathArray)!!
            


    
                        if(list!!.size() > 0)
                        
                                    {
                                    
    
                        if((evt!!.getModifiers() and evt!!.BUTTON3_MASK) == evt!!.BUTTON3_MASK)
                        
                                    {
                                    



                        for (index in 0 until selectedTreePathArray!!.size)


        {
    var defaultMutableTreeNode: DefaultMutableTreeNode = list!!.get(index) as DefaultMutableTreeNode


    
                        if(defaultMutableTreeNode!!.getUserObject() is CanvasTreeLabel)
                        
                                    {
                                    this.itemJPopupMenu!!.show(this, evt!!.getX(), evt!!.getY())

                                    }
                                
                        else {
                            this.itemJPopupMenu!!.show(this, evt!!.getX(), evt!!.getY())

                        }
                            
}


                                    }
                                

    
                        if((evt!!.getModifiers() and evt!!.BUTTON1_MASK) == evt!!.BUTTON1_MASK)
                        
                                    {
                                    this.deselectAll()




                        for (index in 0 until selectedTreePathArray!!.size)


        {
    var defaultMutableTreeNode: DefaultMutableTreeNode = list!!.get(index) as DefaultMutableTreeNode


    
                        if(defaultMutableTreeNode!!.getUserObject() is CanvasTreeLabel)
                        
                                    {
                                    MyCanvasEventService.fire(MyCanvasEvent(MyCanvasEventSource(MyCanvasEventService.SELECT, defaultMutableTreeNode) as Object))

                                    }
                                
                        else {
                            this.selectGraphicItem(defaultMutableTreeNode)

                        }
                            
}


                                    }
                                

                                    }
                                
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "workAreaJTreeMousePressed", e)
}

}


open fun itemJPopupMenuPopupMenuWillBecomeInvisible(evt: PopupMenuEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
}


open fun itemJPopupMenuPopupMenuWillBecomeVisible(evt: PopupMenuEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
}


open fun copyJMenuItemMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            this.copy()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "copyJMenuItemMousePressed", e)
}

}


open fun deleteJMenuItemMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            
    var selectedTreePathArray: Array<TreePath?> = this.workAreaJTree!!.getSelectionPaths()!!
            





                        for (index in 0 until selectedTreePathArray!!.size)


        {
    var treePath: TreePath = selectedTreePathArray[index]!!

this.remove(treePath)
this.updateTree()
this.expand()
this.repaint()
}

} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "deleteJMenuItemMousePressed", e)
}

}


open fun workAreaPropertiesJPanelMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
}


    private var copyJMenuItem: JMenuItem

    private var deleteJMenuItem: JMenuItem

    private var itemJPopupMenu: JPopupMenu

    private var itemJScrollPane1: JScrollPane

    private var rotateJMenuItem: JMenuItem

    private var workAreaPropertiesJPanel: JPanel

}
                
            


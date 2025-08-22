
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
        package org.allbinary.input.automation.module.generic.configuration.profile.actions.script




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.event.MouseEvent
import javax.swing
import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.DefaultTreeModel
import javax.swing.tree.TreePath
import org.allbinary.input.automation.actions.script.JTreeInterface
import org.allbinary.input.automation.actions.script.condition.CustomTreeNodeInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class GenericProfileActionScriptJPanel : javax.swing.JPanel
                , JTreeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var defaultMutableTreeNode: DefaultMutableTreeNode = DefaultMutableTreeNode("Root")

    private var genericProfileActionScript: GenericProfileActionScript
public constructor        (){logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)
initComponents()
}


open fun updateJTree()
        //nullable = true from not(false or (false and true)) = true
{
    var defaultTreeModel: DefaultTreeModel = DefaultTreeModel(this.getGenericProfileActionScript())

this.getActionScriptJTree()!!.setModel(defaultTreeModel)
this.repaint()
logUtil!!.put("Updated UI", this, "updateJTree")
}


open fun getGenericProfileActionScript()
        //nullable = true from not(false or (false and true)) = true
: GenericProfileActionScript{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return genericProfileActionScript
}


open fun setGenericProfileActionScript(genericProfileActionScript: GenericProfileActionScript)
        //nullable = true from not(false or (false and false)) = true
{

                    var genericProfileActionScript = genericProfileActionScript
this.genericProfileActionScript= genericProfileActionScript
}


open fun getActionScriptJTree()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JTree{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return actionScriptJTree
}


open fun setActionScriptJTree(actionScriptJTree: javax.swing.JTree)
        //nullable = true from not(false or (false and false)) = true
{

                    var actionScriptJTree = actionScriptJTree
this.actionScriptJTree= actionScriptJTree
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{jScrollPane1= javax.swing.JScrollPane()
actionScriptJTree= javax.swing.JTree()
setLayout(java.awt.GridLayout(1, 0))
actionScriptJTree!!.setPreferredSize(java.awt.Dimension(500, 500))
actionScriptJTree!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
open override fun mouseClicked(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
actionScriptJTreeMouseClicked(evt)
}

open override fun mouseReleased(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
actionScriptJTreeMouseReleased(evt)
}

                                }
                            )
jScrollPane1!!.setViewportView(actionScriptJTree)
add(jScrollPane1)
}


open fun actionScriptJTreeMouseReleased(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

    var button: Int = evt.getButton()!!


    
                        if(button == MouseEvent.BUTTON3)
                        
                                    {
                                    
    var treePath: TreePath = this.getActionScriptJTree()!!.getSelectionPath()!!


    
                        if(treePath != 
                                    null
                                )
                        
                                    {
                                    
    var anyType: Any = treePath!!.getLastPathComponent()!!


    
                        if(anyType is CustomTreeNodeInterface)
                        
                                    {
                                    
    var customTreeNodeInterface: CustomTreeNodeInterface = anyType as CustomTreeNodeInterface


    var jPopupMenu: JPopupMenu = customTreeNodeInterface!!.getJPopupMenu()!!

jPopupMenu!!.show(evt.getSource() as JComponent, evt.getX(), evt.getY())

                                    }
                                

                                    }
                                

                                    }
                                
}


open fun actionScriptJTreeMouseClicked(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
}


    private var actionScriptJTree: javax.swing.JTree

    private var jScrollPane1: javax.swing.JScrollPane

}
                
            


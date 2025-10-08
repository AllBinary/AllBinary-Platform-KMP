
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
        package org.allbinary.input.automation.actions.script.condition




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.event.ActionEvent
import java.util.Vector
import javax.swing
import javax.swing.tree.TreePath
import org.allbinary.input.automation.actions.script.JTreeInterfaceFactory
import org.allbinary.input.automation.actions.script.ProfileActionScriptItem
import org.allbinary.input.automation.actions.script.ProfileActionScriptNodeInterface
import org.allbinary.input.automation.actions.script.condition.processors.ProfileActionScriptProcessorInterface
import org.allbinary.input.automation.actions.script.condition.processors.input.GenericProfileActionScriptInputData
import org.allbinary.input.automation.actions.script.condition.processors.input.KeyboardActionScriptInput
import org.allbinary.input.automation.actions.script.condition.processors.input.MouseActionScriptInput
import org.allbinary.input.automation.actions.script.condition.processors.input.ProfileActionScriptInputFactory
import org.allbinary.input.automation.module.actions.script.condition.processors.output.GenericProfileActionScriptOutputData
import org.allbinary.input.automation.module.actions.script.condition.processors.output.ImageActionScriptOutput
import org.allbinary.input.automation.module.actions.script.condition.processors.output.ProfileActionScriptOutputFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class BasicProfileActionScriptCondition : ProfileActionScriptItem
                , ProfileActionScriptConditionInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var profileActionProcessorInterfaceVector: Vector

    private var profileActionConditionInterfaceVector: Vector
public constructor (label: String, node: Node)                        

                            : super(label, node){
var label = label
var node = node


                            //For kotlin this is before the body of the constructor.
                    
this.init()

    var nodeList: NodeList = node.getChildNodes()!!





                        for (index in 0 until nodeList!!.getLength()!!)

        {

    var actionItemNode: Node = nodeList!!.item(index)!!


    
                        if(actionItemNode!!.getNodeType() == Node.ELEMENT_NODE)
                        
                                    {
                                    
    
                        if(actionItemNode!!.getNodeName()!!.compareTo(GenericProfileActionScriptConditionData.NAME) == 0)
                        
                                    {
                                    this.addCondition(ProfileActionScriptConditionFactory.getInstance(actionItemNode))

                                    }
                                
                             else 
    
                        if(actionItemNode!!.getNodeName()!!.compareTo(GenericProfileActionScriptInputData.NAME) == 0)
                        
                                    {
                                    this.addProcessor(ProfileActionScriptInputFactory.getInstance(actionItemNode))

                                    }
                                
                             else 
    
                        if(actionItemNode!!.getNodeName()!!.compareTo(GenericProfileActionScriptOutputData.NAME) == 0)
                        
                                    {
                                    this.addProcessor(ProfileActionScriptOutputFactory.getInstance(actionItemNode))

                                    }
                                

                                    }
                                
}

}


                @Throws(Exception::class)
            
    open fun addProcessorNodes(node: Node)
        //nullable = true from not(false or (false and false)) = true
{
var node = node

    var nodeList: NodeList = node.getChildNodes()!!





                        for (index in 0 until nodeList!!.getLength()!!)

        {

    var processorActionItemNode: Node = nodeList!!.item(index)!!


    
                        if(processorActionItemNode!!.getNodeName()!!.compareTo(GenericProfileActionScriptInputData.NAME) == 0)
                        
                                    {
                                    this.addProcessor(ProfileActionScriptInputFactory.getInstance(processorActionItemNode))

                                    }
                                
                             else 
    
                        if(processorActionItemNode!!.getNodeName()!!.compareTo(GenericProfileActionScriptOutputData.NAME) == 0)
                        
                                    {
                                    this.addProcessor(ProfileActionScriptOutputFactory.getInstance(processorActionItemNode))

                                    }
                                
}

}

public constructor (label: String)                        

                            : super(label){
var label = label


                            //For kotlin this is before the body of the constructor.
                    
this.init()
}


    open fun init()
        //nullable = true from not(false or (false and true)) = true
{
this.setProfileActionProcessorInterfaceVector(Vector())
this.setProfileActionConditionInterfaceVector(Vector())
this.getJPopupMenu()!!.add(this.getConditionJPopupMenu())
this.getJPopupMenu()!!.add(this.getInputJPopupMenu())
this.getJPopupMenu()!!.add(this.getOutputJPopupMenu())
}


    open fun getConditionJPopupMenu()
        //nullable = true from not(false or (false and true)) = true
: JMenu{

    var jMenu: JMenu = JMenu(NEW_CONDITION)


    var jMenuItemColorAt: JMenuItem = JMenuItem(NEW_COLOR_AT)


    var jMenuItemAlways: JMenuItem = JMenuItem(NEW_ALWAYS)


    var jMenuItemTimeInterval: JMenuItem = JMenuItem(NEW_TIME_INTERVAL)

jMenuItemColorAt!!.addActionListener(this)
jMenuItemAlways!!.addActionListener(this)
jMenuItemTimeInterval!!.addActionListener(this)
jMenu!!.add(jMenuItemColorAt)
jMenu!!.add(jMenuItemAlways)
jMenu!!.add(jMenuItemTimeInterval)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return jMenu
}


    open fun getInputJPopupMenu()
        //nullable = true from not(false or (false and true)) = true
: JMenu{

    var jMenu: JMenu = JMenu(NEW_INPUT)


    var jMenuItemKey: JMenuItem = JMenuItem(NEW_KEY_INPUT)


    var jMenuItemMouse: JMenuItem = JMenuItem(NEW_MOUSE_INPUT)


    var jMenuItemJoystick: JMenuItem = JMenuItem(NEW_JOYSTICK_INPUT)

jMenuItemKey!!.addActionListener(this)
jMenuItemMouse!!.addActionListener(this)
jMenuItemJoystick!!.addActionListener(this)
jMenu!!.add(jMenuItemKey)
jMenu!!.add(jMenuItemMouse)
jMenu!!.add(jMenuItemJoystick)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return jMenu
}


    open fun getOutputJPopupMenu()
        //nullable = true from not(false or (false and true)) = true
: JMenu{

    var jMenu: JMenu = JMenu(NEW_OUTPUT)


    var jMenuItemImage: JMenuItem = JMenuItem(NEW_IMAGE_OUTPUT)

jMenuItemImage!!.addActionListener(this)
jMenu!!.add(jMenuItemImage)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return jMenu
}


    open fun addProcessor(profileActionProcessorInterface: ProfileActionScriptProcessorInterface)
        //nullable = true from not(false or (false and false)) = true
{
var profileActionProcessorInterface = profileActionProcessorInterface
logUtil!!.put(this.commonStrings!!.START, this, "addInput")
this.getProfileActionProcessorInterfaceVector()!!.add(profileActionProcessorInterface)
this.add(profileActionProcessorInterface)
}


    open fun removeProcessor(profileActionProcessorInterface: ProfileActionScriptProcessorInterface)
        //nullable = true from not(false or (false and false)) = true
{
var profileActionProcessorInterface = profileActionProcessorInterface
logUtil!!.put(this.commonStrings!!.START, this, "removeInput")
this.getProfileActionProcessorInterfaceVector()!!.remove(profileActionProcessorInterface)
this.remove(profileActionProcessorInterface)
}


    open fun removeCondition(profileActionScriptNodeInterface: ProfileActionScriptNodeInterface)
        //nullable = true from not(false or (false and false)) = true
{
var profileActionScriptNodeInterface = profileActionScriptNodeInterface
logUtil!!.put(this.commonStrings!!.START, this, "removeCondition")
this.getProfileActionConditionInterfaceVector()!!.remove(profileActionScriptNodeInterface)
this.remove(profileActionScriptNodeInterface)
}


    open fun addCondition(profileActionScriptNodeInterface: ProfileActionScriptNodeInterface)
        //nullable = true from not(false or (false and false)) = true
{
var profileActionScriptNodeInterface = profileActionScriptNodeInterface
logUtil!!.put(this.commonStrings!!.START, this, "addCondition")
this.getProfileActionConditionInterfaceVector()!!.add(profileActionScriptNodeInterface)
this.add(profileActionScriptNodeInterface)
}


                @Throws(Exception::class)
            
    open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document

    var node: Node = document.createElement(GenericProfileActionScriptConditionData.NAME)!!


    var profileActionConditionInterfaceVector: Vector = this.getProfileActionConditionInterfaceVector()!!


    var size: Int = profileActionConditionInterfaceVector!!.size!!





                        for (index in 0 until size)

        {

    var profileActionConditionInterface: ProfileActionScriptConditionInterface = profileActionConditionInterfaceVector!!.get(index) as ProfileActionScriptConditionInterface

node.appendChild(profileActionConditionInterface!!.toXmlNode(document))
}


    var profileActionProcessorInterfaceVector: Vector = this.getProfileActionProcessorInterfaceVector()!!


    var size2: Int = profileActionProcessorInterfaceVector!!.size!!





                        for (index in 0 until size2)

        {

    var profileActionProcessorInterface: ProfileActionScriptProcessorInterface = profileActionProcessorInterfaceVector!!.get(index) as ProfileActionScriptProcessorInterface

node.appendChild(profileActionProcessorInterface!!.toXmlNode(document))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


    open fun getProfileActionConditionInterfaceVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return profileActionConditionInterfaceVector
}


    open fun setProfileActionConditionInterfaceVector(profileActionConditionInterfaceVector: Vector)
        //nullable = true from not(false or (false and false)) = true
{
var profileActionConditionInterfaceVector = profileActionConditionInterfaceVector
this.profileActionConditionInterfaceVector= profileActionConditionInterfaceVector
}


    open fun actionPerformed(actionEvent: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var actionEvent = actionEvent

        try {
            super.actionPerformed(actionEvent)

    
                        if(actionEvent!!.getActionCommand()!!.compareTo(DELETE) == 0)
                        
                                    {
                                    
    
                        if(this.getParent() is ProfileActionScriptNodeInterface)
                        
                                    {
                                    
    var profileActionScriptNodeInterface: ProfileActionScriptNodeInterface = this.getParent() as ProfileActionScriptNodeInterface

profileActionScriptNodeInterface!!.removeCondition(this)
JTreeInterfaceFactory.getInstance()!!.getJTreeInterface()!!.updateJTree()

                                    }
                                

                                    }
                                
                             else 
    
                        if(actionEvent!!.getActionCommand()!!.compareTo(NEW_COLOR_AT) == 0)
                        
                                    {
                                    this.addCondition(ColorAtActionScriptCondition())
this.updateTree()

                                    }
                                
                             else 
    
                        if(actionEvent!!.getActionCommand()!!.compareTo(NEW_ALWAYS) == 0)
                        
                                    {
                                    this.addCondition(AlwaysActionScriptCondition())
this.updateTree()

                                    }
                                
                             else 
    
                        if(actionEvent!!.getActionCommand()!!.compareTo(NEW_TIME_INTERVAL) == 0)
                        
                                    {
                                    this.addCondition(TimeIntervalActionScriptCondition())
this.updateTree()

                                    }
                                
                             else 
    
                        if(actionEvent!!.getActionCommand()!!.compareTo(NEW_KEY_INPUT) == 0)
                        
                                    {
                                    this.addProcessor(KeyboardActionScriptInput())
this.updateTree()

                                    }
                                
                             else 
    
                        if(actionEvent!!.getActionCommand()!!.compareTo(NEW_MOUSE_INPUT) == 0)
                        
                                    {
                                    this.addProcessor(MouseActionScriptInput())
this.updateTree()

                                    }
                                
                             else 
    
                        if(actionEvent!!.getActionCommand()!!.compareTo(NEW_IMAGE_OUTPUT) == 0)
                        
                                    {
                                    this.addProcessor(ImageActionScriptOutput())
this.updateTree()

                                    }
                                
} catch(e: Exception)
            {
logUtil!!.put("Error", this, "actionPerformed", e)
}

}


    open fun getProfileActionProcessorInterfaceVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return profileActionProcessorInterfaceVector
}


    open fun setProfileActionProcessorInterfaceVector(profileActionProcessorInterfaceVector: Vector)
        //nullable = true from not(false or (false and false)) = true
{
var profileActionProcessorInterfaceVector = profileActionProcessorInterfaceVector
this.profileActionProcessorInterfaceVector= profileActionProcessorInterfaceVector
}


    open fun updateTree()
        //nullable = true from not(false or (false and true)) = true
{
JTreeInterfaceFactory.getInstance()!!.getJTreeInterface()!!.updateJTree()

    var treePath: TreePath = TreePath(this)

JTreeInterfaceFactory.getInstance()!!.getJTreeInterface()!!.getActionScriptJTree()!!.expandPath(treePath)
}


                @Throws(Exception::class)
            
    open fun shouldProcess(frame: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var frame = frame

    var profileActionConditionInterfaceVector: Vector = this.getProfileActionConditionInterfaceVector()!!


    var size: Int = profileActionConditionInterfaceVector!!.size!!





                        for (index in 0 until size)

        {

    var profileActionScriptConditionInterface: ProfileActionScriptConditionInterface = profileActionConditionInterfaceVector!!.get(index) as ProfileActionScriptConditionInterface


    
                        if(!profileActionScriptConditionInterface!!.shouldProcess(frame))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


                @Throws(Exception::class)
            
    open fun process(frame: Long)
        //nullable = true from not(false or (false and false)) = true
{
var frame = frame
logUtil!!.put(StringMaker().
                            append("Start - Processing ")!!.append(this.getProfileActionProcessorInterfaceVector()!!.size())!!.append(" inputs")!!.toString(), this, commonStrings!!.PROCESS)

    var profileActionProcessorInterfaceVector: Vector = this.getProfileActionProcessorInterfaceVector()!!


    var size: Int = profileActionProcessorInterfaceVector!!.size!!





                        for (index in 0 until size)

        {

    var profileActionScriptProcessorInterface: ProfileActionScriptProcessorInterface = profileActionProcessorInterfaceVector!!.get(index) as ProfileActionScriptProcessorInterface

profileActionScriptProcessorInterface!!.process(frame)
}

}


}
                
            


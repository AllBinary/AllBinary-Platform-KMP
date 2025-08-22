
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
        package org.allbinary.input.automation.actions.script.condition.processors.input




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.event.InputEvent
import java.util.HashMap
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class MouseActionScriptInput : BasicProfileActionScriptInput
                , MouseActionScriptInputInterface {
        

        companion object {
            
    private val NAME: String = "Mouse"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var point: Point

    private var buttons: Int= 0

    private var mouseActionScriptInputJPanel: MouseActionScriptInputJPanel
public constructor        (node: Node)                        

                            : super(NAME, node){

                    var node = node


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)
this.point= Point()

    var actionNode: Node = DomSearchHelper.getNode(MouseActionScriptInputData.NAME, node.getChildNodes())!!


    
                        if(actionNode != 
                                    null
                                )
                        
                                    {
                                    
    var nodeList: NodeList = actionNode!!.getChildNodes()!!





                        for (index in 0 until nodeList!!.getLength()!!)


        {
    var childNode: Node = nodeList!!.item(index)!!


    
                        if(childNode!!.getNodeName()!!.compareTo(MouseActionScriptInputData.BUTTONS) == 0)
                        
                                    {
                                    
    var buttons: String = DomNodeHelper.getTextNodeValue(childNode)!!

this.setButtonClicks(Integer.valueOf(buttons)!!.toInt())

                                    }
                                
                             else 
    
                        if(childNode!!.getNodeName()!!.compareTo(MouseActionScriptInputData.MOVE) == 0)
                        
                                    {
                                    
    var mouseXNode: Node = DomSearchHelper.getNode(MouseActionScriptInputData.MOVE_X, childNode!!.getChildNodes())!!


    var mouseXString: String = DomNodeHelper.getTextNodeValue(mouseXNode)!!


    var mouseXInteger: Integer = Integer(Integer.valueOf(mouseXString))!!


    var mouseYNode: Node = DomSearchHelper.getNode(MouseActionScriptInputData.MOVE_Y, childNode!!.getChildNodes())!!


    var mouseYString: String = DomNodeHelper.getTextNodeValue(mouseYNode)!!


    var mouseYInteger: Integer = Integer(Integer.valueOf(mouseYString))!!


    var newPoint: Point = Point(mouseXInteger!!.toInt(), mouseYInteger!!.toInt())

this.setPoint(newPoint)

                                    }
                                
                        else {
                            


                            throw Exception("Action Script Input Unknown Node")

                        }
                            
}


                                    }
                                
                        else {
                            


                            throw Exception("Action Script Input Node Null")

                        }
                            
this.setAllowsChildren(false)
this.mouseActionScriptInputJPanel= MouseActionScriptInputJPanel(this)
}

public constructor        ()                        

                            : super(NAME){

                            //For kotlin this is before the body of the constructor.
                    
this.point= Point()
this.setAllowsChildren(false)
this.mouseActionScriptInputJPanel= MouseActionScriptInputJPanel(this)
}


open fun setPoint(point: Point)
        //nullable = true from not(false or (false and false)) = true
{

                    var point = point
this.point= point
}


open fun getPoint()
        //nullable = true from not(false or (false and true)) = true
: Point{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.point
}


open fun getButtonClicks()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.buttons
}


open fun setButtonClicks(buttons: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var buttons = buttons
this.buttons= buttons
}


open fun showDialog()
        //nullable = true from not(false or (false and true)) = true
{this.mouseActionScriptInputJPanel!!.getMouseActionJDialog()!!.setVisible(true)
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(MouseActionScriptInputData.BUTTONS, Integer.toString(this.getButtonClicks()))
logUtil!!.put("HashMap: " +hashMap!!.toString(), this, "toHashMap()")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = super.toXmlNode(document)!!


    var mouseNode: Node = ModDomHelper.createNodeWithValueNodes(document, MouseActionScriptInputData.NAME, this.toHashMap())!!

node.appendChild(mouseNode)

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(MouseActionScriptInputData.MOVE_X, Integer.toString(this.getPoint()!!.x))
hashMap!!.put(MouseActionScriptInputData.MOVE_Y, Integer.toString(this.getPoint()!!.y))
mouseNode!!.appendChild(ModDomHelper.createNodeWithValueNodes(document, MouseActionScriptInputData.MOVE, hashMap))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


                @Throws(Exception::class)
            
open fun process(frame: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var frame = frame
MouseInputAutomationProcessor.process(this)
}


open fun log()
        //nullable = true from not(false or (false and true)) = true
{
    var buttonStringBuffer: StringMaker = StringMaker()

buttonStringBuffer!!.append("1: ")

    
                        if((this.getButtonClicks() and InputEvent.BUTTON1_MASK) != 0)
                        
                                    {
                                    buttonStringBuffer!!.append(Boolean.TRUE)

                                    }
                                
                        else {
                            buttonStringBuffer!!.append(Boolean.FALSE)

                        }
                            
buttonStringBuffer!!.append(" 2: ")

    
                        if((this.getButtonClicks() and InputEvent.BUTTON2_MASK) != 0)
                        
                                    {
                                    buttonStringBuffer!!.append(Boolean.TRUE)

                                    }
                                
                        else {
                            buttonStringBuffer!!.append(Boolean.FALSE)

                        }
                            
buttonStringBuffer!!.append(" 3: ")

    
                        if((this.getButtonClicks() and InputEvent.BUTTON3_MASK) != 0)
                        
                                    {
                                    buttonStringBuffer!!.append(Boolean.TRUE)

                                    }
                                
                        else {
                            buttonStringBuffer!!.append(Boolean.FALSE)

                        }
                            
logUtil!!.put("Input Type: " +this.getInputRobotInterface()!!.getName() +" Point: " +this.getPoint() +" Buttons Clicked: " +buttonStringBuffer!!.toString(), this, "log")
}


}
                
            


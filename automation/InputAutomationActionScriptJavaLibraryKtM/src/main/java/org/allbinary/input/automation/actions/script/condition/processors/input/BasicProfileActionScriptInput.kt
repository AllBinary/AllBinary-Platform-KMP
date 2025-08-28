
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
        
import java.util.HashMap
import java.util.Hashtable
import java.util.Iterator
import java.util.Set
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.input.automation.actions.script.condition.processors.BasicProfileActionScriptProcessor
import org.allbinary.input.automation.robot.InputRobotFactory
import org.allbinary.input.automation.robot.InputRobotInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class BasicProfileActionScriptInput : BasicProfileActionScriptProcessor
                , ProfileActionScriptInputInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var inputRobotInterface: InputRobotInterface

    private var time: Int= 0
public constructor        (label: String, node: Node)                        

                            : super(label, node)

        Updates for KMP build        
        {
    //var label = label
    //var node = node


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(commonStrings!!.START +label, this, commonStrings!!.CONSTRUCTOR)

    var actionNode: Node = DomSearchHelper.getNode(GenericProfileActionScriptInputData.TYPE, node.getChildNodes())!!


    var inputTypeString: String = DomNodeHelper.getTextNodeValue(actionNode)!!


    var timeNode: Node = DomSearchHelper.getNodeNoThrow(GenericProfileActionScriptInputData.DELAY, node.getChildNodes())!!


    
                        if(timeNode != 
                                    null
                                )
                        
                                    {
                                    
    var delayString: String = DomNodeHelper.getTextNodeValue(timeNode)!!

this.setTime(Integer.valueOf(delayString)!!.toInt())

                                    }
                                
                        else {
                            this.setTime(0)

                        }
                            
this.setInputRobotInterface(InputRobotFactory.getInstance()!!.get(inputTypeString))
}

public constructor        (label: String)                        

                            : super(label)

        Updates for KMP build        
        {
    //var label = label


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(commonStrings!!.START +label, this, commonStrings!!.CONSTRUCTOR)

    var inputRobotFactory: InputRobotFactory = InputRobotFactory.getInstance()!!


    var hashtable: Hashtable<Any, Any> = inputRobotFactory!!.get() as Hashtable<Any, Any>


    var set: Set = hashtable.keys!!


    var iterator: Iterator = set.iterator()!!

this.setInputRobotInterface(inputRobotFactory!!.get(iterator.next() as String))
this.setTime(0)
}


open fun getTime()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return time
}


open fun setTime(time: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var time = time
this.time= time
}


open fun BasicProfileActionScriptInput_toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

        Updates for KMP build        
        {

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(GenericProfileActionScriptInputData.TYPE, this.getInputRobotInterface()!!.getName())
hashMap!!.put(GenericProfileActionScriptInputData.DELAY, Integer.toString(this.getTime()))
logUtil!!.put("HashMap: " +hashMap!!.toString(), this, "toHashMap()")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document

    var node: Node = ModDomHelper.createNodeWithValueNodes(document, GenericProfileActionScriptInputData.NAME, this.BasicProfileActionScriptInput_toHashMap())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


open fun setInputRobotInterface(inputRobotInterface: InputRobotInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var inputRobotInterface = inputRobotInterface
this.inputRobotInterface= inputRobotInterface
}


open fun getInputRobotInterface()
        //nullable = true from not(false or (false and true)) = true
: InputRobotInterface

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputRobotInterface
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(super.toString())
stringBuffer!!.append(" Input Type: ")

    
                        if(this.getInputRobotInterface() != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(this.getInputRobotInterface()!!.getName())

                                    }
                                
                        else {
                            stringBuffer!!.append(StringUtil.getInstance()!!.NULL_STRING)

                        }
                            
stringBuffer!!.append(" Time: ")
stringBuffer!!.append(this.getTime())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            


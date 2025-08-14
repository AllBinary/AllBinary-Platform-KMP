
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
        
import java.util.HashMap
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class AlwaysActionScriptCondition : BasicProfileActionScriptCondition
                , AlwaysActionScriptConditionInterface {
        

        companion object {
            
    private val NAME: String = "Always On/Off"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var alwaysActionScriptConditionJPanel: AlwaysActionScriptConditionJPanel

    private var isOn: Boolean= false
public constructor        (node: Node)                        

                            : super(AlwaysActionScriptCondition.NAME, node){

                    var node = node


                            //For kotlin this is before the body of the constructor.
                    

    var actionNode: Node = DomSearchHelper.getNode(AlwaysActionScriptConditionData.NAME, node.getChildNodes())!!
            


    
                        if(actionNode != 
                                    null
                                )
                        
                                    {
                                    
    var nodeList: NodeList = actionNode!!.getChildNodes()!!
            





                        for (index in 0 until nodeList!!.getLength()!!)


        {
    var childNode: Node = nodeList!!.item(index)!!
            


    
                        if(childNode!!.getNodeName()!!.compareTo(AlwaysActionScriptConditionData.IS_ON) == 0)
                        
                                    {
                                    
    var booleanString: String = DomNodeHelper.getTextNodeValue(childNode)!!
            

this.setIsOn(.
                            )

                                    }
                                
                        else {
                            


                            throw Exception(
                            "Action Script Condition Unknown Node")

                        }
                            
}


                                    }
                                
                        else {
                            


                            throw Exception(
                            "Action Script Condition Node Null")

                        }
                            
this.init()
}

public constructor        ()                        

                            : super(AlwaysActionScriptCondition.NAME){

                            //For kotlin this is before the body of the constructor.
                    
this.init()
}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{this.alwaysActionScriptConditionJPanel= AlwaysActionScriptConditionJPanel(this)
}


open fun isIsOn()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isOn
}


open fun setIsOn(isOn: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var isOn = isOn
this.isOn= isOn
}


open fun showDialog()
        //nullable = true from not(false or (false and true)) = true
{this.alwaysActionScriptConditionJPanel!!.getAlwaysActionJDialog()!!.setVisible(true)
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(AlwaysActionScriptConditionData.IS_ON, Boolean.toString(this.isIsOn()))
logUtil!!.put("HashMap: " +hashMap!!.toString(), this, 
                            "toHashMap()")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = super.toXmlNode(document)!!
            

node.appendChild(ModDomHelper.createNodeWithValueNodes(document, AlwaysActionScriptConditionData.NAME, this.toHashMap()))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


                @Throws(Exception::class)
            
open fun shouldProcess(frame: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var frame = frame

    
                        if(this.isIsOn())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.shouldProcess(frame)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun log()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put("Is On: " +this.isIsOn(), this, 
                            "log")
}


}
                
            


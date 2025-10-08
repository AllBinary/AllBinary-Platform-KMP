
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
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.time.TimeDelayHelper
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class TimeIntervalActionScriptCondition : BasicProfileActionScriptCondition
                , TimeIntervalActionScriptConditionInterface {
        
companion object {
            
    private val NAME: String = "Time Interval"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var timeIntervalActionScriptConditionJPanel: TimeIntervalActionScriptConditionJPanel

    private var timeHelper: TimeDelayHelper
public constructor (node: Node)                        

                            : super(TimeIntervalActionScriptCondition.NAME, node){
var node = node


                            //For kotlin this is before the body of the constructor.
                    

    var actionNode: Node = DomSearchHelper.getNode(TimeIntervalActionScriptConditionData.NAME, node.getChildNodes())!!


    
                        if(actionNode != 
                                    null
                                )
                        
                                    {
                                    
    var nodeList: NodeList = actionNode!!.getChildNodes()!!





                        for (index in 0 until nodeList!!.getLength()!!)

        {

    var childNode: Node = nodeList!!.item(index)!!


    
                        if(childNode!!.getNodeName()!!.compareTo(TimeIntervalActionScriptConditionData.TIME) == 0)
                        
                                    {
                                    
    var interval: String = DomNodeHelper.getTextNodeValue(childNode)!!

this.setTimeDelayHelper(TimeDelayHelper(Integer(Integer.valueOf(interval))))

                                    }
                                
                        else {
                            


                            throw Exception("Time Interval Action Script Condition Unknown Node")

                        }
                            
}


                                    }
                                
                        else {
                            


                            throw Exception("Time Interval Action Script Condition Node Null")

                        }
                            
this.init()
}

public constructor ()                        

                            : super(TimeIntervalActionScriptCondition.NAME){


                            //For kotlin this is before the body of the constructor.
                    
this.setTimeDelayHelper(TimeDelayHelper(0))
this.init()
}


    open fun init()
        //nullable = true from not(false or (false and true)) = true
{
this.timeIntervalActionScriptConditionJPanel= TimeIntervalActionScriptConditionJPanel(this)
}


    open fun showDialog()
        //nullable = true from not(false or (false and true)) = true
{
this.timeIntervalActionScriptConditionJPanel!!.getTimeIntervalActionJDialog()!!.setVisible(true)
}


    open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(TimeIntervalActionScriptConditionData.TIME, Integer.toString(this.timeHelper!!.delay))
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

node.appendChild(ModDomHelper.createNodeWithValueNodes(document, TimeIntervalActionScriptConditionData.NAME, this.toHashMap()))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


    open fun log()
        //nullable = true from not(false or (false and true)) = true
{
logUtil!!.put("Time Interval: " +this.timeHelper!!.delay, this, "log")
}


    open fun getTimeDelayHelper()
        //nullable = true from not(false or (false and true)) = true
: TimeDelayHelper{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return timeHelper
}


    open fun setTimeDelayHelper(timeHelper: TimeDelayHelper)
        //nullable = true from not(false or (false and false)) = true
{
    //var timeHelper = timeHelper
this.timeHelper= timeHelper
}


                @Throws(Exception::class)
            
    open fun shouldProcess(frame: Long)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var frame = frame

    var timeHelper: TimeDelayHelper = this.getTimeDelayHelper()!!


    
                        if(timeHelper!!.isTime())
                        
                                    {
                                    timeHelper!!.setStartTime()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.shouldProcess(frame)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            


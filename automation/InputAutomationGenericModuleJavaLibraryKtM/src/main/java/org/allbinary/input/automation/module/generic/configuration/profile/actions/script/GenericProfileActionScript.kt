
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import javax.swing.tree.DefaultMutableTreeNode
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.input.automation.actions.script.ProfileActionScriptNodeInterface
import org.allbinary.input.automation.actions.script.condition.ProfileActionScriptConditionFactory
import org.allbinary.input.automation.actions.script.condition.ProfileActionScriptConditionInterface
import org.allbinary.input.automation.module.generic.configuration.profile.actions.GenericProfileActionData
import org.allbinary.input.automation.module.generic.configuration.profile.actions.GenericProfileActionJPanel
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class GenericProfileActionScript : DefaultMutableTreeNode
                , ProfileActionScriptNodeInterface {
        

        companion object {


    private val NAME: String = "Root"


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var genericProfileActionJPanel: GenericProfileActionJPanel

    private var profileActionConditionInterfaceVector: Vector
public constructor        (genericProfileActionJPanel: GenericProfileActionJPanel, node: Node)                        

                            : super(NAME){

                    var genericProfileActionJPanel = genericProfileActionJPanel


                    var node = node


                            //For kotlin this is before the body of the constructor.
                    
this.genericProfileActionJPanel= genericProfileActionJPanel
this.setProfileActionConditionInterfaceVector(Vector())

    var actionScriptNode: Node = DomSearchHelper.getNode(GenericProfileActionData.SCRIPT, node.getChildNodes())!!
            


    
                        if(actionScriptNode != 
                                    null
                                )
                        
                                    {
                                    
    var nodeList: NodeList = actionScriptNode!!.getChildNodes()!!
            





                        for (index in 0 until nodeList!!.getLength()!!)


        {
    var actionConditionNode: Node = nodeList!!.item(index)!!
            


    
                        if(actionConditionNode!!.getNodeType() == Node.ELEMENT_NODE)
                        
                                    {
                                    this.addCondition(ProfileActionScriptConditionFactory.getInstance(actionConditionNode))

                                    }
                                
}


                                    }
                                
                        else {
                            


                            throw Exception(
                            "Profile Action Script Node Null")

                        }
                            
}

public constructor        (genericProfileActionJPanel: GenericProfileActionJPanel){

                    var genericProfileActionJPanel = genericProfileActionJPanel
this.genericProfileActionJPanel= genericProfileActionJPanel
this.setProfileActionConditionInterfaceVector(Vector())
}


open fun addCondition(profileActionScriptNodeInterface: ProfileActionScriptNodeInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var profileActionScriptNodeInterface = profileActionScriptNodeInterface
logUtil!!.put(this.commonStrings!!.START, this, 
                            "addCondition")
this.getProfileActionConditionInterfaceVector()!!.add(profileActionScriptNodeInterface)
this.add(profileActionScriptNodeInterface)
}


open fun removeCondition(profileActionScriptNodeInterface: ProfileActionScriptNodeInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var profileActionScriptNodeInterface = profileActionScriptNodeInterface
logUtil!!.put(this.commonStrings!!.START, this, 
                            "removeCondition")
this.getProfileActionConditionInterfaceVector()!!.remove(profileActionScriptNodeInterface)
this.remove(profileActionScriptNodeInterface)
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

logUtil!!.put("HashMap: " +hashMap!!.toString(), this, 
                            "toHashMap()")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
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


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = document.createElement(GenericProfileActionData.SCRIPT)!!
            


    var vector: Vector = this.getProfileActionConditionInterfaceVector()!!
            


    var size: Int = vector.size!!
            





                        for (index in 0 until size)


        {
    var profileActionConditionInterface: ProfileActionScriptConditionInterface = vector.get(index) as ProfileActionScriptConditionInterface

node.appendChild(profileActionConditionInterface!!.toXmlNode(document))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            


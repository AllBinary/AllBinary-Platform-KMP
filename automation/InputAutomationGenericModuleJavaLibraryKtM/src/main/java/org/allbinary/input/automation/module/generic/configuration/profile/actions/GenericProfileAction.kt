
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
        package org.allbinary.input.automation.module.generic.configuration.profile.actions




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.input.automation.module.generic.configuration.profile.actions.script.GenericProfileActionScript
import org.allbinary.logic.communication.log.LogUtil
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class GenericProfileAction
            : Object
        
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var name: String

    private var genericProfileActionScript: GenericProfileActionScript

    private var genericProfileActionJPanel: GenericProfileActionJPanel
public constructor        (genericProfileActionJPanel: GenericProfileActionJPanel, node: Node)
            : super()
        {

                    var genericProfileActionJPanel = genericProfileActionJPanel


                    var node = node

    var actionNameNode: Node = DomSearchHelper.getNode(GenericProfileActionData.NAME, node.getChildNodes())!!
            


    
                        if(actionNameNode != 
                                    null
                                )
                        
                                    {
                                    this.name= DomNodeHelper.getTextNodeValue(actionNameNode)

                                    }
                                
                        else {
                            


                            throw Exception(
                            "Profile Action Name Node Null")

                        }
                            
this.setGenericProfileActionScript(GenericProfileActionScript(this.genericProfileActionJPanel, node))
}

public constructor        (name: String)
            : super()
        {

                    var name = name
this.name= name
this.setGenericProfileActionScript(GenericProfileActionScript(this.genericProfileActionJPanel))
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name
this.name= name
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(GenericProfileActionData.NAME, this.name)
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

    var node: Node = ModDomHelper.createNodeWithValueNodes(document, GenericProfileActionData.NAME, this.toHashMap())!!
            

node.appendChild(getGenericProfileActionScript()!!.toXmlNode(document))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
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


}
                
            


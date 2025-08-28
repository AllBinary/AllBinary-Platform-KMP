
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
        package org.allbinary.logic.communication.smtp.configuration.user.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class UserEmailEventConfigurationView
            : Object
        
                , DomNodeInterface {
        

    private var userEmailEventConfigurationInterface: UserEmailEventConfigurationInterface
public constructor        (node: Node)
            : super()
        {
var node = node

    var childNodeList: NodeList = node.getChildNodes()!!


    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var name: String = DomNodeHelper.getTextNodeValue(UserEmailEventConfigurationData.NAME, childNodeList)!!

hashMap!!.put(UserEmailEventConfigurationData.NAME, name)

    var eventListenerClassPath: String = DomNodeHelper.getTextNodeValue(UserEmailEventConfigurationData.LISTENER_CLASSPATH, childNodeList)!!

hashMap!!.put(UserEmailEventConfigurationData.LISTENER_CLASSPATH, eventListenerClassPath)
this.setUserEmailEventConfigurationInterface(UserEmailEventConfiguration(hashMap) as UserEmailEventConfigurationInterface)
}

public constructor        (userEmailEventConfigurationInterface: UserEmailEventConfigurationInterface)
            : super()
        {
var userEmailEventConfigurationInterface = userEmailEventConfigurationInterface
this.setUserEmailEventConfigurationInterface(userEmailEventConfigurationInterface)
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document

    var userEmailEventConfigurationMapping: UserEmailEventConfigurationMapping = UserEmailEventConfigurationMapping(this.getUserEmailEventConfigurationInterface())


    var hashMap: HashMap<Any, Any> = userEmailEventConfigurationMapping!!.toHashMap()!!


    var node: Node = ModDomHelper.createNameValueNodes(document, UserEmailEventConfigurationData.NAME, hashMap)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


open fun getUserEmailEventConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: UserEmailEventConfigurationInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userEmailEventConfigurationInterface
}


open fun setUserEmailEventConfigurationInterface(userEmailEventConfigurationInterface: UserEmailEventConfigurationInterface)
        //nullable = true from not(false or (false and false)) = true
{
var userEmailEventConfigurationInterface = userEmailEventConfigurationInterface
this.userEmailEventConfigurationInterface= userEmailEventConfigurationInterface
}


}
                
            


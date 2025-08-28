
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
        package org.allbinary.logic.communication.smtp.configuration.user




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.configuration.user.event.UserEmailEventsConfigurationData
import org.allbinary.logic.communication.smtp.configuration.user.event.UserEmailEventsConfigurationInterface
import org.allbinary.logic.communication.smtp.configuration.user.event.UserEmailEventsConfigurationView
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class UserEmailConfigurationView
            : Object
        
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var userEmailConfigurationInterface: UserEmailConfigurationInterface
public constructor        (node: Node)
            : super()
        

        Updates for KMP build        
        {
var node = node

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.CONSTRUCTOR, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.userEmailConfigurationInterface= UserEmailConfiguration() as UserEmailConfigurationInterface

    var childNodeList: NodeList = node.getChildNodes()!!


    var userEmailEventsConfigurationNode: Node = DomSearchHelper.getNodeNoThrow(UserEmailEventsConfigurationData.NAME, childNodeList)!!


    var userEmailEventsConfigurationView: UserEmailEventsConfigurationView = UserEmailEventsConfigurationView(userEmailEventsConfigurationNode)

this.userEmailConfigurationInterface!!.setUserEmailEventsConfigurationInterface(userEmailEventsConfigurationView!!.getUserEmailEventsConfigurationInterface())
}

public constructor        (userEmailConfigurationInterface: UserEmailConfigurationInterface)
            : super()
        

        Updates for KMP build        
        {
var userEmailConfigurationInterface = userEmailConfigurationInterface
this.userEmailConfigurationInterface= userEmailConfigurationInterface
}


open fun getEmailConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: UserEmailConfigurationInterface

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userEmailConfigurationInterface
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document

    var emailConfigurationMapping: UserEmailConfigurationMapping = UserEmailConfigurationMapping(this.userEmailConfigurationInterface)


    var hashMap: HashMap<Any, Any> = emailConfigurationMapping!!.toHashMap()!!


    var node: Node = ModDomHelper.createNameValueNodes(document, UserEmailConfigurationData.NAME, hashMap)!!


    var userEmailConfigurationInterface: UserEmailConfigurationInterface = this.getEmailConfigurationInterface()!!


    var userEmailEventsConfigurationInterface: UserEmailEventsConfigurationInterface = userEmailConfigurationInterface!!.getUserEmailEventsConfigurationInterface()!!


    var userEmailEventsConfigurationView: UserEmailEventsConfigurationView = UserEmailEventsConfigurationView(userEmailEventsConfigurationInterface)

node.appendChild(userEmailEventsConfigurationView!!.toXmlNode(document))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            


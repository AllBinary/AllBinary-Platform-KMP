
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
import java.util.Set
import java.util.Vector
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class UserEmailEventsConfigurationView
            : Object
        
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var userEmailEventsConfigurationInterface: UserEmailEventsConfigurationInterface
public constructor (node: Node)
            : super()
        {
var node = node
this.userEmailEventsConfigurationInterface= UserEmailEventsConfiguration() as UserEmailEventsConfigurationInterface

    var childNodeList: NodeList = node.getChildNodes()!!


    var emailEventConfigurationNodeVector: Vector = DomSearchHelper.getAllNodesNoThrow(UserEmailEventConfigurationData.NAME, childNodeList)!!


    var size: Int = emailEventConfigurationNodeVector!!.size!!





                        for (index in 0 until size)

        {

    var userEmailConfigurationNode: Node = emailEventConfigurationNodeVector!!.get(index) as Node


    var userEmailEventConfigurationView: UserEmailEventConfigurationView = UserEmailEventConfigurationView(userEmailConfigurationNode)

this.userEmailEventsConfigurationInterface!!.addUserEmailEventConfiguration(userEmailEventConfigurationView!!.getUserEmailEventConfigurationInterface())
}

}

public constructor (userEmailEventsConfigurationInterface: UserEmailEventsConfigurationInterface)
            : super()
        {
var userEmailEventsConfigurationInterface = userEmailEventsConfigurationInterface
this.userEmailEventsConfigurationInterface= userEmailEventsConfigurationInterface
}


    open fun getUserEmailEventsConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: UserEmailEventsConfigurationInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userEmailEventsConfigurationInterface
}


                @Throws(Exception::class)
            
    open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document

    var userEmailConfigurationMapping: UserEmailEventsConfigurationMapping = UserEmailEventsConfigurationMapping(this.userEmailEventsConfigurationInterface)


    var node: Node = document.createElement(UserEmailEventsConfigurationData.NAME)!!


    var emailEventHashMap: HashMap<Any, Any> = this.getUserEmailEventsConfigurationInterface()!!.getEventConfigurationHashMap()!!


    var set: Set = emailEventHashMap!!.keys!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put("Number Of Email Events Specified in file: " +set.size(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                

    var eventNameArray: Array<Any?> = set.toArray()!!


    var size: Int = eventNameArray!!.size
                





                        for (index in 0 until size)

        {

    var eventName: String = eventNameArray[index]!! as String


    var userEmailEventsConfigurationInterface: UserEmailEventConfigurationInterface = emailEventHashMap!!.get(eventName as Object) as UserEmailEventConfigurationInterface


    var userEmailEventConfigurationView: UserEmailEventConfigurationView = UserEmailEventConfigurationView(userEmailEventsConfigurationInterface)

node.appendChild(userEmailEventConfigurationView!!.toXmlNode(document))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            


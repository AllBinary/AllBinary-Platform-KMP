
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
        package org.allbinary.business.user.modules.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.entry.EntryData
import org.allbinary.business.time.created.TimeCreatedView
import org.allbinary.business.time.modified.TimeLastModifiedView
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.logic.communication.smtp.configuration.user.UserEmailConfigurationData
import org.allbinary.logic.communication.smtp.configuration.user.UserEmailConfigurationInterface
import org.allbinary.logic.communication.smtp.configuration.user.UserEmailConfigurationView
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class UserConfigurationView
            : Object
        
                , DomNodeInterface {
        

    private var userConfigurationInterface: UserConfigurationInterface
public constructor (node: Node)
            : super()
        {
var node = node
this.userConfigurationInterface= UserConfiguration() as UserConfigurationInterface

    var childNodeList: NodeList = node.getChildNodes()!!


    var emailConfigurationNode: Node = DomSearchHelper.getNode(UserEmailConfigurationData.NAME, childNodeList)!!


    var userEmailConfigurationView: UserEmailConfigurationView = UserEmailConfigurationView(emailConfigurationNode)


    var userEmailConfigurationInterface: UserEmailConfigurationInterface = userEmailConfigurationView!!.getEmailConfigurationInterface() as UserEmailConfigurationInterface

userConfigurationInterface!!.setUserEmailConfigurationInterface(userEmailConfigurationInterface)

    var timeCreatedNode: Node = DomSearchHelper.getNode(EntryData.getInstance()!!.TIMECREATED, childNodeList)!!


    var timeCreatedView: TimeCreatedView = TimeCreatedView(timeCreatedNode)

this.userConfigurationInterface!!.setTimeCreated(timeCreatedView!!.getTimeCreated())

    var timeLastModifiedNode: Node = DomSearchHelper.getNode(EntryData.getInstance()!!.LASTMODIFIED, childNodeList)!!


    var timeLastModifiedView: TimeLastModifiedView = TimeLastModifiedView(timeLastModifiedNode)

this.userConfigurationInterface!!.setTimeLastModified(timeLastModifiedView!!.getTimeLastModified())
}

public constructor (userConfigurationInterface: UserConfigurationInterface)
            : super()
        {
var userConfigurationInterface = userConfigurationInterface
this.userConfigurationInterface= userConfigurationInterface
}


    open fun getUserConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: UserConfigurationInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userConfigurationInterface
}


                @Throws(Exception::class)
            
    open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document

    var node: Node = document.createElement(UserConfigurationData.NAME)!!


    var userEmailConfigurationView: UserEmailConfigurationView = UserEmailConfigurationView(this.userConfigurationInterface!!.getUserEmailConfigurationInterface())

node.appendChild(userEmailConfigurationView!!.toXmlNode(document))

    var timeCreatedView: TimeCreatedView = TimeCreatedView(userConfigurationInterface!!.getTimeCreated())

node.appendChild(timeCreatedView!!.toXmlNode(document))

    var timeLastModifiedView: TimeLastModifiedView = TimeLastModifiedView(userConfigurationInterface!!.getTimeLastModified())

node.appendChild(timeLastModifiedView!!.toXmlNode(document))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            


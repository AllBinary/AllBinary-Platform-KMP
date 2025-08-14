
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
        package org.allbinary.business.context.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.logic.communication.smtp.configuration.server.EmailServerConfigurationData
import org.allbinary.logic.communication.smtp.configuration.server.EmailServerConfigurationInterface
import org.allbinary.logic.communication.smtp.configuration.server.EmailServerConfigurationView
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class ContextConfigurationView
            : Object
        
                , DomNodeInterface {
        

    private var contextConfigurationInterface: ContextConfigurationInterface
public constructor        (node: Node)
            : super()
        {

                    var node = node

    var childNodeList: NodeList = node.getChildNodes()!!
            

this.contextConfigurationInterface= ContextConfiguration()

    var emailConfigurationNode: Node = DomSearchHelper.getNode(EmailServerConfigurationData.NAME, childNodeList)!!
            


    var emailServerConfigurationView: EmailServerConfigurationView = EmailServerConfigurationView(emailConfigurationNode)

this.contextConfigurationInterface!!.setEmailServerConfigurationInterface(emailServerConfigurationView!!.getEmailConfigurationInterface() as EmailServerConfigurationInterface)
}

public constructor        (contextConfigurationInterface: ContextConfigurationInterface)
            : super()
        {

                    var contextConfigurationInterface = contextConfigurationInterface
this.contextConfigurationInterface= contextConfigurationInterface
}


open fun getContextConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: ContextConfigurationInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.contextConfigurationInterface
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = document.createElement(ContextConfigurationData.getInstance()!!.NAME)!!
            


    var emailServerConfigurationView: EmailServerConfigurationView = EmailServerConfigurationView(this.getContextConfigurationInterface()!!.getEmailServerConfigurationInterface())

node.appendChild(emailServerConfigurationView!!.toXmlNode(document))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            


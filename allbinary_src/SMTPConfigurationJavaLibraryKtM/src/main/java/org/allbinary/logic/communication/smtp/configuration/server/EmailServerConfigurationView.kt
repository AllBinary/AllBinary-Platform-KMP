
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
        package org.allbinary.logic.communication.smtp.configuration.server



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class EmailServerConfigurationView
            : Object
        
                , DomNodeInterface {
        

    private var emailServerConfigurationInterface: EmailServerConfigurationInterface
public constructor        (node: Node)
            : super()
        {

                    var node = node

    var childNodeList: NodeList = node!!.getChildNodes()!!
            


    var server: String = DomNodeHelper.getTextNodeValue(EmailServerConfigurationData.SERVER, childNodeList)!!
            


    var accountName: String = DomNodeHelper.getTextNodeValue(EmailServerConfigurationData.ACCOUNT, childNodeList)!!
            


    var password: String = DomNodeHelper.getTextNodeValue(EmailServerConfigurationData.PASSWORD, childNodeList)!!
            

this.emailServerConfigurationInterface= EmailServerConfiguration(accountName, password, server) as EmailServerConfigurationInterface
}

public constructor        (emailServerConfigurationInterface: EmailServerConfigurationInterface)
            : super()
        {

                    var emailServerConfigurationInterface = emailServerConfigurationInterface
this.emailServerConfigurationInterface= emailServerConfigurationInterface
}


open fun getEmailConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: EmailServerConfigurationInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.emailServerConfigurationInterface
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var emailConfigurationMapping: EmailServerConfigurationMapping = EmailServerConfigurationMapping(this.emailServerConfigurationInterface)


    var hashMap: HashMap<Any, Any> = emailConfigurationMapping!!.toHashMap()!!
            


    var node: Node = ModDomHelper.createNodeWithValueNodes(document, EmailServerConfigurationData.NAME, hashMap)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            


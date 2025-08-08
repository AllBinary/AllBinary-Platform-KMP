
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
        package org.allbinary.logic.communication.ftp.configuration



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

open public class FtpConfigurationView
            : Object
        
                , DomNodeInterface {
        

    private var ftpConfigurationInterface: FtpConfigurationInterface
public constructor        (node: Node)
            : super()
        {

                    var node = node
this.setFtpConfigurationInterface(FtpConfiguration() as FtpConfigurationInterface)

    var chileNodeList: NodeList = node.getChildNodes()!!
            


    var server: String = DomNodeHelper.getTextNodeValue(FtpConfigurationData.SERVER, chileNodeList)!!
            

this.getFtpConfigurationInterface()!!.setServer(server)

    var userName: String = DomNodeHelper.getTextNodeValue(FtpConfigurationData.USERNAME, chileNodeList)!!
            

this.getFtpConfigurationInterface()!!.setUserName(userName)

    var password: String = DomNodeHelper.getTextNodeValue(FtpConfigurationData.PASSWORD, chileNodeList)!!
            

this.getFtpConfigurationInterface()!!.setPassword(password)

    var path: String = DomNodeHelper.getTextNodeValue(FtpConfigurationData.PATH, chileNodeList)!!
            

this.getFtpConfigurationInterface()!!.setPath(path)
}

public constructor        (ftpConfigurationInterface: FtpConfigurationInterface)
            : super()
        {

                    var ftpConfigurationInterface = ftpConfigurationInterface
this.setFtpConfigurationInterface(ftpConfigurationInterface)
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var ftpConfigurationMapping: FtpConfigurationMapping = FtpConfigurationMapping(this.getFtpConfigurationInterface())


    var hashMap: HashMap<Any, Any> = ftpConfigurationMapping!!.toHashMap()!!
            


    var node: Node = ModDomHelper.createNameValueNodes(document, FtpConfigurationData.NAME, hashMap)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


open fun getFtpConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: FtpConfigurationInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ftpConfigurationInterface
}


open fun setFtpConfigurationInterface(ftpConfigurationInterface: FtpConfigurationInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var ftpConfigurationInterface = ftpConfigurationInterface
this.ftpConfigurationInterface= ftpConfigurationInterface
}


}
                
            


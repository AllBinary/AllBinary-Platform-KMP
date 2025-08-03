
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
        package org.allbinary.dom



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayOutputStream
import java.io.File
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.Transformer
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.util.BasicArrayList
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class DomHelper
            : Object
         {
        

        companion object {


    private val instance: DomHelper = DomHelper()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DomHelper{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


open fun createDocument()
        //nullable = true from not(false or (false and true)) = true
: Document{
        try {
            
    var factory: DocumentBuilderFactory = DocumentBuilderFactory.newInstance()!!
            


    var builder: DocumentBuilder = factory!!.newDocumentBuilder()!!
            


    var document: Document = builder!!.newDocument()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document
} catch(e: Exception)
            {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


                @Throws(Exception::class)
            
open fun createDocument(xmlFile: File)
        //nullable = true from not(false or (false and false)) = true
: Document{

                    var xmlFile = xmlFile

        try {
            
    var factory: DocumentBuilderFactory = DocumentBuilderFactory.newInstance()!!
            


    var builder: DocumentBuilder = factory!!.newDocumentBuilder()!!
            


    var document: Document = builder!!.parse(xmlFile)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document
} catch(e: Exception)
            {


                            throw e
}

}


                @Throws(Exception::class)
            
open fun toString(document: Document)
        //nullable = true from not(false or (true and false)) = true
: String{

                    var document = document

        try {
            
    var domSource: DOMSource = DOMSource(document)


    var byteArrayOutputStream: ByteArrayOutputStream = ByteArrayOutputStream()


    var streamResult: StreamResult = StreamResult(byteArrayOutputStream)


    var copyTransformerFactory: TransformerFactory = TransformerFactory.newInstance()!!
            


    var copyTransformer: Transformer = copyTransformerFactory!!.newTransformer()!!
            

copyTransformer!!.transform(domSource, streamResult)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return byteArrayOutputStream!!.toString()
} catch(e: Exception)
            {


                            throw e
}

}


                @Throws(Exception::class)
            
open fun save(file: File, document: Document)
        //nullable = true from not(false or (false and false)) = true
{

                    var file = file


                    var document = document

        try {
            
    var copyTransformerFactory: TransformerFactory = TransformerFactory.newInstance()!!
            


    var copyTransformer: Transformer = copyTransformerFactory!!.newTransformer()!!
            


    var domSource: DOMSource = DOMSource(document)

file!!.createNewFile()

    var streamResult: StreamResult = StreamResult(file)

copyTransformer!!.transform(domSource, streamResult)
} catch(e: Exception)
            {


                            throw e
}

}


                @Throws(Exception::class)
            
open fun getChildNodeList(nodeName: String, nodeList: NodeList)
        //nullable = true from not(false or (false and false)) = true
: NodeList{

                    var nodeName = nodeName


                    var nodeList = nodeList

    var numberOfNodes: Int = nodeList!!.getLength()!!
            





                        for (index in 0 until numberOfNodes)


        {
    var node: Node = nodeList!!.item(index)!!
            


    
                        if(node!!.getNodeName()!!.compareTo(nodeName) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node!!.getChildNodes()

                                    }
                                
}




                            throw Exception(nodeName +" Node Not Found")
}


                @Throws(Exception::class)
            
open fun getChildrenWithoutTextNodes(nodeName: String, nodeList: NodeList)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var nodeName = nodeName


                    var nodeList = nodeList

    var list: BasicArrayList = BasicArrayList()


    var childNodeList: NodeList = getChildNodeList(nodeName, nodeList)!!
            


    var numberOfChildren: Int = childNodeList!!.getLength()!!
            





                        for (index in 0 until numberOfChildren)


        {
    var node: Node = childNodeList!!.item(index)!!
            


    
                        if(node!!.getNodeType() != Node.TEXT_NODE)
                        
                                    {
                                    list!!.add(node)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


                @Throws(Exception::class)
            
open fun getWithoutTextNodes(nodeList: NodeList)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var nodeList = nodeList

    var list: BasicArrayList = BasicArrayList()


    var numberOfChildren: Int = nodeList!!.getLength()!!
            





                        for (index in 0 until numberOfChildren)


        {
    var node: Node = nodeList!!.item(index)!!
            


    
                        if(node!!.getNodeType() != Node.TEXT_NODE)
                        
                                    {
                                    list!!.add(node)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


                @Throws(Exception::class)
            
open fun searchNodeList(nodeName: String, nodeList: NodeList)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var nodeName = nodeName


                    var nodeList = nodeList

    var numberOfNodes: Int = nodeList!!.getLength()!!
            





                        for (index in 0 until numberOfNodes)


        {
    var node: Node = nodeList!!.item(index)!!
            

logUtil!!.put("NodeName: " +node!!.getNodeName(), this, 
                            "searchNodeList")

    
                        if(node!!.getNodeName()!!.compareTo(nodeName) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node

                                    }
                                
}




                            throw Exception(nodeName +" Node Not Found in search")
}


                @Throws(Exception::class)
            
open fun searchNodeList(nodeName: String, nodeList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var nodeName = nodeName


                    var nodeList = nodeList

    var numberOfNodes: Int = nodeList!!.size()!!
            





                        for (index in 0 until numberOfNodes)


        {
    var node: Node = nodeList!!.get(index) as Node

logUtil!!.put("NodeName: " +node!!.getNodeName(), this, 
                            "searchNodeList")

    
                        if(node!!.getNodeName()!!.compareTo(nodeName) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node

                                    }
                                
}




                            throw Exception(nodeName +" Node Not Found in search")
}


}
                
            



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
        package org.allbinary.data.tree.dom



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Set
import java.util.Vector
import org.allbinary.logic.java.anyType.clazz.ClassUtil
import org.allbinary.logic.string.StringUtil
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class ModDomHelper
            : Object
         {
        

        companion object {


                @Throws(Exception::class)
            
open fun createTextNode(document: Document, name: String, text: String)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document


                    var name = name


                    var text = text

    var newValueNode: Node = document!!.createElement(name)!!
            


    var newValueTextNode: Node = document!!.createTextNode(text)!!
            

newValueNode!!.appendChild(newValueTextNode)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newValueNode
}


                @Throws(Exception::class)
            
open fun createValueNode(document: Document, text: String)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document


                    var text = text



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createTextNode(document, DomData.VALUE, text)
}


                @Throws(Exception::class)
            
open fun createNameNode(document: Document, text: String)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document


                    var text = text



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createTextNode(document, DomData.NAME, text)
}


                @Throws(Exception::class)
            
open fun createIndexNode(document: Document, index: Int)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document


                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createTextNode(document, DomData.INDEX, Integer(index).
                            toString())
}


                @Throws(Exception::class)
            
open fun createNameValueNodes(document: Document, elementName: String, nameText: String, valueText: String)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document


                    var elementName = elementName


                    var nameText = nameText


                    var valueText = valueText

    var newNode: Node = document!!.createElement(elementName)!!
            

newNode!!.appendChild(ModDomHelper.createNameNode(document, nameText))
newNode!!.appendChild(ModDomHelper.createValueNode(document, valueText))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newNode
}


                @Throws(Exception::class)
            
open fun createNameValueNodes(document: Document, elementNameAndNameText: String, valueText: String)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document


                    var elementNameAndNameText = elementNameAndNameText


                    var valueText = valueText

    var newNode: Node = ModDomHelper.createNameValueNodes(document, elementNameAndNameText, elementNameAndNameText, valueText)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newNode
}


                @Throws(Exception::class)
            
open fun createNameValueIndexNodes(document: Document, elementNameAndNameText: String, index: Int, valueText: String)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document


                    var elementNameAndNameText = elementNameAndNameText


                    var index = index


                    var valueText = valueText

    var newNode: Node = ModDomHelper.createNameValueNodes(document, elementNameAndNameText, valueText)!!
            

newNode!!.appendChild(ModDomHelper.createIndexNode(document, index))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newNode
}


                @Throws(Exception::class)
            
open fun createNameValueNodes(document: Document, rootNode: String, hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document


                    var rootNode = rootNode


                    var hashMap = hashMap

    var node: Node = document!!.createElement(rootNode)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createNameValueNodes(document, node, hashMap)
}


                @Throws(Exception::class)
            
open fun createNameValueNodes(document: Document, node: Node, hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document


                    var node = node


                    var hashMap = hashMap

    var stringUtil: StringUtil = StringUtil.getInstance()!!
            


    var keySet: Set = hashMap!!.keySet()!!
            


    var keyArray: Array<Any?> = keySet!!.toArray()!!
            


    var size: Int = keyArray!!.size
                





                        for (i in 0 until size)


        {
    var objectKey: Any = keyArray[i]!!


    var name: String = objectKey as String


    var anyType: Any = hashMap!!.get(objectKey as Object?) as Object


    
                        if(anyType == 
                                    null
                                )
                        
                                    {
                                    
    var value: String = stringUtil!!.EMPTY_STRING

node!!.appendChild(ModDomHelper.createNameValueNodes(document, name, value))

                                    }
                                
                             else 
    
                        if(anyType is String)
                        
                                    {
                                    
    var value: String = stringUtil!!.getInstance(anyType as String)!!
            

node!!.appendChild(ModDomHelper.createNameValueNodes(document, name, value))

                                    }
                                
                             else 
    
                        if(anyType is HashMap)
                        
                                    {
                                    node!!.appendChild(ModDomHelper.createNameValueNodes(document, name, hashMap))

                                    }
                                
                        else {
                            


                            throw Exception("HashMap value is the wrong instance and is: " +ClassUtil.viewAll(anyType, 
                            "\n"))

                        }
                            
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


                @Throws(Exception::class)
            
open fun createNameValueNodes(document: Document, rootNodeName: String, duplicateNodeName: String, valueVector: Vector)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document


                    var rootNodeName = rootNodeName


                    var duplicateNodeName = duplicateNodeName


                    var valueVector = valueVector

    var stringUtil: StringUtil = StringUtil.getInstance()!!
            


    var node: Node = document!!.createElement(rootNodeName)!!
            


    var size: Int = valueVector!!.size!!
            





                        for (i in 0 until size)


        {
    var value: String = stringUtil!!.getInstance(valueVector!!.get(i) as String)!!
            

node!!.appendChild(ModDomHelper.createNameValueNodes(document, duplicateNodeName, value))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


                @Throws(Exception::class)
            
open fun createNameValueIndexNodes(document: Document, rootNodeName: String, duplicateNodeName: String, valueVector: Vector)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document


                    var rootNodeName = rootNodeName


                    var duplicateNodeName = duplicateNodeName


                    var valueVector = valueVector

    var stringUtil: StringUtil = StringUtil.getInstance()!!
            


    var node: Node = document!!.createElement(rootNodeName)!!
            


    var size: Int = valueVector!!.size!!
            





                        for (index in 0 until size)


        {
    var value: String = stringUtil!!.getInstance(valueVector!!.get(index) as String)!!
            

node!!.appendChild(ModDomHelper.createNameValueIndexNodes(document, duplicateNodeName, index, value))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


                @Throws(Exception::class)
            
open fun createNodeWithValueNodes(document: Document, rootNode: String, hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document


                    var rootNode = rootNode


                    var hashMap = hashMap

    var node: Node = document!!.createElement(rootNode)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createNodeWithValueNodes(document, node, hashMap)
}


                @Throws(Exception::class)
            
open fun createNodeWithValueNodes(document: Document, node: Node, hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document


                    var node = node


                    var hashMap = hashMap

    var stringUtil: StringUtil = StringUtil.getInstance()!!
            


    var keySet: Set = hashMap!!.keySet()!!
            


    var keyArray: Array<Any?> = keySet!!.toArray()!!
            


    var size: Int = keyArray!!.size
                





                        for (i in 0 until size)


        {
    var name: String = keyArray[i]!! as String


    var anyType: Any = hashMap!!.get(name as Object?) as Object


    var value: String = stringUtil!!.getInstance(anyType as String)!!
            

node!!.appendChild(ModDomHelper.createTextNode(document, name, value))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}



        }
            private constructor        ()
            : super()
        {}


}
                
            



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
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class DomNodeHelper
            : Object
         {
        

        companion object {


open fun getFirstChildElement(parentNode: Node)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var parentNode = parentNode

    var node: Node = parentNode!!.getFirstChild()!!
            


    
                        if(node != 
                                    null
                                 && node!!.getNodeType() != Node.ELEMENT_NODE)
                        
                                    {
                                    
    var nodeList: NodeList = parentNode!!.getChildNodes()!!
            





                        for (index in 0 until nodeList!!.getLength()!!)


        {node= nodeList!!.item(index)

    
                        if(node!!.getNodeType() == 1)
                        
                                    {
                                    break;

                    

                                    }
                                
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


open fun getTextNodeValue(node: Node)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var node = node

    var nodeTextNode: Node = node!!.getFirstChild()!!
            


    
                        if(nodeTextNode != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return nodeTextNode!!.getNodeValue()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING

                        }
                            
}


                @Throws(Exception::class)
            
open fun getTextNodeValue(nodeName: String, nodeList: NodeList)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var nodeName = nodeName


                    var nodeList = nodeList

    var node: Node = DomSearchHelper.getNode(nodeName, nodeList)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DomNodeHelper.getTextNodeValue(node)
}


open fun getTextNodesValue(node: Node)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var node = node

    var stringBuffer: StringMaker = StringMaker()


    var nodeList: NodeList = node!!.getChildNodes()!!
            





                        for (index in 0 until nodeList!!.getLength()!!)


        {
    var nodeTextNode: Node = nodeList!!.item(index)!!
            


    
                        if(nodeTextNode!!.getNodeType() == Node.TEXT_NODE)
                        
                                    {
                                    
    
                        if(nodeTextNode != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(nodeTextNode!!.getNodeValue())

                                    }
                                

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}



        }
            private constructor        ()
            : super()
        {}


}
                
            


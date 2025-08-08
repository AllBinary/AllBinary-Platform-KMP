
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
        
import java.util.Vector
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class DomSearchHelper
            : Object
         {
        

        companion object {


open fun getNodeNoThrow(nodeName: String, nodeList: NodeList)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var nodeName = nodeName


                    var nodeList = nodeList

    var numberOfNodes: Int = nodeList!!.getLength()!!
            





                        for (index in 0 until numberOfNodes)


        {
    var node: Node = nodeList!!.item(index)!!
            


    
                        if(node.getNodeName()!!.compareTo(nodeName) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun getNode(nodeName: String, nodeList: NodeList)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var nodeName = nodeName


                    var nodeList = nodeList

    var node: Node = DomSearchHelper.getNodeNoThrow(nodeName, nodeList)!!
            


    
                        if(node != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node

                                    }
                                
                        else {
                            


                            throw Exception(nodeName +" Node Not Found in search")

                        }
                            
}


                @Throws(Exception::class)
            
open fun getChildNodeList(nodeName: String, nodeList: NodeList)
        //nullable = true from not(false or (false and false)) = true
: NodeList{

                    var nodeName = nodeName


                    var nodeList = nodeList

    var node: Node = DomSearchHelper.getNode(nodeName, nodeList)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node.getChildNodes()
}


                @Throws(Exception::class)
            
open fun getAllNodes(nodeName: String, nodeList: NodeList)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var nodeName = nodeName


                    var nodeList = nodeList

    var vector: Vector = DomSearchHelper.getAllNodesNoThrow(nodeName, nodeList)!!
            


    
                        if(vector == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception(nodeName +" Node Not Found in search")

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector

                        }
                            
}


open fun getAllNodesNoThrow(nodeName: String, nodeList: NodeList)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var nodeName = nodeName


                    var nodeList = nodeList

    var nodeVector: Vector = Vector()


    var numberOfNodes: Int = nodeList!!.getLength()!!
            





                        for (index in 0 until numberOfNodes)


        {
    var node: Node = nodeList!!.item(index)!!
            


    
                        if(node.getNodeName()!!.compareTo(nodeName) == 0)
                        
                                    {
                                    nodeVector!!.add(node)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return nodeVector
}



        }
            private constructor        ()
            : super()
        {}


}
                
            


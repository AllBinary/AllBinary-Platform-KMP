
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.w3c.dom.NodeList

open public class DomNodeListHelper
            : Object
         {
        
companion object {
            
    open fun getVector(nodeList: NodeList)
        //nullable = true from not(false or (false and false)) = true
: Vector{
var nodeList = nodeList

    var vector: Vector = Vector()


    var size: Int = nodeList!!.getLength()!!





                        for (index in 0 until size)

        {
vector.add(DomNodeHelper.getTextNodeValue(nodeList!!.item(index)))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            


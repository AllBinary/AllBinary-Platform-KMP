
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
        package org.allbinary.logic.visual.dhtml.style.css.property




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.logic.control.validate.ValidationInterface
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class CssPropertiesValidationFactory
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun getInstance(nodeList: NodeList)
        //nullable =  from not(true or (false and false)) = 
: Vector{
var nodeList = nodeList

    var propertiesVector: Vector = Vector()





                        for (index in 0 until nodeList!!.getLength()!!)

        {

    var node: Node = nodeList!!.item(index)!!


    
                        if(node.getNodeName()!!.compareTo(CssPropertyData.getInstance()!!.NAME) == 0)
                        
                                    {
                                    
    var cssPropertyValidationInterface: ValidationInterface = CssPropertyValidationFactory.getInstance(node) as ValidationInterface

propertiesVector!!.add(cssPropertyValidationInterface)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return propertiesVector
}


open fun getInstance(hashMap: HashMap<Any, Any>)
        //nullable =  from not(true or (false and false)) = 
: Vector{
var hashMap = hashMap

    var styles: Vector = Vector()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return styles
}


        }
            private constructor        ()
            : super()
        {
}


}
                
            


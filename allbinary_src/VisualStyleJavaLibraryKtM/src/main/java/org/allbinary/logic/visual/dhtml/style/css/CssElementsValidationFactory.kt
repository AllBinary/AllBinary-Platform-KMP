
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
        package org.allbinary.logic.visual.dhtml.style.css




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.logic.control.validate.ValidationInterface
import org.w3c.dom.Node

open public class CssElementsValidationFactory
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun getInstance(cssElementStyleNodeList: Vector)
        //nullable =  from not(true or (false and false)) = 
: Vector{

                    var cssElementStyleNodeList = cssElementStyleNodeList

    var styles: Vector = Vector()


    var size: Int = cssElementStyleNodeList!!.size!!


    var cssElementStyleNode: Node


    var cssValidationInterface: ValidationInterface





                        for (index in 0 until size)

        {cssElementStyleNode= cssElementStyleNodeList!!.get(index) as Node
cssValidationInterface= CssElementValidationFactory.getInstance(cssElementStyleNode) as ValidationInterface
styles.add(cssValidationInterface)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return styles
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
        {}


}
                
            


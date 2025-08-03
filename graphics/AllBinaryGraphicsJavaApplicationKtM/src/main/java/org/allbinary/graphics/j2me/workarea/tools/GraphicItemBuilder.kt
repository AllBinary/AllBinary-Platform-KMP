
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
        package org.allbinary.graphics.j2me.workarea.tools



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.w3c.dom.Node

open public class GraphicItemBuilder
            : Object
         {
        

        companion object {


                @Throws(Exception::class)
            
open fun getInstance(node: Node)
        //nullable =  from not(true or (false and false)) = 
: GraphicItemInterface{

                    var node = node

    var graphicItemName: String = node!!.getNodeName()!!
            


    
                        if(graphicItemName!!.compareTo(PointsDomUtil.getInstance()!!.LINES) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return LinesGraphicItem(node)

                                    }
                                
                        else {
                            


                            throw Exception("Graphic Item Does Not Exist: " +graphicItemName)

                        }
                            
}



        }
            private constructor        ()
            : super()
        {}


}
                
            


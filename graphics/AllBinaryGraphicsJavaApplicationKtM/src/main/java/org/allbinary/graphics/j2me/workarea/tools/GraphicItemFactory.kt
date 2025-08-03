
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
        
import java.util.HashMap
import org.allbinary.log.LOGGING
import org.allbinary.util.BasicArrayList
import org.w3c.dom.Node

open public class GraphicItemFactory
            : Object
         {
        

        companion object {


    private val instance: GraphicItemFactory = GraphicItemFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GraphicItemFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    private val graphicItems: HashMap<Any, Any>

    private val DEFAULT: GraphicsItemInterfaceFactoryInterface = SelectionToolFactory()
private constructor        ()
            : super()
        {graphicItems= HashMap<Any, Any>()
graphicItems!!.put(LinesGraphicItem.getStaticName(), LinesGraphicItemFactory())
}


open fun getInstance(itemName: String)
        //nullable =  from not(true or (false and false)) = 
: GraphicsItemInterfaceFactoryInterface{

                    var itemName = itemName

    var graphicsItemInterfaceFactoryInterface: GraphicsItemInterfaceFactoryInterface = graphicItems!!.get(itemName) as GraphicsItemInterfaceFactoryInterface


    
                        if(graphicsItemInterfaceFactoryInterface == 
                                    null
                                )
                        
                                    {
                                    graphicsItemInterfaceFactoryInterface= DEFAULT

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return graphicsItemInterfaceFactoryInterface
}


                @Throws(Exception::class)
            
open fun getInstance(graphicItemNodeList: BasicArrayList)
        //nullable =  from not(true or (false and false)) = 
: HashMap<Any, Any>{

                    var graphicItemNodeList = graphicItemNodeList

    var numberOfItems: Int = graphicItemNodeList!!.size()!!
            


    var graphicItemHashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    
                        if(LOGGING.contains(LOGGING.MENUEVENT))
                        
                                    {
                                    
                                    }
                                




                        for (index in 0 until numberOfItems)


        {
    var graphicItem: GraphicItemInterface = GraphicItemBuilder.getInstance(graphicItemNodeList!!.get(index) as Node)!!
            

graphicItemHashMap!!.put(graphicItem!!.getTreeNode(), graphicItem)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return graphicItemHashMap
}


}
                
            


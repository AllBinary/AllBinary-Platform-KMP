
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
        package org.allbinary.business.category




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringUtil
import org.apache.commons.lang3.StringUtils
import org.w3c.dom.Attr
import org.w3c.dom.NamedNodeMap
import org.w3c.dom.Node

open public class CategoryUtil
            : Object
         {
        

        companion object {
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getPathLevel(categoryPath: AbPath)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var categoryPath = categoryPath

    var count: Int = StringUtils.countMatches(categoryPath!!.toString(), AbPathData.getInstance()!!.SEPARATOR)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return count
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getNameFromNode(node: Node)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var node = node

    var attributes: NamedNodeMap = node.getAttributes()!!


    var attrNode: Attr = attributes.getNamedItem(CategoryData.getInstance()!!.LABEL) as Attr


    
                        if(attrNode != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return attrNode!!.getValue()

                                    }
                                
                        else {
                            
    var labelNode: Node = DomSearchHelper.getNodeNoThrow(CategoryData.getInstance()!!.LABEL, node.getChildNodes())!!


    
                        if(labelNode != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DomNodeHelper.getTextNodeValue(labelNode)

                                    }
                                

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


        }
            private constructor        ()
            : super()
        {}


}
                
            


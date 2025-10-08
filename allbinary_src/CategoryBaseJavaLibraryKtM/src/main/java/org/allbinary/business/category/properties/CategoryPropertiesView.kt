
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
        package org.allbinary.business.category.properties




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.category.CategoryData
import org.allbinary.data.tree.dom.DomNodeInterface
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node

open public class CategoryPropertiesView
            : Object
        
                , DomNodeInterface {
        

    var categoryPropertiesInterface: CategoryPropertiesInterface
public constructor (categoryPropertiesInterface: CategoryPropertiesInterface)
            : super()
        {
var categoryPropertiesInterface = categoryPropertiesInterface
this.categoryPropertiesInterface= categoryPropertiesInterface
}


                @Throws(Exception::class)
            
    open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document

    var categoryNode: Node = document.createElement(CategoryData.getInstance()!!.NAME)!!


    var newCategoryNode: Element = categoryNode as Element

newCategoryNode!!.setAttribute(CategoryData.getInstance()!!.LABEL, this.categoryPropertiesInterface!!.getValue())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return categoryNode
}


}
                
            


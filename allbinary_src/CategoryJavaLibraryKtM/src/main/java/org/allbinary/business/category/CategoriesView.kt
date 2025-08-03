
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.DomNodeInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class CategoriesView
            : Object
        
                , DomNodeInterface {
        

    private var categoryInterface: CategoryInterface
public constructor        (categoryInterface: CategoryInterface)
            : super()
        {

                    var categoryInterface = categoryInterface
this.categoryInterface= categoryInterface
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = CategoryView(categoryInterface).
                            toXmlNode(document)!!
            


    var childArray: Array<Any?> = this.categoryInterface!!.getChildNodes()!!.toArray()!!
            


    var size: Int = childArray!!.size
                





                        for (i in 0 until size)


        {
    var childCategoryInterface: CategoryInterface = childArray[i]!! as CategoryInterface


    var childCategoryNode: Node = CategoriesView(childCategoryInterface).
                            toXmlNode(document)!!
            

node!!.appendChild(childCategoryNode)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            


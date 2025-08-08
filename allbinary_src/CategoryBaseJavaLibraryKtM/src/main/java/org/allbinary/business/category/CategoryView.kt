
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
        
import java.util.Vector
import org.allbinary.business.category.properties.CategoryPropertiesInterface
import org.allbinary.business.category.properties.CategoryPropertiesView
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.anyType.InterfaceUtil
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class CategoryView
            : Object
        
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var categoryInterface: CategoryInterface
public constructor        (categoryInterface: CategoryInterface)
            : super()
        {

                    var categoryInterface = categoryInterface
this.categoryInterface= categoryInterface
}


open fun getCategoryInterface()
        //nullable = true from not(false or (false and true)) = true
: CategoryInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.categoryInterface
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = document.createElement(CategoryData.getInstance()!!.NAME)!!
            


    var childCategoryVector: Vector = this.categoryInterface!!.getChildNodes()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put("Number Of Children: " +childCategoryVector!!.size, this, 
                            "toXmlNode")

                                    }
                                

    var size: Int = childCategoryVector!!.size!!
            





                        for (i in 0 until size)


        {
    var anyType: Any = childCategoryVector!!.get(i)!!
            


    var categoryPropertiesInterface: CategoryPropertiesInterface = 
                null
            


    
                        if(InterfaceUtil.isImplemented(
                            "CategoryPropertiesInterface", anyType))
                        
                                    {
                                    categoryPropertiesInterface= anyType as CategoryPropertiesInterface

                                    }
                                
                             else 
    
                        if(InterfaceUtil.isImplemented(
                            "CategoryInterface", anyType))
                        
                                    {
                                    
    var categoryInterface: CategoryInterface = anyType as CategoryInterface

categoryPropertiesInterface= categoryInterface!!.getProperties()

                                    }
                                
                        else {
                            
    var isImpl: String = InterfaceUtil.viewAll(anyType!!::class, 
                            "\n")!!
            




                            throw Exception("CategoryView found unknown object.\n" +"Show Testing:" +isImpl)

                        }
                            

    var childCategoryNode: Node = CategoryPropertiesView(categoryPropertiesInterface).
                            toXmlNode(document)!!
            

node.appendChild(childCategoryNode)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            


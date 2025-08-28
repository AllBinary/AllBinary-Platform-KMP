
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
        package org.allbinary.business.category.store.theme




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.category.CategoryView
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.logic.visual.theme.ThemeInterface
import org.allbinary.logic.visual.theme.ThemePropertiesView
import org.allbinary.logic.visual.theme.ThemeValidation
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class StoreThemeCategoryPathView : CategoryView
                , DomNodeInterface {
        
public constructor        (categoryInterface: StoreThemeCategoryInterface)                        

                            : super(categoryInterface as StoreThemeCategoryInterface){
var categoryInterface = categoryInterface


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document

    var node: Node = super.toXmlNode(document)!!


    var storeThemeCategoryInterface: StoreThemeCategoryInterface = this.getCategoryInterface() as StoreThemeCategoryInterface


    var themeArray: Array<Any?> = storeThemeCategoryInterface!!.getThemes()!!.toArray()!!


    var size: Int = themeArray!!.size
                





                        for (i in 0 until size)

        {

    var themeValidation: ThemeValidation = themeArray[i]!! as ThemeValidation


    var domNodeInterface: DomNodeInterface = ThemePropertiesView(themeValidation as ThemeInterface) as DomNodeInterface

node.appendChild(domNodeInterface!!.toXmlNode(document))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            


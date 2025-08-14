
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
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.category.Category
import org.allbinary.business.category.CategoryInterface
import org.allbinary.business.category.properties.CategoryPropertiesFactoryInterface
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.logic.visual.theme.ThemeData
import org.allbinary.logic.visual.theme.ThemeValidation
import org.allbinary.logic.visual.theme.ThemesData
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class StoreThemeCategory : Category
                , StoreThemeCategoryInterface {
        

    private var transformInfoInterface: TransformInfoInterface

    private var themeVector: Vector
public constructor        (transformInfoInterface: TransformInfoInterface, categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface, level: Int)                        

                            : super(categoryPropertiesFactoryInterface, level){

                    var transformInfoInterface = transformInfoInterface


                    var categoryPropertiesFactoryInterface = categoryPropertiesFactoryInterface


                    var level = level


                            //For kotlin this is before the body of the constructor.
                    
this.transformInfoInterface= transformInfoInterface
this.themeVector= Vector()
}

public constructor        (transformInfoInterface: TransformInfoInterface, rootCategoryInterface: CategoryInterface, parentCategoryInterface: CategoryInterface, categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface)                        

                            : super(rootCategoryInterface, parentCategoryInterface, categoryPropertiesFactoryInterface){

                    var transformInfoInterface = transformInfoInterface


                    var rootCategoryInterface = rootCategoryInterface


                    var parentCategoryInterface = parentCategoryInterface


                    var categoryPropertiesFactoryInterface = categoryPropertiesFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    
this.transformInfoInterface= transformInfoInterface
this.themeVector= Vector()
}

public constructor        (transformInfoInterface: TransformInfoInterface, node: Node, categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface, level: Int)                        

                            : super(categoryPropertiesFactoryInterface, level){

                    var transformInfoInterface = transformInfoInterface


                    var node = node


                    var categoryPropertiesFactoryInterface = categoryPropertiesFactoryInterface


                    var level = level


                            //For kotlin this is before the body of the constructor.
                    
this.transformInfoInterface= transformInfoInterface
this.themeVector= Vector()
this.addThemes(node)
}

public constructor        (transformInfoInterface: TransformInfoInterface, node: Node, rootCategoryInterface: CategoryInterface, parentCategoryInterface: CategoryInterface, categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface)                        

                            : super(rootCategoryInterface, parentCategoryInterface, categoryPropertiesFactoryInterface){

                    var transformInfoInterface = transformInfoInterface


                    var node = node


                    var rootCategoryInterface = rootCategoryInterface


                    var parentCategoryInterface = parentCategoryInterface


                    var categoryPropertiesFactoryInterface = categoryPropertiesFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    
this.transformInfoInterface= transformInfoInterface
this.themeVector= Vector()
this.addThemes(node)
}


open fun getTransformInfoInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformInfoInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.transformInfoInterface
}


                @Throws(Exception::class)
            
open fun addThemes(node: Node)
        //nullable = true from not(false or (false and false)) = true
{

                    var node = node

    var themesNode: Node = DomSearchHelper.getNode(ThemesData.getInstance()!!.NAME, node.getChildNodes())!!
            


    var nodeList: NodeList = themesNode!!.getChildNodes()!!
            





                        for (index in 0 until nodeList!!.getLength()!!)


        {
    var themeNode: Node = nodeList!!.item(index)!!
            


    
                        if(themeNode!!.getNodeName()!!.compareTo(ThemeData.getInstance()!!.NAME) == 0)
                        
                                    {
                                    this.themeVector!!.add(ThemeValidation(this, themeNode))

                                    }
                                
}

}


open fun addTheme(themeValidation: ThemeValidation)
        //nullable = true from not(false or (false and false)) = true
{

                    var themeValidation = themeValidation
this.themeVector!!.add(themeValidation)
}


open fun getThemes()
        //nullable = true from not(false or (false and true)) = true
: Vector{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.themeVector
}


                @Throws(Exception::class)
            
open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(!super.isValid()!!)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}


                @Throws(Exception::class)
            
open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var categoryHashMap: HashMap<Any, Any> = super.toHashMap()!!
            

categoryHashMap!!.put(ThemesData.getInstance()!!.NAME, this.themeVector)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return categoryHashMap
}


                @Throws(Exception::class)
            
open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{
    var categoryVector: Vector = super.toVector()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return categoryVector
}


}
                
            


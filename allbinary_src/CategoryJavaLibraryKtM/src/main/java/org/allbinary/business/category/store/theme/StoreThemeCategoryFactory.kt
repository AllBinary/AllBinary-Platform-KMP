
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
import org.allbinary.business.category.CategoryFactoryInterface
import org.allbinary.business.category.CategoryInterface
import org.allbinary.business.category.CategoryUtil
import org.allbinary.business.category.properties.CategoryPropertiesFactory
import org.allbinary.business.category.properties.CategoryPropertiesFactoryInterface
import org.allbinary.business.category.properties.root.store.theme.RootStoreThemeCategoryPropertiesFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.string.CommonStrings
import org.w3c.dom.Node

open public class StoreThemeCategoryFactory
            : Object
        
                , CategoryFactoryInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var transformInfoInterface: TransformInfoInterface
public constructor (transformInfoInterface: TransformInfoInterface)
            : super()
        {
var transformInfoInterface = transformInfoInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.START, this, "StoreCategoryFactory(TransformInfoInterface transformInfoInterface)")

                                    }
                                
this.transformInfoInterface= transformInfoInterface
}


    open fun getRootInstance()
        //nullable = true from not(false or (false and true)) = true
: CategoryInterface{

        try {
            
    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = RootStoreThemeCategoryPropertiesFactory(this.transformInfoInterface) as CategoryPropertiesFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StoreThemeCategory(this.transformInfoInterface, categoryPropertiesFactoryInterface, 0) as CategoryInterface
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getRootInstance()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


    open fun getRootInstance(categoryAbPath: AbPath)
        //nullable = true from not(false or (false and false)) = true
: CategoryInterface{
var categoryAbPath = categoryAbPath

        try {
            
    var level: Int = CategoryUtil.getPathLevel(categoryAbPath)!!


    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = RootStoreThemeCategoryPropertiesFactory(this.transformInfoInterface, categoryAbPath) as CategoryPropertiesFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StoreThemeCategory(this.transformInfoInterface, categoryPropertiesFactoryInterface, level) as CategoryInterface
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getRootInstance(String)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


    open fun getRootInstanceFromNode(node: Node)
        //nullable = true from not(false or (false and false)) = true
: CategoryInterface{
var node = node

        try {
            
    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = RootStoreThemeCategoryPropertiesFactory(this.transformInfoInterface, node) as CategoryPropertiesFactoryInterface


    var categoryPath: AbPath = AbPath(CategoryUtil.getNameFromNode(node))


    var level: Int = CategoryUtil.getPathLevel(categoryPath)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StoreThemeCategory(this.transformInfoInterface, node, categoryPropertiesFactoryInterface, level) as CategoryInterface
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getRootInstance(node)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


    open fun getInstance(categoryPath: String, level: Int)
        //nullable =  from not(true or (false and false)) = 
: CategoryInterface{
var categoryPath = categoryPath
var level = level

        try {
            
    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = CategoryPropertiesFactory(categoryPath) as CategoryPropertiesFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StoreThemeCategory(this.transformInfoInterface, categoryPropertiesFactoryInterface, level) as CategoryInterface
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getInstance(String, int)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


    open fun getInstance(rootCategoryInterface: CategoryInterface, parentCategoryInterface: CategoryInterface, categoryPath: String)
        //nullable =  from not(true or (false and false)) = 
: CategoryInterface{
var rootCategoryInterface = rootCategoryInterface
var parentCategoryInterface = parentCategoryInterface
var categoryPath = categoryPath

        try {
            
    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = CategoryPropertiesFactory(categoryPath) as CategoryPropertiesFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StoreThemeCategory(this.transformInfoInterface, rootCategoryInterface, parentCategoryInterface, categoryPropertiesFactoryInterface) as CategoryInterface
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getInstance(CategoryInterface, CategoryInterface , String, int)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


    open fun getInstance(node: Node, level: Int)
        //nullable =  from not(true or (false and false)) = 
: CategoryInterface{
var node = node
var level = level

        try {
            
    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = CategoryPropertiesFactory(node) as CategoryPropertiesFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StoreThemeCategory(this.transformInfoInterface, categoryPropertiesFactoryInterface, level) as CategoryInterface
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getInstance(Node, int)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


    open fun getInstance(rootCategoryInterface: CategoryInterface, parentCategoryInterface: CategoryInterface, node: Node)
        //nullable =  from not(true or (false and false)) = 
: CategoryInterface{
var rootCategoryInterface = rootCategoryInterface
var parentCategoryInterface = parentCategoryInterface
var node = node

        try {
            
    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = CategoryPropertiesFactory(node) as CategoryPropertiesFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StoreThemeCategory(this.transformInfoInterface, rootCategoryInterface, parentCategoryInterface, categoryPropertiesFactoryInterface) as CategoryInterface
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getInstance(CategoryInterface, CategoryInterface, Node, int)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


    open fun getInstance(categoryPropertiesHashMap: HashMap<Any, Any>, level: Int)
        //nullable =  from not(true or (false and false)) = 
: CategoryInterface{
var categoryPropertiesHashMap = categoryPropertiesHashMap
var level = level

        try {
            
    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = CategoryPropertiesFactory(categoryPropertiesHashMap) as CategoryPropertiesFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StoreThemeCategory(this.transformInfoInterface, categoryPropertiesFactoryInterface, level) as CategoryInterface
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getInstance(HashMap)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


    open fun getInstance(rootCategoryInterface: CategoryInterface, parentCategoryInterface: CategoryInterface, categoryPropertiesHashMap: HashMap<Any, Any>)
        //nullable =  from not(true or (false and false)) = 
: CategoryInterface{
var rootCategoryInterface = rootCategoryInterface
var parentCategoryInterface = parentCategoryInterface
var categoryPropertiesHashMap = categoryPropertiesHashMap

        try {
            
    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = CategoryPropertiesFactory(categoryPropertiesHashMap) as CategoryPropertiesFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StoreThemeCategory(this.transformInfoInterface, rootCategoryInterface, parentCategoryInterface, categoryPropertiesFactoryInterface) as CategoryInterface
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getInstance(CategoryInterface, CategoryInterface, HashMap)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


}
                
            


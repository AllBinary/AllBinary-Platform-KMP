
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
        
import java.util.HashMap
import org.allbinary.business.category.properties.CategoryPropertiesFactory
import org.allbinary.business.category.properties.CategoryPropertiesFactoryInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.path.AbPath
import org.allbinary.string.CommonStrings
import org.w3c.dom.Node

open public class CategoryAbstractFactory
            : Object
        
                , CategoryFactoryInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            
public constructor        ()
            : super()
        {}


open fun getRootInstance()
        //nullable = true from not(false or (false and true)) = true
: CategoryInterface{


                            throw RuntimeException()
}


open fun getRootInstance(categoryAbPath: AbPath)
        //nullable = true from not(false or (false and false)) = true
: CategoryInterface{

                    var categoryAbPath = categoryAbPath



                            throw RuntimeException()
}


open fun getRootInstanceFromNode(node: Node)
        //nullable = true from not(false or (false and false)) = true
: CategoryInterface{

                    var node = node



                            throw RuntimeException()
}


open fun getInstance(categoryName: String)
        //nullable =  from not(true or (false and false)) = 
: CategoryInterface{

                    var categoryName = categoryName

        try {
            
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, 
                            "getInstance(String)")

                                    }
                                

    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = CategoryPropertiesFactory(categoryName) as CategoryPropertiesFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Category(categoryPropertiesFactoryInterface) as CategoryInterface
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "getInstance(String, int)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun getInstance(rootCategoryInterface: CategoryInterface, parentCategoryInterface: CategoryInterface, categoryName: String)
        //nullable =  from not(true or (false and false)) = 
: CategoryInterface{

                    var rootCategoryInterface = rootCategoryInterface


                    var parentCategoryInterface = parentCategoryInterface


                    var categoryName = categoryName

        try {
            
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, 
                            "getInstance(CategoryInterface, CategoryInterface, String)")

                                    }
                                

    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = CategoryPropertiesFactory(categoryName) as CategoryPropertiesFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Category(rootCategoryInterface, parentCategoryInterface, categoryPropertiesFactoryInterface) as CategoryInterface
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "getInstance(CategoryInterface, CategoryInterface , String, int)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun getInstance(node: Node)
        //nullable =  from not(true or (false and false)) = 
: CategoryInterface{

                    var node = node

        try {
            
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, 
                            "getInstance(Node)")

                                    }
                                

    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = CategoryPropertiesFactory(node) as CategoryPropertiesFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Category(categoryPropertiesFactoryInterface) as CategoryInterface
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "getInstance(Node, int)", e)

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
            
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, 
                            "getInstance(CategoryInterface, CategoryInterface, Node)")

                                    }
                                

    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = CategoryPropertiesFactory(node) as CategoryPropertiesFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Category(rootCategoryInterface, parentCategoryInterface, categoryPropertiesFactoryInterface) as CategoryInterface
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "getInstance(CategoryInterface, CategoryInterface, Node, int)", e)

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
            
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, 
                            "getInstance(CategoryInterface, CategoryInterface, HashMap)")

                                    }
                                

    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = CategoryPropertiesFactory(categoryPropertiesHashMap) as CategoryPropertiesFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Category(rootCategoryInterface, parentCategoryInterface, categoryPropertiesFactoryInterface) as CategoryInterface
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.CATEGORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "getInstance(CategoryInterface, CategoryInterface, HashMap)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


}
                
            


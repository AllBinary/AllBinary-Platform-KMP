
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
        package org.allbinary.business.category.store




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.category.Category
import org.allbinary.business.category.CategoryAbstractFactory
import org.allbinary.business.category.CategoryFactoryInterface
import org.allbinary.business.category.CategoryInterface
import org.allbinary.business.category.CategoryUtil
import org.allbinary.business.category.properties.CategoryPropertiesFactoryInterface
import org.allbinary.business.category.properties.root.store.RootStoreCategoryPropertiesFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Node

open public class StoreCategoryFactory : CategoryAbstractFactory
                , CategoryFactoryInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var transformInfoInterface: TransformInfoInterface
public constructor        (transformInfoInterface: TransformInfoInterface){

                    var transformInfoInterface = transformInfoInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.START, this, 
                            "StoreCategoryFactory(TransformInfoInterface transformInfoInterface)")

                                    }
                                
this.transformInfoInterface= transformInfoInterface
}


open fun getRootInstance()
        //nullable = true from not(false or (false and true)) = true
: CategoryInterface{
        try {
            
    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = RootStoreCategoryPropertiesFactory(this.transformInfoInterface) as CategoryPropertiesFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Category(categoryPropertiesFactoryInterface) as CategoryInterface
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "getInstance(String, int)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun getRootInstance(categoryPath: AbPath)
        //nullable = true from not(false or (false and false)) = true
: CategoryInterface{

                    var categoryPath = categoryPath

        try {
            
    var level: Int = CategoryUtil.getPathLevel(categoryPath)!!
            


    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = RootStoreCategoryPropertiesFactory(this.transformInfoInterface, categoryPath) as CategoryPropertiesFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Category(categoryPropertiesFactoryInterface, level) as CategoryInterface
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "getInstance(String, int)", e)

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
            
    var categoryPropertiesFactoryInterface: CategoryPropertiesFactoryInterface = RootStoreCategoryPropertiesFactory(this.transformInfoInterface, node) as CategoryPropertiesFactoryInterface


    var categoryPath: AbPath = AbPath(CategoryUtil.getNameFromNode(node))


    var level: Int = CategoryUtil.getPathLevel(categoryPath)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Category(categoryPropertiesFactoryInterface, level) as CategoryInterface
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "getInstance(String, int)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


}
                
            



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
        package org.allbinary.business.category.properties.root.store




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.category.properties.CategoryPropertiesFactoryInterface
import org.allbinary.business.category.properties.CategoryPropertiesInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.string.CommonStrings
import org.w3c.dom.Node

open public class RootStoreCategoryPropertiesFactory
            : Object
        
                , CategoryPropertiesFactoryInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var categoryPropertiesInterface: CategoryPropertiesInterface
public constructor        (transformInfoInterface: TransformInfoInterface)
            : super()
        {

                    var transformInfoInterface = transformInfoInterface
this.categoryPropertiesInterface= RootStoreCategoryProperties(transformInfoInterface) as CategoryPropertiesInterface
}

public constructor        (transformInfoInterface: TransformInfoInterface, abPath: AbPath)
            : super()
        {

                    var transformInfoInterface = transformInfoInterface


                    var abPath = abPath
this.categoryPropertiesInterface= RootStoreCategoryProperties(transformInfoInterface, abPath) as CategoryPropertiesInterface
}

public constructor        (transformInfoInterface: TransformInfoInterface, node: Node)
            : super()
        {

                    var transformInfoInterface = transformInfoInterface


                    var node = node
this.categoryPropertiesInterface= RootStoreCategoryProperties(transformInfoInterface, node) as CategoryPropertiesInterface
}

public constructor        (transformInfoInterface: TransformInfoInterface, categoryPropertiesHashMap: HashMap<Any, Any>)
            : super()
        {

                    var transformInfoInterface = transformInfoInterface


                    var categoryPropertiesHashMap = categoryPropertiesHashMap
this.categoryPropertiesInterface= RootStoreCategoryProperties(transformInfoInterface, categoryPropertiesHashMap) as CategoryPropertiesInterface
}


open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CategoryPropertiesInterface{
        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.categoryPropertiesInterface as CategoryPropertiesInterface
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


}
                
            


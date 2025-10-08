
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
        
import java.util.HashMap
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.w3c.dom.Node

open public class CategoryPropertiesFactory
            : Object
        
                , CategoryPropertiesFactoryInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var categoryPropertiesInterface: CategoryPropertiesInterface
public constructor (name: String)
            : super()
        {
var name = name
this.categoryPropertiesInterface= CategoryProperties(name) as CategoryPropertiesInterface
}

public constructor (node: Node)
            : super()
        {
var node = node
this.categoryPropertiesInterface= CategoryProperties(node) as CategoryPropertiesInterface
}

public constructor (categoryPropertiesHashMap: HashMap<Any, Any>)
            : super()
        {
var categoryPropertiesHashMap = categoryPropertiesHashMap
this.categoryPropertiesInterface= CategoryProperties(categoryPropertiesHashMap) as CategoryPropertiesInterface
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
                
            


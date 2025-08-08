
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
        package org.allbinary.data.tree.category



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.category.CategoryFactoryInterface
import org.allbinary.business.category.CategoryInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.directory.Directory
import org.allbinary.logic.io.path.AbPath
import org.allbinary.string.CommonStrings

open public class CategoryModifierTree : CategoryPrivateTree
                , CategoryModifierTreeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val directory: Directory = Directory.getInstance()!!
            
public constructor        (categoryFactoryInterface: CategoryFactoryInterface)                        

                            : super(categoryFactoryInterface){

                    var categoryFactoryInterface = categoryFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.START, this, 
                            "CategoryModifierTree(CategoryFactoryInterface categoryFactoryInterface)")

                                    }
                                
}


open fun insert(parentCategoryInterface: CategoryInterface, newChildCategoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var parentCategoryInterface = parentCategoryInterface


                    var newChildCategoryInterface = newChildCategoryInterface

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put(
                            "Inserting", this, 
                            "insert()")

                                    }
                                

    
                        if(parentCategoryInterface!!.isValid()!!)
                        
                                    {
                                    parentCategoryInterface!!.addChild(newChildCategoryInterface)

    var directoryToBeCreatedAbPath: AbPath = AbPath(newChildCategoryInterface!!.getRootFilePath()!!.toString() +newChildCategoryInterface!!.getPath()!!.toString())

this.directory.create(directoryToBeCreatedAbPath)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put(
                            "Saving", this, 
                            "insert()")

                                    }
                                
this.save(parentCategoryInterface)
this.save(newChildCategoryInterface)

                                    }
                                
                             else 
    
                        if()
                        
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "insert", e)

                                    }
                                
}

}


open fun delete(parentCategoryInterface: CategoryInterface, existingChildCategoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var parentCategoryInterface = parentCategoryInterface


                    var existingChildCategoryInterface = existingChildCategoryInterface

        try {
            
    
                        if(parentCategoryInterface!!.isValid()!!)
                        
                                    {
                                    parentCategoryInterface!!.addChild(existingChildCategoryInterface)

    var directoryToBeDeletedAbPath: AbPath = AbPath(existingChildCategoryInterface!!.getRootFilePath()!!.toString() +existingChildCategoryInterface!!.getPath()!!.toString())

this.delete(existingChildCategoryInterface)
parentCategoryInterface!!.removeChild(existingChildCategoryInterface)
this.save(parentCategoryInterface)
this.directory.remove(directoryToBeDeletedAbPath)

                                    }
                                
                             else 
    
                        if()
                        
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, commonStrings!!.delete, e)

                                    }
                                
}

}


}
                
            


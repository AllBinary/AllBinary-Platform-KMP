
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.category.CategoryComponent
import org.allbinary.business.category.CategoryData
import org.allbinary.business.category.CategoryFactoryInterface
import org.allbinary.business.category.CategoryInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.crypt.file.CryptFileWriter
import org.allbinary.logic.io.file.AbFile
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document

open public class CategoryPrivateTree
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    var categoryFactoryInterface: CategoryFactoryInterface
public constructor        (categoryFactoryInterface: CategoryFactoryInterface)
            : super()
        {

                    var categoryFactoryInterface = categoryFactoryInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.START, this, "CategoryPrivateTree(CategoryFactoryInterface categoryFactoryInterface)")

                                    }
                                
this.categoryFactoryInterface= categoryFactoryInterface
}


                @Throws(Exception::class)
            
open fun save(categoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var categoryInterface = categoryInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put("Saving Category File: " +categoryInterface!!.getFilePath(), this, "save()")

                                    }
                                

    var document: Document = CategoryComponent(categoryInterface).
                            toXmlDoc()!!
            


    var cryptFileWriter: CryptFileWriter = CryptFileWriter(CategoryData.getInstance()!!.UNCRYPTED_EXTENSION, CategoryData.getInstance()!!.ENCRYPTED_EXTENSION)

cryptFileWriter!!.write(categoryInterface!!.getFilePath(), document)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put("end", this, "save()")

                                    }
                                
}


                @Throws(Exception::class)
            
open fun delete(categoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var categoryInterface = categoryInterface

    
                        if(categoryInterface!!.isLeaf())
                        
                                    {
                                    
    var categoryFile: AbFile = AbFile(categoryInterface!!.getFilePath())


    
                        if(categoryFile!!.delete())
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put("Removed: " +categoryInterface!!.getFilePath(), this, "delete(CategoryInterface)")

                                    }
                                

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put("Not a leaf unable to remove", this, "delete(CategoryInterface)")

                                    }
                                

                        }
                            
}


}
                
            



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
        
import org.allbinary.business.category.CategoryData
import org.allbinary.business.category.CategoryFactoryInterface
import org.allbinary.business.category.CategoryInterface
import org.allbinary.business.category.properties.CategoryProperties
import org.allbinary.business.category.properties.CategoryPropertiesInterface
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.crypt.file.CryptFileReader
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.path.AbPath
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class CategoryLoader : CategoryModifierTree
                , CategoryLoaderInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        (categoryFactoryInterface: CategoryFactoryInterface)                        

                            : super(categoryFactoryInterface){

                    var categoryFactoryInterface = categoryFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.START, this, "CategoryLoader(CategoryFactoryInterface categoryFactoryInterface)")

                                    }
                                
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getDoc(categoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
: Document{

                    var categoryInterface = categoryInterface

        try {
            
    
                        if(categoryInterface!!.getProperties()!!.getPath(categoryInterface!!.getHierarchy()) != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(categoryInterface!!.getHierarchy()!!.getLevel() == 1)
                        
                                    {
                                    
    var rootAbFile: AbFile = AbFile(categoryInterface!!.getRootFilePath())


    
                        if(!rootAbFile!!.isDirectory())
                        
                                    {
                                    rootAbFile!!.mkdirs()

    
                        if(!rootAbFile!!.isDirectory())
                        
                                    {
                                    


                            throw Exception("Could Not Create Directory")

                                    }
                                
this.save(categoryInterface)

                                    }
                                

                                    }
                                

    var fileAbPath: AbPath = categoryInterface!!.getFilePath()!!


    var cryptFileReader: CryptFileReader = CryptFileReader(CategoryData.getInstance()!!.UNCRYPTED_EXTENSION, CategoryData.getInstance()!!.ENCRYPTED_EXTENSION)


    var document: Document = DomDocumentHelper.create(cryptFileReader!!.get(fileAbPath))!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document

                                    }
                                
                        else {
                            


                            throw Exception("Null Category")

                        }
                            
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    
        try {
            categoryInterface!!.log()
} catch(e2: Exception)
            {logUtil!!.put("Could Not Log Category", this, "getDoc", e)
}

logUtil!!.put(this.commonStrings!!.FAILURE, this, "getDoc", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun get(categoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
: CategoryInterface{

                    var categoryInterface = categoryInterface

        try {
            
    var document: Document = this.getDoc(categoryInterface)!!


    var categoryNode: Node = DomSearchHelper.getNode(CategoryData.getInstance()!!.NAME, document.getChildNodes())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.addProperties(categoryInterface, categoryNode!!.getChildNodes())
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, commonStrings!!.GET, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun get(document: Document)
        //nullable = true from not(false or (false and false)) = true
: CategoryInterface{

                    var document = document

        try {
            
    var categoryNode: Node = DomSearchHelper.getNode(CategoryData.getInstance()!!.NAME, document.getChildNodes())!!


    var loadedCategoryInterface: CategoryInterface = this.categoryFactoryInterface!!.getRootInstanceFromNode(categoryNode)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.addProperties(loadedCategoryInterface, categoryNode!!.getChildNodes())
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, commonStrings!!.GET, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getAll(categoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
: CategoryInterface{

                    var categoryInterface = categoryInterface

        try {
            
    var document: Document = this.getDoc(categoryInterface)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getAll(document)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, commonStrings!!.GET, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getAll(document: Document)
        //nullable = true from not(false or (false and false)) = true
: CategoryInterface{

                    var document = document

        try {
            
    var categoryNode: Node = DomSearchHelper.getNode(CategoryData.getInstance()!!.NAME, document.getChildNodes())!!


    var loadedCategoryInterface: CategoryInterface = this.categoryFactoryInterface!!.getRootInstanceFromNode(categoryNode)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.addProperties(loadedCategoryInterface, categoryNode!!.getChildNodes())
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, commonStrings!!.GET, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getAll(parentCategoryInterface: CategoryInterface, categoryNodeList: NodeList)
        //nullable = true from not(false or (false and false)) = true
: CategoryInterface{

                    var parentCategoryInterface = parentCategoryInterface


                    var categoryNodeList = categoryNodeList

        try {
            
    
                        if(categoryNodeList != 
                                    null
                                )
                        
                                    {
                                    



                        for (index in 0 until categoryNodeList!!.getLength()!!)

        {
    var categoryNode: Node = categoryNodeList!!.item(index)!!


    
                        if(categoryNode != 
                                    null
                                 && categoryNode!!.getNodeName()!!.compareTo(CategoryData.getInstance()!!.NAME) == 0)
                        
                                    {
                                    
    var categoryInterface: CategoryInterface = this.categoryFactoryInterface!!.getInstance(parentCategoryInterface!!.getHierarchy()!!.getRoot(), parentCategoryInterface, categoryNode) as CategoryInterface

parentCategoryInterface!!.addChild(categoryInterface)

                                    }
                                
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return parentCategoryInterface
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, commonStrings!!.GET, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun addProperties(loadedCategoryInterface: CategoryInterface, categoryNodeList: NodeList)
        //nullable = true from not(false or (false and false)) = true
: CategoryInterface{

                    var loadedCategoryInterface = loadedCategoryInterface


                    var categoryNodeList = categoryNodeList

        try {
            
    
                        if(categoryNodeList != 
                                    null
                                )
                        
                                    {
                                    



                        for (index in 0 until categoryNodeList!!.getLength()!!)

        {
    var categoryNode: Node = categoryNodeList!!.item(index)!!


    
                        if(categoryNode != 
                                    null
                                 && categoryNode!!.getNodeName()!!.compareTo(CategoryData.getInstance()!!.NAME) == 0)
                        
                                    {
                                    
    var categoryPropertiesInterface: CategoryPropertiesInterface = CategoryProperties(categoryNode) as CategoryPropertiesInterface

loadedCategoryInterface!!.addChildProperty(categoryPropertiesInterface)

                                    }
                                
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return loadedCategoryInterface
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, commonStrings!!.GET, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


}
                
            


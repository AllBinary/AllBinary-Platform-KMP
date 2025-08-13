
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
        package admin.taghelpers



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Map
import java.util.Set
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.business.category.CategoryComponent
import org.allbinary.business.category.CategoryData
import org.allbinary.business.category.CategoryInterface
import org.allbinary.business.category.store.StoreCategoryFactory
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.data.tree.category.CategoryLoaderFactory
import org.allbinary.data.tree.category.CategoryLoaderInterface
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.visual.transform.info.TransformInfoBasic
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class CategoryRequestHelper : ModifyTable {
        

        companion object {
            
    private val categoryRequest: String = StringMaker().
                            append(
                            "<")!!.append(CategoryData.getInstance()!!.REQUEST)!!.append(
                            ">")!!.toString()!!
            

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var pageContext: PageContext

    private var hashMap: HashMap<Any, Any>

    private var request: HttpServletRequest

    private var categoryLoaderInterface: CategoryLoaderInterface

    private var categoryInterface: CategoryInterface

    private var childCategoryInterface: CategoryInterface

    private var transformInfoInterface: TransformInfoInterface
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext){

                    var hashMap = hashMap


                    var pageContext = pageContext

        try {
            this.request= pageContext!!.getRequest() as HttpServletRequest
this.pageContext= pageContext
this.hashMap= hashMap
this.getXmlData()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "CategoryRequestHelper()", e)

                                    }
                                
}

}


open fun getXmlData()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var map: Map = this.request.getParameterMap()!!
            


    var categoryData: CategoryData = CategoryData.getInstance()!!
            


    var keys: Set = map.keySet()!!
            


    var keyArray: Array<Any?> = keys.toArray()!!
            


    var size: Int = keyArray!!.size
                


    
                        if(size > 0)
                        
                                    {
                                    
    var xmlRequest: String = keyArray[0]!! as String


    var index: Int = 1


        while(index < size && !xmlRequest!!.startsWith(categoryRequest))
        {xmlRequest= keyArray[index]!! as String

    
                        if(xmlRequest!!.startsWith(categoryRequest))
                        
                                    //Otherwise - thenStmt - BreakStmt

}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put(xmlRequest, this, 
                            "getXmlData()")

                                    }
                                

    var document: Document = DomDocumentHelper.create(xmlRequest)!!
            


    var requestNode: Node = DomSearchHelper.getNode(categoryData!!.REQUEST, document.getChildNodes())!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put(DomDocumentHelper.toString(document), this, 
                            "getXmlData()")

                                    }
                                
this.setCategoryLoader(requestNode)

    var parentCategoryNode: Node = DomSearchHelper.getNode(categoryData!!.PARENT, requestNode!!.getChildNodes())!!
            


    var categoryNode: Node = DomSearchHelper.getNode(categoryData!!.NAME, parentCategoryNode!!.getChildNodes())!!
            

this.categoryInterface= StoreCategoryFactory(this.transformInfoInterface).
                            getRootInstanceFromNode(categoryNode) as CategoryInterface
this.categoryInterface= this.categoryLoaderInterface!!.get(this.categoryInterface)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    this.categoryInterface!!.log()
logUtil!!.put(
                            "Loaded Parent Category", this, 
                            "getXmlData()")

                                    }
                                

    var childCategoryNode: Node = DomSearchHelper.getNodeNoThrow(categoryData!!.NAME, requestNode!!.getChildNodes())!!
            


    
                        if(childCategoryNode != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put(
                            "Loading Child Category", this, 
                            "getXmlData()")

                                    }
                                
this.childCategoryInterface= StoreCategoryFactory(this.transformInfoInterface).
                            getInstance(childCategoryNode) as CategoryInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    this.childCategoryInterface!!.log()
logUtil!!.put(
                            "Loaded Child Category", this, 
                            "getXmlData()")

                                    }
                                

                                    }
                                
                        else {
                            this.childCategoryInterface= this.categoryInterface

                        }
                            

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "getXmlData()", e)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun setCategoryLoader(requestNode: Node)
        //nullable = true from not(false or (false and false)) = true
{

                    var requestNode = requestNode

    var storeNameNode: Node = DomSearchHelper.getNode(StoreFrontData.getInstance()!!.NAME, requestNode!!.getChildNodes())!!
            


    
                        if(storeNameNode != 
                                    null
                                )
                        
                                    {
                                    
    var storeName: String = DomNodeHelper.getTextNodeValue(storeNameNode)!!
            


    
                        if(storeName != 
                                    null
                                )
                        
                                    {
                                    
    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(storeName)!!
            

this.transformInfoInterface= TransformInfoBasic(storeFrontInterface, hashMap, pageContext) as TransformInfoInterface

    
                        if(this.transformInfoInterface == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception(
                            "TransformInfo null")

                                    }
                                

    var storeCategoryFactory: StoreCategoryFactory = StoreCategoryFactory(this.transformInfoInterface)

this.categoryLoaderInterface= CategoryLoaderFactory.getInstance(storeCategoryFactory)

                                    }
                                
                        else {
                            


                            throw Exception("Store Name Error: " +storeName)

                        }
                            

                                    }
                                
}


open fun insert()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var success: String = "Successfully Added the following to the Category table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(
                            "inserting", this, 
                            "insert()")

                                    }
                                
this.categoryLoaderInterface!!.insert(this.categoryInterface, this.childCategoryInterface)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, 
                            "insert()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to add item to Category"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "insert()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun delete()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var success: String = "Successfully Removed " +CategoryData.getInstance()!!.NAME +"=" +this.childCategoryInterface!!.getPath()


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(
                            "Deleting", this, 
                            "delete()")

                                    }
                                
this.categoryLoaderInterface!!.delete(this.categoryInterface, this.childCategoryInterface)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, 
                            "delete()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
        try {
            
    var error: String = "Failed to remove category: " +this.childCategoryInterface!!.getPath()


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "delete()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
} catch(e2: Exception)
            {
    var error: String = "Failed to remove category and show the path of the failed category"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "delete()", e2)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}

}


open fun viewCategory()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var document: Document = CategoryComponent(this.childCategoryInterface).
                            toXmlDoc()!!
            


    var xmlString: String = DomDocumentHelper.toString(document)!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(xmlString, this, 
                            "viewCategory()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return xmlString
} catch(e: Exception)
            {
    var error: String = "Failed to get Category"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "viewCategory()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun viewCategories()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var success: String = StringUtil.getInstance()!!.EMPTY_STRING


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, 
                            "viewCategories()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to view Categories table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "viewCategories()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun update()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var success: String = "New Item Successfully added"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, 
                            "update()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to add Item"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "update()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            


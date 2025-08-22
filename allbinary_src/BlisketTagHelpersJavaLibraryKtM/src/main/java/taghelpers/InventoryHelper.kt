
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
        package taghelpers




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.jsp.PageContext
import admin.taghelpers.TagHelper
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.address.StreetAddress
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.logic.communication.http.AcceptableResponseGenerator
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.search.SearchParams
import org.allbinary.logic.control.search.SearchRequest
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.visual.transform.info.TransformInfoData
import views.admin.inventory.listings.InventoryViewFactory
import views.admin.inventory.listings.InventoryViewSearchInterface

open public class InventoryHelper : TagHelper {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var weblisketSession: WeblisketSession

    private var response: HttpServletResponse

    private var request: HttpServletRequest

    private var streetAddress: StreetAddress

    private var id: String

    private var searchRequest: SearchRequest
public constructor        (propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext){

                    var propertiesHashMap = propertiesHashMap


                    var pageContext = pageContext
this.response= pageContext!!.getResponse() as HttpServletResponse
this.request= pageContext!!.getRequest() as HttpServletRequest

    var storeName: String = propertiesHashMap!!.get(StoreFrontData.getInstance()!!.NAME) as String


    var xslFile: String = propertiesHashMap!!.get(TransformInfoData.getInstance()!!.TEMPLATEFILENAME) as String


    
                        if(storeName != 
                                    null
                                )
                        
                                    {
                                    
    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(storeName)!!


    var contentType: String = AcceptableResponseGenerator.getInstance()!!.get(this.request)!!


    var searchParams: SearchParams = SearchParams(this.request)

this.searchRequest= SearchRequest(storeFrontInterface, searchParams, xslFile, contentType, propertiesHashMap, pageContext)

                                    }
                                
this.getFormData()
}


open fun getFormData()
        //nullable = true from not(false or (false and true)) = true
{this.id= this.request.getParameter(BasicItemData.ID)
}


open fun viewSummary()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var inventoryViewSearchInterface: InventoryViewSearchInterface = InventoryViewFactory.getInstance(searchRequest)!!


    var result: String = inventoryViewSearchInterface!!.getProduct(this.id)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put("Successfull Inventory View Summary", this, "viewSummary()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {
    var error: String = "Failed to View Summary"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "viewSummary()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error +"<br>" +"Exception: " +e +"<br>"
}

}


open fun search()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var stringUtil: StringUtil = StringUtil.getInstance()!!


    var keywords: String = this.searchRequest!!.getParams()!!.get()!!.get(BasicItemData.KEYWORDS) as String


    
                        if(keywords == 
                                    null
                                 || keywords.compareTo(stringUtil!!.EMPTY_STRING) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Please enter a keyword in the search field above the Search button."

                                    }
                                

    var inventoryViewSearchInterface: InventoryViewSearchInterface = InventoryViewFactory.getInstance(searchRequest)!!


    var result: String = inventoryViewSearchInterface!!.searchSingleDynamicPage()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put("Successful Inventory Dynamic Search", this, "searchSingleDynamicPage()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {
    var error: String = "Failed to search Inventory by keyword"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "searchSingleDynamicPage()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error +"<br>" +"Exception: " +e +"<br>"
}

}


}
                
            



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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.quoterequest.QuoteRequest
import org.allbinary.data.tables.user.quoterequest.QuoteRequestEntityFactory
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil

open public class QuoteRequestHelper : ModifyTable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var weblisketSession: WeblisketSession

    private var storeFrontInterface: StoreFrontInterface

    private var quoteRequest: QuoteRequest
public constructor (hashMap: HashMap<Any, Any>, pageContext: PageContext){
var hashMap = hashMap
var pageContext = pageContext

    var request: HttpServletRequest = pageContext!!.getRequest() as HttpServletRequest

this.weblisketSession= WeblisketSession(hashMap, pageContext)
this.quoteRequest= QuoteRequest(this.weblisketSession!!.getUserName(), request)

    var storeName: String = hashMap!!.get(StoreFrontData.getInstance()!!.NAME) as String


    
                        if(storeName != 
                                    null
                                )
                        
                                    {
                                    this.storeFrontInterface= StoreFrontFactory.getInstance(storeName)

                                    }
                                
}


    open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.quoteRequest!!.isValid()
}


    open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.quoteRequest!!.validationInfo()
}


    open fun insert()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var values: Vector = this.quoteRequest!!.toVector()!!

QuoteRequestEntityFactory.getInstance()!!.getQuoteRequestEntityInstance()!!.insert(values)

    var success: String = "New QuoteRequest Successfully added to the QuoteRequest Table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "add()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {

    var error: String = "Failed to add QuoteRequest"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "add()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


    open fun update()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var values: HashMap<Any, Any> = this.quoteRequest!!.toHashMap()!!

QuoteRequestEntityFactory.getInstance()!!.getQuoteRequestEntityInstance()!!.update(this.quoteRequest!!.getUserName(), values)

    var success: String = "New QuoteRequest Successfully updated"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "update()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {

    var error: String = "Failed to update QuoteRequest"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "update()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


    open fun delete()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.NOT_IMPLEMENTED
}


}
                
            


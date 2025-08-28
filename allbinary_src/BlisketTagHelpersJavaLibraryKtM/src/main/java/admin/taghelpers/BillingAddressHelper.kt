
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
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.business.installer.Portion
import org.allbinary.business.user.UserData
import org.allbinary.business.user.address.StreetAddress
import org.allbinary.data.tables.user.address.billing.BillingAddressesEntity
import org.allbinary.data.tables.user.address.billing.BillingAddressesEntityFactory
import org.allbinary.data.tables.user.address.shipping.ShippingAddressesEntityFactory
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.http.request.session.WeblisketSessionData
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlTableUtil
import org.allbinary.logic.string.StringUtil

open public class BillingAddressHelper : Table {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val stringUtil: StringUtil = StringUtil.getInstance()!!

    private var weblisketSession: WeblisketSession

    private var request: HttpServletRequest

    private var userName: String

    private var streetAddress: StreetAddress

    private val portion: Portion
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext)

        Updates for KMP build        
        {
var hashMap = hashMap
var pageContext = pageContext
this.request= pageContext!!.getRequest() as HttpServletRequest
this.weblisketSession= WeblisketSession(hashMap, pageContext)
this.portion= Portion(hashMap)
this.getAddressForm()
}


open fun getAddressForm()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.userName= request.getParameter(UserData.USERNAME)

    
                        if(this.userName == 
                                    null
                                )
                        
                                    {
                                    this.userName= request.getParameter(WeblisketSessionData.REMOVABLEUSERNAME)

                                    }
                                
this.streetAddress= StreetAddress(this.request)
}


open fun drop()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var success: String = BillingAddressesEntity(stringUtil!!.EMPTY_STRING).
                            drop()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, commonStrings!!.DROP)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to drop Admin table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.DROP, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun create()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var success: String = BillingAddressesEntity(stringUtil!!.EMPTY_STRING).
                            createTable()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "create()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to create user table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "create()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun restore()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var success: String = "Restore Successful"


    var billingAddressesEntity: BillingAddressesEntity = BillingAddressesEntity(StringUtil.getInstance()!!.EMPTY_STRING)


    var result: String = AbSqlTableUtil.getInstance()!!.restoreTable(billingAddressesEntity, this.portion)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "restore()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to restore backup"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "restore()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun backup()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var success: String = "Backup Successful"


    var result: String = AbSqlTableUtil.getInstance()!!.backupTable(BillingAddressesEntity(StringUtil.getInstance()!!.EMPTY_STRING))!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "backup()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to make backup"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "backup()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun insert()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var success: String = "Successfully Added Billing Address"

BillingAddressesEntityFactory.getInstance()!!.getInstance(this.weblisketSession!!.getUserName())!!.add(this.streetAddress)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "add()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to add Billing Address"


    
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
: String

        Updates for KMP build        
        {

        try {
            
    var success: String = "Successfully Updated Billing Address"

BillingAddressesEntityFactory.getInstance()!!.getInstance(this.weblisketSession!!.getUserName())!!.update(this.streetAddress)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put("Successfull update of a user Billing Address table", this, "update()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed update of a User Billing Address Table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "update()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun setToShippingAddress()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var shippingAddressesEntityFactory: ShippingAddressesEntityFactory = ShippingAddressesEntityFactory.getInstance()!!


    var streetAddress: StreetAddress = shippingAddressesEntityFactory!!.getInstance(this.weblisketSession!!.getUserName())!!.getDefault()!!


    
                        if(streetAddress != 
                                    null
                                )
                        
                                    {
                                    shippingAddressesEntityFactory!!.getInstance(this.weblisketSession!!.getUserName())!!.add(streetAddress)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "No Shipping Address"

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to Set Billing address to Shipping Address"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "setToShippingAddress()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun delete()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var success: String = "Successfully Removed Billing Address"

BillingAddressesEntityFactory.getInstance()!!.getInstance(this.weblisketSession!!.getUserName())!!.remove(Integer(this.streetAddress!!.getId()))

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "delete()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to remove Billing Address"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "delete()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun set()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var success: String = "Successfully Set Billing Address"

BillingAddressesEntityFactory.getInstance()!!.getInstance(this.weblisketSession!!.getUserName())!!.setDefault(this.streetAddress!!.getId())

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "set()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed to set billing Address"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "set()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


}
                
            


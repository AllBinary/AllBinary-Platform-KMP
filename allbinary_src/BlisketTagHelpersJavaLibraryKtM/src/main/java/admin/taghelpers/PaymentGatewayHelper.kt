
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
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.business.installer.Portion
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayInterface
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayInterfaceFactory
import org.allbinary.business.user.commerce.money.payment.types.BasicPaymentTypeUtil
import org.allbinary.data.tables.user.commerce.money.payment.gateway.PaymentGatewayEntityFactory
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlTableUtil
import org.allbinary.logic.string.StringMaker

open public class PaymentGatewayHelper : BasicTable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var weblisketSession: WeblisketSession

    private val httpServletRequest: HttpServletRequest

    private val portion: Portion
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext){

                    var hashMap = hashMap


                    var pageContext = pageContext

        try {
            this.weblisketSession= WeblisketSession(hashMap, pageContext)
httpServletRequest= pageContext!!.getRequest() as HttpServletRequest
this.portion= Portion(hashMap)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PAYMENTERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, this.commonStrings!!.CONSTRUCTOR, e)

                                    }
                                



                            throw e
}

}


open fun insert()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var paymentGatewayInterface: PaymentGatewayInterface = PaymentGatewayInterfaceFactory().
                            getInstance(httpServletRequest)!!

paymentGatewayInterface!!.setStoreName(this.weblisketSession!!.getStoreName())
PaymentGatewayEntityFactory.getInstance()!!.add(paymentGatewayInterface)

    var success: String = "Successfully Added New Payment Gateway"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "insert()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success +"<br/>"
} catch(e: Exception)
            {
    var error: String = "Failed to add"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "add()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error +"<br>" +"Exception: " +e +"<br>"
}

}


open fun update()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var paymentGatewayInterface: PaymentGatewayInterface = PaymentGatewayInterfaceFactory().
                            getInstance(httpServletRequest)!!

paymentGatewayInterface!!.setStoreName(this.weblisketSession!!.getStoreName())

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Gateway Name: ")
stringBuffer!!.append(paymentGatewayInterface!!.getName())
stringBuffer!!.append(" HashMap=")
stringBuffer!!.append(paymentGatewayInterface!!.toHashMap(true)!!.toString())
logUtil!!.put(stringBuffer!!.toString(), this, "update()")

                                    }
                                
PaymentGatewayEntityFactory.getInstance()!!.update(paymentGatewayInterface)

    var success: String = "Successfully Updated Payment Gateway information"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "update()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success +"<br/>"
} catch(e: Exception)
            {
    var error: String = "Failed to update payment gateway information"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "update()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error +"<br/>" +"Exception: " +e +"<br/>"
}

}


open fun delete()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var paymentGatewayInterface: PaymentGatewayInterface = PaymentGatewayInterfaceFactory().
                            getInstance(httpServletRequest)!!

paymentGatewayInterface!!.setStoreName(this.weblisketSession!!.getStoreName())

    var storeName: String = paymentGatewayInterface!!.getStoreName()!!


    var gatewayName: String = paymentGatewayInterface!!.getName()!!

PaymentGatewayEntityFactory.getInstance()!!.remove(storeName, BasicPaymentTypeUtil.getInstance()!!.get(gatewayName))

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Successfully Removed payment gateway where store name=")
stringBuffer!!.append(storeName)
stringBuffer!!.append(" and gateway name=")
stringBuffer!!.append(gatewayName)

    var success: String = stringBuffer!!.toString()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "delete()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success +"<br/>"
} catch(e: Exception)
            {
    var error: String = "Failed to remove payment gateway from table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "remove()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error +"<br/>" +"Exception: " +e +"<br>"
}

}


open fun drop()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var success: String = PaymentGatewayEntityFactory.getInstance()!!.dropTable()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, commonStrings!!.DROP)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to drop payment transaction result table"


    
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
: String{
        try {
            
    var success: String = PaymentGatewayEntityFactory.getInstance()!!.createTable()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "create()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {
    var error: String = "Failed to create payment transaction result table"


    
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
: String{
        try {
            
    var success: String = "Restore Successful"


    var result: String = AbSqlTableUtil.getInstance()!!.restoreTable(PaymentGatewayEntityFactory.getInstance(), this.portion)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "restore()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
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
: String{
        try {
            
    var success: String = "Restore Successful"


    var result: String = AbSqlTableUtil.getInstance()!!.backupTable(PaymentGatewayEntityFactory.getInstance())!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "backup()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
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


}
                
            


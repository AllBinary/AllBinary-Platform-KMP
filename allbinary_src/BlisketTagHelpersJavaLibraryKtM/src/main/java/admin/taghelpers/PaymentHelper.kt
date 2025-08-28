
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
import org.allbinary.business.user.commerce.money.payment.PaymentFactory
import org.allbinary.business.user.commerce.money.payment.PaymentInterface
import org.allbinary.data.tables.user.commerce.money.payment.PaymentEntity
import org.allbinary.data.tables.user.commerce.money.payment.PaymentEntityFactory
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlTableUtil
import org.allbinary.logic.system.security.licensing.LicensingException

open public class PaymentHelper : Table {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var weblisketSession: WeblisketSession

    private var request: HttpServletRequest

    private var value: String

    private val portion: Portion
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext){
var hashMap = hashMap
var pageContext = pageContext
this.request= pageContext!!.getRequest() as HttpServletRequest
this.weblisketSession= WeblisketSession(hashMap, pageContext)
this.portion= Portion(hashMap)
this.getFormData()
}


open fun getFormData()
        //nullable = true from not(false or (false and true)) = true
{
this.value= request.getParameter("VALUE")
}


open fun insert()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var success: String = "Successfully Added Payment"


    var paymentEntity: PaymentEntity = PaymentEntityFactory.getInstance()!!.getPaymentEntityInstance()!!


    var paymentInterface: PaymentInterface = PaymentFactory.getInstance(request)!!

paymentEntity!!.add(this.weblisketSession!!.getUserName(), paymentInterface)
paymentEntity!!.setDefault(this.weblisketSession!!.getUserName(), Integer(paymentEntity!!.getLastId(this.weblisketSession!!.getUserName())))

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "addPayment()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {

    var error: String = "Failed to add Payment"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "addPayment()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun select()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var success: String = "Successfully Selected Payment"


    var paymentEntity: PaymentEntity = PaymentEntityFactory.getInstance()!!.getPaymentEntityInstance()!!

paymentEntity!!.setDefault(this.weblisketSession!!.getUserName(), Integer(this.value))

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "selectPayment()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {

    var error: String = "Failed to select Payment"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "selectPayment()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun delete()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var success: String = "Successfully Removed Payment"


    var paymentEntity: PaymentEntity = PaymentEntityFactory.getInstance()!!.getPaymentEntityInstance()!!

paymentEntity!!.remove(this.weblisketSession!!.getUserName(), Integer(this.value))

    var paymentInterface: PaymentInterface = paymentEntity!!.getDefault(this.weblisketSession!!.getUserName())!!


    
                        if(paymentInterface == 
                                    null
                                )
                        
                                    {
                                    paymentEntity!!.setDefault(this.weblisketSession!!.getUserName(), Integer(paymentEntity!!.getLastId(this.weblisketSession!!.getUserName())))

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "removePayment()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
            {

    var error: String = "Failed to remove Payment"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "removePayment()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


open fun drop()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var paymentEntity: PaymentEntity = PaymentEntityFactory.getInstance()!!.getPaymentEntityInstance()!!


    var success: String = paymentEntity!!.dropTable()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, commonStrings!!.DROP)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
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
: String{

        try {
            
    var paymentEntity: PaymentEntity = PaymentEntityFactory.getInstance()!!.getPaymentEntityInstance()!!


    var success: String = paymentEntity!!.createTable()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(success, this, "create()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return success
} catch(e: Exception)
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
: String{

        try {
            
    var success: String = "Restore Successful"


    var result: String = AbSqlTableUtil.getInstance()!!.restoreTable(PaymentEntityFactory.getInstance()!!.getPaymentEntityInstance(), portion)!!


    
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
            
    var success: String = "Backup Successful"


    var result: String = AbSqlTableUtil.getInstance()!!.backupTable(PaymentEntityFactory.getInstance()!!.getPaymentEntityInstance())!!


    
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


                @Throws(LicensingException::class)
            
open fun update()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.NOT_IMPLEMENTED
}


}
                
            


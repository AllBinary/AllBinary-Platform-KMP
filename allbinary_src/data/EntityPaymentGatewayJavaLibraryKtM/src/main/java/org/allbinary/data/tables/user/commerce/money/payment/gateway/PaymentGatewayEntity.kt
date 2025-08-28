
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
        package org.allbinary.data.tables.user.commerce.money.payment.gateway




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.business.user.UserData
import org.allbinary.business.user.commerce.money.payment.PaymentData
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayData
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayEncryptedMapping
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayInterface
import org.allbinary.business.user.commerce.money.payment.gateway.PaymentGatewayInterfaceFactory
import org.allbinary.business.user.commerce.money.payment.types.BasicPaymentType
import org.allbinary.business.user.commerce.money.payment.types.BasicPaymentTypeUtil
import org.allbinary.data.generator.PaymentGatewayIdGenerator
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.control.crypt.SuperCrypt
import org.allbinary.logic.string.StringMaker

open public class PaymentGatewayEntity : AbSqlBean
                , PaymentGatewayEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val tableName: String = "paymentgateways"
public constructor        ()                        

                            : super(UserDbInitInfo())

        Updates for KMP build        
        {


                            //For kotlin this is before the body of the constructor.
                    
this.setTableName(tableName)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.CONSTRUCTOR, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


open fun add(paymentGatewayInterface: PaymentGatewayInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var paymentGatewayInterface = paymentGatewayInterface

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, "add")

                                    }
                                

    var vector: Vector = Vector()

vector.add(PaymentGatewayIdGenerator().
                            getNext())
vector.addAll(PaymentGatewayEncryptedMapping(paymentGatewayInterface).
                            toVector())

    var calendar: Calendar = Calendar.getInstance()!!


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                

vector.add(time)
vector.add(time)
super.insert(vector)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.END, this, "add")

                                    }
                                
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "add", e)

                                    }
                                
}

}


open fun update(paymentGatewayInterface: PaymentGatewayInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var paymentGatewayInterface = paymentGatewayInterface

        try {
            
    var calendar: Calendar = Calendar.getInstance()!!


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                

paymentGatewayInterface!!.setLastModified(time)

    var whereKeyValuePairs: HashMap<Any, Any> = HashMap<Any, Any>()

whereKeyValuePairs!!.put(StoreFrontData.getInstance()!!.NAME.toString(), paymentGatewayInterface!!.getStoreName())
whereKeyValuePairs!!.put(PaymentGatewayData.NAME.toString(), paymentGatewayInterface!!.getName())

    
                        if(whereKeyValuePairs!!.get(EntryData.getInstance()!!.TIMECREATED) != 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Don't update TimeCreated for update")

                                    }
                                

    var updateHashMap: HashMap<Any, Any> = PaymentGatewayEncryptedMapping(paymentGatewayInterface).
                            toHashMap()!!

super.updateWhere(whereKeyValuePairs, updateHashMap)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, "update")

                                    }
                                
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "update", e)

                                    }
                                
}

}


open fun getPaymentGatewayInterface(storeName: String, paymentType: BasicPaymentType)
        //nullable = true from not(false or (false and false)) = true
: PaymentGatewayInterface

        Updates for KMP build        
        {
var storeName = storeName
var paymentType = paymentType

        try {
            
    var paymentGatewayHashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var whereKeyAndValue: HashMap<Any, Any> = HashMap<Any, Any>()

whereKeyAndValue!!.put(StoreFrontData.getInstance()!!.NAME.toString(), storeName)
whereKeyAndValue!!.put(PaymentGatewayData.NAME.toString(), paymentType!!.getName())
paymentGatewayHashMap= super.getRow(whereKeyAndValue)

    
                        if(paymentGatewayHashMap != 
                                    null
                                )
                        
                                    {
                                    
    var userName: String = paymentGatewayHashMap!!.get(UserData.USERNAME.toString()) as String


    var password: String = paymentGatewayHashMap!!.get(UserData.PASSWORD.toString()) as String


    var special1: String = paymentGatewayHashMap!!.get(PaymentGatewayData.SPECIAL1.toString()) as String


    var special2: String = paymentGatewayHashMap!!.get(PaymentGatewayData.SPECIAL2.toString()) as String


    var special3: String = paymentGatewayHashMap!!.get(PaymentGatewayData.SPECIAL3.toString()) as String


    var special4: String = paymentGatewayHashMap!!.get(PaymentGatewayData.SPECIAL4.toString()) as String


    var special5: String = paymentGatewayHashMap!!.get(PaymentGatewayData.SPECIAL5.toString()) as String


    var special6: String = paymentGatewayHashMap!!.get(PaymentGatewayData.SPECIAL6.toString()) as String


    var special7: String = paymentGatewayHashMap!!.get(PaymentGatewayData.SPECIAL7.toString()) as String


    var special8: String = paymentGatewayHashMap!!.get(PaymentGatewayData.SPECIAL8.toString()) as String


    var special9: String = paymentGatewayHashMap!!.get(PaymentGatewayData.SPECIAL9.toString()) as String


    var superCrypt: SuperCrypt = SuperCrypt(PaymentGatewayData.CRYPTNUM)

paymentGatewayHashMap!!.put(UserData.USERNAME.toString(), superCrypt!!.decrypt(userName))
paymentGatewayHashMap!!.put(UserData.PASSWORD.toString(), superCrypt!!.decrypt(password))
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL1.toString(), superCrypt!!.decrypt(special1))
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL2.toString(), superCrypt!!.decrypt(special2))
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL3.toString(), superCrypt!!.decrypt(special3))
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL4.toString(), superCrypt!!.decrypt(special4))
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL5.toString(), superCrypt!!.decrypt(special5))
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL6.toString(), superCrypt!!.decrypt(special6))
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL7.toString(), superCrypt!!.decrypt(special7))
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL8.toString(), superCrypt!!.decrypt(special8))
paymentGatewayHashMap!!.put(PaymentGatewayData.SPECIAL9.toString(), superCrypt!!.decrypt(special9))

    var paymentGatewayInterface: PaymentGatewayInterface = PaymentGatewayInterfaceFactory().
                            getInstance(paymentGatewayHashMap)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, "getPaymentGatewayInterface()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paymentGatewayInterface

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PaymentGatewayInterfaceFactory().
                            getInstance(paymentType)

                        }
                            
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put("Command Failed for paymentType: " +paymentType!!.getName(), this, "getPaymentGatewayInterface", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun findPaymentTypeVectorByStore(storeName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector

        Updates for KMP build        
        {
var storeName = storeName

        try {
            
    var paymentGatewayNameVector: Vector = Vector()

paymentGatewayNameVector= super.getColumnWhere(PaymentGatewayData.NAME.toString(), StoreFrontData.getInstance()!!.NAME.toString(), storeName)

    
                        if(paymentGatewayNameVector != 
                                    null
                                )
                        
                                    {
                                    
    var paymentGatewayVector: Vector = Vector()


    var size: Int = paymentGatewayNameVector!!.size!!





                        for (i in 0 until size)

        

        Updates for KMP build        
        {

    var paymentTypeString: String = paymentGatewayNameVector!!.get(i) as String


    var paymentType: BasicPaymentType = BasicPaymentTypeUtil.getInstance()!!.get(paymentTypeString)!!

paymentGatewayVector!!.add(paymentType)
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, "findPaymentTypeVectorByStore()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paymentGatewayVector

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Vector()

                        }
                            
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "findPaymentTypeVectorByStore", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun remove(storeName: String, paymentType: BasicPaymentType)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var storeName = storeName
var paymentType = paymentType

        try {
            
    var whereHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

whereHashMap!!.put(StoreFrontData.getInstance()!!.NAME.toString(), storeName)
whereHashMap!!.put(PaymentGatewayData.NAME.toString(), paymentType!!.getName())
super.deleteWhere(whereHashMap)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, "remove")

                                    }
                                
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "remove", e)

                                    }
                                
}

}


open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)
stringBuffer!!.append(tableName)
stringBuffer!!.append(this.sqlStrings!!.START)
stringBuffer!!.append(PaymentGatewayData.ID.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_AUTO_INCREMENT_NOT_NULL)
stringBuffer!!.append(EntryData.getInstance()!!.ENABLE)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(StoreFrontData.getInstance()!!.NAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.NAME.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentData.METHOD)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.MODE.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.TESTPROTOCOL.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.TESTSERVER.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.TESTPORT.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.TESTPATH.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.SERVERPROTOCOL.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.SERVER.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.SERVERPORT.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.SERVERPATH.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(UserData.USERNAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(UserData.PASSWORD)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.TIMEOUT.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.PROXYPROTOCOL.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.PROXYSERVER.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.PROXYPORT.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.PROXYPATH.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.PROXYUSERNAME.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.PROXYPASSWORD.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.PROXYTIMEOUT.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.SPECIAL1.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.SPECIAL2.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.SPECIAL3.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.SPECIAL4.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.SPECIAL5.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.SPECIAL6.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.SPECIAL7.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.SPECIAL8.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentGatewayData.SPECIAL9.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(EntryData.getInstance()!!.LASTMODIFIED)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(EntryData.getInstance()!!.TIMECREATED)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(this.sqlStrings!!.PRIMARY_KEY)
stringBuffer!!.append(PaymentGatewayData.ID.toString())
stringBuffer!!.append(this.sqlStrings!!.END)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun createTable()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.createTable(this.createTableStatement())
}


open fun dropTable()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.dropTable()
}


}
                
            


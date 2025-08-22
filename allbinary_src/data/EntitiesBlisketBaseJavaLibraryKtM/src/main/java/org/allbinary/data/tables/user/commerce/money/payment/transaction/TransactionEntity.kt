
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
        package org.allbinary.data.tables.user.commerce.money.payment.transaction




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.business.user.UserData
import org.allbinary.business.user.commerce.inventory.order.OrderData
import org.allbinary.business.user.commerce.money.payment.gateway.transaction.PaymentTransactionInterface
import org.allbinary.business.user.commerce.money.payment.gateway.transaction.PaymentTransactionKeysFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.string.StringMaker

open public class TransactionEntity : AbSqlBean
                , TransactionEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val tableName: String = "vtrans"
public constructor        ()                        

                            : super(UserDbInitInfo()){

                            //For kotlin this is before the body of the constructor.
                    
this.setTableName(tableName)
}


open fun remove(userName: String, orderNumber: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var userName = userName


                    var orderNumber = orderNumber

        try {
            
    var whereHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

whereHashMap!!.put(OrderData.ID, orderNumber as String)
whereHashMap!!.put(UserData.USERNAME, userName)
super.deleteWhere(whereHashMap)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, "remove")

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "remove", e)

                                    }
                                
}

}


open fun add(userName: String, orderNumber: String, paymentTransactionInterface: PaymentTransactionInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var userName = userName


                    var orderNumber = orderNumber


                    var paymentTransactionInterface = paymentTransactionInterface

        try {
            
    var values: Vector = Vector()

values.add(orderNumber)
values.add(userName)
values.addAll(paymentTransactionInterface!!.toVector())

    var calendar: Calendar = Calendar.getInstance()!!


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                

values.add(time)
values.add(time)
super.insert(values)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, "add")

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "add", e)

                                    }
                                
}

}


open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String{
    var paymentTransactionKeysFactory: PaymentTransactionKeysFactory = PaymentTransactionKeysFactory.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)
stringBuffer!!.append(tableName)
stringBuffer!!.append(this.sqlStrings!!.START)
stringBuffer!!.append(OrderData.ID)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(UserData.USERNAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.TRXTYPE.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.TENDER.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.ACCT.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.EXPDATE.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.AMT.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.AUTHCODE.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.MICR.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.CHECKNUM.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.NAME.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.STREET.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.CITY.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.STATE.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.ZIP.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.DL.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.EMAIL.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.COMMENT1.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.COMMENT2.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.ORIGID.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.PONUM.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.DESC.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.DESC1TO4.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.INVNUM.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.SHIPTOZIP.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.SWIPE.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.TAXAMT.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.COMMCARD.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.DUTYAMT.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.FREIGHTAMT.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.ORDERDATE.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.TAXEXEMPT.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.COUNTRYCODE.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.CUSTCODE.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.CVV2.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.ABA.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.ACCTTYPE.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.DISCOUNT.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.FIRSTNAME.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.LASTNAME.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.SHIPFROMZIP.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.PRENOTE.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.CHKTYPE.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.DOB.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.PHONENUM.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.SS.toString())!!.append(" VARCHAR(30) NOT NULL,")!!.append(paymentTransactionKeysFactory!!.COMPANYNAME.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.COUNTRY.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.SHIPTOCITY.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.SHIPTOFIRSTNAME.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.SHIPTOLASTNAME.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.SHIPTOSTATE.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.SHIPTOSTREET.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.SPECIAL1.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.SPECIAL2.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.SPECIAL3.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(EntryData.getInstance()!!.LASTMODIFIED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(EntryData.getInstance()!!.TIMECREATED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(this.sqlStrings!!.PRIMARY_KEY)!!.append(OrderData.ID)!!.append(this.sqlStrings!!.END)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun createTable()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.createTable(this.createTableStatement())
}


open fun dropTable()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.dropTable()
}


}
                
            


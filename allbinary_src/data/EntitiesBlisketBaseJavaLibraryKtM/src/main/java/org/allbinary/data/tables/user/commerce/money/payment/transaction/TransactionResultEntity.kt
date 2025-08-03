
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.business.user.UserData
import org.allbinary.business.user.commerce.inventory.order.OrderData
import org.allbinary.business.user.commerce.money.payment.gateway.transaction.PaymentTransactionKeysFactory
import org.allbinary.business.user.commerce.money.payment.gateway.transaction.TransactionResult
import org.allbinary.business.user.commerce.money.payment.gateway.transaction.TransactionResultInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.string.StringMaker

open public class TransactionResultEntity : AbSqlBean
                , TransactionResultEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val tableName: String = "vresults"
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

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, 
                            "remove")

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "remove", e)

                                    }
                                
}

}


open fun add(userName: String, orderNumber: String, transactionResultInterface: TransactionResultInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var userName = userName


                    var orderNumber = orderNumber


                    var transactionResultInterface = transactionResultInterface

        try {
            
    var values: Vector = Vector()

values!!.add(orderNumber)
values!!.add(userName)
values!!.addAll(transactionResultInterface!!.getValues())

    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = Long(calendar!!.getTimeInMillis()).
                            toString()!!
            

values!!.add(time)
values!!.add(time)
super.insert(values)

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, 
                            "add")

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "add", e)

                                    }
                                
}

}


open fun getTransactionResultInterface(orderNumber: String)
        //nullable = true from not(false or (false and false)) = true
: TransactionResultInterface{

                    var orderNumber = orderNumber

        try {
            
    var resultHashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var updateKeyAndValue: HashMap<Any, Any> = HashMap<Any, Any>()

updateKeyAndValue!!.put(OrderData.ID, orderNumber)
resultHashMap= super.getRow(updateKeyAndValue)

    
                        if(resultHashMap != 
                                    null
                                )
                        
                                    {
                                    
    var transactionResult: TransactionResult = TransactionResult(resultHashMap)


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, 
                            "getTransactionResultInterface")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return transactionResult as TransactionResultInterface

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "getTransactionResultInterface", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String{
    var paymentTransactionKeysFactory: PaymentTransactionKeysFactory = PaymentTransactionKeysFactory.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)!!.append(tableName)!!.append(this.sqlStrings!!.START)!!.append(OrderData.ID)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(UserData.USERNAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(paymentTransactionKeysFactory!!.RESULT.toString())!!.append(this.sqlTypeStrings!!.MAX_INT_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.PNREF.toString())!!.append(this.sqlTypeStrings!!.TWELVE_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(paymentTransactionKeysFactory!!.RESPMSG.toString())!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.AUTHCODE.toString())!!.append(this.sqlTypeStrings!!.SIX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.AVSADDR.toString())!!.append(this.sqlTypeStrings!!.ONE_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(paymentTransactionKeysFactory!!.AVSZIP.toString())!!.append(this.sqlTypeStrings!!.ONE_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.ORIGRESULT.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.STATUS.toString())!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(paymentTransactionKeysFactory!!.FRAUDCODE.toString())!!.append(this.sqlTypeStrings!!.TWO_INT_NOT_NULL)
stringBuffer!!.append(paymentTransactionKeysFactory!!.FRAUDMSG.toString())!!.append(this.sqlTypeStrings!!.MAX_INT_NOT_NULL)
stringBuffer!!.append(paymentTransactionKeysFactory!!.ERRCODE.toString())!!.append(this.sqlTypeStrings!!.MAX_INT_NOT_NULL)
stringBuffer!!.append(paymentTransactionKeysFactory!!.SCORE.toString())!!.append(this.sqlTypeStrings!!.THREE_INT_NOT_NULL)
stringBuffer!!.append(paymentTransactionKeysFactory!!.REASON1.toString())!!.append(this.sqlTypeStrings!!.FOUR_INT_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.REASON2.toString())!!.append(this.sqlTypeStrings!!.FOUR_INT_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.REASON3.toString())
stringBuffer!!.append(this.sqlTypeStrings!!.FOUR_INT_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.EXCEPTION1.toString())!!.append(this.sqlTypeStrings!!.FOUR_INT_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.EXCEPTION2.toString())!!.append(this.sqlTypeStrings!!.FOUR_INT_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.EXCEPTION3.toString())!!.append(this.sqlTypeStrings!!.FOUR_INT_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.EXCEPTION4.toString())!!.append(this.sqlTypeStrings!!.FOUR_INT_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.EXCEPTION5.toString())!!.append(this.sqlTypeStrings!!.FOUR_INT_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.EXCEPTION6.toString())!!.append(this.sqlTypeStrings!!.FOUR_INT_NOT_NULL)!!.append(paymentTransactionKeysFactory!!.EXCEPTION7.toString())!!.append(this.sqlTypeStrings!!.FOUR_INT_NOT_NULL)!!.append(EntryData.getInstance()!!.LASTMODIFIED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(EntryData.getInstance()!!.TIMECREATED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(this.sqlStrings!!.PRIMARY_KEY)!!.append(OrderData.ID)!!.append(this.sqlStrings!!.END)



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
                
            



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
        package org.allbinary.data.tables.user.commerce.money.payment



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.HashMap
import java.util.Random
import java.util.Vector
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.business.user.UserData
import org.allbinary.business.user.commerce.money.payment.Payment
import org.allbinary.business.user.commerce.money.payment.PaymentData
import org.allbinary.business.user.commerce.money.payment.PaymentInterface
import org.allbinary.data.generator.PaymentIdGenerator
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.control.crypt.SuperCrypt
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class PaymentEntity : AbSqlBean
                , PaymentEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val tableName: String = "payment"
public constructor        ()                        

                            : super(UserDbInitInfo()){

                            //For kotlin this is before the body of the constructor.
                    
this.setTableName(tableName)
}


open fun getLastId(userName: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var userName = userName



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getLargestIntegerInColumnWhere(PaymentData.ID, UserData.USERNAME, userName)
}


open fun setDefault(userName: String, index: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var userName = userName


                    var index = index

        try {
            
    var updateKeyAndValue: HashMap<Any, Any> = HashMap<Any, Any>()


    var whereKeyAndValue: HashMap<Any, Any> = HashMap<Any, Any>()

whereKeyAndValue!!.put(UserData.USERNAME, userName)

    var paymentInterface: PaymentInterface = getDefault(userName)!!
            


    
                        if(paymentInterface != 
                                    null
                                )
                        
                                    {
                                    updateKeyAndValue!!.put(EntryData.getInstance()!!.DEFAULT, StringUtil.getInstance()!!.EMPTY_STRING)
whereKeyAndValue!!.put(PaymentData.ID, paymentInterface!!.getId())
super.updateWhere(whereKeyAndValue, updateKeyAndValue)

                                    }
                                
updateKeyAndValue!!.put(EntryData.getInstance()!!.DEFAULT, EntryData.getInstance()!!.DEFAULT)
whereKeyAndValue!!.put(PaymentData.ID, index.toString())
super.updateWhere(whereKeyAndValue, updateKeyAndValue)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, 
                            "setDefault")

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "setDefault", e)

                                    }
                                
}

}


open fun get(userName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var userName = userName

        try {
            
    var paymentVector: Vector = Vector()


    var keyAndValue: HashMap<Any, Any> = HashMap<Any, Any>()

keyAndValue!!.put(UserData.USERNAME, userName)

    var paymentList: Vector = super.getRows(keyAndValue)!!
            


    var size: Int = paymentList!!.size!!
            





                        for (index in 0 until size)


        {
    var paymentHashMap: HashMap<Any, Any> = paymentList!!.get(index) as HashMap<Any, Any>


    var payment: Payment = Payment(paymentHashMap)


    
                        if(payment != 
                                    null
                                )
                        
                                    {
                                    paymentVector!!.add(payment)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paymentVector
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


open fun getDefault(userName: String)
        //nullable = true from not(false or (false and false)) = true
: PaymentInterface{

                    var userName = userName

        try {
            
    var paymentHashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var updateKeyAndValue: HashMap<Any, Any> = HashMap<Any, Any>()

updateKeyAndValue!!.put(EntryData.getInstance()!!.DEFAULT, EntryData.getInstance()!!.DEFAULT)
updateKeyAndValue!!.put(UserData.USERNAME, userName)
paymentHashMap= super.getRow(updateKeyAndValue)

    
                        if(paymentHashMap != 
                                    null
                                )
                        
                                    {
                                    
    var payment: Payment = Payment(paymentHashMap)


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, 
                            "getDefault")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return payment as PaymentInterface

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "getDefault", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun remove(userName: String, index: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var userName = userName


                    var index = index

        try {
            
    var whereHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

whereHashMap!!.put(UserData.USERNAME, userName)
whereHashMap!!.put(PaymentData.ID, index.toString() as String)
super.deleteWhere(whereHashMap)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, 
                            "remove")

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "remove", e)

                                    }
                                
}

}


open fun add(userName: String, paymentInterface: PaymentInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var userName = userName


                    var paymentInterface = paymentInterface

        try {
            
    var vector: Vector = Vector()

vector.add(PaymentIdGenerator().
                            getNext())
vector.add(userName)
vector.add(StringUtil.getInstance()!!.EMPTY_STRING)
vector.add(paymentInterface!!.getName())
vector.add(paymentInterface!!.getType())
vector.add(paymentInterface!!.getExpiration())

    var random: Int = Random().
                            nextInt(SuperCrypt.KEYMAX)!!
            

vector.add(SuperCrypt(random).
                            encrypt(paymentInterface!!.getNumber()))
vector.add(Integer(random).
                            toString())

    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = calendar.getTimeInMillis() as Long.
                            toString().toCharArray().concatToString()
                                

vector.add(time)
super.insert(vector)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, 
                            "add")

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "add", e)

                                    }
                                
}

}


open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String{
    var entryData: EntryData = EntryData.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)!!.append(tableName)!!.append(this.sqlStrings!!.START)!!.append(PaymentData.ID)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_AUTO_INCREMENT_NOT_NULL)!!.append(UserData.USERNAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(entryData!!.DEFAULT)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(PaymentData.NAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(PaymentData.TYPE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(PaymentData.EXPIRATION)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(PaymentData.NUMBER)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(entryData!!.ENCRYPTION)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(entryData!!.TIMECREATED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(this.sqlStrings!!.PRIMARY_KEY)!!.append(PaymentData.ID)!!.append(this.sqlStrings!!.END)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun createTable()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.createTable(this.createTableStatement())
}


open fun drop()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.dropTable()
}


}
                
            


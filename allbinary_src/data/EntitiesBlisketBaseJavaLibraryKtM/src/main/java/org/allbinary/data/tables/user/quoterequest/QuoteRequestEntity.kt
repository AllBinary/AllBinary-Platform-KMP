
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
        package org.allbinary.data.tables.user.quoterequest




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.business.quoterequest.QuoteRequestData
import org.allbinary.business.user.UserData
import org.allbinary.business.user.quoterequest.QuoteRequest
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.string.StringMaker

open public class QuoteRequestEntity : AbSqlBean
                , QuoteRequestEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val tableName: String = "quoterequest"
public constructor        ()                        

                            : super(UserDbInitInfo()){

                            //For kotlin this is before the body of the constructor.
                    
this.setTableName(tableName)
}


open fun insert(values: Vector)
        //nullable = true from not(false or (false and false)) = true
{

                    var values = values

        try {
            super.insert(values)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, INSERT)

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, INSERT, e)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun get(userName: String, id: Int)
        //nullable = true from not(false or (false and false)) = true
: QuoteRequest{

                    var userName = userName


                    var id = id

    var row: HashMap<Any, Any> = HashMap<Any, Any>()

row.put(UserData.USERNAME, userName)
row.put(QuoteRequestData.getInstance()!!.ID, id.toString())

    var quoteRequestHashMap: HashMap<Any, Any> = super.getRow(row)!!
            


    
                        if(quoteRequestHashMap != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return org.allbinary.business.user.quoterequest.QuoteRequest(quoteRequestHashMap)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}


open fun getIds(userName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var userName = userName



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getColumnWhere(QuoteRequestData.getInstance()!!.ID, UserData.USERNAME, userName)
}


open fun deleteWhere(key: String, value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var key = key


                    var value = value

        try {
            super.deleteWhere(key, value)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, "deleteWhere")

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "deleteWhere", e)

                                    }
                                
}

}


open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String{
    var quoteRequestData: QuoteRequestData = QuoteRequestData.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)!!.append(tableName)!!.append(this.sqlStrings!!.START)
stringBuffer!!.append(quoteRequestData!!.ID)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(UserData.USERNAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(quoteRequestData!!.PROJECT_INFO)
stringBuffer!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)
stringBuffer!!.append(quoteRequestData!!.CUSTOMER_COMMENTS)
stringBuffer!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)
stringBuffer!!.append(quoteRequestData!!.BUDGET)
stringBuffer!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)
stringBuffer!!.append(quoteRequestData!!.TIMEFRAME)
stringBuffer!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)
stringBuffer!!.append(quoteRequestData!!.COMMENTS)
stringBuffer!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)
stringBuffer!!.append(EntryData.getInstance()!!.TIMECREATED)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(EntryData.getInstance()!!.LASTMODIFIED)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(this.sqlStrings!!.PRIMARY_KEY)
stringBuffer!!.append(quoteRequestData!!.ID)
stringBuffer!!.append(this.sqlStrings!!.END)



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
    var result: String = dropTable.toCharArray().concatToString()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}


open fun update(userName: String, updatedValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var userName = userName


                    var updatedValues = updatedValues
super.updateWhere(UserData.USERNAME, userName, updatedValues)
}


}
                
            


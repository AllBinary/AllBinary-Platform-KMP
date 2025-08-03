
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
        package org.allbinary.data.tables.log



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.LogDbInitInfo
import org.allbinary.logic.communication.http.request.AbeHttpRequestInfoData
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.string.StringMaker

open public class LogTableEntity : AbSqlBean
                , LogTableEntityInterface {
        

    private val tableName: String = "log"
public constructor        ()                        

                            : super(LogDbInitInfo()){

                            //For kotlin this is before the body of the constructor.
                    
this.setTableName(tableName)
}


open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String{
    var abeHttpRequestInfoData: AbeHttpRequestInfoData = AbeHttpRequestInfoData.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)!!.append(tableName)!!.append(this.sqlStrings!!.START)!!.append(this.sqlStrings!!.ID)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(abeHttpRequestInfoData!!.HTTP_USER_AGENT)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(abeHttpRequestInfoData!!.REMOTE_HOST)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN)!!.append(abeHttpRequestInfoData!!.REMOTE_ADDRESS)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(abeHttpRequestInfoData!!.REQUEST_FILE_PATH)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(abeHttpRequestInfoData!!.REMOTE_PORT)!!.append(this.sqlTypeStrings!!.MAX_INT_UNSIGNED_NOT_NULL)!!.append(EntryData.getInstance()!!.TIMECREATED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(this.sqlStrings!!.PRIMARY_KEY)!!.append(this.sqlStrings!!.ID)!!.append(this.sqlStrings!!.END)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun createTable()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.createTable(this.createTableStatement())
}


}
                
            


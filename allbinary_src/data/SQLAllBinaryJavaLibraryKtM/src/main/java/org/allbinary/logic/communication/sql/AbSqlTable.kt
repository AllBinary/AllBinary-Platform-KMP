
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
        package org.allbinary.logic.communication.sql



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.init.db.DbConnectionInfo
import org.allbinary.logic.communication.log.LogUtil

open public class AbSqlTable : AbSqlBasic {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var tableName: String

    private val METHOD_CREATED_TABLE: String = "createTable()"

    private val METHOD_DROP_TABLE: String = "dropTable()"

    private val TABLE_CREATION_SUCCESS: String = "Table Creation Successful: "

    private val DROPPED_SUCCESS: String = " Dropped Successfully"
public constructor        (databaseConnectionInfoInterface: DbConnectionInfo)                        

                            : super(databaseConnectionInfoInterface){

                    var databaseConnectionInfoInterface = databaseConnectionInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


open fun setTableName(tableName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var tableName = tableName
this.tableName= tableName
}


open fun getTableName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tableName
}


open fun createTable(data: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var data = data

        try {
            this.executeSQLStatement(data)

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(TABLE_CREATION_SUCCESS +this.tableName +" with statement: " +data, this, this.METHOD_CREATED_TABLE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tableName +sqlStrings!!.CREATE_RETURN
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put("Table Creation Failed: " +this.tableName +" with statement: " +data, this, this.METHOD_CREATED_TABLE, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Failed to Create " +tableName +" table."
}

}


open fun dropTable()
        //nullable = true from not(false or (false and true)) = true
: String{
    var sqlStatement: String = sqlStrings!!.DROP_TABLE +tableName


        try {
            this.executeSQLStatement(sqlStatement)

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.SUCCESS_SQL_STATEMENT +sqlStatement, this, this.METHOD_DROP_TABLE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tableName +DROPPED_SUCCESS
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +sqlStatement, this, this.METHOD_DROP_TABLE, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Failed to Drop " +tableName +" table."
}

}


}
                
            


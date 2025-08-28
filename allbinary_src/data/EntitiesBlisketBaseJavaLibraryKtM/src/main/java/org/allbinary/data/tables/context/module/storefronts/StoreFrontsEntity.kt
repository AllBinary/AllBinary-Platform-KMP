
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
        package org.allbinary.data.tables.context.module.storefronts




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFront
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.string.StringMaker

open public class StoreFrontsEntity : AbSqlBean
                , StoreFrontsEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val tableName: String = "storefronts"
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


open fun delete(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value

        try {
            super.deleteWhere(StoreFrontData.getInstance()!!.NAME, value)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, commonStrings!!.delete)

                                    }
                                
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, commonStrings!!.delete, e)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun getStoreFrontInterface(name: String)
        //nullable = true from not(false or (false and false)) = true
: StoreFront{
var name = name

    var keysAndValues: HashMap<Any, Any> = HashMap<Any, Any>()

keysAndValues!!.put(StoreFrontData.getInstance()!!.NAME, name)

    var storeHashMap: HashMap<Any, Any> = super.getRow(keysAndValues)!!


    
                        if(storeHashMap != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StoreFront(storeHashMap)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StoreFront()

                        }
                            
}


open fun getStoreFrontNames()
        //nullable = true from not(false or (false and true)) = true
: Vector{

    var storeFrontNames: Vector = super.getColumn(StoreFrontData.getInstance()!!.NAME)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return storeFrontNames
}


open fun update(updatedValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{
var updatedValues = updatedValues
super.updateWhere(StoreFrontData.getInstance()!!.NAME, updatedValues!!.get(StoreFrontData.getInstance()!!.NAME) as String, updatedValues)
}


open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String{

    var storeFrontData: StoreFrontData = StoreFrontData.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)
stringBuffer!!.append(tableName)
stringBuffer!!.append(this.sqlStrings!!.START)
stringBuffer!!.append(storeFrontData!!.NAME)
stringBuffer!!.append(this.sqlTypeStrings!!.SIXTY_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.HOMEHOSTNAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.HOMEHOSTNAMEPATH)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.HOSTNAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.HOSTNAMEPATH)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.TESTHOMEHOSTNAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.TESTHOMEHOSTNAMEPATH)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.TESTHOSTNAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.TESTHOSTNAMEPATH)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.IMAGEPATH)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.STATICPATH)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.CATEGORYPATH)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.INVENTORYCONTROL)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.CONFIGURATION)
stringBuffer!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.SUBSTORES)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.TAGLOCATION)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.PACKAGELOCATION)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.FTP)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.FTPPATH)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.FTPUSERNAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.FTPPASSWORD)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.TESTFTP)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.TESTFTPPATH)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.TESTFTPUSERNAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(storeFrontData!!.TESTFTPPASSWORD)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(EntryData.getInstance()!!.TIMECREATED)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(EntryData.getInstance()!!.getInstance()!!.LASTMODIFIED)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(this.sqlStrings!!.PRIMARY_KEY)
stringBuffer!!.append(storeFrontData!!.NAME)
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



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.dropTable()
}


}
                
            


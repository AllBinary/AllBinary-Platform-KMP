
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
        package org.allbinary.data.tables.advertisement



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.DynamicObjectData
import org.allbinary.business.advertisement.AdvertisementData
import org.allbinary.business.advertisement.AdvertisementInterface
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.string.StringMaker

open public class AdvertisementsEntity : AbSqlBean
                , AdvertisementsEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val tableName: String = "advertisements"

    private val _INDEX: String = "_index"
public constructor        ()                        

                            : super(UserDbInitInfo()){

                            //For kotlin this is before the body of the constructor.
                    
this.setTableName(tableName)
}


open fun delete(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value

        try {
            super.deleteWhere(EntryData.getInstance()!!.ID, value)

    
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


open fun get(storeName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var storeName = storeName

    var keysAndValues: HashMap<Any, Any> = HashMap<Any, Any>()

keysAndValues!!.put(StoreFrontData.getInstance()!!.NAME, storeName)

    var hashMapVector: Vector = super.getRows(keysAndValues)!!
            


    var vector: Vector = Vector()


    var size: Int = hashMapVector!!.size!!
            





                        for (index in 0 until size)


        {
    var hashMap: HashMap<Any, Any> = hashMapVector!!.get(index as Object?) as HashMap<Any, Any>

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector as Vector
}


open fun get(storeName: String, advertismentName: String)
        //nullable = true from not(false or (false and false)) = true
: AdvertisementInterface{

                    var storeName = storeName


                    var advertismentName = advertismentName

    var keysAndValues: HashMap<Any, Any> = HashMap<Any, Any>()

keysAndValues!!.put(StoreFrontData.getInstance()!!.NAME, storeName)
keysAndValues!!.put(AdvertisementData.getInstance()!!.NAME, advertismentName)

    var hashMap: HashMap<Any, Any> = super.getRow(keysAndValues)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String{
    var advertisementData: AdvertisementData = AdvertisementData.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)
stringBuffer!!.append(this.getTableName())!!.append(this.sqlStrings!!.START)!!.append(advertisementData!!.NAME)!!.append(_INDEX)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(advertisementData!!.NAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(StoreFrontData.getInstance()!!.NAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(advertisementData!!.DESCRIPTION)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(DynamicObjectData.NAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(EntryData.getInstance()!!.TIMECREATED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(EntryData.getInstance()!!.LASTMODIFIED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(this.sqlStrings!!.PRIMARY_KEY)!!.append(advertisementData!!.NAME)!!.append(this.sqlStrings!!.END)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun createTable()
        //nullable = true from not(false or (false and true)) = true
: String{
    var returnStr: String = super.createTable(this.createTableStatement())!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return returnStr
}


open fun update(updatedValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var updatedValues = updatedValues
super.updateWhere(EntryData.getInstance()!!.ID, updatedValues!!.get(EntryData.getInstance()!!.ID) as String, updatedValues)
}


open fun dropTable()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.dropTable()
}


}
                
            


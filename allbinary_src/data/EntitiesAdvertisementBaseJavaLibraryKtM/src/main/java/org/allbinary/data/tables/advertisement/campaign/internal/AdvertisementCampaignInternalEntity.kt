
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
        package org.allbinary.data.tables.advertisement.campaign.internal




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.advertisement.campaign.AdvertisementCampaign
import org.allbinary.business.advertisement.campaign.AdvertisementCampaignData
import org.allbinary.business.advertisement.campaign.AdvertisementCampaignInterface
import org.allbinary.business.advertisement.campaign.AdvertisementCampaigns
import org.allbinary.business.advertisement.campaign.AdvertisementCampaignsInterface
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.business.time.TimeData
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.string.StringMaker

open public class AdvertisementCampaignInternalEntity : AbSqlBean
                , AdvertisementCampaignInternalEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val tableName: String = "adCampaignInternal"
public constructor        ()                        

                            : super(UserDbInitInfo())

        Updates for KMP build        
        {


                            //For kotlin this is before the body of the constructor.
                    
this.setTableName(tableName)
}


open fun delete(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value

        try {
            super.deleteWhere(StoreFrontData.getInstance()!!.NAME, value)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, commonStrings!!.delete)

                                    }
                                
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, commonStrings!!.delete, e)

                                    }
                                
}

}


open fun getCampaignsInStore(storeName: String)
        //nullable = true from not(false or (false and false)) = true
: AdvertisementCampaignsInterface

        Updates for KMP build        
        {
var storeName = storeName

    var keysAndValues: HashMap<Any, Any> = HashMap<Any, Any>()

keysAndValues!!.put(StoreFrontData.getInstance()!!.NAME, storeName)

    var hashMapVector: Vector = super.getRows(keysAndValues)!!


    var vector: Vector = Vector()


    var size: Int = hashMapVector!!.size!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var hashMap: HashMap<Any, Any> = hashMapVector!!.get(index as Object) as HashMap<Any, Any>


    
                        if(hashMap != 
                                    null
                                )
                        
                                    {
                                    vector.add(AdvertisementCampaign(hashMap) as AdvertisementCampaignInterface)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdvertisementCampaigns(vector) as AdvertisementCampaignsInterface
}


open fun get(storeName: String, name: String)
        //nullable = true from not(false or (false and false)) = true
: AdvertisementCampaignInterface

        Updates for KMP build        
        {
var storeName = storeName
var name = name

    var keysAndValues: HashMap<Any, Any> = HashMap<Any, Any>()

keysAndValues!!.put(StoreFrontData.getInstance()!!.NAME, storeName)
keysAndValues!!.put(AdvertisementCampaignData.getInstance()!!.NAME, name)

    var hashMap: HashMap<Any, Any> = super.getRow(keysAndValues)!!


    
                        if(hashMap != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdvertisementCampaign(hashMap) as AdvertisementCampaignInterface

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}


open fun update(updatedValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var updatedValues = updatedValues
super.updateWhere(EntryData.getInstance()!!.getInstance()!!.ID, updatedValues!!.get(EntryData.getInstance()!!.getInstance()!!.ID) as String, updatedValues)
}


open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

    var entryData: EntryData = EntryData.getInstance()!!.getInstance()!!


    var advertisementCampaignData: AdvertisementCampaignData = AdvertisementCampaignData.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)
stringBuffer!!.append(this.getTableName())
stringBuffer!!.append(this.sqlStrings!!.START)
stringBuffer!!.append(entryData!!.ID)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(StoreFrontData.getInstance()!!.NAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(advertisementCampaignData!!.NAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(advertisementCampaignData!!.DESCRIPTION)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(advertisementCampaignData!!.CONFIG)!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)!!.append(TimeData.getInstance()!!.START)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(TimeData.getInstance()!!.END)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(entryData!!.TIMECREATED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(entryData!!.LASTMODIFIED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(this.sqlStrings!!.PRIMARY_KEY)!!.append(entryData!!.ID)!!.append(this.sqlStrings!!.END)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun createTable()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

    var returnStr: String = super.createTable(this.createTableStatement())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return returnStr
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
                
            


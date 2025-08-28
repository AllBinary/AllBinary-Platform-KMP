
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
        package org.allbinary.data.tables.user.commerce.inventory.item.options




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.InventoryDbInitInfo
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.business.user.commerce.inventory.item.option.BasicOptionItemData
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.string.StringMaker

open public class BasicOptionItemsEntity : AbSqlBean
                , BasicOptionItemsEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val tableName: String = "basicoptionitems"
public constructor        ()                        

                            : super(InventoryDbInitInfo())

        Updates for KMP build        
        {


                            //For kotlin this is before the body of the constructor.
                    
this.setTableName(tableName)
}


open fun insert(values: Vector)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var values = values

        try {
            super.insert(values)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, INSERT)

                                    }
                                
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, INSERT, e)

                                    }
                                
}

}


open fun delete(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var value = value

        try {
            super.deleteWhere(BasicItemData.ID, value)

    
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


open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)!!.append(tableName)!!.append(this.sqlStrings!!.START)!!.append(BasicItemData.ID)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(BasicOptionItemData.OPTION_ONE_TITLE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(BasicOptionItemData.DEFAULT_OPTION_ITEM)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(BasicOptionItemData.DEFAULT_OPTION_VALUE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicOptionItemData.OPTION_ONE_ONE_ITEM)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_ONE_VALUE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_TWO_ITEM)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_TWO_VALUE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_THREE_ITEM)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_THREE_VALUE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_FOUR_ITEM)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_FOUR_VALUE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_FIVE_ITEM)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_FIVE_VALUE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_SIX_ITEM)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_SIX_VALUE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_SEVEN_ITEM)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_SEVEN_VALUE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_EIGHT_ITEM)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_EIGHT_VALUE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_NINE_ITEM)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(BasicOptionItemData.OPTION_ONE_NINE_VALUE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(EntryData.getInstance()!!.TIMECREATED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(EntryData.getInstance()!!.LASTMODIFIED)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(this.sqlStrings!!.PRIMARY_KEY)!!.append(BasicItemData.ID)!!.append(this.sqlStrings!!.END)



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


open fun update(updatedValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var updatedValues = updatedValues
super.updateWhere(BasicItemData.ID, updatedValues!!.get(BasicItemData.ID) as String, updatedValues)
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
                
            


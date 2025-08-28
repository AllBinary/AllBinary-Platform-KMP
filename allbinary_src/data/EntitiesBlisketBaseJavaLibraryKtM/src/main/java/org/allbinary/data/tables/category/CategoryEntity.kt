
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
        package org.allbinary.data.tables.category




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.category.Category
import org.allbinary.business.category.CategoryData
import org.allbinary.business.category.CategoryFactoryInterface
import org.allbinary.business.init.db.InventoryDbInitInfo
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.string.StringMaker

open public class CategoryEntity : AbSqlBean
                , CategoryEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val tableName: String = "categories"
public constructor        (categoryFactoryInterface: CategoryFactoryInterface)                        

                            : super(InventoryDbInitInfo())

        Updates for KMP build        
        {
var categoryFactoryInterface = categoryFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    
this.setTableName(tableName)
}

public constructor        ()                        

                            : super(InventoryDbInitInfo())

        Updates for KMP build        
        {


                            //For kotlin this is before the body of the constructor.
                    
this.setTableName(tableName)
}


open fun insert(category: Category)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var category = category

        try {
            
    var categoryVector: Vector = category.toVector()!!


    var values: Vector = Vector()

values.add(categoryVector!!.get(0))
values.add(categoryVector!!.get(1))
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
            super.deleteWhere(CategoryData.getInstance()!!.NAME, value)

    
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

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)
stringBuffer!!.append(tableName)
stringBuffer!!.append(this.sqlStrings!!.START)
stringBuffer!!.append(CategoryData.getInstance()!!.NAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(CategoryData.getInstance()!!.LEVEL)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(this.sqlStrings!!.PRIMARY_KEY)
stringBuffer!!.append(CategoryData.getInstance()!!.NAME)
stringBuffer!!.append(this.sqlStrings!!.END)



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
super.updateWhere(CategoryData.getInstance()!!.NAME, updatedValues!!.get(CategoryData.getInstance()!!.NAME) as String, updatedValues)
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
                
            


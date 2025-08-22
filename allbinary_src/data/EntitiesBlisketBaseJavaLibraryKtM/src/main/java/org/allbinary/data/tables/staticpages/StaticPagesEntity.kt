
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
        package org.allbinary.data.tables.staticpages




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.init.db.StaticPagesDbInitInfo
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.control.search.SearchData
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps

open public class StaticPagesEntity : AbSqlBean
                , StaticPagesEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val TABLENAME: String = "staticpages"
public constructor        ()                        

                            : super(StaticPagesDbInitInfo()){

                            //For kotlin this is before the body of the constructor.
                    
this.setTableName(TABLENAME)
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


open fun getFile(store: String, keywords: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var store = store


                    var keywords = keywords

    var whereHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

whereHashMap!!.put(StoreFrontData.getInstance()!!.NAME, store)
whereHashMap!!.put(BasicItemData.KEYWORDS, keywords)

    var file: String = super.getField(whereHashMap, SearchData.PAGE)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return file
}


open fun delete(keywords: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var keywords = keywords
super.deleteWhere(BasicItemData.KEYWORDS, keywords)
}


open fun dropTable()
        //nullable = true from not(false or (false and true)) = true
: String{
    var returnStr: String = super.dropTable()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return returnStr
}


open fun update(updatedValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var updatedValues = updatedValues
super.updateWhere(BasicItemData.KEYWORDS, updatedValues!!.get(BasicItemData.KEYWORDS) as String, updatedValues)
}


open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)!!.append(TABLENAME)!!.append(this.sqlStrings!!.START)!!.append(StoreFrontData.getInstance()!!.NAME)!!.append(this.sqlTypeStrings!!.SIXTY_CHAR_COLUMN_NOT_NULL)!!.append(BasicItemData.KEYWORDS)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(SearchData.PAGE)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(this.sqlStrings!!.PRIMARY_KEY)!!.append(StoreFrontData.getInstance()!!.NAME)!!.append(CommonSeps.getInstance()!!.COMMA_SEP)!!.append(BasicItemData.KEYWORDS)!!.append(this.sqlStrings!!.END)



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
                
            


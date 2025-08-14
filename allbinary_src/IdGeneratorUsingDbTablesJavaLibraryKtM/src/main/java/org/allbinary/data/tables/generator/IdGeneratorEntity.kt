
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2002 AllBinary 
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
        package org.allbinary.data.tables.generator




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean

open public class IdGeneratorEntity : AbSqlBean
                , IdGeneratorEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val tableName: String = "idgenerator"

    private val tableData: String

    val NAME: String = "NAME"

    val VALUE: String = "VALUE"
public constructor        ()                        

                            : super(UserDbInitInfo()){

                            //For kotlin this is before the body of the constructor.
                    
this.tableData= StringBuilder().
                            append(this.sqlStrings!!.CREATE_TABLE)!!.append(tableName)!!.append(this.sqlStrings!!.START)!!.append(NAME)!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)!!.append(VALUE)!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)!!.append(this.sqlStrings!!.PRIMARY_KEY)!!.append(NAME)!!.append(this.sqlStrings!!.END)!!.toString()
super.setTableName(tableName)
}


                @Throws(Exception::class)
            
open fun get(name: String)
        //nullable = true from not(false or (false and false)) = true
: Long{

                    var name = name

    var keysAndValues: HashMap<Any, Any> = HashMap<Any, Any>()

keysAndValues!!.put(NAME, name)

    var hashMap: HashMap<Any, Any> = super.getRow(keysAndValues)!!
            


    
                        if(
                                    (get as String).compareTo(name) != 0)
                        
                                    {
                                    


                            throw Exception(
                            "results do not match")

                                    }
                                

    var value: String = hashMap!!.get(VALUE as Object?) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Long.parseLong(value)
}


open fun insert(values: Vector)
        //nullable = true from not(false or (false and false)) = true
{

                    var values = values

        try {
            super.insert(values)
logUtil!!.put(this.commonStrings!!.SUCCESS, this, INSERT)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.FAILURE, this, INSERT, e)
}

}


open fun delete(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value

        try {
            super.deleteWhere(NAME, value)
logUtil!!.put(this.commonStrings!!.SUCCESS, this, commonStrings!!.delete)
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.FAILURE, this, commonStrings!!.delete, e)
}

}


open fun update(name: String, value: Long)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name


                    var value = value

    var map: HashMap<Any, Any> = HashMap<Any, Any>()

map.put(NAME, name)
map.put(VALUE, value.toString())
this.update(map)
}


open fun update(hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var hashMap = hashMap
super.updateWhere(NAME, hashMap!!.get(NAME as Object?) as String, hashMap)
}


open fun createTable()
        //nullable = true from not(false or (false and true)) = true
: String{
    var returnStr: String = super.createTable(tableData)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return returnStr
}


open fun dropTable()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.dropTable()
}


}
                
            



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
        package org.allbinary.business.init



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory
import org.allbinary.logic.communication.log.config.type.LogConfigTypes
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker

open public class InitInfoEntity : InitSql {
        

    private val NAME: String = "InitInfoEntity"

    private val NOTHING: String = "NOTHING"

    private val tableName: String = "initdata"

    private val tableData: String

    private val NOT_IN_DB: String = "Not In DB"

    private val METHOD_GET: String = "get()"

    private val METHOD_IS: String = "is()"

    private val METHOD_ADD: String = "add()"

    private val CREATED_SUCCESS: String = " Created Successfully"

    private val FAILED_TO_CREATE: String = "Failed to create "
public constructor        ()                        

                            : super(UserDbInitInfo()){

                            //For kotlin this is before the body of the constructor.
                    

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.CREATE_TABLE)
stringBuffer!!.append(tableName)
stringBuffer!!.append(this.sqlStrings!!.START)
stringBuffer!!.append(NOTHING)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(InitInfo.getInstance()!!.TESTING)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(InitInfo.getInstance()!!.TESTHTMLPATH)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(InitInfo.getInstance()!!.MAINPATH)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(this.sqlStrings!!.PRIMARY_KEY)
stringBuffer!!.append(NOTHING)
stringBuffer!!.append(this.sqlStrings!!.END)
this.tableData= stringBuffer!!.toString()
this.setTable(this.tableName)
}


open fun get()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var keyAndValue: HashMap<Any, Any> = HashMap<Any, Any>()

keyAndValue!!.put(NOTHING, NOTHING)

    var hashMap: HashMap<Any, Any> = getRow(keyAndValue)!!
            


    
                        if(hashMap != 
                                    null
                                )
                        
                                    {
                                    InitInfo.getInstance()!!.set(hashMap)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADER))
                        
                                    {
                                    PreLogUtil.put(this.NOT_IN_DB, NAME, this.METHOD_GET)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
} catch(e: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADERERROR))
                        
                                    {
                                    PreLogUtil.put(this.commonStrings!!.EXCEPTION, this.NAME, this.METHOD_GET, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun is()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var keyAndValue: HashMap<Any, Any> = HashMap<Any, Any>()

keyAndValue!!.put(NOTHING, NOTHING)

    var hashMap: HashMap<Any, Any> = getRow(keyAndValue)!!
            


    
                        if(hashMap != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADER))
                        
                                    {
                                    PreLogUtil.put(this.NOT_IN_DB, this.NAME, this.METHOD_IS)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
} catch(e: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADERERROR))
                        
                                    {
                                    PreLogUtil.put(this.commonStrings!!.EXCEPTION, this.NAME, this.METHOD_IS, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{updateWhere(NOTHING, NOTHING, InitInfo.getInstance()!!.toHashMap())
}


open fun add()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var values: Vector = Vector()

values!!.add(NOTHING)
values!!.add(InitInfo.getInstance()!!.getTesting())
values!!.add(InitInfo.getInstance()!!.getTestHtmlPath())
values!!.add(InitInfo.getInstance()!!.getMainPath())
insert(values)
} catch(e: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.PRELOADERERROR))
                        
                                    {
                                    PreLogUtil.put(this.commonStrings!!.EXCEPTION, this.NAME, this.METHOD_ADD, e)

                                    }
                                
}

}


open fun createTable()
        //nullable = true from not(false or (false and true)) = true
: String{
    
                        if(super.createTable(tableData))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tableName +CREATED_SUCCESS

                                    }
                                
                        else {
                            
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(FAILED_TO_CREATE)
stringBuffer!!.append(tableData)
stringBuffer!!.append(AbPathData.getInstance()!!.EXTENSION_SEP)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()

                        }
                            
}


}
                
            


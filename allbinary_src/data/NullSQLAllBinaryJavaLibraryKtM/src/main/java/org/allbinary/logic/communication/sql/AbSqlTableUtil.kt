
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.installer.Portion
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class AbSqlTableUtil
            : Object
         {
        

        companion object {
            
    private val instance: AbSqlTableUtil = AbSqlTableUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AbSqlTableUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val TABLE_LABEL: String = "Table: "

    val stringUtil: StringUtil = StringUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    val commonSeps: CommonSeps = CommonSeps.getInstance()!!

    val sqlStrings: SqlStrings = SqlStrings.getInstance()!!

open fun backupTable(abSqlTable: AbSqlTable)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abSqlTable = abSqlTable

    var tableName: String = abSqlTable!!.getTableName()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TABLE_LABEL +tableName +" Backup Failed"
}


open fun restoreTable(abSqlTable: AbSqlTable, portion: Portion)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abSqlTable = abSqlTable


                    var portion = portion

    var tableName: String = abSqlTable!!.getTableName()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(TABLE_LABEL)
stringBuffer!!.append(tableName)
stringBuffer!!.append(" Restoration Failed")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            



        /* Generated Code Do Not Modify */
        package org.allbinary.logic.communication.sql




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class SqlStrings
            : Object
         {
        

        companion object {
            
    private val instance: SqlStrings = SqlStrings()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SqlStrings{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val CREATE_DATABASE: String = "CREATE DATABASE "

    val DROP_TABLE: String = "DROP TABLE "

    val CREATE_TABLE: String = "CREATE TABLE "

    val START: String = " ("

    val SELECT: String = "SELECT "

    val FROM: String = " FROM "

    val SELECT_ALL: String = "SELECT *"

    val WHERE: String = " WHERE "

    val AND: String = " AND "

    val UPDATE: String = "UPDATE "

    val SET: String = " SET "

    val SELECT_ALL_FROM: String = this.SELECT_ALL +this.FROM

    val DELETE: String = "DELETE"

    val LIKE_QUOTE: String = " LIKE \""

    val INSERT_INTO: String = "INSERT INTO "

    val VALUES: String = " VALUES ('"

    val ORDER_BY: String = "ORDER BY"

    val COUNT: String = "COUNT("

    val ASC: String = "ASC"

    val DESC: String = "DESC"

    val PRIMARY_KEY: String = "PRIMARY KEY("

    val END: String = ") )"

    val EQUAL_QUOTE: String = " = \""

    val CLOSE_QUOTE: String = "\""

    val EQUAL_QUOTE_NO_SPACE: String = "=\""

    val ESCAPE: String = "\\"

    val DOUBLE_ESCAPE: String = "\\\\"

    val MORE_THAN_QUOTE: String = " > \""

    val LESS_THAN_QUOTE: String = " < \""

    val SINGLE_QUOTE_COMMA_SEP: String = "','"

    val ID: String = "ID"

    val SQL_STATEMENT_LABEL: String = "SQL Statement: "

    val COLUMN_VALUE: String = "\nColumn Value: "

    val CREATE_RETURN: String = " Created Successfully"

    val FIELD_VALUE: String = "\nField Value: "

}
                
            


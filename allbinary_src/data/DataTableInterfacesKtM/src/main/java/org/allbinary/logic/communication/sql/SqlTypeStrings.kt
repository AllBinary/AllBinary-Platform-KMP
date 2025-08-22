
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.communication.sql




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.string.CommonSeps

open public class SqlTypeStrings
            : Object
         {
        

        companion object {
            
    private val instance: SqlTypeStrings = SqlTypeStrings()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SqlTypeStrings{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val CHAR_COLUMN: String = "VARCHAR"

    val INT_COLUMN: String = "VARCHAR"

    val MAX_SIZE: String = "(255)"

    val SIXTY_SIZE: String = "(60)"

    val NOT_NULL: String = "NOT NULL"

    val ONE_SIZE: String = "(1)"

    val TWO_SIZE: String = "(2)"

    val THREE_SIZE: String = "(3)"

    val SIX_SIZE: String = "(6)"

    val ELEVEN_SIZE: String = "(11)"

    val TWELVE_SIZE: String = "(12)"

    val ONE_KB_CHAR_COLUMN: String = StringBuilder().
                            append(CommonSeps.getInstance()!!.SPACE)!!.append(CHAR_COLUMN)!!.append("(1024)")!!.append(CommonSeps.getInstance()!!.COMMA_SEP)!!.toString()!!

    val MAX_CHAR_COLUMN: String = StringBuilder().
                            append(CommonSeps.getInstance()!!.SPACE)!!.append(CHAR_COLUMN)!!.append(MAX_SIZE)!!.append(CommonSeps.getInstance()!!.COMMA_SEP)!!.toString()!!

    val MAX_CHAR_COLUMN_NOT_NULL: String = StringBuilder().
                            append(CommonSeps.getInstance()!!.SPACE)!!.append(CHAR_COLUMN)!!.append(MAX_SIZE)!!.append(CommonSeps.getInstance()!!.SPACE)!!.append(NOT_NULL)!!.append(CommonSeps.getInstance()!!.COMMA_SEP)!!.toString()!!

    val SIXTY_CHAR_COLUMN_NOT_NULL: String = StringBuilder().
                            append(CommonSeps.getInstance()!!.SPACE)!!.append(CHAR_COLUMN)!!.append(SIXTY_SIZE)!!.append(NOT_NULL)!!.append(CommonSeps.getInstance()!!.COMMA_SEP)!!.toString()!!

    val ONE_CHAR_COLUMN_NOT_NULL: String = StringBuilder().
                            append(CommonSeps.getInstance()!!.SPACE)!!.append(CHAR_COLUMN)!!.append(ONE_SIZE)!!.append(NOT_NULL)!!.append(CommonSeps.getInstance()!!.COMMA_SEP)!!.toString()!!

    val SIX_CHAR_COLUMN_NOT_NULL: String = StringBuilder().
                            append(CommonSeps.getInstance()!!.SPACE)!!.append(CHAR_COLUMN)!!.append(SIX_SIZE)!!.append(NOT_NULL)!!.append(CommonSeps.getInstance()!!.COMMA_SEP)!!.toString()!!

    val TWELVE_CHAR_COLUMN_NOT_NULL: String = StringBuilder().
                            append(CommonSeps.getInstance()!!.SPACE)!!.append(CHAR_COLUMN)!!.append(this.TWELVE_SIZE)!!.append(NOT_NULL)!!.append(CommonSeps.getInstance()!!.COMMA_SEP)!!.toString()!!

    val TWO_INT_NOT_NULL: String = " INT(2) NOT NULL, "

    val THREE_INT_NOT_NULL: String = " INT(3) NOT NULL, "

    val FOUR_INT_NOT_NULL: String = " INT(4) NOT NULL, "

    val MAX_INT_NOT_NULL: String = " INT(11) NOT NULL, "

    val MAX_INT_UNSIGNED: String = " INT(11) UNSIGNED, "

    val MAX_INT_UNSIGNED_NOT_NULL: String = " INT(11) UNSIGNED NOT NULL, "

    val MAX_BIG_INT_NOT_NULL: String = " BIGINT(19) NOT NULL, "

    val MAX_BIG_INT_UNSIGNED: String = " BIGINT(19) UNSIGNED, "

    val MAX_BIG_INT_UNSIGNED_NOT_NULL: String = " BIGINT(19) UNSIGNED NOT NULL, "

    val MAX_BIG_INT_UNSIGNED_AUTO_INCREMENT_NOT_NULL: String = " BIGINT(19) UNSIGNED AUTO_INCREMENT NOT NULL,"

    val LONG_BLOB: String = " LONGBLOB, "

    val BLOB: String = " BLOB, "

    val BLOB_NOT_NULL: String = " BLOB NOT NULL, "

}
                
            


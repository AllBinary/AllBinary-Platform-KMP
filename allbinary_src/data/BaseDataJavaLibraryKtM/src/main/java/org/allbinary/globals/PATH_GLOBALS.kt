
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
        package org.allbinary.globals




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings

open public class PATH_GLOBALS
            : Object
         {
        

        companion object {
            
    private val instance: PATH_GLOBALS = PATH_GLOBALS()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PATH_GLOBALS{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {
    var stringBuffer: StringMaker = StringMaker()


    var abPathData: AbPathData = AbPathData.getInstance()!!
            

stringBuffer!!.append(
                            "data")
stringBuffer!!.append(abPathData!!.SEPARATOR)
this.DATA_PATH= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(DATA_PATH)
stringBuffer!!.append(CommonStrings.getInstance()!!.INIT)
stringBuffer!!.append(abPathData!!.SEPARATOR)
this.INIT_PATH= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(DATA_PATH)
stringBuffer!!.append(
                            "log")
stringBuffer!!.append(abPathData!!.SEPARATOR)
this.LOG_PATH= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(DATA_PATH)
stringBuffer!!.append(
                            "backup")
stringBuffer!!.append(abPathData!!.SEPARATOR)
this.BACKUP_PATH= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(INIT_PATH)
stringBuffer!!.append(
                            "views")
stringBuffer!!.append(abPathData!!.SEPARATOR)
this.VIEWS_PATH= stringBuffer!!.toString()
}


    val DATA_PATH: String

    val INIT_PATH: String

    val VIEWS_PATH: String

    val LOG_PATH: String

    val BACKUP_PATH: String

}
                
            


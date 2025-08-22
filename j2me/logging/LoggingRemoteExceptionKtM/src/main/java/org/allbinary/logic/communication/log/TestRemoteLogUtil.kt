
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
        package org.allbinary.logic.communication.log




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.globals.Globals
import org.allbinary.string.CommonStrings

open public class TestRemoteLogUtil
            : Object
         {
        

        companion object {
            
    val PATH: String = "G:\\mnt\\bc\\mydev\\work\\allbinary_src\\licensing\\data\\"

                @Throws(Exception::class)
            
open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var args = args

                        //Otherwise - ExpressionStmt - expression - ObjectCreationExpr

}


        }
            public constructor        ()
            : super()
        {Globals.getInstance()!!.init(this::class.java.classLoader, PATH)

    var logUtil: LogUtil = LogUtil.getInstance()!!


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, "Test", "TestClass", Exception("Pretend Exception"))
}


}
                
            



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
        package org.allbinary.logic.java.exception




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayOutputStream
import java.io.PrintStream

/*actual*/ open public class ExceptionUtil
            : Object
         {
        
/*actual*/ companion object {
            
    private val instance: ExceptionUtil = ExceptionUtil()

    /*actual*/ open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ExceptionUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


    /*actual*/ val PRETEND_EXCEPTION: Exception = Exception("Not Really An Exception")

        }
            private constructor ()
            : super()
        {
}


    private val NONE: String = "No Stack Trace"

    /*actual*/ open fun getStackTrace(e: Throwable)
        //nullable = true from not(false or (false and false)) = true
: String{
    //var e = e

    
                        if(e != 
                                    null
                                )
                        
                                    {
                                    
    var byteArrayOutputStream: ByteArrayOutputStream = ByteArrayOutputStream()


    var printStream: PrintStream = PrintStream(byteArrayOutputStream)

e.printStackTrace(printStream)

    var output: String = byteArrayOutputStream!!.toString()!!


    
                        if(output != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return output.toCharArray().concatToString()

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NONE
}


}
                
            


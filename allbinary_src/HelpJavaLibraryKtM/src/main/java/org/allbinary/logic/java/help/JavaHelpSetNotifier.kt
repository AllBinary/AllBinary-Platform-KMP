
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
        package org.allbinary.logic.java.help




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.net.URL
import java.util.Vector
import javax.help.HelpSet

open public class JavaHelpSetNotifier
            : Object
         {
        

        companion object {
            
    private var vector: Vector = Vector()

open fun get()
        //nullable = true from not(false or (false and true)) = true
: Vector{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector
}


open fun isNotified(helpSet: HelpSet)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var helpSet = helpSet

    var isNotified: Boolean = false


    var url: URL = helpSet!!.getHelpSetURL()!!
            


    var size: Int = vector.size!!
            


    var urlArray: Array<Any?> = vector.toArray()!!
            





                        for (i in 0 until size)


        {
    var nextURL: URL = urlArray[i]!! as URL


    
                        if(url.toString()!!.compareTo(nextURL!!.toString()) == 0)
                        
                                    {
                                    isNotified= true

                                    }
                                
}

vector.add(url)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isNotified
}


        }
            private constructor        ()
            : super()
        {}


}
                
            


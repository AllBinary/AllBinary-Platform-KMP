
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
        package views.generic.inventory




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class InventorySearchLoopInfo
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var lastPage: Int =  -1

    var currentPage: Int =  -1

    var numberOfResultsOnCurrentPage: Int = 0

    var numberOfResults: Int = 0

    private val CURRENT: String = "current: "

    private val NUM: String = " num: "

    private val LAST: String = " last: "

    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(CURRENT)
stringBuffer!!.append(currentPage)
stringBuffer!!.append(NUM)
stringBuffer!!.append(numberOfResults)
stringBuffer!!.append(LAST)
stringBuffer!!.append(lastPage)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            


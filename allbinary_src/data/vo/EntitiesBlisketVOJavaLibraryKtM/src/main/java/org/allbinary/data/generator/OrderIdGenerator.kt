
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
        package org.allbinary.data.generator




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.globals.PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.string.StringMaker

open public class OrderIdGenerator : UniqueIdGenerator {
        

    private val IDFILE: String = "orderId"
public constructor        (){
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getMainPath())
stringBuffer!!.append(PATH_GLOBALS.getInstance()!!.INIT_PATH)
stringBuffer!!.append(IDFILE)
stringBuffer!!.append(UniqueIdGenerator.EXT)
super.setFile(stringBuffer!!.toString(), IDFILE)
}


}
                
            


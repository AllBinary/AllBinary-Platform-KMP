
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
        package org.allbinary.game.ai




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.util.visitor.Visitor
import org.allbinary.string.CommonStrings

open public class LastKeyAIVisitor : Visitor {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val TRUE: Boolean = BooleanFactory.getInstance()!!.TRUE
public constructor        (){}

override fun visit(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var anyType = anyType

        try {
            
    var basicAI: BasicAI = anyType as BasicAI


    var key: Int = basicAI!!.getLastKey()!!
            


    
                        if(key !=  -1)
                        
                                    {
                                    basicAI!!.processAI(key)

                                    }
                                
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.VISIT, e)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TRUE
}


}
                
            


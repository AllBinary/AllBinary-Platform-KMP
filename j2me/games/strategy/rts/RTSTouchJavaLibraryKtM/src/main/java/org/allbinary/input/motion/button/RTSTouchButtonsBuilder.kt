
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2007 AllBinary 
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
        package org.allbinary.input.motion.button




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil

open public class RTSTouchButtonsBuilder : BaseTouchInput {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

open fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

        Updates for KMP build        
        {

        try {
            logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)

    var list: BasicArrayList = BasicArrayList()

list.addAll(BasicTouchButtonsBuilder().
                            getList())
list.addAll(BuildingScrollTouchButtonsBuilder().
                            getList())
list.addAll(UpgradeDowngradeTouchButtonsBuilder().
                            getList())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicArrayListUtil.getInstance()!!.getImmutableInstance()
}

}


}
                
            


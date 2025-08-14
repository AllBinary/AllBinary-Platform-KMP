
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
        package org.allbinary.logic.communication.http




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class AcceptableResponse
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            
protected constructor        (candidate: String, tagName: String, index: Int)
            : super()
        {

                    var candidate = candidate


                    var tagName = tagName


                    var index = index
logUtil!!.put(tagName, this, this.commonStrings!!.CONSTRUCTOR)

    var acceptableResponseUtil: AcceptableResponseUtil = AcceptableResponseUtil.getInstance()!!
            

acceptableResponseUtil!!.candidateVector!!.add(index, candidate)
acceptableResponseUtil!!.tagNameVector!!.add(index, tagName)
}


}
                
            



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
        package org.allbinary.logic.visual.transform.data



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.jsp.PageContext
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.control.search.SearchRequest

open public class TransformStoreDocumentFactory
            : Object
         {
        

        companion object {


                @Throws(Exception::class)
            
open fun getInstance(pageContext: PageContext, weblisketSession: WeblisketSession)
        //nullable =  from not(true or (false and false)) = 
: TransformDocumentInterface{

                    var pageContext = pageContext


                    var weblisketSession = weblisketSession



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TransformStoreDocument(pageContext, weblisketSession) as TransformDocumentInterface
}


                @Throws(Exception::class)
            
open fun getInstance(searchRequest: SearchRequest)
        //nullable =  from not(true or (false and false)) = 
: TransformDocumentInterface{

                    var searchRequest = searchRequest



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TransformStoreDocument(searchRequest) as TransformDocumentInterface
}



        }
            private constructor        ()
            : super()
        {}


}
                
            


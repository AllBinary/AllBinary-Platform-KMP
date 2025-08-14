
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
        package org.allbinary.logic.visual.dhtml.html




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector

open public class HtmlTags
            : Object
         {
        

    private var htmlTagVector: Vector
public constructor        ()
            : super()
        {htmlTagVector= Vector()
}


open fun get(index: Int)
        //nullable = true from not(false or (false and false)) = true
: HtmlTag{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return htmlTagVector!!.get(index) as HtmlTag
}


open fun add(htmlTag: HtmlTag)
        //nullable = true from not(false or (false and false)) = true
{

                    var htmlTag = htmlTag
htmlTagVector!!.add(htmlTag)
}


open fun size()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return htmlTagVector!!.size
}


}
                
            


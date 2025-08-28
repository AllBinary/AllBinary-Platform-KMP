
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
        package org.allbinary.logic.visual.dhtml.html.head.meta




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class HtmlMetaAttributeData
            : Object
         {
        

    private var id: Int

    private var name: String
public constructor        (id: Int, value: String)
            : super()
        

        Updates for KMP build        
        {
var id = id
var value = value
this.name= value
this.id= id
}


open fun equals(htmlMetaAttributeData: HtmlMetaAttributeData?)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var htmlMetaAttributeData = htmlMetaAttributeData

    
                        if(htmlMetaAttributeData!!.id == this.id)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


}
                
            


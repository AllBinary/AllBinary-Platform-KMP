
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
        package admin.tags




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.jsp.tagext.Tag
import org.allbinary.logic.string.StringMaker

open public class ParentInventoryTagHelper
            : Object
         {
        
companion object {
            
    private val instance: ParentInventoryTagHelper = ParentInventoryTagHelper()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ParentInventoryTagHelper{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
    open fun isValid(tagClass: Any, parentTag: Tag)
        //nullable = true from not(false or (false and false)) = true
{
var tagClass = tagClass
var parentTag = parentTag

    
                        if(parentTag == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Must have parent tag.")

                                    }
                                
                             else 
    
                        if(!(parentTag is HelperTag))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Must have at least a ")
stringBuffer!!.append("tags.HelperTag")
stringBuffer!!.append(" as parent")
stringBuffer!!.append("and not: ")
stringBuffer!!.append(parentTag!!::class.toString()!!)



                            throw Exception(stringBuffer!!.toString())

                                    }
                                
}


}
                
            


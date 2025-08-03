
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
        package org.allbinary.graphics.form.item.validation



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.util.visitor.Visitor

open public class TextItemVisitor : Visitor {
        
public constructor        (){}

override fun visit(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var anyType = anyType

    var value: String = anyType as String


    
                        if(value!!.length < 2)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BooleanFactory.getInstance()!!.TRUE

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BooleanFactory.getInstance()!!.FALSE

                        }
                            
}


}
                
            


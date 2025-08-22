
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.TextNotificationUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.util.visitor.Visitor
import org.allbinary.string.CommonStrings

open public class TextItemUserIdentifierVisitor : Visitor {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        (){}

override fun visit(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var anyType = anyType

    var value: String = anyType as String


    
                        if(value.length < 2)
                        
                                    {
                                    
    var charValue: Char = value[0]!!


    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!


    
                        if(stringValidationUtil!!.isNumber(value))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BooleanFactory.getInstance()!!.TRUE

                                    }
                                
                             else 
    
                        if(this.isLetter(charValue))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BooleanFactory.getInstance()!!.TRUE

                                    }
                                
                        else {
                            
        try {
            TextNotificationUtil.getInstance()!!.fireError("Only Letters & Numbers Allowed")
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.VISIT, e)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BooleanFactory.getInstance()!!.FALSE

                        }
                            

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BooleanFactory.getInstance()!!.FALSE

                        }
                            
}


open fun isLetter(charValue: Char)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var charValue = charValue

    var value: Int = charValue.toInt()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (value > 64 && value < 91) || (value > 96 && value < 123)
}


}
                
            


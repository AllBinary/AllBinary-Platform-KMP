
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
        package org.allbinary.logic.communication.log




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import javax.swing
import org.allbinary.string.CommonStrings

open public class GuiLog
            : Object
         {
        

        companion object {
            
    private val instance: GuiLog = GuiLog()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GuiLog{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
private constructor        ()
            : super()
        {}


open fun showDialog(msg: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var msg = msg

    var error: JDialog = JDialog()


    var size: Int = msg.length *9


    var x: Int = size


    
                        if(x > 550)
                        x= 550
error.getContentPane()!!.setLayout(GridLayout(1, 1))

    
                        if(size > 255)
                        
                                    {
                                    
    var y: Int = 550

error.setSize(x, y)
error.getContentPane()!!.add(javax.swing.JScrollPane(javax.swing.JTextArea(msg)))

                                    }
                                
                             else 
    
                        if(size > 0)
                        
                                    {
                                    
    var y: Int = 50

error.setSize(x, y)
error.getContentPane()!!.add(javax.swing.JScrollPane(javax.swing.JLabel(msg)))

                                    }
                                
error.show()
}


open fun put(specialMessage: String, anyType: Any, functionName: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var specialMessage = specialMessage


                    var anyType = anyType


                    var functionName = functionName



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.put(specialMessage, anyType, functionName, 
                            null)
}


open fun put(specialMessage: String, anyType: Any, functionName: String, exception: Exception)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var specialMessage = specialMessage


                    var anyType = anyType


                    var functionName = functionName


                    var exception = exception

        try {
            
    var data: String = LogFormatUtil.getInstance()!!.get(specialMessage, anyType!!::class.qualifiedName!!, functionName, exception)!!

this.showDialog(data)
System.out.println(data)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return data
} catch(e: Exception)
            {PreLogUtil.put(commonStrings!!.EXCEPTION, this, "put", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Logging Error"
}

}


open fun put(specialMessage: String, className: String, functionName: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var specialMessage = specialMessage


                    var className = className


                    var functionName = functionName



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.put(specialMessage, className, functionName, 
                            null)
}


open fun put(specialMessage: String, className: String, functionName: String, exception: Exception)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var specialMessage = specialMessage


                    var className = className


                    var functionName = functionName


                    var exception = exception

        try {
            
    var data: String = LogFormatUtil.getInstance()!!.get(specialMessage, className, functionName, exception)!!

this.showDialog(data)
System.out.println(data)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return data
} catch(e: Exception)
            {PreLogUtil.put(commonStrings!!.EXCEPTION, this, "put", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Logging Error"
}

}


}
                
            



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
        package org.allbinary.graphics.form.item




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Command
import org.allbinary.game.commands.GameCommandsFactory
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.form.ScreenInfo
import org.allbinary.logic.java.bool.BooleanFactory
import org.allbinary.logic.util.visitor.Visitor

open public class LimitCommandsVisitor : Visitor {
        

    private val isNotSmallDisplay: Boolean
public constructor        (){
    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            

isNotSmallDisplay= (displayInfo!!.isPortrait() && displayInfo!!.getLastHeight() > ScreenInfo.getInstance()!!.SMALL_WIDTH) || (!displayInfo!!.isPortrait() && displayInfo!!.getLastHeight() > ScreenInfo.getInstance()!!.SMALL_HEIGHT)
}

override fun visit(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var anyType = anyType

    var command: Command = anyType as Command


    var booleanFactory: BooleanFactory = BooleanFactory.getInstance()!!
            


    
                        if(isNotSmallDisplay || command.getPriority() == 1 || command == GameCommandsFactory.getInstance()!!.EXIT_COMMAND || command == GameCommandsFactory.getInstance()!!.EXIT_WITHOUT_PROGRESS_COMMAND)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return booleanFactory!!.TRUE

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return booleanFactory!!.FALSE

                        }
                            
}


}
                
            


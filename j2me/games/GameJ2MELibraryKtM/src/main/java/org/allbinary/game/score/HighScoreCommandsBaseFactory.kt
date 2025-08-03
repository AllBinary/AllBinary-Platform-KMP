
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
        package org.allbinary.game.score



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Command
import org.allbinary.J2MEUtil
import org.allbinary.logic.communication.log.LogUtil

open public class HighScoreCommandsBaseFactory
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val HIGH_SCORE_COMMANDS: Array<Command?>
protected constructor        (HIGH_SCORE_COMMANDS: Array<Command?>)
            : super()
        {

                    var HIGH_SCORE_COMMANDS = HIGH_SCORE_COMMANDS

    
                        if(J2MEUtil.isJ2ME())
                        
                                    {
                                    this.HIGH_SCORE_COMMANDS= arrayOf(HighScoreCommands.getInstance()!!.PERSONAL)

                                    }
                                
                        else {
                            this.HIGH_SCORE_COMMANDS= HIGH_SCORE_COMMANDS

                        }
                            
}


open fun isHighScoreCommand(command: Command)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var command = command




                        for (index in HIGH_SCORE_COMMANDS.size -1 downTo 0)


        {
    
                        if(command == HIGH_SCORE_COMMANDS[index])
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun getIndex(command: Command)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var command = command




                        for (index in HIGH_SCORE_COMMANDS.size -1 downTo 0)


        {
    
                        if(command == HIGH_SCORE_COMMANDS[index])
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return index

                                    }
                                
}




                            throw Exception(
                            "No Such Command")
}


}
                
            


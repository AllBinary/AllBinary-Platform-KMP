
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener
import org.allbinary.game.layer.AllBinaryGameLayerManager

open public class NullAllBinaryGameCanvas
            : Object
        
                , AllBinaryGameCanvasInterface {
        
companion object {
            
    val NULL_ALLBINARY_GAME_CANVAS: NullAllBinaryGameCanvas = NullAllBinaryGameCanvas()

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    override fun getLayerManager()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryGameLayerManager{



                            throw RuntimeException()
}


    override fun addCommand(cmd: Command)
        //nullable = true from not(false or (false and false)) = true
{
var cmd = cmd



                            throw RuntimeException()
}


    override fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                            throw RuntimeException()
}


    override fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                            throw RuntimeException()
}


    override fun removeCommand(cmd: Command)
        //nullable = true from not(false or (false and false)) = true
{
var cmd = cmd



                            throw RuntimeException()
}


    override fun setCommandListener(l: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{
var l = l



                            throw RuntimeException()
}


}
                
            


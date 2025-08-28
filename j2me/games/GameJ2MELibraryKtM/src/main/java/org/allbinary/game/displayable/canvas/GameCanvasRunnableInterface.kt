
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.ItemStateListener
import org.allbinary.game.state.GameStateCompositeInterface
import org.allbinary.graphics.paint.PaintableInterface
import org.allbinary.thread.RunnableInterface
interface GameCanvasRunnableInterface : RunnableInterface, PaintableInterface, ItemStateListener, GameStateCompositeInterface {
        

open fun getTitle()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun isInitialized()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun isPaused()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun unPause()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

open fun pause()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

open fun isHighScoreSubmitted()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun setHighScoreSubmitted(highScoreSubmitted: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun setGameOver()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

open fun isGameOver()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun initCommands(cmdListener: CommandListener)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun getCurrentStateHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun getLoadStateHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun setLoadStateHashtable(hashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        

}
                
            


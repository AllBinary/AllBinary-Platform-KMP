
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
        package org.allbinary.graphics.j2me.workarea



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.w3c.dom.Document
interface WorkAreaJPanelInterface : event.KeyListener {
        

open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

open fun deselect()
        //nullable = true from not(false or (false and true)) = true


open fun select()
        //nullable = true from not(false or (false and true)) = true


open fun changeZoom(factor: Int)
        //nullable = true from not(false or (false and false)) = true


open fun explodeAll()
        //nullable = true from not(false or (false and true)) = true


                @Throws(Exception::class)
            
open fun autoRotate(increments: Int, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun autoExplode(numberOfFrames: Int, explodeType: Int)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun autoMirror()
        //nullable = true from not(false or (false and true)) = true


open fun play()
        //nullable = true from not(false or (false and true)) = true


open fun stop()
        //nullable = true from not(false or (false and true)) = true


open fun isPlaying()
        //nullable = true from not(false or (false and true)) = true
: Boolean

                @Throws(Exception::class)
            
open fun toDocument()
        //nullable = true from not(false or (false and true)) = true
: Document

}
                
            


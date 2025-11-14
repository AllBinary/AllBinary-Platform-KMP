
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
        package org.allbinary.image.gui




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class ImageJPanel : javax.swing.JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val canvasStrings: CanvasStrings = CanvasStrings.getInstance()!!

    private var isDrawn: Boolean = false

    private var bufferedImage: BufferedImage
public constructor (bufferedImage: BufferedImage){
var bufferedImage = bufferedImage
initComponents()
this.bufferedImage= bufferedImage
this.setSize(this.bufferedImage!!.getWidth(
                            null), this.bufferedImage!!.getHeight(
                            null))
}


    open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    
                        if(!isDrawn)
                        
                                    {
                                    logUtil!!.put(commonStrings!!.START, this, canvasStrings!!.PAINT)
graphics.drawImage(bufferedImage, 0, 0, this.bufferedImage!!.getWidth(
                            null), this.bufferedImage!!.getHeight(
                            null), 
                            null)
isDrawn= true

                                    }
                                
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 400, Short.MAX_VALUE))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 300, Short.MAX_VALUE))
}


}
                
            


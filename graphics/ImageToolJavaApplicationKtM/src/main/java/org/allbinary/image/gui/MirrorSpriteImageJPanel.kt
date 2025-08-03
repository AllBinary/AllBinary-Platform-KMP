
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage
import java.awt.image.RenderedImage
import java.io.File
import javax.imageio.ImageIO
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.image.BufferedImageUtil2
import org.allbinary.media.image.ImageProcessorInput
import org.allbinary.media.image.ImageProcessorInputCompositeInterface
import org.allbinary.media.image.ImageStrings
import org.allbinary.media.image.MirrorImageUtil
import org.allbinary.string.CommonStrings

open public class MirrorSpriteImageJPanel : swing.JPanel
                , ImageProcessorInputCompositeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val imageStrings: ImageStrings = ImageStrings.getInstance()!!
            

    private var imageProcessorInput: ImageProcessorInput

    private var result: BufferedImage
public constructor        (imageProcessorInput: ImageProcessorInput)                        

                            : super(){

                    var imageProcessorInput = imageProcessorInput


                            //For kotlin this is before the body of the constructor.
                    
logUtil!!.put(
                            "Starting", this, this.commonStrings!!.CONSTRUCTOR)
initComponents()
this.imageProcessorInput= imageProcessorInput
}


open fun process()
        //nullable = true from not(false or (false and true)) = true
{Thread().
                            start()
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{jLayeredPane1= JLayeredPane()
jPanel1= object: JPanel()
                                {
                                
open override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    
                        if(this@MirrorSpriteImageJPanel.result != 
                                    null
                                )
                        
                                    {
                                    graphics!!.drawImage(this@MirrorSpriteImageJPanel.result, 0, 0, this@MirrorSpriteImageJPanel.result!!.getWidth(
                            null), this@MirrorSpriteImageJPanel.result!!.getHeight(
                            null), 
                            null)

                                    }
                                
}

                                }
                            
jPanel2= JPanel()
imageHeightIsFrameSizeJCheckBox= JCheckBox()
horizontalJCheckBox= JCheckBox()
verticleJCheckBox= JCheckBox()
writeOverOriginalJCheckBox= JCheckBox()
generateJButton= JButton()
jPanel3= JPanel()
jLabel2= JLabel()

    var jPanel1Layout: GroupLayout = GroupLayout(jPanel1)

jPanel1!!.setLayout(jPanel1Layout)
jPanel1Layout!!.setHorizontalGroup(jPanel1Layout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.LEADING)!!.add(0, 507, Short.MAX_VALUE))
jPanel1Layout!!.setVerticalGroup(jPanel1Layout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.LEADING)!!.add(0, 230, Short.MAX_VALUE))
imageHeightIsFrameSizeJCheckBox!!.setSelected(true)
imageHeightIsFrameSizeJCheckBox!!.setText(
                            "Image Height Is Frame Size")
imageHeightIsFrameSizeJCheckBox!!.setEnabled(false)
imageHeightIsFrameSizeJCheckBox!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
imageHeightIsFrameSizeJCheckBoxActionPerformed(evt)
}

                                }
                            )
horizontalJCheckBox!!.setSelected(true)
horizontalJCheckBox!!.setText(
                            "Horizontal")
horizontalJCheckBox!!.setEnabled(false)
verticleJCheckBox!!.setText(
                            "Verticle")
verticleJCheckBox!!.setEnabled(false)
writeOverOriginalJCheckBox!!.setText(
                            "Write Over Original")
generateJButton!!.setText(
                            "Generate")
generateJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
generateJButtonActionPerformed(evt)
}

                                }
                            )

    var jPanel2Layout: GroupLayout = GroupLayout(jPanel2)

jPanel2!!.setLayout(jPanel2Layout)
jPanel2Layout!!.setHorizontalGroup(jPanel2Layout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.LEADING)!!.add(jPanel2Layout!!.createSequentialGroup()!!.addContainerGap(org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.add(verticleJCheckBox)!!.addPreferredGap(org!!.jdesktop!!.layout!!.LayoutStyle.UNRELATED)!!.add(horizontalJCheckBox)!!.addPreferredGap(org!!.jdesktop!!.layout!!.LayoutStyle.RELATED)!!.add(imageHeightIsFrameSizeJCheckBox)!!.addPreferredGap(org!!.jdesktop!!.layout!!.LayoutStyle.RELATED)!!.add(writeOverOriginalJCheckBox)!!.addPreferredGap(org!!.jdesktop!!.layout!!.LayoutStyle.RELATED)!!.add(generateJButton)))
jPanel2Layout!!.setVerticalGroup(jPanel2Layout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.LEADING)!!.add(jPanel2Layout!!.createSequentialGroup()!!.add(jPanel2Layout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.BASELINE)!!.add(imageHeightIsFrameSizeJCheckBox, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.add(horizontalJCheckBox)!!.add(verticleJCheckBox)!!.add(writeOverOriginalJCheckBox)!!.add(generateJButton, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE, 25, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE))!!.addContainerGap()))
jLabel2!!.setText(
                            "Results:")

    var jPanel3Layout: GroupLayout = GroupLayout(jPanel3)

jPanel3!!.setLayout(jPanel3Layout)
jPanel3Layout!!.setHorizontalGroup(jPanel3Layout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.LEADING)!!.add(jPanel3Layout!!.createSequentialGroup()!!.add(jLabel2)!!.addContainerGap(448, Short.MAX_VALUE)))
jPanel3Layout!!.setVerticalGroup(jPanel3Layout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.LEADING)!!.add(jLabel2))

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout!!.setHorizontalGroup(layout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.LEADING)!!.add(org!!.jdesktop!!.layout!!.GroupLayout.TRAILING, layout!!.createSequentialGroup()!!.addContainerGap()!!.add(jPanel3, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addContainerGap())!!.add(jPanel1, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.add(layout!!.createSequentialGroup()!!.add(jPanel2, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE)!!.addContainerGap(org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
layout!!.setVerticalGroup(layout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.LEADING)!!.add(layout!!.createSequentialGroup()!!.add(jPanel2, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE, 25, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(org!!.jdesktop!!.layout!!.LayoutStyle.RELATED)!!.add(jPanel3, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(org!!.jdesktop!!.layout!!.LayoutStyle.RELATED)!!.add(jPanel1, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
}


open fun generateJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.process()
}


open fun imageHeightIsFrameSizeJCheckBoxActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
}


    private var generateJButton: JButton

    private var horizontalJCheckBox: JCheckBox

    private var imageHeightIsFrameSizeJCheckBox: JCheckBox

    private var jLabel2: JLabel

    private var jLayeredPane1: JLayeredPane

    private var jPanel1: JPanel

    private var jPanel2: JPanel

    private var jPanel3: JPanel

    private var verticleJCheckBox: JCheckBox

    private var writeOverOriginalJCheckBox: JCheckBox

open fun getImageProcessorInput()
        //nullable = true from not(false or (false and true)) = true
: ImageProcessorInput{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageProcessorInput
}


open fun setImageProcessorInput(imageProcessorInput: ImageProcessorInput)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageProcessorInput = imageProcessorInput
this.imageProcessorInput= imageProcessorInput
}


}
                
            



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
        
        import java.lang.Integer
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import java.awt
import java.awt.image.BufferedImage
import java.awt.image.RenderedImage
import java.io.File
import javax.imageio.ImageIO
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.image.ImageJ2SERotationUtil
import org.allbinary.media.image.ImageProcessorInput
import org.allbinary.media.image.ImageProcessorInputCompositeInterface
import org.allbinary.media.image.ImageStrings
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.DefaultComboBoxModel
import javax.swing.JButton
import javax.swing.JCheckBox
import javax.swing.JComboBox
import javax.swing.JLabel
import javax.swing.JPanel

open public class RotationSpriteImageJPanel : JPanel
                , ImageProcessorInputCompositeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val imageStrings: ImageStrings = ImageStrings.getInstance()!!

    private var imageProcessorInput: ImageProcessorInput

    private var result: BufferedImage
public constructor (imageProcessorInput: ImageProcessorInput)                        

                            : super(){
var imageProcessorInput = imageProcessorInput


                            //For kotlin this is before the body of the constructor.
                    
this.initComponents()
this.imageProcessorInput= imageProcessorInput
}


    open fun process()
        //nullable = true from not(false or (false and true)) = true
{
object: Thread()
                                {
                                
                                
    open fun run()
        //nullable = true from not(false or (false and true)) = true
{

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    var generatedBufferedImageArray: Array<BufferedImage?>


    var imageProcessorInput: ImageProcessorInput = this@RotationSpriteImageJPanel.getImageProcessorInput()!!


    var bufferedImageArray: Array<BufferedImage?> = imageProcessorInput!!.getBufferedImageArray()!!





                        for (index in 0 until bufferedImageArray!!.size)

        {

    var totalFrames: Integer = Integer(Integer.valueOf(this@RotationSpriteImageJPanel.totalFramesJComboBox!!.getSelectedItem() as String))!!


    var totalAngle: Integer = Integer(Integer.valueOf(this@RotationSpriteImageJPanel.totalAngleJComboBox!!.getSelectedItem() as String))!!

generatedBufferedImageArray= ImageJ2SERotationUtil.getInstance()!!.getRotatedImages(bufferedImageArray[index]!!, totalFrames, totalAngle)!!
this@RotationSpriteImageJPanel.result= ImageJ2SERotationUtil.getInstance()!!.createSpriteImage(generatedBufferedImageArray)
this@RotationSpriteImageJPanel.getParent()!!.repaint()

    var file: File = imageProcessorInput!!.getFiles()[index]!!


    
                        if(!this@RotationSpriteImageJPanel.writeOverOriginalJCheckBox!!.isSelected())
                        
                                    {
                                    
    var filePath: String = file.getAbsolutePath()!!


    var extensionIndex: Int = filePath!!.indexOf(imageStrings!!.PNG_EXTENSION)

filePath= StringMaker().
                            append(filePath!!.substring(0, extensionIndex))!!.append(CommonSeps.getInstance()!!.UNDERSCORE)!!.append("sprite")!!.append(imageStrings!!.PNG_EXTENSION)!!.toString()!!
logUtil!!.putF("New File Path: " +filePath, this, commonStrings!!.RUN)
file= File(filePath)

                                    }
                                

    var isWritten: Boolean = ImageIO.write(this@RotationSpriteImageJPanel.result as RenderedImage, imageStrings!!.PNG, file)

logUtil!!.putF("File: " +file +" Wrote: " +isWritten, this, commonStrings!!.RUN)
}

} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}

                                }
                            .
                            start()
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.jPanel1= object: JPanel()
                                {
                                
                                
    open override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    
                        if(this@RotationSpriteImageJPanel.result != 
                                    null
                                )
                        
                                    {
                                    graphics.drawImage(this@RotationSpriteImageJPanel.result, 0, 0, this@RotationSpriteImageJPanel.result.getWidth(
                            null), this@RotationSpriteImageJPanel.result.getHeight(
                            null), 
                            null)

                                    }
                                
}

                                }
                            
this.jPanel2= JPanel()
this.totalFramesJComboBox= JComboBox()
this.jLabel1= JLabel()
this.generateJButton= JButton()
this.totalAngleJComboBox= JComboBox()
this.jLabel3= JLabel()
this.writeOverOriginalJCheckBox= JCheckBox()
this.jPanel3= JPanel()
this.jLabel2= JLabel()

    var jPanel1Layout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(this.jPanel1)

this.jPanel1!!.setLayout(jPanel1Layout)
jPanel1Layout!!.setHorizontalGroup(jPanel1Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(0, 436, Short.MAX_VALUE))
jPanel1Layout!!.setVerticalGroup(jPanel1Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(0, 227, Short.MAX_VALUE))
this.totalFramesJComboBox!!.setModel(DefaultComboBoxModel(arrayOf(CommonPhoneStrings.getInstance()!!.FOUR,CommonPhoneStrings.getInstance()!!.NINE,"18","20","36")))
this.jLabel1!!.setText("Total Frames:")
this.generateJButton!!.setText("Generate")
this.generateJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
generateJButtonActionPerformed(evt)
}

                                }
                            )
this.totalAngleJComboBox!!.setModel(DefaultComboBoxModel(arrayOf("360","90")))
this.totalAngleJComboBox!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
totalAngleJComboBoxActionPerformed(evt)
}

                                }
                            )
this.jLabel3!!.setText("Total Angle:")
this.writeOverOriginalJCheckBox!!.setText("Write Over Original")

    var jPanel2Layout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(this.jPanel2)

this.jPanel2!!.setLayout(jPanel2Layout)
jPanel2Layout!!.setHorizontalGroup(jPanel2Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(jPanel2Layout!!.createSequentialGroup()!!.add(8, 8, 8)!!.add(jLabel1)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(totalFramesJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(jLabel3)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(totalAngleJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(writeOverOriginalJCheckBox)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(generateJButton)!!.addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
jPanel2Layout!!.setVerticalGroup(jPanel2Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(jPanel2Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)!!.add(jLabel1)!!.add(totalFramesJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.add(generateJButton)!!.add(totalAngleJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.add(jLabel3)!!.add(writeOverOriginalJCheckBox)))
this.jLabel2!!.setText("Results:")

    var jPanel3Layout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(this.jPanel3)

this.jPanel3!!.setLayout(jPanel3Layout)
jPanel3Layout!!.setHorizontalGroup(jPanel3Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(jPanel3Layout!!.createSequentialGroup()!!.add(jLabel2)!!.addContainerGap(377, Short.MAX_VALUE)))
jPanel3Layout!!.setVerticalGroup(jPanel3Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(jLabel2))

    var layout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.add(layout.createSequentialGroup()!!.addContainerGap()!!.add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addContainerGap())!!.add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(layout.createSequentialGroup()!!.add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)!!.add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
}


    open fun generateJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.process()
}


    open fun totalAngleJComboBoxActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    private var generateJButton: JButton

    private var jLabel1: JLabel

    private var jLabel2: JLabel

    private var jLabel3: JLabel

    private var jPanel1: JPanel

    private var jPanel2: JPanel

    private var jPanel3: JPanel

    private var totalAngleJComboBox: JComboBox

    private var totalFramesJComboBox: JComboBox

    private var writeOverOriginalJCheckBox: JCheckBox

    open fun getImageProcessorInput()
        //nullable = true from not(false or (false and true)) = true
: ImageProcessorInput{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.imageProcessorInput
}


    open fun setImageProcessorInput(imageProcessorInput: ImageProcessorInput)
        //nullable = true from not(false or (false and false)) = true
{
var imageProcessorInput = imageProcessorInput
this.imageProcessorInput= imageProcessorInput
}


}
                
            


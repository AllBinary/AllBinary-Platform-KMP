
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
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import java.awt
import java.awt.image.BufferedImage
import java.awt.image.RenderedImage
import java.io.File
import javax.imageio.ImageIO
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.image.ImageProcessorInput
import org.allbinary.media.image.ImageProcessorInputCompositeInterface
import org.allbinary.media.image.ImageStrings
import org.allbinary.media.image.MirrorImageUtil
import org.allbinary.string.CommonStrings
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.ButtonGroup
import javax.swing.JButton
import javax.swing.JCheckBox
import javax.swing.JLabel
import javax.swing.JLayeredPane
import javax.swing.JPanel
import javax.swing.JRadioButton

open public class MirrorImageJPanel : JPanel
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
                    
this.logUtil!!.putF("Starting", this, this.commonStrings!!.CONSTRUCTOR)
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
            
    var imageProcessorInput: ImageProcessorInput = this@MirrorImageJPanel.getImageProcessorInput()!!


    var bufferedImageArray: Array<BufferedImage?> = imageProcessorInput!!.getBufferedImageArray()!!





                        for (index in 0 until bufferedImageArray!!.size)

        {
this@MirrorImageJPanel.result= MirrorImageUtil.getInstance()!!.getImage(bufferedImageArray[index]!!, this@MirrorImageJPanel.verticleJCheckBox!!.isSelected(), this@MirrorImageJPanel.horizontalJCheckBox!!.isSelected())

    var file: File = imageProcessorInput!!.getFiles()[index]!!


    
                        if(this@MirrorImageJPanel.writeOverOriginalJRadioButton!!.isSelected())
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(this@MirrorImageJPanel.renameJRadioButton!!.isSelected())
                        
                                    {
                                    
    var filePath: String = file.getAbsolutePath()!!


    var extensionIndex: Int = filePath!!.indexOf(imageStrings!!.PNG_EXTENSION)

filePath= filePath!!.substring(0, extensionIndex) +"_mirror" +imageStrings!!.PNG_EXTENSION
logUtil!!.putF("Renamed File: " +filePath, this, commonStrings!!.RUN)
file= File(filePath)

                                    }
                                

    var isWritten: Boolean = ImageIO.write(this@MirrorImageJPanel.result as RenderedImage, imageStrings!!.PNG, file)

logUtil!!.putF("File: " +file +" Wrote: " +isWritten, this, commonStrings!!.RUN)
this@MirrorImageJPanel.getParent()!!.repaint()
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
jLayeredPane1= JLayeredPane()
this.buttonGroup= ButtonGroup()
this.jPanel1= object: JPanel()
                                {
                                
                                
    open override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    
                        if(this@MirrorImageJPanel.result != 
                                    null
                                )
                        
                                    {
                                    graphics.drawImage(this@MirrorImageJPanel.result, 0, 0, this@MirrorImageJPanel.result.getWidth(
                            null), this@MirrorImageJPanel.result.getHeight(
                            null), 
                            null)

                                    }
                                
}

                                }
                            
this.jPanel2= JPanel()
this.horizontalJCheckBox= JCheckBox()
this.verticleJCheckBox= JCheckBox()
this.generateJButton= JButton()
this.renameJRadioButton= JRadioButton()
this.writeOverOriginalJRadioButton= JRadioButton()
this.jPanel3= JPanel()
this.jLabel2= JLabel()

    var jPanel1Layout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(this.jPanel1)

this.jPanel1!!.setLayout(jPanel1Layout)
jPanel1Layout!!.setHorizontalGroup(jPanel1Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(0, 522, Short.MAX_VALUE))
jPanel1Layout!!.setVerticalGroup(jPanel1Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(0, 230, Short.MAX_VALUE))
this.horizontalJCheckBox!!.setSelected(true)
this.horizontalJCheckBox!!.setText("Horizontal")
this.horizontalJCheckBox!!.setEnabled(false)
this.verticleJCheckBox!!.setText("Verticle")
this.verticleJCheckBox!!.setEnabled(false)
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
this.renameJRadioButton!!.setText("Save As filename_mirror")
this.renameJRadioButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
renameJRadioButtonActionPerformed(evt)
}

                                }
                            )
this.writeOverOriginalJRadioButton!!.setText("Write Over Original")

    var jPanel2Layout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(this.jPanel2)

this.jPanel2!!.setLayout(jPanel2Layout)
jPanel2Layout!!.setHorizontalGroup(jPanel2Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(jPanel2Layout!!.createSequentialGroup()!!.addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.add(verticleJCheckBox)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)!!.add(horizontalJCheckBox)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(writeOverOriginalJRadioButton)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)!!.add(renameJRadioButton)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(generateJButton)!!.add(37, 37, 37)))
jPanel2Layout!!.setVerticalGroup(jPanel2Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(jPanel2Layout!!.createSequentialGroup()!!.add(jPanel2Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)!!.add(horizontalJCheckBox)!!.add(verticleJCheckBox)!!.add(writeOverOriginalJRadioButton)!!.add(renameJRadioButton)!!.add(generateJButton))!!.addContainerGap()))
this.jLabel2!!.setText("Results:")

    var jPanel3Layout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(this.jPanel3)

this.jPanel3!!.setLayout(jPanel3Layout)
jPanel3Layout!!.setHorizontalGroup(jPanel3Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(jPanel3Layout!!.createSequentialGroup()!!.add(jLabel2)!!.addContainerGap(433, Short.MAX_VALUE)))
jPanel3Layout!!.setVerticalGroup(jPanel3Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(jLabel2))

    var layout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()!!.addContainerGap()!!.add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addContainerGap())!!.add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.add(layout.createSequentialGroup()!!.add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(layout.createSequentialGroup()!!.add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
}


    open fun generateJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.process()
}


    open fun renameJRadioButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    private var buttonGroup: ButtonGroup

    private var generateJButton: JButton

    private var horizontalJCheckBox: JCheckBox

    private var jLabel2: JLabel

    private var jLayeredPane1: JLayeredPane

    private var jPanel1: JPanel

    private var jPanel2: JPanel

    private var jPanel3: JPanel

    private var renameJRadioButton: JRadioButton

    private var verticleJCheckBox: JCheckBox

    private var writeOverOriginalJRadioButton: JRadioButton

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
                
            



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
import java.io.IOException
import javax.imageio.ImageIO
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.image.ImageArrayRotationUtil
import org.allbinary.media.image.ImageProcessedVisitor
import org.allbinary.media.image.ImageProcessorInput
import org.allbinary.media.image.ImageStrings
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class RotationImageJPanel : javax.swing.JPanel
                , ImageProcessedVisitor {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val imageStrings: ImageStrings = ImageStrings.getInstance()!!

    private var imageProcessorInput: ImageProcessorInput

    private var result: BufferedImage
public constructor (imageProcessorInput: ImageProcessorInput)                        

                            : super(){
var imageProcessorInput = imageProcessorInput


                            //For kotlin this is before the body of the constructor.
                    
initComponents()
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

        try {
            
    var angleAsString: String = this@RotationImageJPanel.totalAngleJComboBox!!.getSelectedItem() as String

ImageArrayRotationUtil.getInstance()!!.process(this@RotationImageJPanel.getImageProcessorInput(), angleAsString, this@RotationImageJPanel)
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
jPanel1= object: javax.swing.JPanel()
                                {
                                
    open override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    
                        if(this@RotationImageJPanel.result != 
                                    null
                                )
                        
                                    {
                                    graphics.drawImage(this@RotationImageJPanel.result, 0, 0, this@RotationImageJPanel.result.getWidth(
                            null), this@RotationImageJPanel.result.getHeight(
                            null), 
                            null)

                                    }
                                
}

                                }
                            
jPanel2= javax.swing.JPanel()
jLabel1= javax.swing.JLabel()
generateJButton= javax.swing.JButton()
totalAngleJComboBox= javax.swing.JComboBox()
jLabel3= javax.swing.JLabel()
writeOverOriginalJCheckBox= javax.swing.JCheckBox()
jPanel3= javax.swing.JPanel()
jLabel2= javax.swing.JLabel()

    var jPanel1Layout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(jPanel1)

jPanel1!!.setLayout(jPanel1Layout)
jPanel1Layout!!.setHorizontalGroup(jPanel1Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(0, 436, Short.MAX_VALUE))
jPanel1Layout!!.setVerticalGroup(jPanel1Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(0, 227, Short.MAX_VALUE))
generateJButton!!.setText("Generate")
generateJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
generateJButtonActionPerformed(evt)
}

                                }
                            )
totalAngleJComboBox!!.setModel(javax.swing.DefaultComboBoxModel(arrayOf(commonStrings!!.UP,commonStrings!!.DOWN,"-90","90")))
totalAngleJComboBox!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
totalAngleJComboBoxActionPerformed(evt)
}

                                }
                            )
jLabel3!!.setText("Total Angle:")
writeOverOriginalJCheckBox!!.setText("Write Over Original")

    var jPanel2Layout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(jPanel2)

jPanel2!!.setLayout(jPanel2Layout)
jPanel2Layout!!.setHorizontalGroup(jPanel2Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(jPanel2Layout!!.createSequentialGroup()!!.add(8, 8, 8)!!.add(jLabel1)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(jLabel3)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(totalAngleJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(writeOverOriginalJCheckBox)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(generateJButton)!!.addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
jPanel2Layout!!.setVerticalGroup(jPanel2Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(jPanel2Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)!!.add(jLabel1)!!.add(generateJButton)!!.add(totalAngleJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.add(jLabel3)!!.add(writeOverOriginalJCheckBox)))
jLabel2!!.setText("Results:")

    var jPanel3Layout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(jPanel3)

jPanel3!!.setLayout(jPanel3Layout)
jPanel3Layout!!.setHorizontalGroup(jPanel3Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(jPanel3Layout!!.createSequentialGroup()!!.add(jLabel2)!!.addContainerGap(377, Short.MAX_VALUE)))
jPanel3Layout!!.setVerticalGroup(jPanel3Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(jLabel2))

    var layout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.add(layout.createSequentialGroup()!!.addContainerGap()!!.add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addContainerGap())!!.add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(layout.createSequentialGroup()!!.add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)!!.add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
}


    open fun generateJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.process()
}


    open fun totalAngleJComboBoxActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    private var generateJButton: javax.swing.JButton

    private var jLabel1: javax.swing.JLabel

    private var jLabel2: javax.swing.JLabel

    private var jLabel3: javax.swing.JLabel

    private var jPanel1: javax.swing.JPanel

    private var jPanel2: javax.swing.JPanel

    private var jPanel3: javax.swing.JPanel

    private var totalAngleJComboBox: javax.swing.JComboBox

    private var writeOverOriginalJCheckBox: javax.swing.JCheckBox

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


                @Throws(IOException::class)
            
    open fun visit(generatedBufferedImage: BufferedImage, name: String, index: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var generatedBufferedImage = generatedBufferedImage
    //var name = name
    //var index = index
this.result= generatedBufferedImage
this.getParent()!!.repaint()

    var file: File = imageProcessorInput!!.getFiles()[index]!!


    
                        if(!this.writeOverOriginalJCheckBox!!.isSelected())
                        
                                    {
                                    
    var filePath: String = file.getAbsolutePath()!!


    var extensionIndex: Int = filePath!!.indexOf(imageStrings!!.PNG_EXTENSION)!!

filePath= StringBuilder().
                            append(filePath!!.substring(0, extensionIndex))!!.append(CommonSeps.getInstance()!!.UNDERSCORE)!!.append(name)!!.append(imageStrings!!.PNG_EXTENSION)!!.toString()
file= File(filePath)

                                    }
                                

    var isWritten: Boolean = ImageIO.write(this@RotationImageJPanel.result as RenderedImage, imageStrings!!.PNG, file)!!

logUtil!!.put("File: " +file +" Wrote: " +isWritten, this, commonStrings!!.RUN)
}


}
                
            


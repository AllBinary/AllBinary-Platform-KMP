
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

open public class MirrorImageJPanel : javax.swing.JPanel
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
                    
logUtil!!.put("Starting", this, this.commonStrings!!.CONSTRUCTOR)
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


    var extensionIndex: Int = filePath!!.indexOf(imageStrings!!.PNG_EXTENSION)!!

filePath= filePath!!.substring(0, extensionIndex) +"_mirror" +imageStrings!!.PNG_EXTENSION
logUtil!!.put("Renamed File: " +filePath, this, commonStrings!!.RUN)
file= File(filePath)

                                    }
                                

    var isWritten: Boolean = ImageIO.write(this@MirrorImageJPanel.result as RenderedImage, imageStrings!!.PNG, file)!!

logUtil!!.put("File: " +file +" Wrote: " +isWritten, this, commonStrings!!.RUN)
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
jLayeredPane1= javax.swing.JLayeredPane()
buttonGroup= javax.swing.ButtonGroup()
jPanel1= object: javax.swing.JPanel()
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
                            
jPanel2= javax.swing.JPanel()
horizontalJCheckBox= javax.swing.JCheckBox()
verticleJCheckBox= javax.swing.JCheckBox()
generateJButton= javax.swing.JButton()
renameJRadioButton= javax.swing.JRadioButton()
writeOverOriginalJRadioButton= javax.swing.JRadioButton()
jPanel3= javax.swing.JPanel()
jLabel2= javax.swing.JLabel()

    var jPanel1Layout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(jPanel1)

jPanel1!!.setLayout(jPanel1Layout)
jPanel1Layout!!.setHorizontalGroup(jPanel1Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(0, 522, Short.MAX_VALUE))
jPanel1Layout!!.setVerticalGroup(jPanel1Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(0, 230, Short.MAX_VALUE))
horizontalJCheckBox!!.setSelected(true)
horizontalJCheckBox!!.setText("Horizontal")
horizontalJCheckBox!!.setEnabled(false)
verticleJCheckBox!!.setText("Verticle")
verticleJCheckBox!!.setEnabled(false)
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
renameJRadioButton!!.setText("Save As filename_mirror")
renameJRadioButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
renameJRadioButtonActionPerformed(evt)
}

                                }
                            )
writeOverOriginalJRadioButton!!.setText("Write Over Original")

    var jPanel2Layout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(jPanel2)

jPanel2!!.setLayout(jPanel2Layout)
jPanel2Layout!!.setHorizontalGroup(jPanel2Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(jPanel2Layout!!.createSequentialGroup()!!.addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.add(verticleJCheckBox)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)!!.add(horizontalJCheckBox)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(writeOverOriginalJRadioButton)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)!!.add(renameJRadioButton)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(generateJButton)!!.add(37, 37, 37)))
jPanel2Layout!!.setVerticalGroup(jPanel2Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(jPanel2Layout!!.createSequentialGroup()!!.add(jPanel2Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)!!.add(horizontalJCheckBox)!!.add(verticleJCheckBox)!!.add(writeOverOriginalJRadioButton)!!.add(renameJRadioButton)!!.add(generateJButton))!!.addContainerGap()))
jLabel2!!.setText("Results:")

    var jPanel3Layout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(jPanel3)

jPanel3!!.setLayout(jPanel3Layout)
jPanel3Layout!!.setHorizontalGroup(jPanel3Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(jPanel3Layout!!.createSequentialGroup()!!.add(jLabel2)!!.addContainerGap(433, Short.MAX_VALUE)))
jPanel3Layout!!.setVerticalGroup(jPanel3Layout!!.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(jLabel2))

    var layout: org.jdesktop.layout.GroupLayout = org.jdesktop.layout.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()!!.addContainerGap()!!.add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addContainerGap())!!.add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.add(layout.createSequentialGroup()!!.add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)!!.add(layout.createSequentialGroup()!!.add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)!!.add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
}


    open fun generateJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.process()
}


    open fun renameJRadioButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    private var buttonGroup: javax.swing.ButtonGroup

    private var generateJButton: javax.swing.JButton

    private var horizontalJCheckBox: javax.swing.JCheckBox

    private var jLabel2: javax.swing.JLabel

    private var jLayeredPane1: javax.swing.JLayeredPane

    private var jPanel1: javax.swing.JPanel

    private var jPanel2: javax.swing.JPanel

    private var jPanel3: javax.swing.JPanel

    private var renameJRadioButton: javax.swing.JRadioButton

    private var verticleJCheckBox: javax.swing.JCheckBox

    private var writeOverOriginalJRadioButton: javax.swing.JRadioButton

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
                
            


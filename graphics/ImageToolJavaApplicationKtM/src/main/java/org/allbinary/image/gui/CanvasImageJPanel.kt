
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
import java.io.IOException
import javax.imageio.ImageIO
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.media.image.CanvasExpandUtil
import org.allbinary.media.image.CanvasTrimUtil
import org.allbinary.media.image.ImageProcessedVisitor
import org.allbinary.media.image.ImageProcessorInput
import org.allbinary.media.image.ImageStrings
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.GroupLayout
import javax.swing.JButton
import javax.swing.JCheckBox
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField
import javax.swing.LayoutStyle

open public class CanvasImageJPanel : JPanel
                , ImageProcessedVisitor {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val commonSeps: CommonSeps = CommonSeps.getInstance()!!

    private val imageStrings: ImageStrings = ImageStrings.getInstance()!!

    private var imageProcessorInput: ImageProcessorInput

    private var result: BufferedImage
public constructor (imageProcessorInput: ImageProcessorInput)                        

                            : super(){
    //var imageProcessorInput = imageProcessorInput


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

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    var canvasTrimUtil: CanvasTrimUtil = CanvasTrimUtil.getInstance()!!


    var canvasExpandUtil: CanvasExpandUtil = CanvasExpandUtil.getInstance()!!


    var leftReduction: Int = Integer(Integer.valueOf(widthReductionTextField1!!.getText()))


    var topReduction: Int = Integer(Integer.valueOf(heightReductionTextField1!!.getText()))


    var widthReduction: Int = Integer(Integer.valueOf(widthReductionTextField!!.getText()))


    var heightReduction: Int = Integer(Integer.valueOf(heightReductionTextField!!.getText()))


    
                        if(leftReduction <= 0 || topReduction <= 0 || widthReduction <= 0 || heightReduction <= 0)
                        
                                    {
                                    canvasTrimUtil!!.process(this@CanvasImageJPanel.getImageProcessorInput(),  -leftReduction,  -topReduction,  -widthReduction,  -heightReduction, this@CanvasImageJPanel)

                                    }
                                
                        else {
                            canvasExpandUtil!!.process(this@CanvasImageJPanel.getImageProcessorInput(), leftReduction, topReduction, this@CanvasImageJPanel)

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
this.writeOverOriginalJCheckBox= JCheckBox()
this.jPanel1= object: JPanel()
                                {
                                
                                
    open override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    
                        if(this@CanvasImageJPanel.result != 
                                    null
                                )
                        
                                    {
                                    graphics.drawImage(this@CanvasImageJPanel.result, 0, 0, this@CanvasImageJPanel.result.getWidth(
                            null), this@CanvasImageJPanel.result.getHeight(
                            null), 
                            null)

                                    }
                                
}

                                }
                            
this.generateJButton= JButton()
this.jLabel4= JLabel()
this.jPanel2= JPanel()
this.jLabel5= JLabel()
this.widthReductionTextField= JTextField()
this.jLabel6= JLabel()
this.heightReductionTextField= JTextField()
this.widthReductionTextField1= JTextField()
this.jLabel7= JLabel()
this.jLabel8= JLabel()
this.heightReductionTextField1= JTextField()
this.writeOverOriginalJCheckBox!!.setSelected(true)
this.writeOverOriginalJCheckBox!!.setText("Write Over Original")
this.writeOverOriginalJCheckBox!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
writeOverOriginalJCheckBoxActionPerformed(evt)
}

                                }
                            )

    var jPanel1Layout: GroupLayout = GroupLayout(this.jPanel1)

this.jPanel1!!.setLayout(jPanel1Layout)
jPanel1Layout!!.setHorizontalGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 0, Short.MAX_VALUE))
jPanel1Layout!!.setVerticalGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGap(0, 196, Short.MAX_VALUE))
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
this.jLabel4!!.setText("Results:")
this.jLabel5!!.setText("Right:")
this.widthReductionTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
this.widthReductionTextField!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
widthReductionTextFieldActionPerformed(evt)
}

                                }
                            )
this.jLabel6!!.setText("Bottom")
this.heightReductionTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
this.widthReductionTextField1!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
this.widthReductionTextField1!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
widthReductionTextField1ActionPerformed(evt)
}

                                }
                            )
this.jLabel7!!.setText("Top")
this.jLabel8!!.setText("Left:")
this.heightReductionTextField1!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)

    var jPanel2Layout: GroupLayout = GroupLayout(this.jPanel2)

this.jPanel2!!.setLayout(jPanel2Layout)
jPanel2Layout!!.setHorizontalGroup(jPanel2Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(jPanel2Layout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(jLabel8)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(widthReductionTextField1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel5)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(widthReductionTextField, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel7)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(heightReductionTextField1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel6)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(heightReductionTextField, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)!!.addContainerGap(140, Short.MAX_VALUE)))
jPanel2Layout!!.setVerticalGroup(jPanel2Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout!!.createSequentialGroup()!!.addGap(0, 16, Short.MAX_VALUE)!!.addGroup(jPanel2Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(jPanel2Layout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel6)!!.addComponent(heightReductionTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addGroup(jPanel2Layout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel8)!!.addComponent(widthReductionTextField1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel7)!!.addComponent(heightReductionTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addGroup(jPanel2Layout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel5)!!.addComponent(widthReductionTextField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))))

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addGap(78, 78, 78))!!.addGroup(layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))!!.addGroup(layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(jLabel4)!!.addGroup(layout.createSequentialGroup()!!.addComponent(writeOverOriginalJCheckBox)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(generateJButton)))!!.addGap(0, 0, Short.MAX_VALUE)))!!.addContainerGap()))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(generateJButton)!!.addComponent(writeOverOriginalJCheckBox))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel4)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
}


    open fun writeOverOriginalJCheckBoxActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun generateJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.process()
}


    open fun widthReductionTextFieldActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun widthReductionTextField1ActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    private var generateJButton: JButton

    private var heightReductionTextField: JTextField

    private var heightReductionTextField1: JTextField

    private var jLabel4: JLabel

    private var jLabel5: JLabel

    private var jLabel6: JLabel

    private var jLabel7: JLabel

    private var jLabel8: JLabel

    private var jPanel1: JPanel

    private var jPanel2: JPanel

    private var widthReductionTextField: JTextField

    private var widthReductionTextField1: JTextField

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


                @Throws(IOException::class)
            
    override fun visit(generatedBufferedImage: BufferedImage, name: String, index: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var generatedBufferedImage = generatedBufferedImage
    //var name = name
    //var index = index
this.logUtil!!.putF(this.commonStrings!!.VISIT, this, this.commonStrings!!.VISIT)
this.result= generatedBufferedImage
this.getParent()!!.repaint()

    var file: File = this.imageProcessorInput!!.getFiles()[index]!!


    
                        if(!this.writeOverOriginalJCheckBox!!.isSelected())
                        
                                    {
                                    
    var filePath: String = file.getAbsolutePath()!!


    var extensionIndex: Int = filePath!!.indexOf(this.imageStrings!!.PNG_EXTENSION)

filePath= StringMaker().
                            append(filePath!!.substring(0, extensionIndex))!!.append(this.commonSeps!!.UNDERSCORE)!!.append(name)!!.append(this.imageStrings!!.PNG_EXTENSION)!!.toString()!!
file= File(filePath)

                                    }
                                

    var isWritten: Boolean = ImageIO.write(this@CanvasImageJPanel.result as RenderedImage, imageStrings!!.PNG, file)

this.logUtil!!.putF(StringMaker().
                            append("File: ")!!.append(StringUtil.getInstance()!!.toString(file))!!.append(" Wrote: ")!!.appendboolean(isWritten)!!.toString(), this, this.commonStrings!!.RUN)
}


}
                
            


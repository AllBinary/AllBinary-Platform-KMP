
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

open public class CanvasImageJPanel : javax.swing.JPanel
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

        try {
            
    var canvasTrimUtil: CanvasTrimUtil = CanvasTrimUtil.getInstance()!!


    var canvasExpandUtil: CanvasExpandUtil = CanvasExpandUtil.getInstance()!!


    var leftReduction: Int = Integer(Integer.valueOf(widthReductionTextField1!!.getText()))!!


    var topReduction: Int = Integer(Integer.valueOf(heightReductionTextField1!!.getText()))!!


    var widthReduction: Int = Integer(Integer.valueOf(widthReductionTextField!!.getText()))!!


    var heightReduction: Int = Integer(Integer.valueOf(heightReductionTextField!!.getText()))!!


    
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
writeOverOriginalJCheckBox= javax.swing.JCheckBox()
jPanel1= object: javax.swing.JPanel()
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
                            
generateJButton= javax.swing.JButton()
jLabel4= javax.swing.JLabel()
jPanel2= javax.swing.JPanel()
jLabel5= javax.swing.JLabel()
widthReductionTextField= javax.swing.JTextField()
jLabel6= javax.swing.JLabel()
heightReductionTextField= javax.swing.JTextField()
widthReductionTextField1= javax.swing.JTextField()
jLabel7= javax.swing.JLabel()
jLabel8= javax.swing.JLabel()
heightReductionTextField1= javax.swing.JTextField()
writeOverOriginalJCheckBox!!.setSelected(true)
writeOverOriginalJCheckBox!!.setText("Write Over Original")
writeOverOriginalJCheckBox!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
writeOverOriginalJCheckBoxActionPerformed(evt)
}

                                }
                            )

    var jPanel1Layout: javax.swing.GroupLayout = javax.swing.GroupLayout(jPanel1)

jPanel1!!.setLayout(jPanel1Layout)
jPanel1Layout!!.setHorizontalGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 0, Short.MAX_VALUE))
jPanel1Layout!!.setVerticalGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGap(0, 196, Short.MAX_VALUE))
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
jLabel4!!.setText("Results:")
jLabel5!!.setText("Right:")
widthReductionTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
widthReductionTextField!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
widthReductionTextFieldActionPerformed(evt)
}

                                }
                            )
jLabel6!!.setText("Bottom")
heightReductionTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
widthReductionTextField1!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
widthReductionTextField1!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
widthReductionTextField1ActionPerformed(evt)
}

                                }
                            )
jLabel7!!.setText("Top")
jLabel8!!.setText("Left:")
heightReductionTextField1!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)

    var jPanel2Layout: javax.swing.GroupLayout = javax.swing.GroupLayout(jPanel2)

jPanel2!!.setLayout(jPanel2Layout)
jPanel2Layout!!.setHorizontalGroup(jPanel2Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(jPanel2Layout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(jLabel8)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(widthReductionTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel5)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(widthReductionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel7)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(heightReductionTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel6)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(heightReductionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addContainerGap(140, Short.MAX_VALUE)))
jPanel2Layout!!.setVerticalGroup(jPanel2Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout!!.createSequentialGroup()!!.addGap(0, 16, Short.MAX_VALUE)!!.addGroup(jPanel2Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(jPanel2Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel6)!!.addComponent(heightReductionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addGroup(jPanel2Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel8)!!.addComponent(widthReductionTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel7)!!.addComponent(heightReductionTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addGroup(jPanel2Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel5)!!.addComponent(widthReductionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addGap(78, 78, 78))!!.addGroup(layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))!!.addGroup(layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(jLabel4)!!.addGroup(layout.createSequentialGroup()!!.addComponent(writeOverOriginalJCheckBox)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(generateJButton)))!!.addGap(0, 0, Short.MAX_VALUE)))!!.addContainerGap()))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(generateJButton)!!.addComponent(writeOverOriginalJCheckBox))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel4)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
}


    open fun writeOverOriginalJCheckBoxActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun generateJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.process()
}


    open fun widthReductionTextFieldActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun widthReductionTextField1ActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    private var generateJButton: javax.swing.JButton

    private var heightReductionTextField: javax.swing.JTextField

    private var heightReductionTextField1: javax.swing.JTextField

    private var jLabel4: javax.swing.JLabel

    private var jLabel5: javax.swing.JLabel

    private var jLabel6: javax.swing.JLabel

    private var jLabel7: javax.swing.JLabel

    private var jLabel8: javax.swing.JLabel

    private var jPanel1: javax.swing.JPanel

    private var jPanel2: javax.swing.JPanel

    private var widthReductionTextField: javax.swing.JTextField

    private var widthReductionTextField1: javax.swing.JTextField

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
            
    override fun visit(generatedBufferedImage: BufferedImage, name: String, index: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var generatedBufferedImage = generatedBufferedImage
    //var name = name
    //var index = index
logUtil!!.put(commonStrings!!.VISIT, this, commonStrings!!.VISIT)
this.result= generatedBufferedImage
this.getParent()!!.repaint()

    var file: File = imageProcessorInput!!.getFiles()[index]!!


    
                        if(!this.writeOverOriginalJCheckBox!!.isSelected())
                        
                                    {
                                    
    var filePath: String = file.getAbsolutePath()!!


    var extensionIndex: Int = filePath!!.indexOf(imageStrings!!.PNG_EXTENSION)!!

filePath= StringBuilder().
                            append(filePath!!.substring(0, extensionIndex))!!.append(commonSeps!!.UNDERSCORE)!!.append(name)!!.append(imageStrings!!.PNG_EXTENSION)!!.toString()
file= File(filePath)

                                    }
                                

    var isWritten: Boolean = ImageIO.write(this@CanvasImageJPanel.result as RenderedImage, imageStrings!!.PNG, file)!!

logUtil!!.put(StringMaker().
                            append("File: ")!!.append(StringUtil.getInstance()!!.toString(file))!!.append(" Wrote: ")!!.append(isWritten)!!.toString(), this, commonStrings!!.RUN)
}


}
                
            


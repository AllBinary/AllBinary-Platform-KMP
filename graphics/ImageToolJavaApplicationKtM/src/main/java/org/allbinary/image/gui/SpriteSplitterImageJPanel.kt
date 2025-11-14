
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
import org.allbinary.media.image.ImageProcessedVisitor
import org.allbinary.media.image.ImageProcessorInput
import org.allbinary.media.image.ImageStrings
import org.allbinary.media.image.SpriteSplitterUtil
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class SpriteSplitterImageJPanel : javax.swing.JPanel
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
            
    var spriteSplitterUtil: SpriteSplitterUtil = SpriteSplitterUtil.getInstance()!!


    var spriteType: String = spriteTypeJComboBox!!.getSelectedItem() as String


    var totalFrames: Integer = Integer(Integer.valueOf(totalFramesJComboBox!!.getSelectedItem() as String))!!


    var totalAnimations: Integer = Integer(Integer.valueOf(totalAnimationsJComboBox!!.getSelectedItem() as String))!!


    var widthReduction: Int = Integer(Integer.valueOf(widthReductionTextField!!.getText()))!!


    var heightReduction: Int = Integer(Integer.valueOf(heightReductionTextField!!.getText()))!!


    var increaseWidth: Int = Integer(Integer.valueOf(increaseWidthTextField!!.getText()))!!


    var increaseHeight: Int = Integer(Integer.valueOf(increaseHeightTextField!!.getText()))!!

spriteSplitterUtil!!.process(this@SpriteSplitterImageJPanel.getImageProcessorInput(), totalFrames, totalAnimations, widthReduction, heightReduction, increaseWidth, increaseHeight, spriteType, this@SpriteSplitterImageJPanel)
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
widthReductionTextField= javax.swing.JTextField()
jLabel5= javax.swing.JLabel()
jPanel1= object: javax.swing.JPanel()
                                {
                                
    open override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    
                        if(this@SpriteSplitterImageJPanel.result != 
                                    null
                                )
                        
                                    {
                                    graphics.drawImage(this@SpriteSplitterImageJPanel.result, 0, 0, this@SpriteSplitterImageJPanel.result.getWidth(
                            null), this@SpriteSplitterImageJPanel.result.getHeight(
                            null), 
                            null)

                                    }
                                
}

                                }
                            
jLabel4= javax.swing.JLabel()
jLabel6= javax.swing.JLabel()
heightReductionTextField= javax.swing.JTextField()
generateJButton= javax.swing.JButton()
jPanel2= javax.swing.JPanel()
jLabel1= javax.swing.JLabel()
totalFramesJComboBox= javax.swing.JComboBox<>()

    var size: Int = 70


    var animationStringArray2: Array<String?> = arrayOfNulls(size -1)





                        for (index in 1 until size)

        {
animationStringArray2[index -1]= index.toString()
}

totalFramesJComboBox!!.setModel(javax.swing.DefaultComboBoxModel(animationStringArray2))
jLabel2= javax.swing.JLabel()
totalAnimationsJComboBox= javax.swing.JComboBox<>()

    var animationStringArray: Array<String?> = arrayOfNulls(size -1)





                        for (index in 1 until size)

        {
animationStringArray[index -1]= index.toString()
}

totalAnimationsJComboBox!!.setModel(javax.swing.DefaultComboBoxModel(animationStringArray))
jLabel3= javax.swing.JLabel()
spriteTypeJComboBox= javax.swing.JComboBox<>()
spriteTypeJComboBox!!.setModel(javax.swing.DefaultComboBoxModel(arrayOf(org.allbinary.media.image.SpriteSplitterUtil.getInstance()!!.DIRECTIONAL_ANIMATIONS,org.allbinary.media.image.SpriteSplitterUtil.getInstance()!!.HORIZONTAL_ANIMATIONS,org.allbinary.media.image.SpriteSplitterUtil.getInstance()!!.HORIZONTAL_SPRITE)))
jLabel7= javax.swing.JLabel()
increaseWidthTextField= javax.swing.JTextField()
jLabel8= javax.swing.JLabel()
increaseHeightTextField= javax.swing.JTextField()
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
jLabel5!!.setText("Less Width:")
jLabel4!!.setText("Results:")

    var jPanel1Layout: javax.swing.GroupLayout = javax.swing.GroupLayout(jPanel1)

jPanel1!!.setLayout(jPanel1Layout)
jPanel1Layout!!.setHorizontalGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addComponent(jLabel4)!!.addGap(0, 0, Short.MAX_VALUE)))
jPanel1Layout!!.setVerticalGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addComponent(jLabel4)!!.addGap(0, 184, Short.MAX_VALUE)))
jLabel6!!.setText("Less Height:")
heightReductionTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
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
jLabel1!!.setText("Row Total:")
totalFramesJComboBox!!.setSelectedIndex(1)
totalFramesJComboBox!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
totalFramesJComboBoxActionPerformed(evt)
}

                                }
                            )
jLabel2!!.setText("Column Total :")
totalAnimationsJComboBox!!.setSelectedIndex(3)
totalAnimationsJComboBox!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
totalAnimationsJComboBoxActionPerformed(evt)
}

                                }
                            )
jLabel3!!.setText("Type:")
spriteTypeJComboBox!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
spriteTypeJComboBoxActionPerformed(evt)
}

                                }
                            )

    var jPanel2Layout: javax.swing.GroupLayout = javax.swing.GroupLayout(jPanel2)

jPanel2!!.setLayout(jPanel2Layout)
jPanel2Layout!!.setHorizontalGroup(jPanel2Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(jLabel1)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(totalFramesJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel2)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(totalAnimationsJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel3)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(spriteTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
jPanel2Layout!!.setVerticalGroup(jPanel2Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(jPanel2Layout!!.createSequentialGroup()!!.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addGroup(jPanel2Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(totalFramesJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel2)!!.addComponent(totalAnimationsJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel3)!!.addComponent(spriteTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
jLabel7!!.setText("More Width:")
increaseWidthTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
increaseWidthTextField!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
increaseWidthTextFieldActionPerformed(evt)
}

                                }
                            )
jLabel8!!.setText("More Height:")
increaseHeightTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, Short.MAX_VALUE)!!.addGap(78, 78, 78))!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addGroup(layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(writeOverOriginalJCheckBox)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(generateJButton))!!.addGroup(layout.createSequentialGroup()!!.addComponent(jLabel5)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(widthReductionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel6)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(heightReductionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel7)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(increaseWidthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel8)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(increaseHeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))!!.addGap(0, 0, Short.MAX_VALUE)))!!.addContainerGap()))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel7)!!.addComponent(increaseWidthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel8)!!.addComponent(increaseHeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel5)!!.addComponent(widthReductionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel6)!!.addComponent(heightReductionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(writeOverOriginalJCheckBox)!!.addComponent(generateJButton))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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


    open fun spriteTypeJComboBoxActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

    var spriteSplitterUtil: SpriteSplitterUtil = SpriteSplitterUtil.getInstance()!!

this.jLabel1!!.setText(spriteSplitterUtil!!.ANIMATIONS_LABELS[this.spriteTypeJComboBox!!.getSelectedIndex()]!!)
this.jLabel2!!.setText(spriteSplitterUtil!!.ANIMATIONS_LABELS[this.spriteTypeJComboBox!!.getSelectedIndex() +1]!!)
}


    open fun totalAnimationsJComboBoxActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun totalFramesJComboBoxActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun widthReductionTextFieldActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun increaseWidthTextFieldActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    private var generateJButton: javax.swing.JButton

    private var heightReductionTextField: javax.swing.JTextField

    private var increaseHeightTextField: javax.swing.JTextField

    private var increaseWidthTextField: javax.swing.JTextField

    private var jLabel1: javax.swing.JLabel

    private var jLabel2: javax.swing.JLabel

    private var jLabel3: javax.swing.JLabel

    private var jLabel4: javax.swing.JLabel

    private var jLabel5: javax.swing.JLabel

    private var jLabel6: javax.swing.JLabel

    private var jLabel7: javax.swing.JLabel

    private var jLabel8: javax.swing.JLabel

    private var jPanel1: javax.swing.JPanel

    private var jPanel2: javax.swing.JPanel

    private var spriteTypeJComboBox: javax.swing.JComboBox<String>

    private var totalAnimationsJComboBox: javax.swing.JComboBox<String>

    private var totalFramesJComboBox: javax.swing.JComboBox<String>

    private var widthReductionTextField: javax.swing.JTextField

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
                                

    var isWritten: Boolean = ImageIO.write(this@SpriteSplitterImageJPanel.result as RenderedImage, imageStrings!!.PNG, file)!!

logUtil!!.put(StringMaker().
                            append("File: ")!!.append(StringUtil.getInstance()!!.toString(file))!!.append(" Wrote: ")!!.append(isWritten)!!.toString(), this, commonStrings!!.RUN)
}


}
                
            


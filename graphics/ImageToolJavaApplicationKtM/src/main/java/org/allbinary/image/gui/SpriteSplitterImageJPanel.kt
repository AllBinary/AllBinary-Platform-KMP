
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
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.DefaultComboBoxModel
import javax.swing.GroupLayout
import javax.swing.JButton
import javax.swing.JCheckBox
import javax.swing.JComboBox
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField
import javax.swing.LayoutStyle

open public class SpriteSplitterImageJPanel : JPanel
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
            
    var spriteSplitterUtil: SpriteSplitterUtil = SpriteSplitterUtil.getInstance()!!


    var spriteType: String = spriteTypeJComboBox!!.getSelectedItem() as String


    var totalFrames: Integer = Integer(Integer.valueOf(totalFramesJComboBox!!.getSelectedItem() as String))!!


    var totalAnimations: Integer = Integer(Integer.valueOf(totalAnimationsJComboBox!!.getSelectedItem() as String))!!


    var widthReduction: Int = Integer(Integer.valueOf(widthReductionTextField!!.getText()))


    var heightReduction: Int = Integer(Integer.valueOf(heightReductionTextField!!.getText()))


    var increaseWidth: Int = Integer(Integer.valueOf(increaseWidthTextField!!.getText()))


    var increaseHeight: Int = Integer(Integer.valueOf(increaseHeightTextField!!.getText()))

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
this.writeOverOriginalJCheckBox= JCheckBox()
this.widthReductionTextField= JTextField()
this.jLabel5= JLabel()
this.jPanel1= object: JPanel()
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
                            
this.jLabel4= JLabel()
this.jLabel6= JLabel()
this.heightReductionTextField= JTextField()
this.generateJButton= JButton()
this.jPanel2= JPanel()
this.jLabel1= JLabel()
this.totalFramesJComboBox= JComboBox()

    var size: Int = 70


    var animationStringArray2: Array<String?> = arrayOfNulls(size -1)





                        for (index in 1 until size)

        {
animationStringArray2[index -1]= index.toString()!!
}

this.totalFramesJComboBox!!.setModel(DefaultComboBoxModel(animationStringArray2))
this.jLabel2= JLabel()
this.totalAnimationsJComboBox= JComboBox()

    var animationStringArray: Array<String?> = arrayOfNulls(size -1)





                        for (index in 1 until size)

        {
animationStringArray[index -1]= index.toString()!!
}

this.totalAnimationsJComboBox!!.setModel(DefaultComboBoxModel(animationStringArray))
this.jLabel3= JLabel()
this.spriteTypeJComboBox= JComboBox()
this.spriteTypeJComboBox!!.setModel(DefaultComboBoxModel(arrayOf(SpriteSplitterUtil.getInstance()!!.DIRECTIONAL_ANIMATIONS,SpriteSplitterUtil.getInstance()!!.HORIZONTAL_ANIMATIONS,SpriteSplitterUtil.getInstance()!!.HORIZONTAL_SPRITE)))
jLabel7= JLabel()
this.increaseWidthTextField= JTextField()
this.jLabel8= JLabel()
this.increaseHeightTextField= JTextField()
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
this.jLabel5!!.setText("Less Width:")
this.jLabel4!!.setText("Results:")

    var jPanel1Layout: GroupLayout = GroupLayout(this.jPanel1)

this.jPanel1!!.setLayout(jPanel1Layout)
jPanel1Layout!!.setHorizontalGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addComponent(jLabel4)!!.addGap(0, 0, Short.MAX_VALUE)))
jPanel1Layout!!.setVerticalGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addComponent(jLabel4)!!.addGap(0, 184, Short.MAX_VALUE)))
this.jLabel6!!.setText("Less Height:")
this.heightReductionTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
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
this.jLabel1!!.setText("Row Total:")
this.totalFramesJComboBox!!.setSelectedIndex(1)
this.totalFramesJComboBox!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
totalFramesJComboBoxActionPerformed(evt)
}

                                }
                            )
this.jLabel2!!.setText("Column Total :")
this.totalAnimationsJComboBox!!.setSelectedIndex(3)
this.totalAnimationsJComboBox!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
totalAnimationsJComboBoxActionPerformed(evt)
}

                                }
                            )
this.jLabel3!!.setText("Type:")
this.spriteTypeJComboBox!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
spriteTypeJComboBoxActionPerformed(evt)
}

                                }
                            )

    var jPanel2Layout: GroupLayout = GroupLayout(this.jPanel2)

this.jPanel2!!.setLayout(jPanel2Layout)
jPanel2Layout!!.setHorizontalGroup(jPanel2Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(jLabel1)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(totalFramesJComboBox, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel2)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(totalAnimationsJComboBox, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel3)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(spriteTypeJComboBox, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)!!.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
jPanel2Layout!!.setVerticalGroup(jPanel2Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(jPanel2Layout!!.createSequentialGroup()!!.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addGroup(jPanel2Layout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(totalFramesJComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel2)!!.addComponent(totalAnimationsJComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel3)!!.addComponent(spriteTypeJComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
this.jLabel7!!.setText("More Width:")
this.increaseWidthTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
this.increaseWidthTextField!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
increaseWidthTextFieldActionPerformed(evt)
}

                                }
                            )
this.jLabel8!!.setText("More Height:")
this.increaseHeightTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 415, Short.MAX_VALUE)!!.addGap(78, 78, 78))!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addGroup(layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(writeOverOriginalJCheckBox)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(generateJButton))!!.addGroup(layout.createSequentialGroup()!!.addComponent(jLabel5)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(widthReductionTextField, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel6)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(heightReductionTextField, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel7)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(increaseWidthTextField, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel8)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(increaseHeightTextField, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)))!!.addGap(0, 0, Short.MAX_VALUE)))!!.addContainerGap()))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel7)!!.addComponent(increaseWidthTextField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel8)!!.addComponent(increaseHeightTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel5)!!.addComponent(widthReductionTextField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel6)!!.addComponent(heightReductionTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(writeOverOriginalJCheckBox)!!.addComponent(generateJButton))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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


    open fun spriteTypeJComboBoxActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

    var spriteSplitterUtil: SpriteSplitterUtil = SpriteSplitterUtil.getInstance()!!

this.jLabel1!!.setText(spriteSplitterUtil!!.ANIMATIONS_LABELS[this.spriteTypeJComboBox!!.getSelectedIndex()]!!)
this.jLabel2!!.setText(spriteSplitterUtil!!.ANIMATIONS_LABELS[this.spriteTypeJComboBox!!.getSelectedIndex() +1]!!)
}


    open fun totalAnimationsJComboBoxActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun totalFramesJComboBoxActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun widthReductionTextFieldActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun increaseWidthTextFieldActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    private var generateJButton: JButton

    private var heightReductionTextField: JTextField

    private var increaseHeightTextField: JTextField

    private var increaseWidthTextField: JTextField

    private var jLabel1: JLabel

    private var jLabel2: JLabel

    private var jLabel3: JLabel

    private var jLabel4: JLabel

    private var jLabel5: JLabel

    private var jLabel6: JLabel

    private var jLabel7: JLabel

    private var jLabel8: JLabel

    private var jPanel1: JPanel

    private var jPanel2: JPanel

    private var spriteTypeJComboBox: JComboBox<String>

    private var totalAnimationsJComboBox: JComboBox<String>

    private var totalFramesJComboBox: JComboBox<String>

    private var widthReductionTextField: JTextField

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
                                

    var isWritten: Boolean = ImageIO.write(this@SpriteSplitterImageJPanel.result as RenderedImage, imageStrings!!.PNG, file)

this.logUtil!!.putF(StringMaker().
                            append("File: ")!!.append(StringUtil.getInstance()!!.toString(file))!!.append(" Wrote: ")!!.appendboolean(isWritten)!!.toString(), this, this.commonStrings!!.RUN)
}


}
                
            


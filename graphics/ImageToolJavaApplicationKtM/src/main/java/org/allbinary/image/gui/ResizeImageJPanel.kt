
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
        
        import java.lang.System
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import java.awt.image.BufferedImage
import java.awt.image.Raster
import java.io.File
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.FileWrapperUtil
import org.allbinary.media.image.ImagePersistanceUtil
import org.allbinary.media.image.ImageProcessorInput
import org.allbinary.media.image.ImageProcessorInputCompositeInterface
import org.allbinary.media.image.ImageUtil
import org.allbinary.string.CommonStrings
import java.awt.Dimension
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.DefaultComboBoxModel
import javax.swing.GroupLayout
import javax.swing.JButton
import javax.swing.JComboBox
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField
import javax.swing.LayoutStyle

open public class ResizeImageJPanel : JPanel
                , ImageProcessorInputCompositeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var imageProcessorInput: ImageProcessorInput
public constructor (imageProcessorInput: ImageProcessorInput)                        

                            : super(){
    //var imageProcessorInput = imageProcessorInput


                            //For kotlin this is before the body of the constructor.
                    
initComponents()
this.imageProcessorInput= imageProcessorInput

    var numberStringArray: Array<String?> = arrayOfNulls(101)

numberStringArray[0]= Integer.toString( -1)!!




                        for (index in 1 until 100)

        {
numberStringArray[index]= index.toString()!!
}

this.jComboBox1!!.setModel(DefaultComboBoxModel(numberStringArray))

    var araster: Raster = this.imageProcessorInput!!.getBufferedImageArray()[0]!!.getAlphaRaster()!!


    
                        if(araster == 
                                    null
                                )
                        
                                    {
                                    System.out.println("there is no Alpha channel!!!!!!!!!")

                                    }
                                
                        else {
                            System.out.println("Alpha channel found !")

                        }
                            
}


    open fun process()
        //nullable = true from not(false or (false and true)) = true
{
object: Thread()
                                {
                                
                                
    override fun run()
        //nullable = true from not(false or (false and true)) = true
{

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    var imageUtil: ImageUtil = ImageUtil.getInstance()!!


    var percent: Integer = Integer(Integer.valueOf(this@ResizeImageJPanel.jComboBox1!!.getSelectedItem() as String))!!


    var percentAsFloat: Float = (this@ResizeImageJPanel.floatPercentJTextField!!.getText()).toFloat()!!


    var imageProcessorInput: ImageProcessorInput = this@ResizeImageJPanel.getImageProcessorInput()!!


    var files: Array<File?> = imageProcessorInput!!.getFiles()!!


    var generatedBufferedImageArray: Array<BufferedImage?>? = 
                null
            


    
                        if(percentAsFloat!!.toInt() !=  -1)
                        
                                    {
                                    generatedBufferedImageArray= imageUtil!!.createBufferedImage2(imageProcessorInput!!.getBufferedImageArray(), percentAsFloat, true)!!

                                    }
                                
                             else 
    
                        if(percent.toInt() !=  -1)
                        
                                    {
                                    generatedBufferedImageArray= imageUtil!!.createBufferedImageForResize(imageProcessorInput!!.getBufferedImageArray(), percent, true)!!

                                    }
                                
                        else {
                            
    var width: Integer = Integer(Integer.valueOf(this@ResizeImageJPanel.jTextField1!!.getText() as String))!!


    var height: Integer = Integer(Integer.valueOf(this@ResizeImageJPanel.jTextField2!!.getText() as String))!!

generatedBufferedImageArray= imageUtil!!.createBufferedImage3(imageProcessorInput!!.getBufferedImageArray(), width, height, true)!!

                        }
                            

    var araster: Raster = generatedBufferedImageArray[0]!!.getAlphaRaster()!!


    
                        if(araster == 
                                    null
                                )
                        
                                    {
                                    System.out.println("No Alpha Channel In Result")

                                    }
                                
                        else {
                            System.out.println("Found Alpha Channel In Result")

                        }
                            

    var imagePersistanceUtil: ImagePersistanceUtil = ImagePersistanceUtil.getInstance()!!





                        for (index in 0 until generatedBufferedImageArray!!.size)

        {
imagePersistanceUtil!!.saveWithBatik(FileWrapperUtil.wrapFile(files[index]!!), generatedBufferedImageArray[index]!!)
}

this@ResizeImageJPanel.getParent()!!.repaint()
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}

                                }
                            .
                            start()
}


    open fun update()
        //nullable = true from not(false or (false and true)) = true
{
object: Thread()
                                {
                                
                                
    override fun run()
        //nullable = true from not(false or (false and true)) = true
{

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    var imageProcessorInput: ImageProcessorInput = this@ResizeImageJPanel.getImageProcessorInput()!!


    var size: Int = imageProcessorInput!!.getBufferedImageArray()!!.size
                


    var bufferedImageArray: Array<BufferedImage?> = imageProcessorInput!!.getBufferedImageArray()!!


    var bufferedImage: BufferedImage





                        for (index in 0 until size)

        {
bufferedImage= bufferedImageArray[0]!!
this@ResizeImageJPanel.jTextField1!!.setText(bufferedImage!!.getWidth().toString())
this@ResizeImageJPanel.jTextField2!!.setText(bufferedImage!!.getHeight().toString())
}

this@ResizeImageJPanel.getParent()!!.repaint()
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}

                                }
                            .
                            start()
}


    open fun updateFor16Above()
        //nullable = true from not(false or (false and true)) = true
{
object: Thread()
                                {
                                
                                
    override fun run()
        //nullable = true from not(false or (false and true)) = true
{

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    var imageProcessorInput: ImageProcessorInput = this@ResizeImageJPanel.getImageProcessorInput()!!


    var size: Int = imageProcessorInput!!.getBufferedImageArray()!!.size
                


    var bufferedImageArray: Array<BufferedImage?> = imageProcessorInput!!.getBufferedImageArray()!!


    var bufferedImage: BufferedImage





                        for (index in 0 until size)

        {
bufferedImage= bufferedImageArray[0]!!
this@ResizeImageJPanel.jTextField1!!.setText(bufferedImage!!.getWidth() /16 *16.toString())
this@ResizeImageJPanel.jTextField2!!.setText(bufferedImage!!.getHeight() /16 *16.toString())
}

this@ResizeImageJPanel.getParent()!!.repaint()
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}

                                }
                            .
                            start()
}


    open fun updateFor16Below()
        //nullable = true from not(false or (false and true)) = true
{
object: Thread()
                                {
                                
                                
    override fun run()
        //nullable = true from not(false or (false and true)) = true
{

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    var imageProcessorInput: ImageProcessorInput = this@ResizeImageJPanel.getImageProcessorInput()!!


    var size: Int = imageProcessorInput!!.getBufferedImageArray()!!.size
                


    var bufferedImageArray: Array<BufferedImage?> = imageProcessorInput!!.getBufferedImageArray()!!


    var bufferedImage: BufferedImage





                        for (index in 0 until size)

        {
bufferedImage= bufferedImageArray[0]!!
this@ResizeImageJPanel.jTextField1!!.setText(((bufferedImage!!.getWidth() /16) +1) *16.toString())
this@ResizeImageJPanel.jTextField2!!.setText(((bufferedImage!!.getHeight() /16) +1) *16.toString())
}

this@ResizeImageJPanel.getParent()!!.repaint()
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}

                                }
                            .
                            start()
}


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


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.jLabel1= JLabel()
this.jComboBox1= JComboBox()
this.aboveJButton= JButton()
this.jTextField1= JTextField()
this.jLabel2= JLabel()
this.jLabel3= JLabel()
this.jTextField2= JTextField()
this.updateJButton= JButton()
this.floatPercentJTextField= JTextField()
this.adjustFor16AboveJButton= JButton()
this.adjustFor16BelowJButton= JButton()
this.jLabel1!!.setText("Percent:")
this.jComboBox1!!.setModel(DefaultComboBoxModel(arrayOf("Item 1","Item 2","Item 3","Item 4")))
this.aboveJButton!!.setText("Process")
this.aboveJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
aboveJButtonActionPerformed(evt)
}

                                }
                            )
this.jLabel2!!.setText("Width:")
this.jLabel3!!.setText("Height:")
this.updateJButton!!.setText("Update")
this.updateJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
updateJButtonActionPerformed(evt)
}

                                }
                            )
this.floatPercentJTextField!!.setText("-1.000000")
this.floatPercentJTextField!!.setMinimumSize(Dimension(120, 22))
this.adjustFor16AboveJButton!!.setText("Adjust for 16 Above")
this.adjustFor16AboveJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
adjustFor16AboveJButtonActionPerformed(evt)
}

                                }
                            )
this.adjustFor16BelowJButton!!.setText("Adjust for 16 Below")
this.adjustFor16BelowJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
adjustFor16BelowJButtonActionPerformed(evt)
}

                                }
                            )

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(jLabel1)!!.addComponent(jLabel2)!!.addComponent(jLabel3))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)!!.addComponent(jComboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(jTextField1)!!.addComponent(jTextField2))!!.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(floatPercentJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(adjustFor16AboveJButton)!!.addComponent(adjustFor16BelowJButton))!!.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))!!.addGroup(layout.createSequentialGroup()!!.addComponent(updateJButton)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(aboveJButton)!!.addGap(0, 250, Short.MAX_VALUE)))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(floatPercentJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel2)!!.addComponent(adjustFor16AboveJButton))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel3)!!.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(adjustFor16BelowJButton))!!.addGap(18, 18, 18)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(aboveJButton)!!.addComponent(updateJButton))!!.addContainerGap(175, Short.MAX_VALUE)))
}


    open fun aboveJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.process()
}


    open fun updateJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.update()
}


    open fun adjustFor16AboveJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.updateFor16Above()
}


    open fun adjustFor16BelowJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.updateFor16Below()
}


    private var aboveJButton: JButton

    private var adjustFor16AboveJButton: JButton

    private var adjustFor16BelowJButton: JButton

    private var floatPercentJTextField: JTextField

    private var jComboBox1: JComboBox<String>

    private var jLabel1: JLabel

    private var jLabel2: JLabel

    private var jLabel3: JLabel

    private var jTextField1: JTextField

    private var jTextField2: JTextField

    private var updateJButton: JButton

}
                
            



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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
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

open public class ResizeImageJPanel : swing.JPanel
                , ImageProcessorInputCompositeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var imageProcessorInput: ImageProcessorInput
public constructor        (imageProcessorInput: ImageProcessorInput)                        

                            : super(){

                    var imageProcessorInput = imageProcessorInput


                            //For kotlin this is before the body of the constructor.
                    
initComponents()
this.imageProcessorInput= imageProcessorInput

    var numberStringArray: Array<String?> = arrayOfNulls(101)

numberStringArray[0]= Integer.toString( -1)




                        for (index in 1 until 100)


        {numberStringArray[index]= Integer.toString(index)
}

jComboBox1!!.setModel(DefaultComboBoxModel(numberStringArray))

    var araster: Raster = this.imageProcessorInput!!.getBufferedImageArray()[0]!!.getAlphaRaster()!!
            


    
                        if(araster == 
                                    null
                                )
                        
                                    {
                                    System.out!!.println(
                            "there is no Alpha channel!!!!!!!!!")

                                    }
                                
                        else {
                            System.out!!.println(
                            "Alpha channel found !")

                        }
                            
}


open fun process()
        //nullable = true from not(false or (false and true)) = true
{Thread().
                            start()
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{Thread().
                            start()
}


open fun updateFor16Above()
        //nullable = true from not(false or (false and true)) = true
{Thread().
                            start()
}


open fun updateFor16Below()
        //nullable = true from not(false or (false and true)) = true
{Thread().
                            start()
}


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


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{jLabel1= JLabel()
jComboBox1= JComboBox<>()
aboveJButton= JButton()
jTextField1= JTextField()
jLabel2= JLabel()
jLabel3= JLabel()
jTextField2= JTextField()
updateJButton= JButton()
floatPercentJTextField= JTextField()
adjustFor16AboveJButton= JButton()
adjustFor16BelowJButton= JButton()
jLabel1!!.setText(
                            "Percent:")
jComboBox1!!.setModel(DefaultComboBoxModel<>(arrayOf("Item 1","Item 2","Item 3","Item 4")))
aboveJButton!!.setText(
                            "Process")
aboveJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
aboveJButtonActionPerformed(evt)
}

                                }
                            )
jLabel2!!.setText(
                            "Width:")
jLabel3!!.setText(
                            "Height:")
updateJButton!!.setText(
                            "Update")
updateJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
updateJButtonActionPerformed(evt)
}

                                }
                            )
floatPercentJTextField!!.setText(
                            "-1.000000")
floatPercentJTextField!!.setMinimumSize(Dimension(120, 22))
adjustFor16AboveJButton!!.setText(
                            "Adjust for 16 Above")
adjustFor16AboveJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
adjustFor16AboveJButtonActionPerformed(evt)
}

                                }
                            )
adjustFor16BelowJButton!!.setText(
                            "Adjust for 16 Below")
adjustFor16BelowJButton!!.addActionListener(object: ActionListener()
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
layout!!.setHorizontalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(layout!!.createSequentialGroup()!!.addContainerGap()!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(jLabel1)!!.addComponent(jLabel2)!!.addComponent(jLabel3))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING, false)!!.addComponent(jComboBox1, 0, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(jTextField1)!!.addComponent(jTextField2))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.UNRELATED)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(floatPercentJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(adjustFor16AboveJButton)!!.addComponent(adjustFor16BelowJButton))!!.addContainerGap(javax!!.swing!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))!!.addGroup(layout!!.createSequentialGroup()!!.addComponent(updateJButton)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(aboveJButton)!!.addGap(0, 250, Short.MAX_VALUE)))
layout!!.setVerticalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(layout!!.createSequentialGroup()!!.addContainerGap()!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(jComboBox1, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(floatPercentJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jTextField1, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel2)!!.addComponent(adjustFor16AboveJButton))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel3)!!.addComponent(jTextField2, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(adjustFor16BelowJButton))!!.addGap(18, 18, 18)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(aboveJButton)!!.addComponent(updateJButton))!!.addContainerGap(175, Short.MAX_VALUE)))
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
                
            


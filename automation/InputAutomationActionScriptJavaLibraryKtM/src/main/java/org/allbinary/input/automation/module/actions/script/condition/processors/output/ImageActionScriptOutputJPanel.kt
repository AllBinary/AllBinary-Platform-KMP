
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
        package org.allbinary.input.automation.module.actions.script.condition.processors.output




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import javax.swing
import org.allbinary.input.media.image.InputImageType
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class ImageActionScriptOutputJPanel : javax.swing.JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var capturedImageActionScriptOutputInterface: ImageActionScriptOutputInterface
public constructor        (capturedImageActionScriptOutputInterface: ImageActionScriptOutputInterface){
var capturedImageActionScriptOutputInterface = capturedImageActionScriptOutputInterface
logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)
initComponents()
this.capturedImageActionScriptOutputInterface= capturedImageActionScriptOutputInterface
this.set()
}


open fun set()
        //nullable = true from not(false or (false and true)) = true
{
this.setImageTypeJlistModel()

    var imageTypes: ImageTypes = this.capturedImageActionScriptOutputInterface!!.getImageTypes()!!


    var vector: Vector = imageTypes!!.getVector()!!


    var selectedArray: IntArray = IntArray(vector.size)


    var size: Int = vector.size!!





                        for (index in 0 until size)

        {

    var imageType: InputImageType = vector.get(index) as InputImageType

selectedArray[index++]= imageType!!.getIndex()
}

this.itemTypesJList!!.setSelectedIndices(selectedArray)

    
                        if(this.capturedImageActionScriptOutputInterface!!.isSaved())
                        
                                    {
                                    this.saveJCheckBox!!.setSelected(true)

                                    }
                                

    
                        if(this.capturedImageActionScriptOutputInterface!!.isSaved())
                        
                                    {
                                    this.displayJCheckBox!!.setSelected(true)

                                    }
                                
this.capturedImageActionScriptOutputInterface!!.log()
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{

    var anyType: Array<Any?> = this.itemTypesJList!!.getSelectedValues()!!


    var imageTypes: ImageTypes = anyType.concatToString()

                                    !!

this.capturedImageActionScriptOutputInterface!!.setImageTypes(imageTypes)

    
                        if(this.saveJCheckBox!!.isSelected())
                        
                                    {
                                    this.capturedImageActionScriptOutputInterface!!.setSaved(true)

                                    }
                                
                        else {
                            this.capturedImageActionScriptOutputInterface!!.setSaved(false)

                        }
                            

    
                        if(this.displayJCheckBox!!.isSelected())
                        
                                    {
                                    this.capturedImageActionScriptOutputInterface!!.setDisplay(true)

                                    }
                                
                        else {
                            this.capturedImageActionScriptOutputInterface!!.setDisplay(false)

                        }
                            
this.capturedImageActionScriptOutputInterface!!.log()
}


open fun setImageTypeJlistModel()
        //nullable = true from not(false or (false and true)) = true
{

    var defaultListModel: DefaultListModel = DefaultListModel()


    var vector: Vector = InputImageType.getAllAsVector()!!


    var size: Int = vector.size!!





                        for (index in 0 until size)

        {

    var imageType: InputImageType = vector.get(index) as InputImageType

defaultListModel!!.addElement(imageType!!.getName())
}

this.itemTypesJList!!.setModel(defaultListModel)
}


open fun getCapturedImageActionJDialog()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JDialog{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return capturedImageActionJDialog
}


open fun setCapturedImageActionJDialog(capturedImageActionJDialog: javax.swing.JDialog)
        //nullable = true from not(false or (false and false)) = true
{
var capturedImageActionJDialog = capturedImageActionJDialog
this.capturedImageActionJDialog= capturedImageActionJDialog
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
capturedImageActionJDialog= javax.swing.JDialog()
titleJLabel= javax.swing.JLabel()
okJButton= javax.swing.JButton()
saveJCheckBox= javax.swing.JCheckBox()
displayJCheckBox= javax.swing.JCheckBox()
jScrollPane1= javax.swing.JScrollPane()
itemTypesJList= javax.swing.JList()
capturedImageActionJButton= javax.swing.JButton()
jLabel1= javax.swing.JLabel()
capturedImageActionJDialog!!.setMinimumSize(java.awt.Dimension(250, 250))
titleJLabel!!.setText("Image Output Options")
okJButton!!.setText("OK")
okJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
okJButtonActionPerformed(evt)
}

                                }
                            )
saveJCheckBox!!.setText("Save To File")
saveJCheckBox!!.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0))
saveJCheckBox!!.setMargin(java.awt.Insets(0, 0, 0, 0))
displayJCheckBox!!.setText("Display")
displayJCheckBox!!.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0))
displayJCheckBox!!.setMargin(java.awt.Insets(0, 0, 0, 0))
displayJCheckBox!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
displayJCheckBoxActionPerformed(evt)
}

                                }
                            )
itemTypesJList!!.setModel(object: javax.swing.AbstractListModel()
                                {
                                
    var strings: Array<String?> = arrayOf("Item 1","Item 2","Item 3","Item 4","Item 5")

open override fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return strings.size
}

open override fun getElementAt(i: Int)
        //nullable = true from not(false or (false and false)) = true
: Any{
var i = i



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return strings[i]!!
}

                                }
                            )
jScrollPane1!!.setViewportView(itemTypesJList)

    var capturedImageActionJDialogLayout: javax.swing.GroupLayout = javax.swing.GroupLayout(capturedImageActionJDialog!!.getContentPane())

capturedImageActionJDialog!!.getContentPane()!!.setLayout(capturedImageActionJDialogLayout)
capturedImageActionJDialogLayout!!.setHorizontalGroup(capturedImageActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(capturedImageActionJDialogLayout!!.createSequentialGroup()!!.addGroup(capturedImageActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(capturedImageActionJDialogLayout!!.createSequentialGroup()!!.addGap(61, 61, 61)!!.addComponent(titleJLabel))!!.addGroup(capturedImageActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addGroup(capturedImageActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(capturedImageActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(displayJCheckBox)!!.addComponent(saveJCheckBox, javax.swing.GroupLayout.Alignment.TRAILING))!!.addGroup(capturedImageActionJDialogLayout!!.createSequentialGroup()!!.addGap(84, 84, 84)!!.addComponent(okJButton))))!!.addGroup(capturedImageActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))!!.addContainerGap()))
capturedImageActionJDialogLayout!!.setVerticalGroup(capturedImageActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(capturedImageActionJDialogLayout!!.createSequentialGroup()!!.addComponent(titleJLabel)!!.addGap(5, 5, 5)!!.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(saveJCheckBox)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(displayJCheckBox)!!.addGap(9, 9, 9)!!.addComponent(okJButton)!!.addContainerGap()))
setMinimumSize(java.awt.Dimension(100, 0))
capturedImageActionJButton!!.setText("Edit")
capturedImageActionJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
capturedImageActionJButtonActionPerformed(evt)
}

                                }
                            )
jLabel1!!.setText("Capture Image:")

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jLabel1)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(capturedImageActionJButton)))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(capturedImageActionJButton)))
}


open fun displayJCheckBoxActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


open fun okJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.update()
this.getCapturedImageActionJDialog()!!.setVisible(false)
}


open fun capturedImageActionJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.getCapturedImageActionJDialog()!!.setVisible(true)
}


    private var capturedImageActionJButton: javax.swing.JButton

    private var capturedImageActionJDialog: javax.swing.JDialog

    private var displayJCheckBox: javax.swing.JCheckBox

    private var itemTypesJList: javax.swing.JList

    private var jLabel1: javax.swing.JLabel

    private var jScrollPane1: javax.swing.JScrollPane

    private var okJButton: javax.swing.JButton

    private var saveJCheckBox: javax.swing.JCheckBox

    private var titleJLabel: javax.swing.JLabel

}
                
            


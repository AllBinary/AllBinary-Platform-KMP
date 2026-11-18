
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
                    
        
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD
import javax.swing
import org.allbinary.input.media.image.InputImageType
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import java.awt.Dimension
import java.awt.Insets
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.AbstractListModel
import javax.swing.BorderFactory
import javax.swing.GroupLayout
import javax.swing.JButton
import javax.swing.JCheckBox
import javax.swing.JDialog
import javax.swing.JLabel
import javax.swing.JList
import javax.swing.JPanel
import javax.swing.JScrollPane
import javax.swing.LayoutStyle

open public class ImageActionScriptOutputJPanel : JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var capturedImageActionScriptOutputInterface: ImageActionScriptOutputInterface
public constructor (capturedImageActionScriptOutputInterface: ImageActionScriptOutputInterface){
var capturedImageActionScriptOutputInterface = capturedImageActionScriptOutputInterface
this.logUtil!!.putF(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)
this.initComponents()
this.capturedImageActionScriptOutputInterface= capturedImageActionScriptOutputInterface
this.set()
}


    open fun set()
        //nullable = true from not(false or (false and true)) = true
{
this.setImageTypeJlistModel()

    var imageTypes: ImageTypes = this.capturedImageActionScriptOutputInterface!!.getImageTypes()!!


    var vector: BasicArrayList = imageTypes!!.getVector()!!


    var selectedArray: IntArray = IntArray(vector.size())


    var size: Int = vector.size()





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


    var vector: BasicArrayList = InputImageType.getAllAsVector()!!


    var size: Int = vector.size()





                        for (index in 0 until size)

        {

    var imageType: InputImageType = vector.get(index) as InputImageType

defaultListModel!!.addElement(imageType!!.getName())
}

this.itemTypesJList!!.setModel(defaultListModel)
}


    open fun getCapturedImageActionJDialog()
        //nullable = true from not(false or (false and true)) = true
: JDialog{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.capturedImageActionJDialog
}


    open fun setCapturedImageActionJDialog(capturedImageActionJDialog: JDialog)
        //nullable = true from not(false or (false and false)) = true
{
var capturedImageActionJDialog = capturedImageActionJDialog
this.capturedImageActionJDialog= capturedImageActionJDialog
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.capturedImageActionJDialog= JDialog()
this.titleJLabel= JLabel()
this.okJButton= JButton()
this.saveJCheckBox= JCheckBox()
this.displayJCheckBox= JCheckBox()
this.jScrollPane1= JScrollPane()
this.itemTypesJList= JList()
this.capturedImageActionJButton= JButton()
this.jLabel1= JLabel()
this.capturedImageActionJDialog!!.setMinimumSize(Dimension(250, 250))
this.titleJLabel!!.setText("Image Output Options")
this.okJButton!!.setText("OK")
this.okJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
okJButtonActionPerformed(evt)
}

                                }
                            )
this.saveJCheckBox!!.setText("Save To File")
this.saveJCheckBox!!.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0))
this.saveJCheckBox!!.setMargin(Insets(0, 0, 0, 0))
this.displayJCheckBox!!.setText("Display")
this.displayJCheckBox!!.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0))
this.displayJCheckBox!!.setMargin(Insets(0, 0, 0, 0))
this.displayJCheckBox!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
displayJCheckBoxActionPerformed(evt)
}

                                }
                            )
this.itemTypesJList!!.setModel(object: AbstractListModel()
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
this.jScrollPane1!!.setViewportView(this.itemTypesJList)

    var capturedImageActionJDialogLayout: GroupLayout = GroupLayout(this.capturedImageActionJDialog!!.getContentPane())

this.capturedImageActionJDialog!!.getContentPane()!!.setLayout(capturedImageActionJDialogLayout)
capturedImageActionJDialogLayout!!.setHorizontalGroup(capturedImageActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(capturedImageActionJDialogLayout!!.createSequentialGroup()!!.addGroup(capturedImageActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(capturedImageActionJDialogLayout!!.createSequentialGroup()!!.addGap(61, 61, 61)!!.addComponent(titleJLabel))!!.addGroup(capturedImageActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addGroup(capturedImageActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(capturedImageActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(displayJCheckBox)!!.addComponent(saveJCheckBox, GroupLayout.Alignment.TRAILING))!!.addGroup(capturedImageActionJDialogLayout!!.createSequentialGroup()!!.addGap(84, 84, 84)!!.addComponent(okJButton))))!!.addGroup(capturedImageActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))!!.addContainerGap()))
capturedImageActionJDialogLayout!!.setVerticalGroup(capturedImageActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(capturedImageActionJDialogLayout!!.createSequentialGroup()!!.addComponent(titleJLabel)!!.addGap(5, 5, 5)!!.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(saveJCheckBox)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(displayJCheckBox)!!.addGap(9, 9, 9)!!.addComponent(okJButton)!!.addContainerGap()))
setMinimumSize(Dimension(100, 0))
this.capturedImageActionJButton!!.setText("Edit")
this.capturedImageActionJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
capturedImageActionJButtonActionPerformed(evt)
}

                                }
                            )
this.jLabel1!!.setText("Capture Image:")

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jLabel1)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(capturedImageActionJButton)))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(capturedImageActionJButton)))
}


    open fun displayJCheckBoxActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun okJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.update()
this.getCapturedImageActionJDialog()!!.setVisible(false)
}


    open fun capturedImageActionJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.getCapturedImageActionJDialog()!!.setVisible(true)
}


    private var capturedImageActionJButton: JButton

    private var capturedImageActionJDialog: JDialog

    private var displayJCheckBox: JCheckBox

    private var itemTypesJList: JList

    private var jLabel1: JLabel

    private var jScrollPane1: JScrollPane

    private var okJButton: JButton

    private var saveJCheckBox: JCheckBox

    private var titleJLabel: JLabel

}
                
            


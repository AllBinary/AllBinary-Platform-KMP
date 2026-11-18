
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
        package org.allbinary.input.automation.actions.script.condition.processors.input




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import javax.swing
import org.allbinary.input.KeySingletonFactory
import org.allbinary.input.automation.robot.InputRobot
import org.allbinary.input.automation.robot.InputRobotFactory
import org.allbinary.input.automation.robot.TempInputRobotNames
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonStrings
import java.awt.Dimension
import java.awt.Insets
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.BorderFactory
import javax.swing.GroupLayout
import javax.swing.JButton
import javax.swing.JComboBox
import javax.swing.JDialog
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JRadioButton
import javax.swing.JTextField
import javax.swing.LayoutStyle
import javax.swing.SwingConstants

open public class KeyboardActionScriptInputJPanel : JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var keyActionScriptInputInterface: KeyboardActionScriptInputInterface
public constructor (keyActionScriptInputInterface: KeyboardActionScriptInputInterface){
var keyActionScriptInputInterface = keyActionScriptInputInterface
this.logUtil!!.putF(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)
this.initComponents()
this.keyActionScriptInputInterface= keyActionScriptInputInterface

    var defaultComboBoxModel: DefaultComboBoxModel = DefaultComboBoxModel()

defaultComboBoxModel!!.addElement(TempInputRobotNames.DX_NAME)
defaultComboBoxModel!!.addElement(InputRobot.NAME)
this.inputAutomationTypeJComboBox!!.setModel(defaultComboBoxModel)
this.keyNameJComboBox!!.setModel(KeyNameDefaultComboBoxModelFactory.getInstance())
this.keyIntegerJComboBox!!.setModel(KeyCharDefaultComboBoxModelFactory.getInstance())

    
                        if(this.keyActionScriptInputInterface!!.isNormal())
                        
                                    {
                                    this.normalJRadioButton!!.setSelected(true)
this.pressJRadioButton!!.setSelected(false)
this.releaseJRadioButton!!.setSelected(false)

                                    }
                                
                             else 
    
                        if(this.keyActionScriptInputInterface!!.isPress())
                        
                                    {
                                    this.normalJRadioButton!!.setSelected(false)
this.pressJRadioButton!!.setSelected(true)
this.releaseJRadioButton!!.setSelected(false)

                                    }
                                
                             else 
    
                        if(this.keyActionScriptInputInterface!!.isRelease())
                        
                                    {
                                    this.normalJRadioButton!!.setSelected(false)
this.pressJRadioButton!!.setSelected(false)
this.releaseJRadioButton!!.setSelected(true)

                                    }
                                
this.set()
}


    open fun set()
        //nullable = true from not(false or (false and true)) = true
{

    var inputTypeComboBoxModel: ComboBoxModel = this.inputAutomationTypeJComboBox!!.getModel()!!

inputTypeComboBoxModel!!.setSelectedItem(this.keyActionScriptInputInterface!!.getInputRobotInterface()!!.getName())
this.textJTextField!!.setText(this.keyActionScriptInputInterface!!.getText())
this.delayJTextField!!.setText(this.keyActionScriptInputInterface!!.getDelayBetweenKeys().toString())
this.timeJTextField!!.setText(this.keyActionScriptInputInterface!!.getTime().toString())
this.keyActionScriptInputInterface!!.log()
}


                @Throws(Exception::class)
            
    open fun updateInputType()
        //nullable = true from not(false or (false and true)) = true
{

    var comboBoxModel: ComboBoxModel = this.inputAutomationTypeJComboBox!!.getModel()!!


    var selectedItem: String = comboBoxModel!!.getSelectedItem() as String


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(selectedItem))
                        
                                    {
                                    this.keyActionScriptInputInterface!!.setInputRobotInterface(InputRobotFactory.getInstance()!!.get(selectedItem))

                                    }
                                
}


    open fun getSelectedKey()
        //nullable = true from not(false or (false and true)) = true
: Integer?{

    var comboBoxModel: ComboBoxModel = this.keyNameJComboBox!!.getModel()!!


    var selectedItem: String = comboBoxModel!!.getSelectedItem() as String


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(selectedItem))
                        
                                    {
                                    
                        //if statement needs to be on the same line and ternary does not work the same way.
                        return KeySingletonFactory.getHashtable()!!.get(selectedItem as Object) as Integer

                                    }
                                

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


    open fun updateKeys()
        //nullable = true from not(false or (false and true)) = true
{

    var text: String = this.textJTextField!!.getText()!!

this.keyActionScriptInputInterface!!.setText(text)
}


                @Throws(Exception::class)
            
    open fun update()
        //nullable = true from not(false or (false and true)) = true
{
this.updateInputType()
this.updateKeys()
this.keyActionScriptInputInterface!!.setTime(Integer.valueOf(this.timeJTextField!!.getText())!!.toInt())
this.keyActionScriptInputInterface!!.log()
}


    open fun getKeyActionJDialog()
        //nullable = true from not(false or (false and true)) = true
: JDialog{

                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.keyActionJDialog
}


    open fun setKeyActionJDialog(keyActionJDialog: JDialog)
        //nullable = true from not(false or (false and false)) = true
{
var keyActionJDialog = keyActionJDialog
this.keyActionJDialog= keyActionJDialog
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.keyActionJDialog= JDialog()
this.titleJLabel= JLabel()
this.addKeyJLabel= JLabel()
this.keyNameJComboBox= JComboBox()
this.timeJTextField= JTextField()
this.holdTimeJLabel= JLabel()
this.inputAutomationTypeJComboBox= JComboBox()
this.inputTypeJLabel= JLabel()
this.delayJTextField= JTextField()
this.delayBetweenJLabel= JLabel()
this.testJLabel= JLabel()
this.textJTextField= JTextField()
this.pressJRadioButton= JRadioButton()
this.releaseJRadioButton= JRadioButton()
this.normalJRadioButton= JRadioButton()
this.simultaneousJRadioButton= JRadioButton()
this.sequenceJRadioButton= JRadioButton()
this.jPanel1= JPanel()
this.okJButton= JButton()
this.keyIntegerJComboBox= JComboBox()
this.keyActionJButton= JButton()
this.jLabel1= JLabel()
this.keyActionJDialog!!.setMinimumSize(Dimension(255, 280))
this.titleJLabel!!.setHorizontalAlignment(SwingConstants.CENTER)
this.titleJLabel!!.setText("Keyboard Input Options")
this.addKeyJLabel!!.setText("Add Key:")
this.keyNameJComboBox!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
keyNameJComboBoxActionPerformed(evt)
}

                                }
                            )
this.timeJTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
this.holdTimeJLabel!!.setText("Hold Time (ms):")
this.inputTypeJLabel!!.setText("Input Type:")
this.delayJTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
this.delayBetweenJLabel!!.setText("Delay Between Keys (ms):")
this.testJLabel!!.setText("Text:")
this.textJTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
this.pressJRadioButton!!.setText("Press")
this.pressJRadioButton!!.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0))
this.pressJRadioButton!!.setMargin(Insets(0, 0, 0, 0))
this.pressJRadioButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
pressJRadioButtonActionPerformed(evt)
}

                                }
                            )
this.releaseJRadioButton!!.setText("Release")
this.releaseJRadioButton!!.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0))
this.releaseJRadioButton!!.setMargin(Insets(0, 0, 0, 0))
this.releaseJRadioButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
releaseJRadioButtonActionPerformed(evt)
}

                                }
                            )
this.normalJRadioButton!!.setSelected(true)
this.normalJRadioButton!!.setText("Normal")
this.normalJRadioButton!!.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0))
this.normalJRadioButton!!.setMargin(Insets(0, 0, 0, 0))
this.normalJRadioButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
normalJRadioButtonActionPerformed(evt)
}

                                }
                            )
this.simultaneousJRadioButton!!.setSelected(true)
this.simultaneousJRadioButton!!.setText("Simultaneous")
this.simultaneousJRadioButton!!.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0))
this.simultaneousJRadioButton!!.setMargin(Insets(0, 0, 0, 0))
this.simultaneousJRadioButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
simultaneousJRadioButtonActionPerformed(evt)
}

                                }
                            )
this.sequenceJRadioButton!!.setText("Sequence")
this.sequenceJRadioButton!!.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0))
this.sequenceJRadioButton!!.setMargin(Insets(0, 0, 0, 0))
this.sequenceJRadioButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
sequenceJRadioButtonActionPerformed(evt)
}

                                }
                            )
this.okJButton!!.setText("OK")
this.okJButton!!.setHorizontalTextPosition(SwingConstants.CENTER)
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
this.jPanel1!!.add(this.okJButton)
this.keyIntegerJComboBox!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
keyIntegerJComboBoxActionPerformed(evt)
}

                                }
                            )

    var keyActionJDialogLayout: GroupLayout = GroupLayout(this.keyActionJDialog!!.getContentPane())

this.keyActionJDialog!!.getContentPane()!!.setLayout(keyActionJDialogLayout)
keyActionJDialogLayout!!.setHorizontalGroup(keyActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(keyActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(keyActionJDialogLayout!!.createSequentialGroup()!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING, false)!!.addComponent(addKeyJLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(inputTypeJLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.TRAILING)!!.addComponent(inputAutomationTypeJComboBox, 0, 148, Short.MAX_VALUE)!!.addComponent(textJTextField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)!!.addGroup(keyActionJDialogLayout!!.createSequentialGroup()!!.addComponent(keyNameJComboBox, 0, 101, Short.MAX_VALUE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(keyIntegerJComboBox, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))))!!.addComponent(testJLabel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)!!.addGroup(keyActionJDialogLayout!!.createSequentialGroup()!!.addComponent(normalJRadioButton)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(pressJRadioButton)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(releaseJRadioButton)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, GroupLayout.PREFERRED_SIZE))!!.addGroup(GroupLayout.Alignment.TRAILING, keyActionJDialogLayout!!.createSequentialGroup()!!.addComponent(holdTimeJLabel)!!.addGap(22, 22, 22)!!.addComponent(timeJTextField, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))!!.addGroup(keyActionJDialogLayout!!.createSequentialGroup()!!.addComponent(delayBetweenJLabel)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)!!.addComponent(delayJTextField, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))!!.addGroup(keyActionJDialogLayout!!.createSequentialGroup()!!.addComponent(simultaneousJRadioButton)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(sequenceJRadioButton)))!!.addContainerGap())!!.addComponent(titleJLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)!!.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
keyActionJDialogLayout!!.setVerticalGroup(keyActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(keyActionJDialogLayout!!.createSequentialGroup()!!.addComponent(titleJLabel)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(inputTypeJLabel)!!.addComponent(inputAutomationTypeJComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(addKeyJLabel)!!.addComponent(keyIntegerJComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(keyNameJComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(testJLabel)!!.addComponent(textJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(pressJRadioButton)!!.addComponent(normalJRadioButton)!!.addComponent(releaseJRadioButton))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(holdTimeJLabel)!!.addComponent(timeJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(delayBetweenJLabel)!!.addComponent(delayJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(keyActionJDialogLayout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(simultaneousJRadioButton)!!.addComponent(sequenceJRadioButton))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addContainerGap()))
setMinimumSize(Dimension(100, 0))
this.keyActionJButton!!.setText("Edit")
this.keyActionJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
keyActionJButtonActionPerformed(evt)
}

                                }
                            )
this.jLabel1!!.setText("Key:")

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jLabel1)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)!!.addComponent(keyActionJButton)))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(keyActionJButton)))
}


    open fun prependText(integer: Integer)
        //nullable = true from not(false or (false and false)) = true
{
var integer = integer

    
                        if(integer != 
                                    null
                                )
                        
                                    {
                                    
    var newKey: String = "&#" +integer.toString() +";"

this.textJTextField!!.setText(newKey +this.textJTextField!!.getText())

                                    }
                                
}


    open fun keyIntegerJComboBoxActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.keyIntegerJComboBox!!.getSelectedIndex()
this.keyNameJComboBox!!.setSelectedIndex(this.keyIntegerJComboBox!!.getSelectedIndex())
}


    open fun sequenceJRadioButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

    
                        if(this.sequenceJRadioButton!!.isSelected())
                        
                                    {
                                    this.delayJTextField!!.setText(CommonPhoneStrings.getInstance()!!.ONE)
this.simultaneousJRadioButton!!.setSelected(false)

                                    }
                                
}


    open fun simultaneousJRadioButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

    
                        if(this.simultaneousJRadioButton!!.isSelected())
                        
                                    {
                                    this.delayJTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
this.sequenceJRadioButton!!.setSelected(false)

                                    }
                                
}


    open fun keyNameJComboBoxActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

    var integer: Integer = this.getSelectedKey()!!

this.prependText(integer)
this.keyIntegerJComboBox!!.setSelectedIndex(this.keyNameJComboBox!!.getSelectedIndex())
}


    open fun okJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            this.update()
this.getKeyActionJDialog()!!.setVisible(false)
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "okButtonActionPerformed", e)
}

}


    open fun keyActionJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.getKeyActionJDialog()!!.setVisible(true)
}


    open fun normalJRadioButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

    
                        if(this.normalJRadioButton!!.isSelected())
                        
                                    {
                                    this.keyActionScriptInputInterface!!.setNormal()
this.pressJRadioButton!!.setSelected(false)
this.releaseJRadioButton!!.setSelected(false)

                                    }
                                
}


    open fun releaseJRadioButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

    
                        if(this.releaseJRadioButton!!.isSelected())
                        
                                    {
                                    this.keyActionScriptInputInterface!!.setRelease(true)
this.keyActionScriptInputInterface!!.setPress(false)
this.pressJRadioButton!!.setSelected(false)
this.normalJRadioButton!!.setSelected(false)

                                    }
                                
}


    open fun pressJRadioButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

    
                        if(this.pressJRadioButton!!.isSelected())
                        
                                    {
                                    this.keyActionScriptInputInterface!!.setPress(true)
this.keyActionScriptInputInterface!!.setRelease(false)
this.releaseJRadioButton!!.setSelected(false)
this.normalJRadioButton!!.setSelected(false)

                                    }
                                
}


    private var addKeyJLabel: JLabel

    private var delayBetweenJLabel: JLabel

    private var delayJTextField: JTextField

    private var holdTimeJLabel: JLabel

    private var inputAutomationTypeJComboBox: JComboBox

    private var inputTypeJLabel: JLabel

    private var jLabel1: JLabel

    private var jPanel1: JPanel

    private var keyActionJButton: JButton

    private var keyActionJDialog: JDialog

    private var keyIntegerJComboBox: JComboBox

    private var keyNameJComboBox: JComboBox

    private var normalJRadioButton: JRadioButton

    private var okJButton: JButton

    private var pressJRadioButton: JRadioButton

    private var releaseJRadioButton: JRadioButton

    private var sequenceJRadioButton: JRadioButton

    private var simultaneousJRadioButton: JRadioButton

    private var testJLabel: JLabel

    private var textJTextField: JTextField

    private var timeJTextField: JTextField

    private var titleJLabel: JLabel

}
                
            


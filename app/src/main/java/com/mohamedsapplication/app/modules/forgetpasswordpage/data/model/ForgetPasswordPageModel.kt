package com.mohamedsapplication.app.modules.forgetpasswordpage.`data`.model

import com.mohamedsapplication.app.R
import com.mohamedsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForgetPasswordPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgetPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forget_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEntertheemail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_the_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etUsernameValue: String? = null
)

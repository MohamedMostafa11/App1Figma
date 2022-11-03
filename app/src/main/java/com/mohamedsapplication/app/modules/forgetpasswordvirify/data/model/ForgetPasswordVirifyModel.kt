package com.mohamedsapplication.app.modules.forgetpasswordvirify.`data`.model

import com.mohamedsapplication.app.R
import com.mohamedsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForgetPasswordVirifyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangePassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordOneValue: String? = null
)

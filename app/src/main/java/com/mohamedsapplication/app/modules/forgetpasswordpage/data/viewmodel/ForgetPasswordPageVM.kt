package com.mohamedsapplication.app.modules.forgetpasswordpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohamedsapplication.app.modules.forgetpasswordpage.`data`.model.ForgetPasswordPageModel
import org.koin.core.KoinComponent

class ForgetPasswordPageVM : ViewModel(), KoinComponent {
  val forgetPasswordPageModel: MutableLiveData<ForgetPasswordPageModel> =
      MutableLiveData(ForgetPasswordPageModel())

  var navArguments: Bundle? = null
}

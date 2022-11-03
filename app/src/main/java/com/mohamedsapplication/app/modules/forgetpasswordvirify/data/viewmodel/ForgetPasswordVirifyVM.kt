package com.mohamedsapplication.app.modules.forgetpasswordvirify.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mohamedsapplication.app.modules.forgetpasswordvirify.`data`.model.ForgetPasswordVirifyModel
import org.koin.core.KoinComponent

class ForgetPasswordVirifyVM : ViewModel(), KoinComponent {
  val forgetPasswordVirifyModel: MutableLiveData<ForgetPasswordVirifyModel> =
      MutableLiveData(ForgetPasswordVirifyModel())

  var navArguments: Bundle? = null
}

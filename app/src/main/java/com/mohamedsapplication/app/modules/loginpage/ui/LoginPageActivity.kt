package com.mohamedsapplication.app.modules.loginpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.mohamedsapplication.app.R
import com.mohamedsapplication.app.appcomponents.base.BaseActivity
import com.mohamedsapplication.app.databinding.ActivityLoginPageBinding
import com.mohamedsapplication.app.modules.forgetpasswordpage.ui.ForgetPasswordPageActivity
import com.mohamedsapplication.app.modules.loginpage.`data`.viewmodel.LoginPageVM
import com.mohamedsapplication.app.modules.registerpage.ui.RegisterPageActivity
import kotlin.String
import kotlin.Unit

class LoginPageActivity : BaseActivity<ActivityLoginPageBinding>(R.layout.activity_login_page) {
  private val viewModel: LoginPageVM by viewModels<LoginPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginPageVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = RegisterPageActivity.getIntent(this, null)
      startActivity(destIntent)
      }, 10000)
    }

    override fun setUpClicks(): Unit {
      binding.txtSignup.setOnClickListener {
        val destIntent = RegisterPageActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtForgetPassword.setOnClickListener {
        val destIntent = ForgetPasswordPageActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "LOGIN_PAGE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LoginPageActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }

package kr.ac.anu.storyleave.core.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseBindingFragment<VB : ViewBinding>(
    private val inflate: (LayoutInflater, ViewGroup?, Boolean) -> VB,
) : Fragment() {
    private var viewBinding: VB? = null
    protected val binding: VB
        get() = checkNotNull(viewBinding) { "Binding is only valid between onCreateView and onDestroyView." }

    final override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View =
        inflate(inflater, container, false)
            .also { viewBinding = it }
            .root

    override fun onDestroyView() {
        viewBinding = null
        super.onDestroyView()
    }
}

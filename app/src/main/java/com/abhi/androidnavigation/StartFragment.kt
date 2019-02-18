package com.abhi.androidnavigation


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_start.*


class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        goFirstFragment.setOnClickListener({
            it.findNavController().navigate(R.id.action_startFragment_to_firstFragment)
        })

        goSecondFragment.setOnClickListener({
            var bundle:Bundle = Bundle()
            bundle.putString("bundleStr", "Hello World !!!")
            it.findNavController().navigate(R.id.action_startFragment_to_secondFragment, bundle)
        })

    }

}

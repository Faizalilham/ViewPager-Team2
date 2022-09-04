package com.example.viewpager.fragment

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import com.example.viewpager.databinding.FragmentCameraBinding


class CameraFragment : Fragment() {


    private lateinit var binding : FragmentCameraBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCameraBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Kalau mau open camera klik layar dulu, belum bisa di slide otomatis open, boleh dikembangin guys
        binding.frameContainer.setOnClickListener { takePicturePreview.launch(null) }
    }

    val takePicturePreview = registerForActivityResult(ActivityResultContracts.TakePicturePreview()){ bitmap ->
        if(bitmap != null){
            binding.imageCapture.setImageBitmap(bitmap)
        }
    }


}
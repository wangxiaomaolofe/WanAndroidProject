package com.example.wanandroid.module.home.view;

import com.example.wanandroid.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import me.jessyan.autosize.AutoSize;
import me.jessyan.autosize.internal.CustomAdapt;

public class HomeFragment extends Fragment  implements CustomAdapt {

	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		AutoSize.autoConvertDensity(getActivity(), 1080, true);
		View view = LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_home, container, false);
		return view;
	}

	@Override
	public boolean isBaseOnWidth() {
		return false;
	}

	@Override
	public float getSizeInDp() {
		return 0;
	}
}

package com.example.wanandroid.module.follow.View;

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

public class FollowFragment extends Fragment implements CustomAdapt {

	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		AutoSize.autoConvertDensity(getActivity(), 1080, true);
		return LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_follow, container, false);
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

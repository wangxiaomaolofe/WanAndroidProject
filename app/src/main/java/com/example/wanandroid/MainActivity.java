package com.example.wanandroid;

import com.flyco.tablayout.CommonTabLayout;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	private View mDecorView;
	private CommonTabLayout mTabLayout_3;
	private String[] mTitles = {"首页", "消息", "联系人", "更多"};
	private int[] mIconUnselectIds = {
		R.mipmap.tab_home_unselect, R.mipmap.tab_speech_unselect,
		R.mipmap.tab_contact_unselect, R.mipmap.tab_more_unselect};
	private int[] mIconSelectIds = {
		R.mipmap.tab_home_select, R.mipmap.tab_speech_select,
		R.mipmap.tab_contact_select, R.mipmap.tab_more_select};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mDecorView = getWindow().getDecorView();
		initView();
	}

	private void initView() {
		/** with Fragments */

		//mTabLayout_3 = ViewFindUtils.find(mDecorView, R.id.tl_3);
	}
}

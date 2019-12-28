package com.example.steganouflage;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<SignupForm> mActivityTestRule = new ActivityTestRule<SignupForm>(SignupForm.class);
    private SignupForm mActivity = null;

    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
    }

    @Test
    public void testUsername() {
        View view = mActivity.findViewById(R.id.etUname);
        assertNotNull(view);


    }

    @Test
    public void testEmail(){
        View view1 = mActivity.findViewById(R.id.etEmail);
        assertNotNull(view1);


    }
    @Test
    public  void testPassword(){
        View view2 = mActivity.findViewById(R.id.etPass);
        assertNotNull(view2);
    }

    @Test
    public  void testConfirmPassword(){
        View view3 = mActivity.findViewById(R.id.etRePass);
        assertNotNull(view3);
    }
    @Test
    public  void testButton(){
        View view4 = mActivity.findViewById(R.id.btnSignUp);
        assertNotNull(view4);
    }




    @After
    public void tearDown() throws Exception {
        mActivity = null;
    }
}
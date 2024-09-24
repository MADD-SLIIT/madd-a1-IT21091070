// Generated by view binder compiler. Do not edit!
package com.example.travelmate2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.travelmate2.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BottomNavigationView bottomNavigationView;

  @NonNull
  public final TextInputEditText editTextAddress;

  @NonNull
  public final TextInputEditText editTextCountry;

  @NonNull
  public final TextInputEditText editTextEmail;

  @NonNull
  public final TextInputEditText editTextMobile;

  @NonNull
  public final TextInputEditText editTextName;

  @NonNull
  public final Button signOutButton;

  @NonNull
  public final Button updateButton;

  private ActivityProfileBinding(@NonNull ConstraintLayout rootView,
      @NonNull BottomNavigationView bottomNavigationView,
      @NonNull TextInputEditText editTextAddress, @NonNull TextInputEditText editTextCountry,
      @NonNull TextInputEditText editTextEmail, @NonNull TextInputEditText editTextMobile,
      @NonNull TextInputEditText editTextName, @NonNull Button signOutButton,
      @NonNull Button updateButton) {
    this.rootView = rootView;
    this.bottomNavigationView = bottomNavigationView;
    this.editTextAddress = editTextAddress;
    this.editTextCountry = editTextCountry;
    this.editTextEmail = editTextEmail;
    this.editTextMobile = editTextMobile;
    this.editTextName = editTextName;
    this.signOutButton = signOutButton;
    this.updateButton = updateButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomNavigationView;
      BottomNavigationView bottomNavigationView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigationView == null) {
        break missingId;
      }

      id = R.id.editTextAddress;
      TextInputEditText editTextAddress = ViewBindings.findChildViewById(rootView, id);
      if (editTextAddress == null) {
        break missingId;
      }

      id = R.id.editTextCountry;
      TextInputEditText editTextCountry = ViewBindings.findChildViewById(rootView, id);
      if (editTextCountry == null) {
        break missingId;
      }

      id = R.id.editTextEmail;
      TextInputEditText editTextEmail = ViewBindings.findChildViewById(rootView, id);
      if (editTextEmail == null) {
        break missingId;
      }

      id = R.id.editTextMobile;
      TextInputEditText editTextMobile = ViewBindings.findChildViewById(rootView, id);
      if (editTextMobile == null) {
        break missingId;
      }

      id = R.id.editTextName;
      TextInputEditText editTextName = ViewBindings.findChildViewById(rootView, id);
      if (editTextName == null) {
        break missingId;
      }

      id = R.id.signOutButton;
      Button signOutButton = ViewBindings.findChildViewById(rootView, id);
      if (signOutButton == null) {
        break missingId;
      }

      id = R.id.updateButton;
      Button updateButton = ViewBindings.findChildViewById(rootView, id);
      if (updateButton == null) {
        break missingId;
      }

      return new ActivityProfileBinding((ConstraintLayout) rootView, bottomNavigationView,
          editTextAddress, editTextCountry, editTextEmail, editTextMobile, editTextName,
          signOutButton, updateButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

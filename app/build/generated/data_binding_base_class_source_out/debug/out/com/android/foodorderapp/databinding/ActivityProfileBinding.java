// Generated by view binder compiler. Do not edit!
package com.android.foodorderapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.android.foodorderapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button3;

  @NonNull
  public final TextView email;

  @NonNull
  public final ImageView image;

  @NonNull
  public final TextView name;

  @NonNull
  public final EditText setName;

  @NonNull
  public final EditText setPhone;

  @NonNull
  public final TextView textView5;

  private ActivityProfileBinding(@NonNull ConstraintLayout rootView, @NonNull Button button3,
      @NonNull TextView email, @NonNull ImageView image, @NonNull TextView name,
      @NonNull EditText setName, @NonNull EditText setPhone, @NonNull TextView textView5) {
    this.rootView = rootView;
    this.button3 = button3;
    this.email = email;
    this.image = image;
    this.name = name;
    this.setName = setName;
    this.setPhone = setPhone;
    this.textView5 = textView5;
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
      id = R.id.button3;
      Button button3 = rootView.findViewById(id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.email;
      TextView email = rootView.findViewById(id);
      if (email == null) {
        break missingId;
      }

      id = R.id.image;
      ImageView image = rootView.findViewById(id);
      if (image == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = rootView.findViewById(id);
      if (name == null) {
        break missingId;
      }

      id = R.id.setName;
      EditText setName = rootView.findViewById(id);
      if (setName == null) {
        break missingId;
      }

      id = R.id.setPhone;
      EditText setPhone = rootView.findViewById(id);
      if (setPhone == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = rootView.findViewById(id);
      if (textView5 == null) {
        break missingId;
      }

      return new ActivityProfileBinding((ConstraintLayout) rootView, button3, email, image, name,
          setName, setPhone, textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

// Generated by view binder compiler. Do not edit!
package com.example.tasktimerapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tasktimerapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;

public final class RvrowBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final Button button2;

  @NonNull
  public final LinearLayout taskRow;

  @NonNull
  public final TextView textView;

  @NonNull
  public final MaterialProgressBar timeProgress;

  @NonNull
  public final TextView tvDes;

  @NonNull
  public final TextView tvTimer;

  @NonNull
  public final TextView tvTitle;

  private RvrowBinding(@NonNull LinearLayout rootView, @NonNull Button button,
      @NonNull Button button2, @NonNull LinearLayout taskRow, @NonNull TextView textView,
      @NonNull MaterialProgressBar timeProgress, @NonNull TextView tvDes, @NonNull TextView tvTimer,
      @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.button = button;
    this.button2 = button2;
    this.taskRow = taskRow;
    this.textView = textView;
    this.timeProgress = timeProgress;
    this.tvDes = tvDes;
    this.tvTimer = tvTimer;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RvrowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RvrowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.rvrow, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RvrowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.taskRow;
      LinearLayout taskRow = ViewBindings.findChildViewById(rootView, id);
      if (taskRow == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.timeProgress;
      MaterialProgressBar timeProgress = ViewBindings.findChildViewById(rootView, id);
      if (timeProgress == null) {
        break missingId;
      }

      id = R.id.tvDes;
      TextView tvDes = ViewBindings.findChildViewById(rootView, id);
      if (tvDes == null) {
        break missingId;
      }

      id = R.id.tvTimer;
      TextView tvTimer = ViewBindings.findChildViewById(rootView, id);
      if (tvTimer == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new RvrowBinding((LinearLayout) rootView, button, button2, taskRow, textView,
          timeProgress, tvDes, tvTimer, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

// Generated by view binder compiler. Do not edit!
package com.example.tasktimerapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Chronometer;
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

public final class ItemRowBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnRestart;

  @NonNull
  public final Button btnStop;

  @NonNull
  public final Chronometer chronometerSmall;

  @NonNull
  public final LinearLayout llMainHolder;

  @NonNull
  public final LinearLayout llOptionsHolder;

  @NonNull
  public final LinearLayout lltimerSmall;

  @NonNull
  public final TextView tvTitleInHome;

  private ItemRowBinding(@NonNull LinearLayout rootView, @NonNull Button btnRestart,
      @NonNull Button btnStop, @NonNull Chronometer chronometerSmall,
      @NonNull LinearLayout llMainHolder, @NonNull LinearLayout llOptionsHolder,
      @NonNull LinearLayout lltimerSmall, @NonNull TextView tvTitleInHome) {
    this.rootView = rootView;
    this.btnRestart = btnRestart;
    this.btnStop = btnStop;
    this.chronometerSmall = chronometerSmall;
    this.llMainHolder = llMainHolder;
    this.llOptionsHolder = llOptionsHolder;
    this.lltimerSmall = lltimerSmall;
    this.tvTitleInHome = tvTitleInHome;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnRestart;
      Button btnRestart = ViewBindings.findChildViewById(rootView, id);
      if (btnRestart == null) {
        break missingId;
      }

      id = R.id.btnStop;
      Button btnStop = ViewBindings.findChildViewById(rootView, id);
      if (btnStop == null) {
        break missingId;
      }

      id = R.id.chronometerSmall;
      Chronometer chronometerSmall = ViewBindings.findChildViewById(rootView, id);
      if (chronometerSmall == null) {
        break missingId;
      }

      LinearLayout llMainHolder = (LinearLayout) rootView;

      id = R.id.llOptionsHolder;
      LinearLayout llOptionsHolder = ViewBindings.findChildViewById(rootView, id);
      if (llOptionsHolder == null) {
        break missingId;
      }

      id = R.id.lltimerSmall;
      LinearLayout lltimerSmall = ViewBindings.findChildViewById(rootView, id);
      if (lltimerSmall == null) {
        break missingId;
      }

      id = R.id.tvTitleInHome;
      TextView tvTitleInHome = ViewBindings.findChildViewById(rootView, id);
      if (tvTitleInHome == null) {
        break missingId;
      }

      return new ItemRowBinding((LinearLayout) rootView, btnRestart, btnStop, chronometerSmall,
          llMainHolder, llOptionsHolder, lltimerSmall, tvTitleInHome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

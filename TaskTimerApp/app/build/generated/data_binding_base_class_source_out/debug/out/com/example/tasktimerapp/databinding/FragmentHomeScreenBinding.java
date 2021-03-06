// Generated by view binder compiler. Do not edit!
package com.example.tasktimerapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tasktimerapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeScreenBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Barrier barrier2;

  @NonNull
  public final ConstraintLayout llmainItem;

  @NonNull
  public final RecyclerView mainRecyclerView;

  @NonNull
  public final TextView tvDescriptionmain;

  @NonNull
  public final Chronometer tvTimemain;

  @NonNull
  public final TextView tvTotalmain;

  private FragmentHomeScreenBinding(@NonNull LinearLayout rootView, @NonNull Barrier barrier2,
      @NonNull ConstraintLayout llmainItem, @NonNull RecyclerView mainRecyclerView,
      @NonNull TextView tvDescriptionmain, @NonNull Chronometer tvTimemain,
      @NonNull TextView tvTotalmain) {
    this.rootView = rootView;
    this.barrier2 = barrier2;
    this.llmainItem = llmainItem;
    this.mainRecyclerView = mainRecyclerView;
    this.tvDescriptionmain = tvDescriptionmain;
    this.tvTimemain = tvTimemain;
    this.tvTotalmain = tvTotalmain;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.barrier2;
      Barrier barrier2 = ViewBindings.findChildViewById(rootView, id);
      if (barrier2 == null) {
        break missingId;
      }

      id = R.id.llmainItem;
      ConstraintLayout llmainItem = ViewBindings.findChildViewById(rootView, id);
      if (llmainItem == null) {
        break missingId;
      }

      id = R.id.mainRecyclerView;
      RecyclerView mainRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (mainRecyclerView == null) {
        break missingId;
      }

      id = R.id.tvDescriptionmain;
      TextView tvDescriptionmain = ViewBindings.findChildViewById(rootView, id);
      if (tvDescriptionmain == null) {
        break missingId;
      }

      id = R.id.tvTimemain;
      Chronometer tvTimemain = ViewBindings.findChildViewById(rootView, id);
      if (tvTimemain == null) {
        break missingId;
      }

      id = R.id.tvTotalmain;
      TextView tvTotalmain = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalmain == null) {
        break missingId;
      }

      return new FragmentHomeScreenBinding((LinearLayout) rootView, barrier2, llmainItem,
          mainRecyclerView, tvDescriptionmain, tvTimemain, tvTotalmain);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

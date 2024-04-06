// Generated by view binder compiler. Do not edit!
package com.example.recipekhojo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.recipekhojo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCategoryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView goBackHome;

  @NonNull
  public final RecyclerView rvCategory;

  @NonNull
  public final TextView tittle;

  private ActivityCategoryBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView goBackHome,
      @NonNull RecyclerView rvCategory, @NonNull TextView tittle) {
    this.rootView = rootView;
    this.goBackHome = goBackHome;
    this.rvCategory = rvCategory;
    this.tittle = tittle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_category, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCategoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.go_back_home;
      ImageView goBackHome = ViewBindings.findChildViewById(rootView, id);
      if (goBackHome == null) {
        break missingId;
      }

      id = R.id.rv_category;
      RecyclerView rvCategory = ViewBindings.findChildViewById(rootView, id);
      if (rvCategory == null) {
        break missingId;
      }

      id = R.id.tittle;
      TextView tittle = ViewBindings.findChildViewById(rootView, id);
      if (tittle == null) {
        break missingId;
      }

      return new ActivityCategoryBinding((ConstraintLayout) rootView, goBackHome, rvCategory,
          tittle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

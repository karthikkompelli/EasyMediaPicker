package com.karthikkompelli.easymediapicker.Video;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

import com.karthikkompelli.easymediapicker.FileUtils2;
import com.karthikkompelli.easymediapicker.FileProcessing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alhazmy13 on 8/15/16.
 * MediaPicker
 */
class VideoProcessing {

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    static List<String> processMultiVideos(Context context, Intent data) {
        List<String> listOfImgs = new ArrayList<>();
        if ((Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) && (null == data.getData())) {
            ClipData clipdata = data.getClipData();
            for (int i = 0; i < clipdata.getItemCount(); i++) {
                Uri selectedImage = clipdata.getItemAt(i).getUri();
                String selectedImagePath = FileProcessing.getPath(context, selectedImage);
                if (selectedImagePath == null)
                    selectedImagePath = FileUtils2.getRealPath(context, selectedImage);
                listOfImgs.add(selectedImagePath);
            }
        }
        return listOfImgs;
    }
}

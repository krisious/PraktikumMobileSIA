package com.example.tugas6;

import android.os.Parcel;
import android.os.Parcelable;

public class Jadwal implements Parcelable {
    String jadwal;

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.jadwal);
    }

    public void readFromParcel(Parcel source) {
        this.jadwal = source.readString();
    }

    public Jadwal() {
    }

    protected Jadwal(Parcel in) {
        this.jadwal = in.readString();
    }

    public static final Parcelable.Creator<Jadwal> CREATOR = new Parcelable.Creator<Jadwal>() {
        @Override
        public Jadwal createFromParcel(Parcel source) {
            return new Jadwal(source);
        }

        @Override
        public Jadwal[] newArray(int size) {
            return new Jadwal[size];
        }
    };
}

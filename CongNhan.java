package huynhtrivy_23681901;

public class CongNhan {
    private String mCN;
    private String mHo;
    private String mTen;
    private int mSoSP;

    // Getters and setters
    public String getmCN() {
        return mCN;
    }

    public void setmCN(String mCN) {
        this.mCN = mCN;
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public int getmSoSP() {
        return mSoSP;
    }

    public void setmSoSP(int mSoSP) {
        this.mSoSP = mSoSP;
    }

    // Constructor
    public CongNhan(String mCN, String mHo, String mTen, int mSoSP) {
        this.mCN = mCN;
        this.mHo = mHo;
        this.mTen = mTen;
        this.mSoSP = mSoSP;
    }

    // Calculate salary
    public double tinhLuong() {
        if (mSoSP >= 600) {
            return mSoSP * 0.65;
        } else if (mSoSP >= 400) {
            return mSoSP * 0.6;
        } else if (mSoSP >= 200) {
            return mSoSP * 0.55;
        } else {
            return mSoSP * 0.5;
        }
    }

    // Override toString
    @Override
    public String toString() {
        return "CongNhan{" +
                "mCN='" + mCN + '\'' +
                ", mHo='" + mHo + '\'' +
                ", mTen='" + mTen + '\'' +
                ", mSoSP=" + mSoSP +
                ", luong=" + tinhLuong() +
                '}';
    }
}



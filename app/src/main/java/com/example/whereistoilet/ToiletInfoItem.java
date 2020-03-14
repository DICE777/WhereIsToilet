package com.example.whereistoilet;
/*
diapExchNum	기저귀교환대개수
dtlLoc	상세위치
exitNo	출구번호
gateInotDvNm	게이트내외구분
grndDvNm	지상구분
lnCd	선코드
mlFmlDvNm	남녀구분
railOprIsttCd	철도운영기관코드
stinCd	역코드
stinFlor	역층
toltNum	화장실개수
*/
public class ToiletInfoItem {

    int diapExchNum;
    String dtlLoc;
    int exitNo;
    int gateInotDvNm;
    int grndDvNm;
    int lnCd;
    int mlFmlDvNm;
    int railOprIsttCd;
    int stinCd;
    int stinFlor;
    int toltNum;

    public ToiletInfoItem() {
    }

    public ToiletInfoItem(int diapExchNum, String dtlLoc, int exitNo, int gateInotDvNm, int grndDvNm, int lnCd, int mlFmlDvNm, int railOprIsttCd, int stinCd, int stinFlor, int toltNum) {
        this.diapExchNum = diapExchNum;
        this.dtlLoc = dtlLoc;
        this.exitNo = exitNo;
        this.gateInotDvNm = gateInotDvNm;
        this.grndDvNm = grndDvNm;
        this.lnCd = lnCd;
        this.mlFmlDvNm = mlFmlDvNm;
        this.railOprIsttCd = railOprIsttCd;
        this.stinCd = stinCd;
        this.stinFlor = stinFlor;
        this.toltNum = toltNum;
    }

    public int getDiapExchNum() {
        return diapExchNum;
    }

    public void setDiapExchNum(int diapExchNum) {
        this.diapExchNum = diapExchNum;
    }

    public String getDtlLoc() {
        return dtlLoc;
    }

    public void setDtlLoc(String dtlLoc) {
        this.dtlLoc = dtlLoc;
    }

    public int getExitNo() {
        return exitNo;
    }

    public void setExitNo(int exitNo) {
        this.exitNo = exitNo;
    }

    public int getGateInotDvNm() {
        return gateInotDvNm;
    }

    public void setGateInotDvNm(int gateInotDvNm) {
        this.gateInotDvNm = gateInotDvNm;
    }

    public int getGrndDvNm() {
        return grndDvNm;
    }

    public void setGrndDvNm(int grndDvNm) {
        this.grndDvNm = grndDvNm;
    }

    public int getLnCd() {
        return lnCd;
    }

    public void setLnCd(int lnCd) {
        this.lnCd = lnCd;
    }

    public int getMlFmlDvNm() {
        return mlFmlDvNm;
    }

    public void setMlFmlDvNm(int mlFmlDvNm) {
        this.mlFmlDvNm = mlFmlDvNm;
    }

    public int getRailOprIsttCd() {
        return railOprIsttCd;
    }

    public void setRailOprIsttCd(int railOprIsttCd) {
        this.railOprIsttCd = railOprIsttCd;
    }

    public int getStinCd() {
        return stinCd;
    }

    public void setStinCd(int stinCd) {
        this.stinCd = stinCd;
    }

    public int getStinFlor() {
        return stinFlor;
    }

    public void setStinFlor(int stinFlor) {
        this.stinFlor = stinFlor;
    }

    public int getToltNum() {
        return toltNum;
    }

    public void setToltNum(int toltNum) {
        this.toltNum = toltNum;
    }
}

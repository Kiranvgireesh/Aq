package com.example.aquawall;

public  final class Calculation {
    String[] F1parameters= new String[24];
    float[] Fvalues= new float[3];
    float totalTests;
    float excursionValue;
    float no_of_variables;

    Calculation() {
        for(int a=0;a<3;a++) {
            Fvalues[a]=0;
        }
        this.totalTests=0;


    }
    public void setNo_of_variables(float x){
        this.no_of_variables=x;

    }
    public void setTotalTest() {
        this.totalTests=0;
    }


    public void setFvalues() {
        for(int a=0;a<3;a++) {
            Fvalues[a]=0;
        }
    }











    public void PhCalculation(float pH) {
        totalTests++;


        if (pH>8.5&&pH<6.5) {
            Fvalues[1]++;
            CheckF1Parameter("pH");

        }if(pH>8.5){
            excursionValueCalculatorGreaterThan(pH,(float)8.5);
        }if(pH<6.5){
            excursionValueCalculatorLessThan(pH,(float)6.5);
        }

    }


    public void TPcalculation(float TP) {


        totalTests++;
        if(TP>0.05) {
            Fvalues[1]++;
            CheckF1Parameter("TP");
            excursionValueCalculatorGreaterThan(TP,(float)0.05);
        }
    }



    public void excursionValueCalculatorGreaterThan(float failedTestValue, float objective) {
        this.excursionValue=this.excursionValue+((failedTestValue/objective)-1);


        // TODO Auto-generated method st
    }


    public void TNcalculation(float TN) {
        totalTests++;
        if(TN>1) {
            Fvalues[1]++;
            CheckF1Parameter("TN");
            excursionValueCalculatorGreaterThan(TN,(float)1);
        }
    }



    public void FCcalculation(float FC) {
        totalTests++;
        if(FC>500) {
            Fvalues[1]++;
            CheckF1Parameter("FC");
            excursionValueCalculatorGreaterThan(FC,(float)100);
        }
    }

    public void AScalculation(float AS) {
        totalTests++;
        if(AS>0.05) {
            Fvalues[1]++;
            CheckF1Parameter("AS");
            excursionValueCalculatorGreaterThan(AS,(float)0.05);
        }
    }



    public void PBcalculation(float PB) {
        this.totalTests++;
        if(PB>0.004) {
            this.Fvalues[1]++;
            CheckF1Parameter("PB");
            excursionValueCalculatorGreaterThan(PB,(float)0.004);
        }
    }



    public void HGcalculation(float HG) {
        totalTests++;
        if(HG>0.1) {
            Fvalues[1]++;
            CheckF1Parameter("HG");
            excursionValueCalculatorGreaterThan(HG,(float)0.1);
        }
    }

    public void Dcalculation(float D) {
        totalTests++;
        if(D>4) {
            Fvalues[1]++;
            CheckF1Parameter("D");
            excursionValueCalculatorGreaterThan(D,(float)4);
        }
    }


    public void LindaneCalculation(float Lindane) {
        totalTests++;
        if(Lindane>0.01) {
            Fvalues[1]++;
            CheckF1Parameter("Lindane");
            excursionValueCalculatorGreaterThan(Lindane,(float)0.01);
        }
    }

    public void ElectronicalConductivityCalculation(float ElectricalConductivity){
        totalTests++;
        if(ElectricalConductivity >300){
            Fvalues[1]++;
            CheckF1Parameter("ElectronicalConductivity");
            excursionValueCalculatorGreaterThan(ElectricalConductivity,(float)300);

        }
    }

    public void TotalDissolvedSolidsCalculation(float TotalDissolvedSolids ){
        totalTests++;
        if(TotalDissolvedSolids >500){
            Fvalues[1]++;
            CheckF1Parameter("TotalDissolvedSolids");
            excursionValueCalculatorGreaterThan(TotalDissolvedSolids,(float)500);
        }
    }
    public void TurbidityCalculaation(float Turbidity){
        totalTests++;
        if(Turbidity >1){
            CheckF1Parameter("Turbidity");
            excursionValueCalculatorGreaterThan(Turbidity,(float)1);
        }
    }
     public void TotalAlkanilityCalculation(float TotalAlkanility ){
        totalTests++;
        if(TotalAlkanility >200){
            CheckF1Parameter("TotalAlkanility");
            excursionValueCalculatorGreaterThan(TotalAlkanility,(float)200);
        }
     }
     public  void  ChloridesCalculation(float Chlorides){
        totalTests++;
        if(Chlorides >250){
            CheckF1Parameter("Chlorides");
            excursionValueCalculatorGreaterThan(Chlorides,(float)250);
        }
     }
    public  void  HardnessCalculation(float Hardness){
        totalTests++;
        if(Hardness >200){
            CheckF1Parameter("Hardness");
            excursionValueCalculatorGreaterThan(Hardness,(float)200);
        }
    }
    public  void  CalciumCalculation(float Calcium){
        totalTests++;
        if(Calcium >75){
            CheckF1Parameter("Calcium");
            excursionValueCalculatorGreaterThan(Calcium,(float)250);
        }
    }
    public  void  MagnesiumCalculation(float Magnesium){
        totalTests++;
        if(Magnesium >30){
            CheckF1Parameter("Magnesium");
            excursionValueCalculatorGreaterThan(Magnesium,(float)30);
        }
    }

    public  void  SulphatesCalculation(float Sulphates){
        totalTests++;
        if(Sulphates >200){
            CheckF1Parameter("Sulphates");
            excursionValueCalculatorGreaterThan(Sulphates,(float)250);
        }
    }
    public  void  tdsCalculation(float tds){
        totalTests++;
        if(tds>500){
            CheckF1Parameter("tds");
            excursionValueCalculatorGreaterThan(tds,(float)250);
        }
    }
    public  void  BoronCalculation(float Boron){
        totalTests++;
        if(Boron >0.5){
            CheckF1Parameter("Boron");
            excursionValueCalculatorGreaterThan(Boron,(float)250);
        }
    }
    public  void  FlurideCalculation(float Fluride){
        totalTests++;
        if(Fluride >0.5){
            CheckF1Parameter("Fluride");
            excursionValueCalculatorGreaterThan(Fluride,(float)0.5);
        }
    }
    public  void  NitrateCalculation(float Nitrate){
        totalTests++;
        if(Nitrate >0.5){
            CheckF1Parameter("Nitrate");
            excursionValueCalculatorGreaterThan(Nitrate,(float)250);
        }
    }
    public  void  CadmiumCalculation(float Cadmium){
        totalTests++;
        if(Cadmium >0.003){
            CheckF1Parameter("Cadmium");
            excursionValueCalculatorGreaterThan(Cadmium,(float)250);
        }
    }
    public  void  CopperCalculation(float Copper){
        totalTests++;
        if(Copper >0.05){
            CheckF1Parameter("Copper");
            excursionValueCalculatorGreaterThan(Copper,(float)250);
        }
    }
    public  void  LeadCalculation(float Lead){
        totalTests++;
        if(Lead >0.01){
            CheckF1Parameter("Lead");
            excursionValueCalculatorGreaterThan(Lead,(float)250);
        }
    }
    public  void  ChromiumCalculation(float Chromium){
        totalTests++;
        if(Chromium >0.05){
            CheckF1Parameter("Chromium");
            excursionValueCalculatorGreaterThan(Chromium,(float)0.05);
        }
    }
    public  void  NickelCalculation(float Nickel){
        totalTests++;
        if(Nickel >0.02){
            CheckF1Parameter("Nickel");
            excursionValueCalculatorGreaterThan(Nickel,(float)250);
        }
    }
    public  void  ZincCalculation(float Zinc){
        totalTests++;
        if(Zinc >5){
            CheckF1Parameter("Zinc");
            excursionValueCalculatorGreaterThan(Zinc,(float)5);
        }
    }

    public  void  IronCalculation(float Iron){
        totalTests++;
        if(Iron >0.3){
            CheckF1Parameter("Iron");
            excursionValueCalculatorGreaterThan(Iron,(float)0.3);
        }
    }
    public  void  TcCalculation(float Tc){
        totalTests++;
        if(Tc>500){
            CheckF1Parameter("TC");
            excursionValueCalculatorGreaterThan(Tc,(float)250);
        }
    }

















    public void DoCalculation(float Do) {
        totalTests++;
        if(Do<5) {
            Fvalues[1]++;
            CheckF1Parameter("DO");
            excursionValueCalculatorLessThan(Do,(float)5);
        }

    }





    public void excursionValueCalculatorLessThan(float failedTestValue, float objective) {
        this.excursionValue=this.excursionValue+((objective/failedTestValue)-1);
        // TODO Auto-generated method stub

    }


    private void CheckF1Parameter(String parameter) {
        int present=0;
        for(int i=0;i<24;i++){
            if(F1parameters[i]==parameter) {
                present=1;
            }

        }
        if(present==0) {
            for(int j=0;j<24;j++) {
                if(F1parameters[j]==null) {
                    F1parameters[j]=parameter;
                    break;
                }
            }
        }

        // TODO Auto-generated method stub

    }
    public float F2calculation() {
        float F2=(this.Fvalues[1])/this.totalTests;
        return F2*100;
    }

    public float F1Calculation() {
        float F1=(getF1Value()/no_of_variables)*100;
        return F1;

    }



    public float getF1Value() {
        float  F1=0;
        int i=0;
        while(this.F1parameters[i]!=null) {
            F1++;
            i++;
        }	// TODO Auto-generated method stub
        return F1;
    }

    public float F3Calculation() {
        float F3=0;
        float nse = this.excursionValue/this.totalTests;
        F3 = nse/((float)0.01*nse+(float)0.01);
        return F3;

    }
    public float waterQualityIndex() {
        float F1=F1Calculation();
        float F2=F2calculation();
        float F3=F3Calculation();
        float wqi= (float) (100- ((Math.sqrt(Math.pow(F1,2)+Math.pow(F2, 2)+Math.pow(F3, 2))/1.732)));
        return wqi;


    }

}

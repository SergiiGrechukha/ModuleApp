package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1389 {

    @Ignore    private SampleClass1390 sampleClass;

    public SampleClass1389(){
        sampleClass = new SampleClass1390();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}
package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1330 {

    @Ignore    private SampleClass1331 sampleClass;

    public SampleClass1330(){
        sampleClass = new SampleClass1331();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}
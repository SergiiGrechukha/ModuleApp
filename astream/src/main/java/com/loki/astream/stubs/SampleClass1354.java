package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1354 {

    @Ignore    private SampleClass1355 sampleClass;

    public SampleClass1354(){
        sampleClass = new SampleClass1355();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}
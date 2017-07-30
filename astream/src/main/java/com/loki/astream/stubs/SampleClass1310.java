package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1310 {

    @Ignore    private SampleClass1311 sampleClass;

    public SampleClass1310(){
        sampleClass = new SampleClass1311();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}